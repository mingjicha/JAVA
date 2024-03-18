package Test;

public class TestA {
    public static void main(String[] args) {
        int result = 0;
        // 1. [나누기] result 값은?
        result = 10 / 3;
        System.out.println(result);
        //  [결과] 3

        // 2. [나머지] result 값은?
        result = 10 % 3;
        System.out.println(result);
        // [결과] 1

        // 3. [더하기] result 값은?
        result = 10 + 20;
        System.out.println("10 + 20 = "+result);
        // [결과] 10 + 20 = 30

        // 4. [빼기] result 값은?
        result = 20 - 30;
        System.out.println("20 - 30 = "+result);
        // 	[결과] 20 - 30 = -10

        // 5. [곱하기] result 값은?
        result = 3 * 7;
        System.out.println("3 * 7 = "+result);
        // [결과] 3 * 7 =  21

        // 6. [비교] result 값은?
        int a = 10;
        int b = 30;

        System.out.println(a > b); // [결과] false
        System.out.println(a <= b); // [결과] true
        System.out.println(a == b); // [결과] false
        System.out.println(a != b); // [결과] true

        // 7. [논리] result 값은?
        boolean c = true;
        boolean d = false;

        System.out.println(c && d); // [결과] false
        System.out.println(c || d); // [결과] true

    }
}
