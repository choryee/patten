package ex13_ChatGPT.DesignPatten.Mediator;


import java.util.List;

import java.util.ArrayList;

interface ChatMediator{
    void sendMessage(String message, User user);
    void addUser(User user);
}

class ChatRoom implements ChatMediator{
    private List<User> users=new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        for(User u : users){
            if(u != null){ //여기 sendMessage하면, 바로 receiveMessage되게.
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}

class User{
    private String name;
    private ChatMediator chatMediator;

    User(String name, ChatMediator chatMediator){
        this.name=name;
        this.chatMediator=chatMediator;
        chatMediator.addUser(this);
    }

    void sendMessage(String message ){
        chatMediator.sendMessage(message, this);
    }

    void receiveMessage(String message){
        System.out.println(name+" received message>> "+message );
    }
}


public class MediatorPatternEx {
    public static void main(String[] args) {
        ChatMediator cm=new ChatRoom();
        cm.addUser(new User("Jon", cm));
        cm.addUser(new User("Lee", cm));

        cm.sendMessage("what's up", new User("park", cm));

    }

}
