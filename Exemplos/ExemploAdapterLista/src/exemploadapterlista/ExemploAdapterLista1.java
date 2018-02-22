
package exemploadapterlista;

import exemploadapterlista.modelo.Funcionario;
import java.util.LinkedList;

public class ExemploAdapterLista1 {

    
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];
        
        funcionarios[0] = new Funcionario("felipe");
        funcionarios[1] = new Funcionario("joão");
        funcionarios[2] = new Funcionario("josé");
        funcionarios[3] = new Funcionario("artur");

        FolhaDePagamento folha = new FolhaDePagamento();
                
        LinkedList listaFuncionarios = new LinkedList();
        for (Funcionario funcionario : funcionarios) {
            listaFuncionarios.add(funcionario);
        }        
        folha.processaPagamentoFuncionarios(listaFuncionarios);
               
        
    }
    
    
    
}
