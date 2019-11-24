
public class Sistema {
    
    public static void main(String[] args) {
        
        ContaSalario c1 = new ContaSalario();
        Relatorio r1 = new Relatorio();
        
        c1.setAgencia(01);
        c1.setNumeroConta(123);
        c1.setTitular("Aderbal");
        
        r1.adicionarContas(c1);
        c1.depositar(1000);
        c1.sacar(200);
        c1.sacar(200);
        
        r1.Calculo();
        System.out.println(r1.getValorTotalTarifa());

    }
    
}
