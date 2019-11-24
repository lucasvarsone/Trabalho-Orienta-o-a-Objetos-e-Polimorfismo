
public class ContaSalario extends Conta{
    
    int quantidadeSaque; 
    
    @Override
    void sacar(double quantidade) {
        super.sacar(quantidade);
        this.quantidadeSaque = ++quantidadeSaque;
        
        if(quantidadeSaque >=1){
            valorTarifa(50);
        }
        else{
            valorTarifa(0);
        } 
    } 
}
