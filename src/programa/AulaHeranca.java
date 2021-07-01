package programa;

import entidade.Conta;
import entidade.ContaFisica;

public class AulaHeranca {
    public static void main(String[] args) {
        Conta c1 = new Conta(0310, "Marina", 0.00);
        
        System.out.println(c1.getTitular());
        ContaFisica cf = new ContaFisica(65651, "Sakura", 3216.02, 0.1);
        System.out.println(cf.getTitular());
    }
    
}
