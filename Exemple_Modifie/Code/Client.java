public class Client {
    public static void main(String[] args) {
        System.out.println("=== Exemple modifie : Singleton (Exemple 2) ===");

        int som = Singleton.getInstance().somme(2, 5);
        System.out.println("La somme est : " + som);

        // Une instance est deja en cours : les valeurs passees sont ignorees
        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(16, 19);
        s2.affiche();

        System.out.println("s1 == s2 : " + (s1 == s2));
    }
}
