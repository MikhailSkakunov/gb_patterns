package Adapter;

public class Human implements User{

    @Override
    public void saveUser() {
        System.out.println("Save Human!");
    }

    @Override
    public void deleteUser() {
        System.out.println("Delete Human.");
    }
}
