package seedu.addressbook.commands;

import seedu.addressbook.data.tag.Tag;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_USAGE = "Clears address book permanently.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Address book has been cleared!";

    @Override
    public CommandResult execute() {
        addressBook.clear();
        Tag.setCount();
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
