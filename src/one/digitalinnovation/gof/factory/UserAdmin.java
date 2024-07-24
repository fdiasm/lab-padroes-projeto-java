package one.digitalinnovation.gof.factory;

import java.util.Queue;

public class UserAdmin extends User {

    public UserAdmin(Long id, String name) {
        super(id, name, "admin");
    }

    public void addPendingTask(User user, String task) {
        Queue<String> tasks = user.getPendingTasks();
        tasks.add(task);
        user.setPendingTasks(tasks);
    }

}
