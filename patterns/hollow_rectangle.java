public class hollow_rectangle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 9 || j == 0 || j == 6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
