package desafio1;

public class testeCachorro {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        cachorro1.nome = "Teste1";
        cachorro1.raca = "Pinscher";
        cachorro1.sexo = 'M';
        cachorro1.idade = 5;

        cachorro2.nome = "Teste1";
        cachorro2.raca = "Pinscher";
        cachorro2.sexo = 'M';
        cachorro2.idade = 5;

        System.out.println("---Cachorro---");
        System.out.printf("%s", cachorro1.nome);
    }
}
