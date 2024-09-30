public class Multiplicar {
    public static void main(String[] args) {
        System.out.println("Introduce 1 número para mostrar su tabla de multiplicar: ");
        int n = Integer.parseInt(System.console().readLine());
        int a = 1;

        while (a <= 10) {
            System.out.println(n + " x " + a + " = " + (n * a));
            a++;
        }
    }
}
