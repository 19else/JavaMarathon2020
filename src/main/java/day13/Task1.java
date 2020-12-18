package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Tom");
        User user2 = new User("Roy");
        user1.sendMessage(user2, "Привет, я Том");
        user1.sendMessage(user2, "Glade to see you!");

        user2.sendMessage(user1, "Hi! I'm Roy");
        user2.sendMessage(user1, "Nice to meet you!");

        user1.sendMessage(user2, "What do you doing, Roy?");
        user2.sendMessage(user1, "Trying to learn Java, Tom");
        user2.sendMessage(user1, "It's very hard!");

        MessageDatabase.showDialog(user1, user2);
    }
}
