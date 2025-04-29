package exemplo8composicaoobjetos;

public class Carro {
    /*Composicao
     * Quando queremos que uma clase referencia objetos de uma outra classe por meio da variavel de instancia
     * Permite criar um objeto com composto por outro através de sua classe */

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario = new Pessoa();

}
