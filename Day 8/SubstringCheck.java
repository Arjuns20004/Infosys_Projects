public class SubstringCheck {
    public static void main(String[] args) {
        String mainString = "Hello, welcome to Java programming!";
        String subString = "Java";

        if (mainString.contains(subString)) {
            System.out.println("Substring is present.");
        } else {
            System.out.println("Substring is NOT present.");
        }
    }
}
