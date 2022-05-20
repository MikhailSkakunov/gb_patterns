package Command;

public class DeleteUserCommand implements Command{

    Application application;

    public DeleteUserCommand(Application application) {
        this.application = application;
    }

    @Override
    public void execute() {
        application.deleteUser();
    }

    @Override
    public void undo() {
        application.createUser();
    }
}
