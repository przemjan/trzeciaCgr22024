public class StringiDemo {
    public static void main(String[] args) {

        String name = "Gienek";

        int dlugosc = name.length();

        char inicjal = name.charAt(5);

        String male, duze;

        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println(male + ", " + duze);

        System.out.println(name);
    }
}
