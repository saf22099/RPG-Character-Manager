import java.util.Random;

/**
 * Classe Atributos
 * Representa os atributos primários de um Personagem.
 */
public class Atributos {

    private int forca;
    private int destreza;
    private int inteligencia;
    private int constituicao;

    public Atributos() {
        this.forca = 0;
        this.destreza = 0;
        this.inteligencia = 0;
        this.constituicao = 0;
    }

    public Atributos(int forca, int destreza, int inteligencia, int constituicao) {
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.constituicao = constituicao;
    }

    // ---- Getters e Setters ----
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    /**
     * Rodar/sortear um atributo aleatoriamente (ex: usado na criação de personagem).
     */
    public int rodarAtributo() {
        Random rand = new Random();
        // Simula rolagem de 3 dados de 6 faces (3d6), comum em RPGs
        int valor = rand.nextInt(6) + rand.nextInt(6) + rand.nextInt(6) + 3;
        return valor;
    }

    @Override
    public String toString() {
        return "Atributos{" +
                "forca=" + forca +
                ", destreza=" + destreza +
                ", inteligencia=" + inteligencia +
                ", constituicao=" + constituicao +
                '}';
    }
}
