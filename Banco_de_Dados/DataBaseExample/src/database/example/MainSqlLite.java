package database.example;

/**
 *
 * @author felipe
 */
import java.sql.*;
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
        
        if (opcaoEscolhida == 1) {
            InsertRecords insert = new InsertRecords();
            int id = Integer.parseInt(JOptionPane.showInputDialog("id"));
            String marca = JOptionPane.showInputDialog("Marca:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
            int  quilometragem = Integer.parseInt(JOptionPane.showInputDialog("Quilometragem:"));
            String tipoVeiculo  = pedeTipoVeiculo();
            insert.insertRecord(id, quilometragem, marca, modelo, ano, tipoVeiculo);
        } else if (opcaoEscolhida == 2) {
            SelectTable select = new SelectTable();
            select.selectTable();
        } else if (opcaoEscolhida == 3) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id para remoção:"));
            DeleteRecord delete = new DeleteRecord();
            delete.deleteRecord(id);
        }
    }
    public static String pedeTipoVeiculo() {
        String tipoVeiculo = "";
        try {
            tipoVeiculo = JOptionPane.showInputDialog("Tipo Veículo(Carro, Moto, Caminhão,Ônibus):");
            if (tipoVeiculo.equalsIgnoreCase("CARRO")
                    || tipoVeiculo.equalsIgnoreCase("MOTO")
                    || tipoVeiculo.equalsIgnoreCase("CAMINHÃO")
                    || tipoVeiculo.equalsIgnoreCase("ÔNIBUS")) {
                return tipoVeiculo;
            } else {
                throw new Exception("Tipo de veículo não permitido");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return pedeTipoVeiculo();
        }
    }
}
