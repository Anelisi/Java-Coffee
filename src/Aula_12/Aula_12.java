package Aula_12;

public class Aula_12 {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Cachorro k1 = new Cachorro();

        m1.setPeso(33.3f);
        m1.setCorPelo("Tigrado");
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();
        System.out.println();

        k1.locomover();
        k1.emitirSom();
        k1.alimentar();
    }
}
