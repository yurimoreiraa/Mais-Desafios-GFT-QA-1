import java.io.IOException;
import java.util.Scanner;

public class Theon {

    public static void main(String[] args) throws IOException {
        //3 / 6 - A Resposta de Theon
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int T, menor = 0, posMenor = 0;
        for (int i = 1; i <= N; i++) {
            T = leitor.nextInt();
            if (i == 1) {
                menor = T;
                posMenor = i;
            } else if (T < menor) {
                menor = T;
                posMenor = i;
            }
        }
        System.out.println(posMenor);
    }
}