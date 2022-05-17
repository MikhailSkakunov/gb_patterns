package Adapter;

public class ChannelAdapter implements User {
    Channel channel;

    public ChannelAdapter(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void saveUser() {
        channel.saveChannel();
    }

    @Override
    public void deleteUser() {
        channel.deleteChannel();
    }
}
