package Command;

public class CreateChannelCommand implements Command {

    Channel channel;

    public CreateChannelCommand(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void execute() {
        channel.createChannel();
    }

    @Override
    public void undo() {
        channel.deleteChannel();
    }
}
