import java.util.ArrayList;
import java.util.List;

/**
 * Classe Mago
 * Herda de Personagem. Composição com Magias.
 */
public class Mago extends Personagem {

    private int manaMago; // atributo "mana" específico da classe Mago no diagrama
    private String magiasConhecidas;

    // Coleção real das magias (necessária para a lógica funcionar)
    private List<Magias> listaMagias;

    public Mago(int id, String nome, int vidaMaxima, int mana, Atributos atributos, int manaMago) {
        super(id, nome, "Mago", vidaMaxima, mana, atributos);
        this.manaMago = manaMago;
        this.listaMagias = new ArrayList<>();
    }

    // ---- Getters e Setters ----
    public int getManaMago() {
        return manaMago;
    }

    public void setManaMago(int manaMago) {
        this.manaMago = manaMago;
    }

    public String getMagiasConhecidas() {
        return magiasConhecidas;
    }

    public void setMagiasConhecidas(String magiasConhecidas) {
        this.magiasConhecidas = magiasConhecidas;
    }

    public List<Magias> getListaMagias() {
        return listaMagias;
    }

    /**
     * Aprende uma nova magia (composição: Mago é dono das Magias).
     */
    public void aprenderMagia(Magias magia) {
        listaMagias.add(magia);
        System.out.println(getNome() + " aprendeu a magia: " + magia.getNome());
    }

    /**
     * Lança uma feitiço/magia específica, consumindo mana.
     */
    public void lancarFeitico(Magias magia) {
        if (manaMago < magia.getCusto()) {
            System.out.println(getNome() + " não tem mana suficiente para lançar " + magia.getNome());
            return;
        }
        manaMago -= magia.getCusto();
        System.out.println(getNome() + " lança " + magia.getNome() + " causando efeito: " + magia.getDanoEfeito());
    }

    @Override
    public int atacar() {
        int dano = getAtributos().getInteligencia() * 2;
        System.out.println(getNome() + " ataca com energia mágica causando " + dano + " de dano.");
        return dano;
    }
}
