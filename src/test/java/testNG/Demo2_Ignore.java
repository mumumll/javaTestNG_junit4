package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * @program: testng
 * @description: 忽略测试和依赖测试
 * @author: mumu
 * @create: 2021-04-25 23:37
 **/
public class Demo2_Ignore {
    @Test
    public void putInA(){
        System.out.println("装入坚果A");
    }
    @Test
    public void putInB(){
        System.out.println("装入坚果B");
    }
    @Test(enabled = false)
    public void putInC(){
        System.out.println("装入坚果C");
    }
    @Test(dependsOnMethods = { "putInA" })
    public void putInD(){
        System.out.println("装入坚果D");
    }
    @Test(dependsOnMethods = { "putInB" })
    public void putInE(){
        System.out.println("装入坚果E");
    }
    @AfterMethod
    public void record(){
        System.out.println("头盔哥统一记录");
    }
}
