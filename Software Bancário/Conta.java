public class Conta
{
    private int numero;
    private String titular;
    private double total;
    
    public Conta (int numero, String titular)
    {
        this.numero = numero;
        this.titular = titular;
    }
    public Conta (int numero, String titular, double deposito)
    {
        this.numero = numero;
        this.titular = titular;
        depositar(deposito);
    }
    public int mostrarNumero()
    {
        return numero;
    }
    public String mostrarTitular()
    {
        return titular;
    }
    public void setaTitular(String titular)
    {
        this.titular = titular;
    }
    public double mostrarTotal()
    {
        return total;
    }
    public void depositar(double quantidade)
    {
        total += quantidade;
    }
    public void saque(double quantidade)
    {
        total -= quantidade + 3.0;
        if (total < 0){
            System.out.println("Saldo insuficiente");
            total = total + quantidade + 3;
        }
    }
    public String toString()
    {
        return "Conta "
                    + numero
                    + ", Titular "
                    + titular
                    + ", Total: R$ "
                    + String.format("%.2f", total);
    }
}