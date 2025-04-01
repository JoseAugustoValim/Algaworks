package com.algaworks.banco;

public class ContaTeste4Downcast {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "1345678910"), 1234, 99999, 90);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("Maria da silva", "1345678911"), 1234, 99998);
        conta2.depositar(100);
        conta2.creditarRendimentos(10);

        caixaEletronico.imprimirDemonstrativo(conta2);
    }
}
