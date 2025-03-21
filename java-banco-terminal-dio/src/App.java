import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Bem-Vindo ao Banco Terminal");
        System.out.println("Digit o nome do usuário: ");

        String nome = scanner.next();

        System.out.println("Digite o sobrenome do usuário: ");

        String sobreNome = scanner.next();
        System.out.println("Digite o número da agência do usuário: ");
        int numeroBanco = scanner.nextInt();
        System.out.println("Digite o número da conta do usuário: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o saldo inicial do usuário: ");
        Double numeroSaldo = scanner.nextDouble();

        String message = String.format("""
                
                Olá, %s %s, o número da sua agência é: %d,"
                O numero da sua conta bancária é: %d"
                O seu saldo atual é de %.2f Reais """.formatted(nome, sobreNome, numeroBanco, numeroAgencia, numeroSaldo)
                );

        System.out.println(message);

    }
}
