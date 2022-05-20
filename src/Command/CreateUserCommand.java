package Command;

public class CreateUserCommand implements Command {

   Application application;

    public CreateUserCommand(Application application) {
        this.application = application;
    }

    @Override
    public void execute() {
        application.createUser();
    }

    @Override
    public void undo() {
        application.deleteUser();

    }
}
