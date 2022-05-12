
package appcontacorrente2;

public class Conta {
    
    private float saldo;
    
    private String númeroConta;  
    
    private Titular titular;

    public Conta(String númeroConta, Titular titular) {
        this.númeroConta = númeroConta;
        this.titular = titular;
    }

    public String getNúmeroConta() {
        return númeroConta;
    }

    public void setNúmeroConta(String númeroConta) {
        this.númeroConta = númeroConta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public String dados(){
        return "Número da conta: "+númeroConta
                + titular.dados()
                +"\nSaldo: " + saldo;
        
    }
  
    public boolean saque(float saque){
        if (saque <= saldo){
            saldo = saldo - saque;
            return true;
        }
        return false;
    }
    
    public void depósito(float depósito) {
        saldo = saldo + depósito;
    }
    
    
}
