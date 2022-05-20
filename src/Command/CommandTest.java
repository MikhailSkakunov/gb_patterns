package Command;

public class CommandTest {
    public static void main(String[] args) {

        User user = new User("Fedor", "Govnyukov");

        Application application = new Application(user);
        CreateUserCommand createUserCommand = new CreateUserCommand(application);
        DeleteUserCommand deleteUserCommand = new DeleteUserCommand(application);

        createUserCommand.execute();
        createUserCommand.undo();

        deleteUserCommand.undo();
    }
}
