package j07_반복;

public class Loop6 {
    public static void main(String[] args) {


        int n = 5;


        for(int i = 0; i < n; i++) {   //반복탈출조건    // for문은 무언가를 순차적으로 증가시킬 떄 사용
            System.out.println(i + 1);
        }

        int i = 0;

        while(i < n) {   //반복탈출조건           //while문은 if처럼 조건이 있을 때 사용
            System.out.println(i + 1);
            i++;
        }

    }
}
