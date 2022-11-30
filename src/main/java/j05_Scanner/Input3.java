package j05_Scanner;

import java.util.Scanner;

public class Input3 {


        /*
            이름 : 김준일             name
            나이 :                   age
            주소 : 부산 동래구 사직동   address
            연락처 : 010 9988 1916   phone

            사용자의 이름은 김준일이고 나이는 29입니다.
            주소는 부산 동래구 사직동이며 연락처는 010 9988 1916입니다.
         */
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);


       String name = null;
       int age = 0;
       String address = null;
       String phone = null;

       System.out.print("이름: ");  //next랑 nextInt는 엔터를 인식안함.
       name = scanner.next();

       System.out.print("나이: ");
       age = scanner.nextInt();
        scanner.nextLine();     //위에 남아있는 엔터를 없애주기 위해 넣어줌.

       System.out.print("주소: ");    //nextLine은 스페이스와 엔터를 인식함.

       address = scanner.nextLine();

       System.out.print("연락처: ");
       phone = scanner.nextLine();


        System.out.println("사용자의 이름은 "+ name +"이고 나이는 " + age + "입니다.");
        System.out.println("주소는 " + address + "이며 연락처는 " + phone +"입니다.");

    }
}















