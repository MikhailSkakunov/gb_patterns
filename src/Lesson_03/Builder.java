package Lesson_03;

public interface Builder {

    Builder nickname(String nickname);
    Builder email(String email);
    Builder password(String password);

    User build();
}
