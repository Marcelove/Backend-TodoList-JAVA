package todolist.project.todolist;

import java.util.List;
import java.util.ArrayList;

interface RepositorioTodos {
    public void salvar(Todo todo);
    public List<Todo> listar();
}