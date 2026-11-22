//Day-7 (30-sept-2026)
// How JVM behave with static, instant and local variable

public class DiffBtwnStatic {

    static int b; 
    int c ; //without static keyword
    public static void main(String[] args) {
        
        //Its mandatory that assign a value method
        //int a = 5;
        //System.out.println(a);

        //Static demo
        System.out.println(b);

        //Instance
        DiffBtwnStatic obj = new DiffBtwnStatic();
        System.out.println(obj.c);
    }
}
