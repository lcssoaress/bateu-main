package br.senac.sp.bateu;

public class Carta {

    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public String getImagem() {
        // O diretório está em resources/static/cartas
        return "/cartas/" + numero + naipe.name() + ".png";
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", naipe=" + naipe + '}';
    }
}
