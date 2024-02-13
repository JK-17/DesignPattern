public class Singleton {
    private static Singleton instance;

    private Singleton() {}  //private으로 생성자 소환

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}