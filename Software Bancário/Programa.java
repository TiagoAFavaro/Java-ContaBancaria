import java.util.Scanner;
class Programa
{
    public static void main (String args[])
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número da conta, (apenas numeros são aceitos): ");
        int numero = entrada.nextInt();
        Conta conta;
        
        System.out.println("Digite o nome do titular: ");
        entrada.nextLine();
        String titular = entrada.nextLine();
        
        System.out.println("Deseja fazer um depósito inicial? [S/N]");
        char resposta = entrada.next().charAt(0);
        if (resposta == 's')
        {
            System.out.println("Digite o valor do seu depósito: ");
            double deposito = entrada.nextDouble();
            conta = new Conta (numero, titular, deposito);
        }
        else
        {
            conta = new Conta (numero, titular);
        }
        
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);
        
        System.out.println();
        System.out.println("Deposite um valor: ");
        double valor = entrada.nextDouble();
        conta.depositar(valor);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);
        
        System.out.println();
        System.out.println("Digite um valor para sacar da conta, será descontado 3,00 de taxa de saque: ");
        double sacar = entrada.nextDouble();
        conta.saque(sacar);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);
        
        entrada.close();
    }
}