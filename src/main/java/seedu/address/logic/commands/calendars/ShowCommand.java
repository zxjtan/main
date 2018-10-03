package seedu.address.logic.commands.calendars;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.calendars.CliSyntax.PREFIX_MONTH;
import static seedu.address.logic.parser.calendars.CliSyntax.PREFIX_YEAR;

import seedu.address.logic.CommandHistory;
import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.model.Model;
import seedu.address.model.task.TaskInYearMonthPredicate;

/**
 * Lists all persons in the address book to the user.
 */
public class ShowCommand extends Command {

    public static final String COMMAND_WORD = "show";

    public static final String MESSAGE_SUCCESS = "Showed calendar";
    public static final String MESSAGE_USAGE = COMMAND_WORD + " <year> <month>: Shows the calendar view. "
            + "Parameters: " + PREFIX_YEAR + "YEAR" + PREFIX_MONTH + "MONTH";

    private final TaskInYearMonthPredicate filter;

    public ShowCommand(int year, int month) {
        filter = new TaskInYearMonthPredicate(year, month);
    }

    @Override
    public CommandResult execute(Model model, CommandHistory history) {
        requireNonNull(model);
        model.updateCalendarTaskList(filter);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
