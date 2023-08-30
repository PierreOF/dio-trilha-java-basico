import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int Numero;
        String Agencia;
        String nomeCliente;
        float Saldo;
        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        System.out.println("Por favor,digite o número da Agência!");
        Numero = input.nextInt();
        System.out.println("Por favor,digite a Agência!");
        Agencia = inputStr.nextLine();
        System.out.println("Por favor,digite o seu nome!");
        nomeCliente = inputStr.nextLine();
        System.out.println("Por favor,digite o seu saldo!");
        Saldo = input.nextFloat();


        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco," +
                " sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
    }
}
