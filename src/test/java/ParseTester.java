import org.example.JsonParser;

public class ParseTester {
    public static void main(String[] args) {
        JsonParser parser = new JsonParser();
        String path = "C:\\Users\\Pawel\\OneDrive\\Desktop\\test.json";
        System.out.println( parser.ContainsAsterisk(path));
    }
}
