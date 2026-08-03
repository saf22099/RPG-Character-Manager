/**
 * Classe de demonstração do sistema baseado no diagrama UML.
 */
public class Main {

    public static void main(String[] args) {

        // Criando atributos para cada personagem
        Atributos atributosGuerreiro = new Atributos(18, 12, 8, 16);
        Atributos atributosMago = new Atributos(6, 10, 19, 10);
        Atributos atributosLadino = new Atributos(10, 18, 12, 11);

        // Criando os personagens (polimorfismo: todos são Personagem)
        Guerreiro conan = new Guerreiro(1, "Conan", 120, 10, atributosGuerreiro, 80, 15);
        Mago gandalf = new Mago(2, "Gandalf", 80, 100, atributosMago, 100);
        Ladino garrus = new Ladino(3, "Garrus", 90, 20, atributosLadino, 70, 0.25);

        Personagem[] grupo = { conan, gandalf, garrus };

        System.out.println("===== Ficha dos personagens =====");
        for (Personagem p : grupo) {
            System.out.println(p);
        }

        System.out.println("\n===== Testando inventário =====");
        Item espada = new Item("Espada Longa", "10-15", "Arma", 4.5, "Uma espada de aço bem forjada");
        Item pocao = new Item("Poção de Cura", "+30 HP", "Consumível", 0.5, "Restaura vida instantaneamente");

        conan.adicionarInventario(espada);
        conan.adicionarInventario(pocao);
        conan.listarInventario();

        System.out.println("\n===== Testando magias do Mago =====");
        Magias bolaDeFogo = new Magias("Bola de Fogo", "25 de dano em área", 20, 3);
        Magias curar = new Magias("Curar Ferimentos", "+20 HP", 15, 2);

        gandalf.aprenderMagia(bolaDeFogo);
        gandalf.aprenderMagia(curar);
        gandalf.lancarFeitico(bolaDeFogo);

        System.out.println("\n===== Testando ataques específicos de cada classe =====");
        conan.usarEscudo();
        garrus.atacarFurtivo();

        System.out.println("\n===== Testando ataque genérico (polimorfismo) =====");
        for (Personagem p : grupo) {
            p.atacar();
        }

        System.out.println("\n===== Testando subir de nível =====");
        conan.uparNivel();
        System.out.println(conan);

        System.out.println("\n===== Testando rodar atributo =====");
        System.out.println("Novo valor de atributo sorteado: " + atributosGuerreiro.rodarAtributo());

        System.out.println("\n===== Fechando inventário =====");
        conan.getMeuInventario().fecharInventario();
    }
}
