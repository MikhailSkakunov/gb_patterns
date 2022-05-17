package Lesson_04;

public class HumanUserDecorator implements User {

    User component;

    public HumanUserDecorator(User component) {
        this.component = component;
    }

    @Override
    public void saveUser(String userName) {
        component.saveUser(userName);
        System.out.println("I welcome you, " + userName);
    }
}
