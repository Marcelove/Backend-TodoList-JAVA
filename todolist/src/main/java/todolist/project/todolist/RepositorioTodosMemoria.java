package todolist.project.todolist;

import java.util.List;
import java.util.ArrayList;

public class RepositorioTodosMemoria implements RepositorioTodos {

    private List<Todo> salvos = new ArrayList<Todo>();
    
    public void salvar(Todo todo) {
        this.salvos.add(todo);
    }

    public List<Todo> listar() {
        return this.salvos;
    }
}