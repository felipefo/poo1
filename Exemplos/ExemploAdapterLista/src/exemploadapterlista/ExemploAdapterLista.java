
package exemploadapterlista;

import exemploadapterlista.modelo.Funcionario;

public class ExemploAdapterLista {

    
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];
        
        funcionarios[0] = new Funcionario("felipe");
        funcionarios[1] = new Funcionario("joão");
        funcionarios[2] = new Funcionario("josé");
        funcionarios[3] = new Funcionario("artur");

        FolhaDePagamento folha = new FolhaDePagamento();
        
        
        
        folha.processaPagamentoFuncionarios(funcionarios);
               
        
    }
    
    
    
}
