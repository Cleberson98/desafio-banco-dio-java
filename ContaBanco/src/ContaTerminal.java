import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome!");
        var nome = scanner.next();
        System.out.println("Por favor, digite o número da sua agência!");
        var agencia = scanner.next();
        System.out.println("Por favor, digite o número da sua conta!");
        var conta = scanner.nextInt();
        System.out.println("Por favor, digite o seu saldo");
        var saldo = scanner.nextFloat();
        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s, e seu saldo %s já está disponíve para saque \n", nome, agencia, conta, saldo, args);
    }
}
