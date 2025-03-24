import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.ContaSalario;
import com.algaworks.banco.Titular;

public class ContaTeste2 {
    public static void main(String[] args) {
        Titular titular = new Titular("Jose Aguusto", "12345678910");
        // Não vai funcionar se não houver uma herança
        // ContaInvestimento contaInvestimento =  new ContaSalario(titular, 1000, 18_000);

        // Isto funciona
        Conta contaInvestimento = new ContaSalario(titular, 9999, 1000, 18_000);
    }
}