package seedu.addressbook.commands;

import seedu.addressbook.data.person.Person;

/**
 * Returns the number of unique tags in the addressbook.
 */
public class CountTagCommand extends Command{

    Person person;

    public static final String COMMAND_WORD = "countTags";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Returns the total number of unique tags in the address book.\n"
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Count Number of Unique Tags: %1$s";

    public CountTagCommand() {}

    @Override
    public  CommandResult execute() {
        int count = person.countTags();

        return new CommandResult(String.format(MESSAGE_SUCCESS, count));
    }

}
