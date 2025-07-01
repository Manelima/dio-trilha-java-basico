import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomecliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao Banco!");
        System.out.println("Por favor, informe o número da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, informe o nome da agência:");
        agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, informe o nome do cliente:");
        nomecliente = scanner.nextLine();

        System.out.println("Por favor, informe o saldo da conta:");
        saldo = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!");

        System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numeroConta + " e seu saldo " + saldo + " já disponível para saque.");

        scanner.close();
//TODO: Conhecer e importar a classe Scanner

// Exibir as mensagens para nosso usuário

//Obter pela scanner os valores digitados no terminal

//Exibir a mensagem da conta criada

}
}
