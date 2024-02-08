package controllers;

import models.Todo;
import play.data.Form;
import play.mvc.*;
import play.data.FormFactory;
import jakarta.inject.Inject;

import java.util.List;

public class TodoController extends Controller {

    private final FormFactory formFactory;

    @Inject
    public TodoController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result createTodo(){
        Form<Todo> todoForm = formFactory.form(Todo.class);
        if (todoForm.hasErrors()){
            return badRequest(todoForm.errorsAsJson());
        } else {
            Todo todo = todoForm.get();
            todo.save();
            return redirect(routes.HomeController.index());
        }
    }

}
