import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class ContaTeste {
    public static void main(String[] args) {
        Titular titular = new Titular("Jose Augusto", "13456789");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 0000, 90);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        // Upcasting - Coerção
        // Conversão formada subclasse para a superclasse
        Conta conta = (Conta) contaEspecial;

        // Comportamentos da subclasse deixam de funcionar
        // contaEspecial.setLimiteChequeEspecial(1000);

        // Pegar o nome da classe que esta sendo referenciado por cada um dos objetos
        // metodo get classs retorna o nome da classe do objeto
        System.out.println(contaEspecial.getClass().getName());
        System.out.println(conta.getClass().getName());
        System.out.println(conta == contaEspecial);

        // Outro exemplo
        ContaInvestimento contaInvestimento = (ContaInvestimento) contaEspecial;
        contaInvestimento.creditarRendimentos(6);

        // Forma implicita
        Conta conta2 = contaEspecial;
    }
}
