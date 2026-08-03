/**
 * Classe Guerreiro
 * Herda de Personagem.
 */
public class Guerreiro extends Personagem {

    private int estamina;
    private int escudo;

    public Guerreiro(int id, String nome, int vidaMaxima, int mana, Atributos atributos,
                      int estamina, int escudo) {
        super(id, nome, "Guerreiro", vidaMaxima, mana, atributos);
        this.estamina = estamina;
        this.escudo = escudo;
    }

    // ---- Getters e Setters ----
    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    /**
     * Usa o escudo para reduzir/bloquear dano recebido.
     */
    public void usarEscudo() {
        System.out.println(getNome() + " ergue o escudo, bloqueando " + escudo + " de dano.");
    }

    @Override
    public int atacar() {
        int dano = getAtributos().getForca() * 2 + estamina / 2;
        System.out.println(getNome() + " ataca com a espada causando " + dano + " de dano.");
        return dano;
    }
}
