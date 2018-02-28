package banco;

class Conta {

    private int numero;
    private String nomeCliente;
    private double saldo=0;
    private double limite=0;
    private int agencia;
    
    public Conta(int numero, String nomeCliente, double saldo, double limite, int agencia){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.limite = limite;
        this.agencia = agencia;      
		
    }
    
    public Conta(String numero, String nomeCliente, String saldo, String limite, String agencia){
        this.numero = Integer.parseInt(numero);
        this.nomeCliente = nomeCliente;
        this.saldo = Double.parseDouble(saldo);
        this.limite = Double.parseDouble(limite);
        this.agencia = Integer.parseInt(agencia);        
    }
         
    public boolean depositar(double valor){        
        return true;        
    }    
    public boolean sacar(double valor){        
        return true;        
    }    
    public void imprimirSaldo(){        
         System.out.println("Prezado, "+ nomeCliente);
      System.out.println("Seu saldo atual é: R$ "+ saldo);          
    }    
}
