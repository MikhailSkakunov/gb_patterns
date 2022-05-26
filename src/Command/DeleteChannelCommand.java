package Command;

public class DeleteChannelCommand implements Command {

    Channel channel;

    public DeleteChannelCommand(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void execute() {
        channel.deleteChannel();
    }

    @Override
    public void undo() {
        channel.createChannel();
    }
}
