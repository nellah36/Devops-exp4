// ParamProgram.java
public class ParamProgram {
    public static void main(String[] args) {
        String sa = System.getenv("num1");
        String sb = System.getenv("num2");
        System.out.println("Environment variables: num1=" + sa + ", num2=" + sb);
        try {
            int a = Integer.parseInt(sa.trim());
            int b = Integer.parseInt(sb.trim());
            System.out.println("Sum: " + (a + b));
            System.out.println("Product: " + (a * b));
        } catch (Exception e) {
            System.out.println("Error parsing numbers: " + e.getMessage());
        }
    }
}
