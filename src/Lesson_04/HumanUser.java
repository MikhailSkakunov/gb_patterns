package Lesson_04;

public class HumanUser implements User {

    private final String userName;

    public HumanUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void saveUser(String  user) {
        System.out.println("Save user: " + userName);
    }
}
