public class Main {
    public static void main() {
        Character mario = new Mario("It's me, Mario!", 100);
        System.out.println("Catchphrase: " + mario.getCatchphrase());
        mario.setSpeed(100);
        System.out.println("Speed: " + mario.getSpeed());
    }
}