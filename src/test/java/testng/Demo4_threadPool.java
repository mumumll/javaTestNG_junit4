package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * @author mumu
 * @Description: 线程测试
 * @date 2021/4/26 15:59
 */
public class Demo4_threadPool {
    @Test
    public void putInA(){
        System.out.println("装入坚果A");
    }
    @Test
    public void putInB(){
        System.out.println("装入坚果B");
    }
    @Test(threadPoolSize = 3, invocationCount = 6)
    public void putInC(){
        System.out.println(Thread.currentThread().getName() + ":装入坚果C");

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
