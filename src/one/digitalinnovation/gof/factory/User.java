package one.digitalinnovation.gof.factory;

import java.util.LinkedList;
import java.util.Queue;

public abstract class User {
    private Long id;
    private String name;
    private String type;
    private Queue<String> pendingTasks = new LinkedList<>();
    private Queue<String> completedTasks = new LinkedList<>();

    public User(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Queue<String> getPendingTasks() {
        return pendingTasks;
    }

    public void setPendingTasks(Queue<String> pendingTasks) {
        this.pendingTasks = pendingTasks;
    }

    public Queue<String> getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(Queue<String> completedTasks) {
        this.completedTasks = completedTasks;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", type=" + type + ", pendingTasks="
                + pendingTasks + ", completedTasks=" + completedTasks + "]";
    }

    public void addPendingTask(User user, String task) {}

    public void completeTask() {
        String task = this.pendingTasks.remove();
        this.completedTasks.add(task);
    }

}
