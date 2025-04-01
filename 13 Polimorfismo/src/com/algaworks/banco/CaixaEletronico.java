package com.algaworks.banco;

public class CaixaEletronico {
    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d %n", valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
                contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

    public void imprimirDemonstrativo(Conta conta){
        System.out.printf("Custo da impressão: R$%.2f%n" , TARIFA_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);

        conta.imprimirDemonstrativo();
    }
}
