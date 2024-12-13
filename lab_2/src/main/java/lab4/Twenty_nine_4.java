package lab4;

import java.util.HashMap;

class TextFile {
    private String filePath;
    private String description;

    // Constructor
    public TextFile(String filePath, String description) {
        this.filePath = filePath;
        this.description = description;
    }

    // Getters
    public String getFilePath() {
        return filePath;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "File Path: " + filePath + ", Description: " + description;
    }
}

public class Twenty_nine_4 {
    private HashMap<String, TextFile> fileList;

    // Constructor
    public Twenty_nine_4() {
        this.fileList = new HashMap<>();
    }

    // Method to add a file
    public void addFile(String fileName, String filePath, String description) {
        TextFile textFile = new TextFile(filePath, description);
        fileList.put(fileName, textFile);
    }

    // Method to get a file by its name
    public TextFile getFile(String fileName) {
        return fileList.get(fileName);
    }

    // Method to display all files
    public void displayFiles() {
        for (String fileName : fileList.keySet()) {
            System.out.println("File Name: " + fileName + " | " + fileList.get(fileName));
        }
    }

    public static void main(String[] args) {
        Twenty_nine_4 app = new Twenty_nine_4();

        // Example: Adding files to the list
        app.addFile("file1.txt", "/path/to/directory", "This is the first file.");
        app.addFile("file2.txt", "/path/to/directory", "This is the second file.");
        app.addFile("file3.txt", "/path/to/directory", "This is the third file.");
        app.addFile("file4.txt", "/path/to/directory", "This is the fourth file.");
        app.addFile("file5.txt", "/path/to/directory", "This is the fifth file.");

        // Display all files
        app.displayFiles();
    }
}
