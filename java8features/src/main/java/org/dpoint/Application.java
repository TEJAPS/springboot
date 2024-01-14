package org.dpoint;

import org.dpoint.lambda.LambdaExpressionExample;
import org.dpoint.methodreferences.MethodReferenceExample;

public class Application {
    public static void main(String argsp[]){
//        LambdaExpressionExample lee = new LambdaExpressionExample();
//        lee.examples();
//        lee.lambdaThreadExample();
//        lee.lambdaComparatorExample();
//        lee.lambdaFilterCollectionData();

        MethodReferenceExample mre = new MethodReferenceExample();
        mre.exampleOfStaticMethodReference();
    }
}
