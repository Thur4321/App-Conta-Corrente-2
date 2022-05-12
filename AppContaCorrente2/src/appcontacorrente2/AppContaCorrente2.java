
package appcontacorrente2;

import javax.swing.JOptionPane;

public class AppContaCorrente2 {

    public static void main(String[] args) {
         String operações[] = {"Listar informações", "Saque", "Depósito", "Sair"};
        
        Conta objConta = null;
        
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do titular:", "Conta", 3);
        
        String sobrenome = JOptionPane.showInputDialog(null, "Informe o sobrenome do titular:", "Conta", 3);
                    
        String númeroConta=JOptionPane.showInputDialog(null,"Qual o número da sua conta","Conta",3);
        
        if (JOptionPane.showConfirmDialog(null, "Deseja informar o CPF?", "Salario", JOptionPane.YES_NO_OPTION, 3) == 0) {
            String cpf = JOptionPane.showInputDialog(null, "Informe o cpf do titular:", "Conta", 3); 
            objConta = new Conta(númeroConta, new Titular(nome, sobrenome, cpf));
        } else {
            objConta = new Conta(númeroConta, new Titular(nome, sobrenome));
        }
                    
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso.", "Conta", 1);
        
        String opçãoUser = "";
        
        while (!opçãoUser.equals(operações[3])) {
            opçãoUser = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada:", "Conta", 3, null, operações, operações[0]);
            
            switch (opçãoUser) {
                case "Listar informações":
                    if(objConta!=null){
                        JOptionPane.showMessageDialog(null, "As informações da sua conta são:\n" + objConta.dados(), "Conta", 1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Cadastre seus dados", "Conta", 1);
                    }
                    
                break;
                case "Saque":
                    if(objConta!=null){
                        float saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do seu saque:", "Conta", 3));
                        boolean sacou = objConta.saque(saque);
                        if (sacou){
                            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso.", "Conta", 1);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Saque indisponível, saldo insuficiente.", "Conta", 1);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Cadastre seus dados", "Conta", 1);
                    }
                    
                break;
                case "Depósito":
                    if(objConta!=null){
                        float depósito = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do seu depósito:", "Conta", 3));
                        objConta.depósito(depósito);
                        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso.", "Conta", 1);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Cadastre seus dados", "Conta", 1);
                    }
            }
        }
        System.exit(0);
    }
    
}
