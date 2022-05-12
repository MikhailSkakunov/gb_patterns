package Lesson_03;

public class ManBuilder implements Builder {

    private String nickname;
    private String email;
    private String password;

    @Override
    public Builder nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    @Override
    public Builder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Builder password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public User build() {
        return new ManUser(nickname, email, password);
    }
}
