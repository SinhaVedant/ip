package duke;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * Class to handle deadline type of tasks.
 */
public class Deadline extends Task {
    protected LocalDate byDate;

    /**
     * Initialises a deadline task.
     *
     * @param description task description.
     * @param by deadline date.
     * @param taskType type of task.
     */
    public Deadline(String description, String by, char taskType) {
        super(description, taskType);
        this.byDate = LocalDate.parse(by, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public String toFileString() {
        return super.toFileString() + " | " +
                byDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public String toString() {
        return super.toString() + " (by: " +
                byDate.format(DateTimeFormatter.ofPattern("MMM dd yyyy")) + ")";
    }
}
