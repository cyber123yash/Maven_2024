package TestNgExam;

import org.testng.annotations.Test;

public class InvocationCountExample {

        @Test(invocationCount = 20, invocationTimeOut = 4)
        public void invocationCountDemo(){
            System.out.println("Invocation Count");
        }
}


