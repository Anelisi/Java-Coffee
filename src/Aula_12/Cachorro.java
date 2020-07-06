package Aula_12;

import Aula_13.Lobo;

public class Cachorro extends Lobo {
    public void emitirSom() {
        System.out.println("Au, au, aaaaauuuuuuuuu...");
    }
    public void alimentar() {
        System.out.println("Comendo ração...");
    }
    public void reagir(String frase){
        if (frase.equals("Oi, Maliti!") || frase.equals("Nenet, amor da mãaaeeee!!!")) {
            System.out.println("Abanando o rabo... ");
            this.emitirSom();
            if (frase.equals("Vou chamar os amigos...") || frase.equals("Vamos pro banho, Maliti?!")){
            System.out.println("Murchando as orelhas e encolhendo o rabinho entre as pernas");
            }
        } else {
            System.out.println("Reinando... ");
        }
    }
    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanando o rabinho ... ");
        } if (hora >= 18) {
            System.out.println("Ignorando a mamis...");
        } else {
            System.out.println("Abanando o rabo e latindo... ");
        }

    }
    public void reagir(boolean dono){
        if (dono = true) {
            System.out.println("Abanando o rabinho ... ");
        } else {
            System.out.println("Rosnando e latindo enlouquecidamente...");
        }

    }
    public void reagir(int idade, float peso){
        if (idade < 5 && peso < 10) {
            System.out.println("Abanando o rabinho ... ");
        } else {
            System.out.println("Abanando o rabo ... ");
            this.emitirSom();
        }
        if (idade < 8 && peso < 15) {
            System.out.println("Rosnando...");
        } else {
            System.out.println("Ignorando...");
        }

    }
}
