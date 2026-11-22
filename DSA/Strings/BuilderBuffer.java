package DSA.Strings;

public class BuilderBuffer 
{
    //append()
    //adds text to the end 
    public static void demoAppend()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("Programming");
        System.out.println(sb);
    }

    //insert()
    public static void demoInsert()
    {
        StringBuilder sb = new StringBuilder("Jva");
        sb.insert(1,"a");
        System.out.println(sb);
    }
    
    //delete()
    public static void demoDelete()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.delete(4,15);
        System.out.println(sb);
    }

    //replace() 
    public static void demoReplace()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.replace(0, 4, "Python");
        System.out.println(sb);
    }

    //reverse()
    public static void demoReverse()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.reverse();
        System.out.println(sb);
    }

    //capacity()
    public static void demoCapacity()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        System.out.println(sb.capacity());
    }

    //ensureCapacity()
    public static void demoEnsureCapacity()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.ensureCapacity(4);
        System.out.println(sb);
    }

    //setCharAt()
    public static void demoSetCharAt()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.setCharAt(0, 'k');
        System.out.println(sb);
    }

    //setLength()
    public static void demoSetLength()
    {
        StringBuilder sb = new StringBuilder("programming");
        sb.setLength(7);
        System.out.println(sb);
    }

    //substring
    public static void demoSubString()
    {
        StringBuilder sb = new StringBuilder("programming");
        sb.substring(0, 3);
        System.out.println(sb);
    }

    //toString
    public static void demoToString()
    {
        StringBuilder sb = new StringBuilder("programming");
        sb.toString();
        System.out.println(sb);
    }

    //String Buffer() --same methods are available in string buffer
    //diff thread safe (syncronized)
    public static void demoStringBufferMethod()
    {
        StringBuffer sb = new StringBuffer("Java Programming");
        sb.append("Programming");
        sb.reverse(); //reversed after appending
        //implement other methods here
        System.out.println(sb);
    }

    public static void main(String[] args) 
    {
        demoAppend(); 
        demoInsert();  
        demoDelete();
        demoReplace();
        demoReverse();
        demoCapacity();
        demoEnsureCapacity();
        demoSetCharAt();
        demoSetLength();
        demoSubString();
        demoToString();
        demoStringBufferMethod();
    }    
}
