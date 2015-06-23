public class HelloWorld {
    public static void main (String [] args) {
        String username = System.getProperty("user.name");
        System.out.println("Hello World!");
        System.out.println("Running as user: " + username);
    }
}