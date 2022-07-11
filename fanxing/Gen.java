package fanxing;

public class Gen {
    public static void main(String[] args) {
        /*generic<String> s = new generic<String>();
        s.setT("林青霞");
        System.out.println(s.getT());

        generic<Integer> s1 = new generic<Integer>();
        s1.setT(30);
        System.out.println(s1.getT());
        s.show("kahfk");

        generic<Boolean> g3=new generic<Boolean>();
*/
        generic g = new generic();
        g.show("sf");
        g.show(30);
        g.show(12.45);
    }
}
