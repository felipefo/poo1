package database.example;


import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class MainSqlLite {

    public static void main(String args[]) {
        CreateTable create = new CreateTable();
        create.createTable();

        String opcao = JOptionPane.showInputDialog("Escolha a opção"
                + "\n(1)criar Veículo"
                + "\n(2)listar Veículo\n"
                + "\n(3)remover Veículo\n");
        int opcaoEscolhida = Integer.parseInt(opcao);
        //Listar listar = new Listar();
        Veiculo veiculo = null;
        if (opcaoEscolhida == 1) {
            InsertRecords insert = new InsertRecords();
            String id = JOptionPane.showInputDialog("id");
            String marca = JOptionPane.showInputDialog("Marca:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            String ano = JOptionPane.showInputDialog("Ano:");
            String quilometragem = JOptionPane.showInputDialog("Quilometragem:");
            veiculo = new Veiculo();
            veiculo.setAno(Integer.parseInt(ano));
            veiculo.setId(Integer.parseInt(id));
            veiculo.setMarca(marca);
            veiculo.setModelo(modelo);
            veiculo.setQuilometragem(Integer.parseInt(quilometragem));
            pedeTipoVeiculo(veiculo);
            insert.insertRecord(veiculo);
        } else if (opcaoEscolhida == 2) {
            SelectTable select = new SelectTable();
            ArrayList list = select.selectTable();
            exibeVeiculos(list);
        } else if (opcaoEscolhida == 3) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id para remoção:"));
            DeleteRecord delete = new DeleteRecord();
            delete.deleteRecord(id);
        }
    }

    public static void pedeTipoVeiculo(Veiculo veiculo) {
        try {
            veiculo.setTipoVeiculo(JOptionPane.showInputDialog("Tipo Veículo(Carro, Moto, Caminhão,Ônibus):"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            pedeTipoVeiculo(veiculo);
        }
    }

    public static void exibeVeiculos(ArrayList lista) {
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            Veiculo veiculo = (Veiculo) it.next();
            System.out.println("ID = " + veiculo.getId());
            System.out.println("marca = " + veiculo.getMarca());
            System.out.println("modelo = " + veiculo.getModelo());
            System.out.println("ano = " + veiculo.getAno());
            System.out.println("tipoVeiculo = " + veiculo.getTipoVeiculo());
            System.out.println("QUILOMETRAGEM = " + veiculo.getQuilometragem());
            System.out.println();
        }
    }
}
