package org.dpoint.methodreferences;

public class MethodReferenceExample {
    public void exampleOfStaticMethodReference() {
        // here we are mapping a static method to the method of functional interface using method reference example
        Sayable sayable = MethodReferenceExample::saySomething;
        sayable.say();

        // if it was with lambda
        Sayable sayable2 = () -> System.out.println("### Hellow, this is static method - via default lambda way");
        sayable2.say();
    }

    public void exampleOfNonStaticMethodReference() {
        MethodReferenceExample mre = new MethodReferenceExample();
        // nonstatic reference with object
        System.out.println("### nonstatic reference with object");
        Sayable sayable = mre::nonstaticSaySomething;
        sayable.say();

        // nonstatic reference with anonymous object
        System.out.println("### nonstatic reference with anonymous object");
        Sayable sayable1 = new MethodReferenceExample()::nonstaticSaySomething;
        sayable1.say();

    }

    public static void saySomething() {
        System.out.println("## MethodReference static method mapped - Hellow, this is static method");
    }

    public void nonstaticSaySomething() {
        System.out.println("## MethodReference static method mapped - Hellow, this is NON-static method");
    }

    public void inbuiltInterfaceMethodMappingExample() {
        // argument expects Runnable Functional Interface, so we are mapping run method with custom impl
        Thread t1 = new Thread(MethodReferenceExample::ThreadStatus);
        t1.start();
    }

    public static void ThreadStatus() {
        System.out.println("## inbuiltInterfaceMethodMappingExample - Thread is running");
    }
}

interface Sayable {
    void say();
}