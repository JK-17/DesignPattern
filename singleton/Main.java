public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1.equals(s2));  // true 둘이 같은 값을 가지고 있구나
        System.out.println(s1 == s2);       //true 아 둘이 같은 주소값을 가지고 있구나 (두개 같은거구나)
    }
}
