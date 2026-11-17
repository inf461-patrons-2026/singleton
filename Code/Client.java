public class Client {
    public static void main(String[] args) {
        System.out.println("=== Exemple du cours : Singleton (Exemple 1) ===");

        // Premiere facon d'utiliser le Singleton
        Singleton.getInstance().op1(1, 2, 3);
        Singleton.getInstance().op2(3, 4, 5);

        // Autre facon : conserver la reference
        Singleton sing1 = Singleton.getInstance();
        sing1.op1(1, 2, 3);
        sing1.op2(3, 4, 5);

        Singleton sing2 = Singleton.getInstance();
        System.out.println("sing1 == sing2 : " + (sing1 == sing2));
    }
}
