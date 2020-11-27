package todolist.project.todolist; 

public class Todo {
    private String title;
    private String text;
    private boolean done;

    Todo(String title, String text, boolean done){
        setTitle(title);
        setText(text);
        setDone(done);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setText(String text){
        this.text = text;
    }

    public void setDone(boolean done){
        this.done = done;
    }

    public String getTitle(){
        return this.title;
    }

    public String getText(){
        return this.text;
    }

    public boolean getDone(){
        return this.done;
    }
}
