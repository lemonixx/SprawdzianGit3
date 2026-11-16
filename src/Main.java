import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nazwę swojej klasy");
        String name = scanner.nextLine();
        System.out.println("Podaj poziom klasy");
        int level = scanner.nextInt();
        System.out.println("Witaj"+name+"Za"+(5-level)+"lata będę pisał maturę !");
    }
}
