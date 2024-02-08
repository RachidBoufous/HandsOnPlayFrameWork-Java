package controllers;

import io.ebean.DB;
import models.Todo;
import play.data.Form;
import play.mvc.*;
import play.data.FormFactory;
import jakarta.inject.Inject;

import java.util.List;

public class TodoController extends Controller {

    private final Form<Todo> form;

    @Inject
    public TodoController(FormFactory formFactory) {
        this.form = formFactory.form(Todo.class);
    }

    public Result createTodo(Http.Request request){
        System.out.println(request.body().asJson());
        final Form<Todo> todoForm = form.bindFromRequest(request);
        if (todoForm.hasErrors()){
            return badRequest(todoForm.errorsAsJson());
        } else {
            Todo todo = new Todo();
            todo.setContent(todoForm.get().getContent());
            todo.save();
            return redirect(routes.HomeController.index()).flashing("success", "Todo created successfully!");
        }
    }

    public Result getTodoList(){
        List<Todo> todoList = DB.find(Todo.class).findList();
        for(Todo todo: todoList){
            System.out.println(todo.getContent());
        }
        // return the list in json format
        return ok(play.libs.Json.toJson(todoList));

    }

}
