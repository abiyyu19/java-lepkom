public class argumen_cmd {
    public static void main(String[] args) {
        System.out.println("Muhammad Abiyyu - 13119957");
        System.out.println("Kalkulator Sederhana");

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
    }
}