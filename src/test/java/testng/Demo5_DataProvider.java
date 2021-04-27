package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * 读取数组参数
     * @param pageName
     * @param aNum
     * @param bNum
     * @param cNum
     * @param dNum
     * @param eNum
     */
    @Test(dataProvider = "putInList")
    public void putInA(String pageName,int aNum,int bNum,int cNum,int dNum,int eNum){
        System.out.println("一号选手操作：" + pageName + " 装入坚果A " + aNum + " 个");
        System.out.println("二号选手操作：" + pageName + " 装入坚果B " + bNum + " 个");
        System.out.println("三号选手操作：" + pageName + " 装入坚果C " + cNum + " 个");
        System.out.println("四号选手操作：" + pageName + " 装入坚果D " + dNum + " 个");
        System.out.println("五号选手操作：" + pageName + " 装入坚果E " + eNum + " 个");
    }

    /**
     * 读取文件数据
     * @param pageName
     * @param aNum
     * @param bNum
     * @param cNum
     * @param dNum
     * @param eNum
     */
    @Test(dataProvider = "putInListFile")
    public void putInFile(String pageName,String aNum,String bNum,String cNum,String dNum,String eNum){
        System.out.print("忧伤哥 操作" + pageName + " 装入坚果A " + aNum + " 个！\n");

        System.out.print("炫酷哥 操作" + pageName + " 装入坚果B " + bNum + " 个！\n");

        System.out.print("羞涩哥 操作" + pageName + " 装入坚果C " + cNum + " 个！\n");

        System.out.print("暴怒哥 操作" + pageName + " 装入坚果D " + dNum + " 个！\n");

        System.out.print("傻笑哥 操作" + pageName + " 装入坚果E " + eNum + " 个！\n");

    }
    @DataProvider(name = "putInListFile")
    public Object[][] putInListFile() throws IOException {
        return getTestData("\\src\\main\\resources\\input_list.csv");
    }

    public static Object[][] getTestData(String fileName) throws IOException {

        String projectRoot = new File("").getAbsolutePath();
        List<Object[]> records = new ArrayList<Object[]>();
        String record;
        //设置字符集为GBK
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(projectRoot + fileName), "GBK"));
        //忽略CSV文件的标题行（第一行）
        String string = file.readLine();
        //遍历读取文件中除第一行外的其它所有行内容，并存储在名为records的ArrayList中，每一个records中存储的对象为一个string数组；
        while ((record = file.readLine()) != null) {
            String fields[] = record.split(",");
            records.add(fields);
        }
        //关闭文件
        file.close();
        //定义函数返回值Object[][],将list转换为一个Object的二维数组；
        Object[][] results = new Object[records.size()][];
        //设置二维数组每行的值，每行是一个Object对象
        for (int i = 0; i < records.size(); i++) {
            results[i] = records.get(i);
        }
        return results;
    }


}
