package org.dpoint;

import org.dpoint.Stream.StreamExample;
import org.dpoint.base64.Base64Example;
import org.dpoint.defaultmethods.DefaultMethodsExample;

public class Application {
    public static void main(String argsp[]) {
//        LambdaExpressionExample lee = new LambdaExpressionExample();
//        lee.examples();
//        lee.lambdaThreadExample();
//        lee.lambdaComparatorExample();
//        lee.lambdaFilterCollectionData();

//        MethodReferenceExample mre = new MethodReferenceExample();
//        mre.exampleOfStaticMethodReference();
//        mre.exampleOfNonStaticMethodReference();
//        ConstructorMethodReference cmr = new ConstructorMethodReference();
//        cmr.constructorMethodRefExample();

//        StreamExample se = new StreamExample();
//        se.filterCollectExample();
//        se.iterationExample();
//        se.collectExample();

//        Base64Example base64Example = new Base64Example();
//        base64Example.base64EncoderDecoder();

        DefaultMethodsExample defaultMethodsExample = new DefaultMethodsExample();
        defaultMethodsExample.say();
        defaultMethodsExample.sayMore("overrided method in child class");

    }
}
