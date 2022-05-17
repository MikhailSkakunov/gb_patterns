package Adapter;

public class MainAdapter {
    public static void main(String[] args) {
        Human human = new Human();

        HumanChannel channel = new HumanChannel();
        User channelAdapter = new ChannelAdapter(channel);

        testUser(human);
        testUser(channelAdapter);
    }

    static void testUser(User user) {
        user.saveUser();
        user.deleteUser();
    }


}
