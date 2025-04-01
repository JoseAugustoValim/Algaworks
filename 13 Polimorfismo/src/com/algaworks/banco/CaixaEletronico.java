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

    public void imprimirDemonstrativo(Conta conta) {
        // conta é visto como um objeto de superclasse
        // logo se eu preciso acessar os metodos da subclasse
        // necessário fazer um downcast

        // Essa e uma coercao explicita e pode levar a problemas
        // caso o objeto nao seja de um subtipo direto da coercao
        // Evite isto
//        ContaInvestimento contaInvestimento = (ContaInvestimento) conta;

        if (contaInvestimento.getValorTotalRendimentos() > 0) {
            System.out.println("Impressão de Demonstrativo gratuita!!");
        } else {
            System.out.printf("Custo da impressão: R$%.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
            conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
        }

        conta.imprimirDemonstrativo();
    }
}
