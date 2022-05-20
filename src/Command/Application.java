package Command;

class Application {

    User user;

    public Application(User user) {
        this.user = user;
    }

    public void createUser() {
        System.out.println("User created!");
    }

    public void deleteUser() {
        System.out.println("User deleted!!!" + " " + user.toString());
    }
}
