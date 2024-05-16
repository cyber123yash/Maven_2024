package TestNgExam;

import org.testng.annotations.Test;
public class NormalTestCases {

    @Test(priority = 1)
    public void priorityDemo_Q(){
        System.out.println("priorityDemo_Q");
    }


    @Test(priority = 'X')
    public void priorityDemo_V(){
        System.out.println("priorityDemo_V");
    }


    @Test(priority = 3)
    public void priorityDemo_K(){
        System.out.println("priorityDemo_K");
    }


    @Test(priority = 'C')
    public void priorityDemo_L(){
        System.out.println("priorityDemo_L");
    }


    @Test(priority = -5)
    public void priorityDemo_P(){
        System.out.println("priorityDemo_P");
    }

    @Test(priority = 6)
    public void priorityDemo_H(){
        System.out.println("priorityDemo_H");
    }

    @Test(priority = 9)
    public void priorityDemo_H(){
        System.out.println("priorityDemo_N");
    }

}
