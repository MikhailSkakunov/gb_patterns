package Command;

public class MacroCommand {

    private final Command command;
    private final Command command_1;
    private final Command command_2;

    public MacroCommand(Command command, Command command_1, Command command_2) {
        this.command = command;
        this.command_1 = command_1;
        this.command_2 = command_2;
    }

    public void commandUser() {
        command.execute();
    }

    public void removeChannel() {
        command_1.execute();
    }

    public void makeChannel() {
        command_2.execute();
    }
}
