package testng;

/**
 * @program: testng
 * @description: 分组测试
 * @author: mumu
 * @create: 2021-04-25 23:37
 **/

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public  class Demo3_Group {

    @Test(groups = {"group01"})
    public void putInA(){
        System.out.println("装入坚果A");
    }
    @Test(groups = {"group01"})
    public void putInB(){
        System.out.println("装入坚果B");
    }
    @Test(groups = {"group01","group02"})
    public void putInC(){
        System.out.println("装入坚果C");
    }
    @Test(groups = {"group02"})
    public void putInD(){
        System.out.println("装入坚果D");
    }
    @Test(groups = {"group02"})
    public void putInE(){
        System.out.println("装入坚果E");
    }
    @AfterMethod
    public void record(){
        System.out.println("头盔哥统一记录");
    }


}
