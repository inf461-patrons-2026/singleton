public final class Singleton {
    private static Singleton instance = null;

    private String attribut1;
    private int attribut2;

    private Singleton() {
        super();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void op1(int x, int y, int z) {
        this.attribut1 = "bonjour";
        System.out.println("op1(" + x + ", " + y + ", " + z + ") : attribut1 = " + this.attribut1);
    }

    public void op2(int x, int y, int z) {
        System.out.println("op2(" + x + ", " + y + ", " + z + ")");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Le Singleton ne peut pas etre clone");
    }
}
