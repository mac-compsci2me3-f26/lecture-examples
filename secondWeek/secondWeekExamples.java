package secondWeek;

public class secondWeekExamples {
    public static void main(String[] args) {
    
    // Example on Char
    // Char in C is one byte - using ascii (256 characters), while char in Java is using UTF-16 encoding - need two bytes
    // char[] chars = {'A', 'a', 'z', 'Z', '0', '9', 'α'};
    // for (char c : chars) {
    //     System.out.printf("'%c' -> U+%04X (decimal: %d)%n", c, (int)c, (int)c);
    // }

    //Examples on TypeCasting
    //float IEEE 754: 1 bit for sign, 8 bits for exponent, and 23 bits for significant
    //float stores the exponent separately from the mantissa (things after decimal points)
    
    // float huge = 3.4E38f;       
    // float small = 16777217; // will lose precision

    // System.out.println("Demonstrating precision in float");
    // System.out.println("3.4E38f : actual: "+huge);
    // System.out.println("16777217 : actual: "+small);
    // System.out.println("==================================");
    
    // // the actual range of float -3.4E38 to +3.4E38, safe for integer -16,777,216 to +16,777,216
    // // int to float 

    // // no loss
    // int int1 = 1000000;    // Safe - within 2^24
    // int int2 = 16777216;
    // System.out.println("Example 1-1: int to float: no loss");
    // System.out.println("Before casting: "+ int1 + "; After casting: "+ (float)int1);
    // System.out.println("Before casting: "+ int2 + "; After casting: "+ (float)int2);
    // System.out.println("==================================");

    // // loss
    // System.out.println("Example 1-2: int to float: data loss");
    // int int3 = 16777217;   // 2^24 + 1
    // int int4 = 123456789;  // Much larger
    // System.out.println("Before casting: "+ int3 + "; After casting: "+ (float)int3);
    // System.out.println("Before casting: "+ int4 + "; After casting: "+ (float)int4);
    // System.out.println("==================================");

    // // long to float 

    // // no loss
    // System.out.println("Example 2-1: long to float: no loss");
    // long long1 = 5000000L;     // Safe - within 2^24
    // long long2 = 16777216L;
    // System.out.println("Before casting: "+ long1 + "; After casting: "+ (float)long1);
    // System.out.println("Before casting: "+ long2 + "; After casting: "+ (float)long2);
    // System.out.println("==================================");

    // // loss
    // System.out.println("Example 2-2: long to float: data loss");
    // long long3 = 16777217L;      // 2^24 + 1
    // long long4 = 9876543210L;   
    // System.out.println("Before casting: "+ long3 + "; After casting: "+ (float)long3);
    // System.out.println("Before casting: "+ long4 + "; After casting: "+ (float)long4);
    // System.out.println("==================================");

    // // long to double
    // // double: 1 bits for sign, 11 bits for exponent, and 52 bits for mantaisa (64 bits)
    
    // // no loss
    // System.out.println("Example 3-1: long to double: no loss");
    // long long5 = 1234567890123456L;     // Safe - within 2^53
    // long long6 = 9007199254740992L; 
    // System.out.println("Before casting: "+ long5 + "; After casting: "+ (double)long5);
    // System.out.println("Before casting: "+ long6 + "; After casting: "+ (double)long6);
    // System.out.println("==================================");

    // long long7 = 9007199254740993L;  // 2^53 + 1
    // long long8 = Long.MAX_VALUE;
    // System.out.println("Example 3-2: long to double: data loss");
    // System.out.println("Before casting: "+ long7 + "; After casting: "+ (double)long7);
    // System.out.println("Before casting: "+ long8 + "; After casting: "+ (double)long8);
    // System.out.println("==================================");    

    // Question why no data loss from int to double?
    
    // Examples on Enum
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    // using integer, string, and other types can cause problem, like typos, readability etc.

    Day today = Day.FRIDAY;

    enum Priority {
        LOW,      // 0
        MEDIUM,   // 1  
        HIGH,     // 2
        CRITICAL  // 3
    }

    Priority task1 = Priority.LOW;
    Priority task2 = Priority.HIGH;

    int result = task1.compareTo(task2);
    if (result > 0 ){
        System.out.println("Task 1 should be done first");
    } else if (result < 0) {
        System.out.println("Task 2 should be done first");
    } else {
        System.out.println("Task 1 and 2 should be done the same time");
    }
    

    // Examples on Short Circuiting

    boolean a = false;
    boolean b = true;
    int test = 4;

    boolean result1 = a && (methodWontBeCalled());

    System.out.println(result1);

    // bitwise operator

    int n = 0B00001101;
    int fourthBitFromRight1 = (n & 0b1000) / 0b1000;
	int fourthBitFromRight2 = (n & (1 << 3)) >> 3;

    System.out.println("Extracting the 4th bit: "+fourthBitFromRight1+", should be the same as: "+fourthBitFromRight2);
    
    }
    public static boolean methodWontBeCalled() {
        System.out.println("methodWontBeCalled() was executed!");
        return true;
    }
}
