public class Main {
    public static void main(String[] args) {
        Personagem base = new Personagem("Guerreiro Base", "Guerreiro", 1, 100, 15);

        Personagem arthur = base.clone();
        arthur.setNome("Arthur");

        Personagem merlin = base.clone();
        merlin.setNome("Merlin");

        Personagem lancelot = base.clone();
        lancelot.setNome("Lancelot");

        System.out.println("=== Personagem Base ===");
        base.exibir();

        System.out.println();
        System.out.println("=== Personagens Clonados ===");
        arthur.exibir();
        merlin.exibir();
        lancelot.exibir();
    }
}