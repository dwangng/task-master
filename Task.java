public class Task {
    private String task;
    private int urgency;
    private int importance;
    private Priority priority;

    public Task(String task, int urgency, int importance) {
        this.task = task;
        this.urgency = urgency;
        this.importance = importance;
        this.priority = Priority.NONE;
    }

    public String getTask() {
        return task;
    }

    public int getUrgency() {
        return urgency;
    }

    public int getImportance() {
        return importance;
    }
}
