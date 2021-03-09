package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        MessageDatabase.addNewMessage(user1, user2, "Привет, user2");
        MessageDatabase.addNewMessage(user1, user2, "Как дела?");

        MessageDatabase.addNewMessage(user2, user1, "Привет, user1");
        MessageDatabase.addNewMessage(user2, user1, "Отлично");
        MessageDatabase.addNewMessage(user2, user1, "Как ты?");

        MessageDatabase.addNewMessage(user3, user1, "Привет, user1!");
        MessageDatabase.addNewMessage(user3, user1, "Как твои дела");
        MessageDatabase.addNewMessage(user3, user1, "Чем занят??");

        MessageDatabase.addNewMessage(user1, user3, "Привет, user3");
        MessageDatabase.addNewMessage(user1, user3, "Норм");
        MessageDatabase.addNewMessage(user1, user3, "Твои как делишки?");

        MessageDatabase.addNewMessage(user3, user1, "У меня все хорошо?");

        MessageDatabase.showDialog(user1, user3);
    }
}
