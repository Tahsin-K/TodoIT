package se.lexicon;

public class TodoItemTask {
    
    private int id;
    private boolean assigned;
    private String TodoItem;
    private Person assignee;
    
    public TodoItemTask(int id, boolean assigned, String TodoItem, Person assignee){
        setId(id);
        this.assigned = assigned;
        this.TodoItem = TodoItem;
        this.assignee = assignee;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id == 0)
            throw new IllegalStateException("id cannot be 0");
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public String getTodoItem() {
        return TodoItem;
    }

    public void setTodoItem(String todoItem) {
        TodoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
