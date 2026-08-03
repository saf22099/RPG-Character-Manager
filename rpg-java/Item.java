/**
 * Classe Item
 * Representa um item que pode ser guardado no Inventario.
 */
public class Item {

    private String item;
    private String danoEfeito;
    private String tipo;
    private double peso;
    private String descricao;

    public Item(String item, String danoEfeito, String tipo, double peso, String descricao) {
        this.item = item;
        this.danoEfeito = danoEfeito;
        this.tipo = tipo;
        this.peso = peso;
        this.descricao = descricao;
    }

    // ---- Getters e Setters ----
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDanoEfeito() {
        return danoEfeito;
    }

    public void setDanoEfeito(String danoEfeito) {
        this.danoEfeito = danoEfeito;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Método de instância que "confirma" o item como pronto para adicionar
     * (a lógica real de inserção fica em Inventario.adicionarItem()).
     */
    public void adicionarItem() {
        System.out.println("Item preparado para ser adicionado: " + this.item);
    }

    /**
     * Método de instância que "confirma" o item como pronto para remover
     * (a lógica real de remoção fica em Inventario.removerItem()).
     */
    public void removerItem() {
        System.out.println("Item preparado para ser removido: " + this.item);
    }

    @Override
    public String toString() {
        return item + " (" + tipo + ") - " + danoEfeito +
                " | Peso: " + peso + " | " + descricao;
    }
}
