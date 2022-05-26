package Command;

public class User {

    String name;
    String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void createUser() {
        System.out.println("User created!");
    }

    public void saveUser(User user) {
        System.out.println("User saved!!!" + " " + user.toString());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
