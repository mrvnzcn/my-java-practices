public class Main {
    public static void main(String[] args) {
        String student1 = "İsmail";
        String student2 = "Mervan";
        String student3 = "Ozcan";
        String student4 = "Hasan";
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println("------------------------------");
        String[] studentArray = new String[4];
        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;
        studentArray[3] = student4;
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println(studentArray[i]);
        }
        System.out.println("------------------------------");

    }
}