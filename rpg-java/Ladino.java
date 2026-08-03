import java.util.Random;

/**
 * Classe Ladino
 * Herda de Personagem.
 */
public class Ladino extends Personagem {

    private int energia;
    private double chanceCritico;

    public Ladino(int id, String nome, int vidaMaxima, int mana, Atributos atributos,
                  int energia, double chanceCritico) {
        super(id, nome, "Ladino", vidaMaxima, mana, atributos);
        this.energia = energia;
        this.chanceCritico = chanceCritico;
    }

    // ---- Getters e Setters ----
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public double getChanceCritico() {
        return chanceCritico;
    }

    public void setChanceCritico(double chanceCritico) {
        this.chanceCritico = chanceCritico;
    }

    /**
     * Realiza um ataque furtivo, com chance de causar dano crítico.
     */
    public void atacarFurtivo() {
        Random rand = new Random();
        boolean critico = rand.nextDouble() < chanceCritico;
        int dano = getAtributos().getDestreza() * (critico ? 3 : 1);
        System.out.println(getNome() + " realiza um ataque furtivo" +
                (critico ? " CRÍTICO" : "") + " causando " + dano + " de dano.");
    }

    @Override
    public int atacar() {
        int dano = getAtributos().getDestreza() + energia / 4;
        System.out.println(getNome() + " ataca rapidamente causando " + dano + " de dano.");
        return dano;
    }
}
