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
         
    public void depositar(double valor){        
        if(valor > 0 ){
            this.saldo+= valor;    
        }else {         
            //como tratar o erro?
        }      
    }    
    public void sacar(double valor) throws Exception{                
        try{                    
            if(valor > 0){
                if(this.saldo >= valor){
                    this.saldo -= valor;    
                }else if(this.limite >= valor ){
                    this.limite -= valor;            
                }else{
                   throw new Exception("Sem saldo para efetuar o saque");
                }               
            }else{
               throw new Exception("O valor tem que ser maior que zero");
            }   
        }catch(Exception ex){
            System.out.println("Conta:");
            ex.printStackTrace();
            throw ex;
        } 
        
    }    
    public void imprimirSaldo(){        
         System.out.println("Prezado, "+ nomeCliente);
      System.out.println("Seu saldo atual é: R$ "+ saldo);          
    }    
}
