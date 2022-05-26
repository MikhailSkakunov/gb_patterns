package Command;

class Channel {

    String channelName;

    public Channel() {
    }

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void createChannel() {
        System.out.println("Channel created!");
    }

    public void deleteChannel() {
        System.out.println("Channel " + channelName + " deleted!");
    }
}

