public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean stringaPariDispari(String str) {
        return str.length() % 2 == 0 ? true : false;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 4 == 0 && anno % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}