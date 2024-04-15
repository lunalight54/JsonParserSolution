import org.example.JsonParser;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParseTester {
    @Test
    public void testContainsAsterisk() {
        JsonParser parser = new JsonParser();

        String json = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Action\":\"s3:GetObject\",\"Resource\":\"arn:aws:s3:::example-bucket/*\"}]}";
        assertTrue(parser.ContainsAsterisk(json));
        json = "{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Action\":\"s3:GetObject\",\"Resource\":\"arn:aws:s3:::example-bucket/\"}]}";
        assertFalse(parser.ContainsAsterisk(json));
    }
}
