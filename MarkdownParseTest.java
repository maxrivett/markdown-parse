import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testBreak1() throws IOException {
        Path fileName = Path.of("test-break-1.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("www.nothing.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testBreak2() throws IOException {
        Path fileName = Path.of("test-break-2.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("www.google.com"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testBreak3() throws IOException {
        Path fileName = Path.of("test-break-3.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile1() throws IOException {
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile2() throws IOException {
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile3() throws IOException {
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile4() throws IOException {
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile5() throws IOException {
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile6() throws IOException {
        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile7() throws IOException {
        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile8() throws IOException {
        Path fileName = Path.of("test-file8.md");
	    String contents = Files.readString(fileName);
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(contents));
    }
}