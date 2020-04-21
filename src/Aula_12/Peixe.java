package Aula_12;

public class Peixe extends Animal {
    private String corEscama;


    @Override
    public void alimentar() {
        System.out.println("Comendo algas ... ");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Bloop, bloop, bloop...");
    }
    public void soltarBolha() {
        System.out.println(" . o O *");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
