package testng;

/**
 * testng测试用例1
 */

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public  class Demo1_PutIn {

    @Test
    public void putInA(){
        System.out.println("装入坚果A");
    }
    @Test
    public void putInB(){
        System.out.println("装入坚果B");
    }
    @Test
    public void putInC(){
        System.out.println("装入坚果C");
    }
    @Test
    public void putInD(){
        System.out.println("装入坚果D");
    }
    @Test
    public void putInE(){
        System.out.println("装入坚果E");
    }
    @AfterMethod
    public void record(){
        System.out.println("头盔哥统一记录");
    }


}
