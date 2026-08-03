/**
 * Classe Magias
 * Composição: um Mago possui (é dono de) várias Magias conhecidas.
 */
public class Magias {

    private String nome;
    private String danoEfeito;
    private int custo;
    private int nivel;

    public Magias(String nome, String danoEfeito, int custo, int nivel) {
        this.nome = nome;
        this.danoEfeito = danoEfeito;
        this.custo = custo;
        this.nivel = nivel;
    }

    // ---- Getters e Setters ----
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDanoEfeito() {
        return danoEfeito;
    }

    public void setDanoEfeito(String danoEfeito) {
        this.danoEfeito = danoEfeito;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return nome + " (Nível " + nivel + ") - " + danoEfeito + " | Custo de mana: " + custo;
    }
}
