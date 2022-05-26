package Command;

public class CommandLoader {
    public static void main(String[] args) {

        User user = new User("Fedor", "Govnyukov");

        Channel channel = new Channel("GovnyukovChannel");

        MacroCommand command = new MacroCommand(new UserCommand(user), new CreateChannelCommand(channel) ,new DeleteChannelCommand(channel));

        command.commandUser();

        command.makeChannel();

        command.removeChannel();

    }
}
