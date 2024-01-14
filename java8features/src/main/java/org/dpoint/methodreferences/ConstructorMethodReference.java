package org.dpoint.methodreferences;

interface Messageable{
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}

public class ConstructorMethodReference {
    public void constructorMethodRefExample(){
        Messageable hello = Message::new;
        hello.getMessage("### CustomArgMessage");
    }
}
