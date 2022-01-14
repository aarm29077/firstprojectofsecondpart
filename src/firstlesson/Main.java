package firstlesson;

public class Main {
    public static void main(String[] args) {
        Valodik valodik = new Valodik(82,"Valodik");

        changePersonsName(valodik);
        System.out.println(valodik.getName());

        int a=15;
        changeIntoNegative(a);
        System.out.println(a);
    }
    public static void changePersonsName(Valodik valodik){
        valodik.setName("Vaxarshak");
    }
    public static void changeIntoNegative(int number){
        number=-1*number;
    }
}
