
package appcontacorrente2;

public class Titular {
    
    private String nome, sobrenome, cpf;

    public Titular(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public Titular(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String dados(){
        if (cpf == null){
            return "Nome do titular: " + nome + " " + sobrenome;
        }else{
            return "Nome do titular: " + nome + " " + sobrenome
                    +"\n CPF: " + cpf;
        }
    }
    
}
