package j04_연산자;

/**
 *              <<<<<<<<<<<<<  논리 연산자  >>>>>>>>>>>>>
 *
 *           True(1) False(0)
 *
 *
 *           AND   (&&) -> 곱        T x T => T,   T x F => F,   F X F => F  하나라도 거짓이면 무조건 거짓
 *           OR    (||) -> 합        T + T => T,   T + F => T,   F + F => F  하나라도 참이면 무조건 참
 *           NOT   (!)  -> 부정
 */
public class Operation2 {
    public static void main(String[] args) {

        boolean flag1 = true;
        boolean flag2 = false;


        // 복사하는법 : control + d
        boolean result1 = flag1 && flag1;
        System.out.println("T x T => " + result1);

         boolean result2 = flag1 && flag2;
        System.out.println("T x F => " + result2);

         boolean result3 = flag1 && flag2;
        System.out.println("F x T => " + result3);
        System.out.println();

        boolean result4 = flag1 || flag1;
        System.out.println("T + T => " + result4);

        boolean result5 = flag1 || flag2;
        System.out.println("T + F => " + result5);

        boolean result6 = flag2 || flag2;
        System.out.println("F + F => " + result6);

        System.out.println();

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F x T => " + !result7);

        boolean result8 = 10 % 3 != 0;
        System.out.println("10 % 3 != 0 => " + result8);


        int year = 2022;
        boolean result9 = year % 2 == 0 && year % 300 != 0 || year % 100 == 0;
        System.out.println(result9);

    }
}













