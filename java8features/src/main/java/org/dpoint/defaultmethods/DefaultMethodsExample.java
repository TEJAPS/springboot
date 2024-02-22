package org.dpoint.defaultmethods;

public class DefaultMethodsExample implements Sayable{
    // interface can define abstract methods - without implementation
    // default methods with implementation
    // static methods with implementation - these methods are not inherited
    // from java9 onwards it allows private and public method calling private method
    // after default methods, diff b/w abstract class and interface is abstract class can have constructor
    public void defaultMethodExample(){

    }

    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }
}

interface Sayable{
    // default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
    // static method - can be called using Sayable.sayLouder only as this is not inherited by child
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}