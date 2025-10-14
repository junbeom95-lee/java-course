package chapter1.array;

public class Main {
    public static void main(String[] args) {

        //모험가 명단을 관리하는법:
        String name1 = "gygim";
        String name2 = "jblee";

        String[] adventurerList = {"gygim", "jblee"};

        //1. 배열 선언
        int[] arr;

        //2. 배열 길이 할당
        arr = new int[5];
        //arr = [] [] [] [] []

        //3. 배열 선언과 길이 동시에 할당
        int[] arrTest = new int[5];
        //arrTest = [] [] [] [] [] <- 빈공간

        //4. 배열 선언과 동시에 배열의 요소 할당
        int[] arrNum = {10, 20, 30, 40, 50};
        //[10, 20, 30, 40, 50]

        //배열의 길이
        int arrLength = arr.length;
        System.out.println("arrLength = " + arrLength);

        //문자열 배열 선언
        String[] arrStr = new String[5];    //[""]

        //논리형 배열 선언
        boolean[] arrBool = new boolean[5];

        //배열의 요소에 접근 : 인덱스 활용 방법
        arr = new int[]{10, 20, 30, 40, 50};

        System.out.println("배열의 1 번째 요소 접근: " + arr[0]);

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        System.out.println("배열의 1 번째 요소 접근: " + arr[0]);
        System.out.println("배열의 2 번째 요소 접근: " + arr[1]);
        System.out.println("배열의 3 번째 요소 접근: " + arr[2]);
        System.out.println("배열의 4 번째 요소 접근: " + arr[3]);
        System.out.println("배열의 5 번째 요소 접근: " + arr[4]);
        System.out.println("배열의 4 번째 요소 접근: " + arr[3]);

        //배열 탐색
        for (int i = 0; i < arr.length; i++) {
            System.out.println("인덱스: " + i + ", 값: " + arr[i]);
        }

        //향상된 for 문
        for( int a : arr) {
            System.out.println("값: " + a);
        }

        //2차원 배열
//        boolean[][] board = new boolean[2][3];
        //[][][]
        //[][][]

        boolean[][] board = {
                {true, false},
                {false, true}
        };
        System.out.println(board[0][0]);
        System.out.println(board[0][1]);
    }
}
