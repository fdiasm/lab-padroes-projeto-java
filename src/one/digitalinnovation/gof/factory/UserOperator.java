package one.digitalinnovation.gof.factory;

import java.util.Queue;

public class UserOperator extends User {

    public UserOperator(Long id, String name) {
        super(id, name, "operator");
    }

    public void addPendingTask(User user, String task) {
        if (this == user) {
            Queue<String> tasks = this.getPendingTasks();
            tasks.add(task);
            this.setPendingTasks(tasks);
        }
    }
}
