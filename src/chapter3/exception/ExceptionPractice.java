package chapter3.exception;

public class ExceptionPractice {

    //1. 언체크 예외 호출 예시
    public void callUncheckedException() {
        try {
            if (true) {
                System.out.println("언체크 예외 발생");
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("언체크 예외 처리");
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }
    }

    //2. 체크 예외 호출 예시
    public void callCheckedException() {

        try {
            if (true) {
                System.out.println("체크 예외 발생");
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }
    }
}
