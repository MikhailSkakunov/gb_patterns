package Lesson_03;

public class MainBuilder {
    public static void main(String[] args) {
        User user = new ManBuilder()
                .nickname("Bob")
                .email("skak8946@yandex.ru")
                .password("123")
                .build();
        System.out.println(user);

    }
}
