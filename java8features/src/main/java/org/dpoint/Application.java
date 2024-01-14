package org.dpoint;

import org.dpoint.Stream.StreamExample;

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

        StreamExample se = new StreamExample();
//        se.filterCollectExample();
//        se.iterationExample();
        se.reduceExample();
    }
}
