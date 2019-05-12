package exception;

public class Main {
    public static void main(String[] args) {

        System.out.println("Primul executat");
        try {
            System.out.println("Incerc executie");
            int i = 10 / 0;
            System.out.println("Am reusit sa execut");
        } catch (Exception e) {
            System.out.println("In catch");
        }
        System.out.println("Ultimul executat");
    }
}
