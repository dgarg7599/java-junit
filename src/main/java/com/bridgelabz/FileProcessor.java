package com.bridgelabz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {

    public void writeToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }

    public String readFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
}
