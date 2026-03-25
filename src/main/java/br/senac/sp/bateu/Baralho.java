package br.senac.sp.bateu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        for (Naipe naipe : Naipe.values()) {
            for (int numero = 1; numero <= 13; numero++) {
                cartas.add(new Carta(numero, naipe));
            }
        }
        embaralhar();
    }

    public Carta comprar() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(0);
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

}
