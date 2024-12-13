package lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Twenty_nine_4Test {

    private Twenty_nine_4 app;

    @BeforeEach
    public void setUp() {
        app = new Twenty_nine_4();
    }

    @Test
    public void testAddFile() {
        // Adding a file
        app.addFile("testFile.txt", "/test/path", "Test description");

        // Checking if the file was added
        TextFile file = app.getFile("testFile.txt");
        assertNotNull(file);
        assertEquals("/test/path", file.getFilePath());
        assertEquals("Test description", file.getDescription());
    }

    @Test
    public void testGetFileNotFound() {
        // Trying to get a file that was not added
        TextFile file = app.getFile("nonExistingFile.txt");
        assertNull(file);
    }

    @Test
    public void testDisplayFiles() {
        // Adding multiple files
        app.addFile("file1.txt", "/path1", "File 1 description");
        app.addFile("file2.txt", "/path2", "File 2 description");

        // Ensure files are correctly stored
        TextFile file1 = app.getFile("file1.txt");
        TextFile file2 = app.getFile("file2.txt");

        assertNotNull(file1);
        assertNotNull(file2);

        assertEquals("/path1", file1.getFilePath());
        assertEquals("File 1 description", file1.getDescription());

        assertEquals("/path2", file2.getFilePath());
        assertEquals("File 2 description", file2.getDescription());
    }
}
