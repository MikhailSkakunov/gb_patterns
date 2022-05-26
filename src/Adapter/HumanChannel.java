package Adapter;

public class HumanChannel implements Channel{
    @Override
    public void saveChannel() {
        System.out.println("Save HumanChannel...");
    }

    @Override
    public void deleteChannel() {
        System.out.println("Delete HumanChannel...!!!");
    }
}
