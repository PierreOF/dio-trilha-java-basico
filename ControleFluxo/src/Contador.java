import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        boolean parametrosValidos = VerificarParametros(firstNumber,secondNumber);

        if (parametrosValidos) {
            for (firstNumber=firstNumber;firstNumber<=secondNumber;firstNumber++){
                System.out.println(firstNumber);
            }
        }
    }

    static boolean VerificarParametros(int firstNumber , int secondNumber) throws ParametrosInvalidosException{
        boolean parametroValido = true;
        if (firstNumber>secondNumber) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            throw new ParametrosInvalidosException();
        }
        return parametroValido;
    }
}

