package f13;

public class IfangfaTest {
    public static void main(String[] args) {
        Ifangfa a = new Ifangfa() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        };
        System.out.println(a.method(10,20));
    }

}


