package Lesson_03;

public class ManUser implements User{

    private final String nickname;
    private final String email;
    private final String password;

    public ManUser(String nickname, String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    @Override
    public String nickname() {
        return nickname;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String password() {
        return password;
    }

    @Override
    public String toString() {
        String stringBuilder;
        stringBuilder = "User nickname - " +
                nickname + ", Email - " +
                email + ", Password - " +
                password;
        return stringBuilder;
    }
}
