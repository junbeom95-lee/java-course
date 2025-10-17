package clazzsession;

public class Main {

    public static void main(String[] args) {
        // -- mayo
        // - name
        // - age
        // - isNeutering
        //기본 생성자
//        Cat mayo = new Cat();
//        Cat nez = new Cat();


        int a = 1;
        System.out.println("a = " + a);
        Cat mayo = new Cat("mayo", 7);
        System.out.println("mayo = " + mayo);


        Cat nez = new Cat("nez", 6, false);

        String mayoName = mayo.getName();
        System.out.println("mayoName = " + mayoName);

        boolean is = mayo.getIsNeutering();
        System.out.println("is = " + is);

        mayo.setIsNeutering(true);
        System.out.println("is = " + mayo.getIsNeutering());

    }
}
