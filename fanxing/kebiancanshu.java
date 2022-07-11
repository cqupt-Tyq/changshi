package fanxing;

public class kebiancanshu {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        sum(20, 30);
        sum(30, 40);
    }

    public static int sum(int... a) {//相当于传入数组
        // return 0;
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

}
