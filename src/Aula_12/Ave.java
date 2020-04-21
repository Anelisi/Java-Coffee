package Aula_12;

public class Ave extends Animal {
    private String corPena;

    public void fazerNinho() {
        System.out.println("Fazendo ninho ...");
    }

    @Override
    public void alimentar() {
        System.out.println("Ciscando ...");
    }

    @Override
    public void locomover() {
        System.out.println("Voando ... ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu, piu, piiiiiuuuu...");
    }
}
