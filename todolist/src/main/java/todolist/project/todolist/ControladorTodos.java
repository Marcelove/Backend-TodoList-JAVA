package todolist.project.todolist;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")

public class ControladorTodos {

    private RepositorioTodosMemoria repositorio = new RepositorioTodosMemoria();
   
    @PostMapping("/post")
    public void salvar(@RequestBody Todo todo) {
        repositorio.salvar(todo);
    }

    @GetMapping("/get")
    public List<Todo> listar() {
        return repositorio.listar();
    }

}