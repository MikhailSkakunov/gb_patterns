package Command;

public class UserCommand implements Command {

   User user;

    public UserCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        user.createUser();
        user.saveUser(user);
    }

    @Override
    public void undo() {

    }
}
