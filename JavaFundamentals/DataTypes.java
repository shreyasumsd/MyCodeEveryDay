package JavaFundamentals;
//Day-7 (30-sept-2026)
// 8 types of data types in java

public class DataTypes {
    public static void main(String[] args) {
        
        // integer data types
        int salary = 100000;  //4 bytes
        byte b = 5; // -127 to 128
        Short year = 2026; //2 bytes - 16 bits - 2`16
        long population = 100000000000000L;

        //Floating point Data types 
        float percentage = 89.74f;
        double pi = 3.142857;

        //Character data type 
        char grade = 'A';

        //Boolean 
        boolean isPassed = true;

        System.out.println("Primitive Data Types ----");

        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + year);
        System.out.println("Int value: " + salary);
        System.out.println("Long value: " + population);
        System.out.println("Double value: " + pi);
        System.out.println("Float value: " + percentage);

        System.out.println("Char value: " + grade);

        System.out.println("Boolean value: " + isPassed);


    }
    
}
