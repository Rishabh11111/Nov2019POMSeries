package testngfeatures;

import org.testng.annotations.Test;

public class Utili {

    @Test(priority = 1)
    public  void loginTest(){
        System.out.println("loginTest");
    }

    @Test(priority = 2)
    public  void homeTest(){
        System.out.println("homeTest");
    }

    @Test(priority =3)
    public  void cartTest(){
        System.out.println("cartTest");
    }

    @Test(priority = -1)
    public  void searchTest(){
        System.out.println("searchTest");
    }

    @Test()
    public  void m1Test(){
        System.out.println("m1Test");
    }

    @Test()
    public  void m2Test(){
        System.out.println("m2Test");
    }
}
