public class Main {
    public static void main(String[] args) {
        char grade = 'W';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz!");
                break;
            case 'B':
                System.out.println("Çok iyi: Geçtiniz!");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz!");
                break;
            case 'D':
                System.out.println("Fena değil: Geçtiniz!");
                break;
            case 'F':
                System.out.println("Kötü: Kaldınız!");
                break;
            default:
                System.out.println("Geçersiz değer girdiniz.");
        }

    }
}