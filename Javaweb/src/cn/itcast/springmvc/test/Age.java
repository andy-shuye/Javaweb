package cn.itcast.springmvc.test;

public class Age {
    public void test(int n) throws MyException {
        if (n < 0 || n > 100) {
            MyException e = new MyException(n);
            throw e;
        } else {
            System.out.print("合理的年龄!");
        }
    }
}
