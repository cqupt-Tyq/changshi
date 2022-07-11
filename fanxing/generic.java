package fanxing;

/*
public class generic<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public void show(T t ){
        System.out.println(t);//创建类的时候可用
    }
}*/
    //泛型方法
public class generic{
public<T> void show(T/*T为什么类型就锁定为什么类型*/ t){
    System.out.println(t);
}
}

