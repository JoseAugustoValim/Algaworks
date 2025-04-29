package exemplo8composicaoobjetos;

public class Main {
    public static void main(String[] args) {
        // Versão ideal de composição fora da classe
        // Menos chamadas
        Pessoa proprietarioAtual = new Pessoa();
        proprietarioAtual = new Pessoa();
        proprietarioAtual.nome = "Jose";
        proprietarioAtual.cpf = "111.111.111-2";
        proprietarioAtual.anoNascimento = 1949;


        Carro carro = new Carro();
        carro.anoFabricacao = 2021;
        carro.cor = "Azul";
        carro.fabricante = "Honda";
        carro.modelo = "HR-V";
        carro.proprietario = proprietarioAtual;

        // Versão não ideal
//        carro.proprietario = new Pessoa();
//        carro.proprietario.nome = "Jose";
//        carro.proprietario.cpf = "111.111.111-2";
//        carro.proprietario.anoNascimento = 1949;

    }
}
