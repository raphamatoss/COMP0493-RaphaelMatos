import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Halim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // primeiro formato: o numero de casos testes é dado:
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + " " + b);
        }

        // segundo formato: os casos testes terminam em 0 0
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a != 0 && b != 0) {
            System.out.println(a + " " + b);
        }

        // terceiro formato: os casos testes terminam em EOF
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + " " + b);
        }

        // quarto formato:
    }
}