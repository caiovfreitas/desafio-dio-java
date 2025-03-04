import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu Número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o Número da sua Agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, informe seu Nome Completo:");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String nomeCompleto = scanner.nextLine();

        System.out.println("Por favor, informe o seu Saldo Disponível:");
        double saldo = scanner.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCompleto, numeroAgencia, numeroConta, saldo);

        scanner.close();
    }

}
