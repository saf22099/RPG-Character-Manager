import java.util.ArrayList;
import java.util.List;

/**
 * Classe Inventario
 * Composição: um Inventario possui (é dono de) vários Itens.
 */
public class Inventario {

    private String itens; // conforme diagrama (String) - mantido por fidelidade
    private String categorias;

    // Coleção real dos itens (necessária para a lógica funcionar)
    private List<Item> listaItens;
    private boolean aberto;

    public Inventario() {
        this.listaItens = new ArrayList<>();
        this.aberto = true;
    }

    // ---- Getters e Setters ----
    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public boolean isAberto() {
        return aberto;
    }

    /**
     * Fecha o inventário, impedindo novas operações até reabri-lo.
     */
    public void fecharInventario() {
        this.aberto = false;
        System.out.println("Inventário fechado.");
    }

    public void abrirInventario() {
        this.aberto = true;
    }

    /**
     * Adiciona um item ao inventário (relação de composição com Item).
     */
    public void adicionarItem(Item item) {
        if (!aberto) {
            System.out.println("Inventário fechado. Não é possível adicionar itens.");
            return;
        }
        listaItens.add(item);
        item.adicionarItem();
    }

    /**
     * Remove um item do inventário.
     */
    public void removerItem(Item item) {
        if (listaItens.remove(item)) {
            item.removerItem();
        } else {
            System.out.println("Item não encontrado no inventário.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Inventario:\n");
        for (Item i : listaItens) {
            sb.append("  - ").append(i).append("\n");
        }
        return sb.toString();
    }
}
