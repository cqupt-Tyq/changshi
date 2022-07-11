package fanxing;
/*Arrays工具中的一个静态方法，返回有指定数组支持的固定大小的列表
List接口中有一个静态方法，返回包含任意元素的不可变列表
Set接口中有一个方法，返回包含任意数量元素的不可变集合666
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Argsdemo {
    public static void main(String[] args) {
        //Arrays工具中的一个静态方法，返回有指定数组支持的固定大小的列表
        List<String> list=Arrays.asList("hello","world","java");
        //list.add不能用因为只能固定,但是能修改
        list.set(1,"javase");
        System.out.println(list);

        //List接口中有一个静态方法，返回包含任意元素的不可变列表
        List<String> f=List.of("hello","world","java","world/*可重复*/");//接口中一个静态方法,可以直接用
        /*list.remove("java");list.add("java)不可变也不可修改*/
        System.out.println(f);

//Set接口中有一个方法，返回包含任意数量元素的不可变集合
        Set<String> set= Set.of("world","hello","java");//不允许重复元素
        System.out.println(set);



    }
}
