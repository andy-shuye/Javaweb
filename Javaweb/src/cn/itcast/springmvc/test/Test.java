package cn.itcast.springmvc.test;

public class Test {
    public static int haha() {
        int x = 1;
        try {
//            x++;
            return x;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ++x;
//            return x;
        }
        return x;
    }
    public static void main(String[] args) {
        /*Age age = new Age();
        try {
            age.test(200);
            System.out.print("抛出异常后的代码") ;//这段代码是不会被执行的，程序已经被转向
        } catch (MyException e) {
            System.out.print(e.toString());
            return;
        } finally {
            System.out.print("进入finally！ ");
        }*/
        System.out.println(haha());
    }
}
