package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author mumu
 * @program：testng
 * @Description: 流水线解决参数化问题
 * @date 2021/4/26 19:39
 */
public class Demo5_DataProvider {
    @DataProvider(name = "putInList")
    public Object[][] putInList(){
        Object[][] object;
        return object = new Object[][]{
            {"包裹1",1,5,0,1,1,},
            {"包裹2",1,1,3,0,1,},
            {"包裹3",1,0,0,4,1,},
        };
    }
    @Test(dataProvider = "putInList")
    public void putInA(String pageName,int aNum,int bNum,int cNum,int dNum,int eNum){
        System.out.println("一号选手操作：" + pageName + " 装入坚果A " + aNum + " 个");
        System.out.println("二号选手操作：" + pageName + " 装入坚果B " + bNum + " 个");
        System.out.println("三号选手操作：" + pageName + " 装入坚果C " + cNum + " 个");
        System.out.println("四号选手操作：" + pageName + " 装入坚果D " + dNum + " 个");
        System.out.println("五号选手操作：" + pageName + " 装入坚果E " + eNum + " 个");
    }

    @Test(threadPoolSize = 10, invocationCount = 100)
    public void pushLeadsMq(){
        String phone = "18383333333";
        String specName = "分发 + 1";
        String providerID = "7869854";

    }


}
