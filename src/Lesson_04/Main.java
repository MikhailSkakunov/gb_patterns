package Lesson_04;


public class Main {
    public static void main(String[] args) {

        User user = new HumanUserDecorator(new HumanUser("Bob"));

        user.saveUser("Bob");
    }
}
