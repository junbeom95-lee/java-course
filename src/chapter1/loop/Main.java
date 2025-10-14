package chapter1.loop;

public class Main {
    public static void main(String[] args) {

        //반복문(for)
        for (int i = 0; i < 10; i++) {
            if (i == 4) break;   //i가 4가 되면 루프에서 벗어남
            if (i == 2) continue; //i가 2가 되었을때 sout안하고 스킵
            System.out.println("안녕하세요!");
        }

        //반복문(while)
        int i = 1;
        while (i <= 10) {
            System.out.println("안녕하세요!");
            i++;
        }

        //반복문(do-while)
        do {
            System.out.println("안녕하세요!");
            i++;
        } while (i <= 10);
    }
}
