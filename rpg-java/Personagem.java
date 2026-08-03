import java.util.ArrayList;

/**
 * Classe abstrata Personagem
 * Classe base para Guerreiro, Mago e Ladino.
 * Associações: possui um Inventario (composição) e um objeto Atributos.
 */
public abstract class Personagem {

    private int id;
    private String nome;
    private String classe; // "Nome" no diagrama -> tipo String
    private int nivel;
    private int vidaMaxima;
    private int mana;
    private Atributos atributos;
    private ArrayList<Item> inventario; // ArrayList mencionado no diagrama

    // Composição real: Personagem "tem um" Inventario
    private Inventario meuInventario;

    protected Personagem(int id, String nome, String classe, int vidaMaxima, int mana, Atributos atributos) {
        this.id = id;
        this.nome = nome;
        this.classe = classe;
        this.nivel = 1;
        this.vidaMaxima = vidaMaxima;
        this.mana = mana;
        this.atributos = atributos;
        this.inventario = new ArrayList<>();
        this.meuInventario = new Inventario();
    }

    // ---- Getters e Setters ----
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public ArrayList<Item> getInventario() {
        return inventario;
    }

    public Inventario getMeuInventario() {
        return meuInventario;
    }

    /**
     * Adiciona um item ao inventário do personagem.
     */
    public void adicionarInventario(Item item) {
        inventario.add(item);
        meuInventario.adicionarItem(item);
        System.out.println(nome + " adicionou '" + item.getItem() + "' ao inventário.");
    }

    /**
     * Lista todos os itens presentes no inventário do personagem.
     */
    public void listarInventario() {
        System.out.println("Inventário de " + nome + ":");
        if (inventario.isEmpty()) {
            System.out.println("  (vazio)");
        }
        for (Item item : inventario) {
            System.out.println("  - " + item);
        }
    }

    /**
     * Ataque genérico do personagem. Cada subclasse deve implementar sua
     * própria fórmula de dano.
     */
    public abstract int atacar();

    /**
     * Aumenta o nível do personagem, elevando seus atributos base.
     */
    public void uparNivel() {
        this.nivel++;
        this.vidaMaxima += 10;
        this.mana += 5;
        System.out.println(nome + " subiu para o nível " + nivel + "!");
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", nivel=" + nivel +
                ", vidaMaxima=" + vidaMaxima +
                ", mana=" + mana +
                '}';
    }
}
