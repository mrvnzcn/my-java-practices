public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngü bitti...");
        int i=1;
        //while
        while (i<10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("while Döngü bitti...");

        //do-while
        do {
            System.out.println(i);
        } while (i<10);
        System.out.println("do-while Döngü bitti...");

    }
}