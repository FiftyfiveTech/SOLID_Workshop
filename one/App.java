package one;

public class App {
    public static void main(String[] args) {
        Client client = new Client() {{
            setDocument("11111111111");
            setEmail("test@test.com");
        }};

        try {

            client.save();
            System.out.println("Client saved successfully");

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
