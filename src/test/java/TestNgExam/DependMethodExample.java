package TestNgExam;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependMethodExample {

    @Test
     public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verfiy Login");
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomePage(){
        System.out.println("Verfiy Home Page");
    }

    @Test
    public void fundtransfer(){
        System.out.println("Fund Transfer");
    }

}
