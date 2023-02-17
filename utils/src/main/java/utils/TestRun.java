package utils;

import org.junit.Test;

public class TestRun {
    @Test
    public  void  testGetName(){
        System.out.println("testGetName");
        UtilMan utilNet = new UtilMan();
        System.out.println(utilNet.getName());
    }

    @Test
    public  void  testGetSex(){
        System.out.println("testGetSex");
        UtilMan utilNet = new UtilMan();
        System.out.println(utilNet.getSex());
    }


}
