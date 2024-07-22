public class Singleton {
    private String singleTonName;
    private static String instance;

    public void setInstance(String val) {
        Singleton.instance = val;
    }

    public void getInstance() {
        System.out.println(Singleton.instance);
    }

    public static void main(String[] args) {
        Singleton singleton1 = new Singleton();
        Singleton singleton2 = new Singleton();

        singleton1.setInstance("A");
        singleton2.getInstance();

        singleton2.setInstance("B");
        singleton1.getInstance();
    }
}
