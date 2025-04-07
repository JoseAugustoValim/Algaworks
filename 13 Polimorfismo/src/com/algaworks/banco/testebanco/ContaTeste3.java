package com.algaworks.banco.testebanco;

import com.algaworks.banco.CaixaEletronico;
import com.algaworks.banco.ContaEspecial;
import com.algaworks.banco.ContaSalario;
import com.algaworks.banco.Titular;

public class ContaTeste3 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "1345678910"), 1234, 99999, 90);
        conta1.setLimiteChequeEspecial(1000);

        ContaEspecial conta2 = new ContaEspecial(new Titular("Maria da silva", "1345678911"), 1234, 99998, 90);

        ContaSalario conta3 = new ContaSalario(new Titular("Pessoa Teste 3", "1345678912"), 1234, 99997, 18_000 );


        conta1.depositar(300);

        caixaEletronico.transferir(conta1, conta3, 50);

        conta1.imprimirDemonstrativo();
        conta3.imprimirDemonstrativo();
    }
}
