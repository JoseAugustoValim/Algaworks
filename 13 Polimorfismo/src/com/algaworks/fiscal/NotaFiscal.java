package com.algaworks.fiscal;

public class NotaFiscal {

    private String descricao;
    private double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double calcularImpostos() {
        return 0;
    }

    public void emitir() {
        System.out.printf("Emitindo nota fiscal para: %s%n", getDescricao());
        System.out.printf("Valor total: %.2f%n", getValorTotal());
        System.out.printf("Impostos: %.2f%n", calcularImpostos());
    }

    public static class GestorFiscal {
        public void emitirNotasFiscais(NotaFiscal... notasFiscais) {
            for (NotaFiscal notaFiscal : notasFiscais) {
                notaFiscal.emitir();
                System.out.println("---------------");
            }
        }
    }
}
