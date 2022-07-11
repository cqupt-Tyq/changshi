package fanxing;

import java.util.ArrayList;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
        genersc<String> g1=new generscimp<String>();
        g1.show("林青霞");
        List<?> list1=new ArrayList<String>();
        List<?> list2=new ArrayList<Number>();

        //上限
        List<? extends  Number> list4=new ArrayList<Number>();
        //下限
        List<? super Number> list5=new ArrayList<Object>();
    }
}
