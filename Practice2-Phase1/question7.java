package assignment2;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class question7
{
    public static void main(String[] args) {
        createFile("demo.txt");

        writeFile("demo.txt", "This is File Creation and writing content");

        String content = readFile("demo.txt");
        System.out.println("File content: " + content);

        updateFile("demo.txt", "This is updated File");

        content = readFile("demo.txt");
        System.out.println("Updated file content: " + content);

        deleteFile("demo.txt");
    }
    public static void createFile(String fileName)
    {
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }
    public static void writeFile(String fileName, String content)
    {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
    public static String readFile(String fileName) 
    {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return content.toString();
    }
    public static void updateFile(String fileName, String newContent) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(newContent);
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file: " + e.getMessage());
        }
    }
    public static void deleteFile(String fileName) 
    {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
