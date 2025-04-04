package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileProcessorTest {

    private FileProcessor processor;

    String testFile = "testFile.txt";
    String content = "Hello World!";

    @BeforeEach
    void setUp(){
        processor = new FileProcessor();
    }

    @AfterEach
    void tearDown(){
        File file = new File(testFile);
        if(file.exists()){
            file.delete(); //Cleanup after test
        }
    }

    @Test
    void shouldWriteAndReadFile() throws IOException {
        processor.writeToFile(testFile, content);
        String readContent = processor.readFromFile(testFile);
        Assertions.assertEquals(content, readContent);
    }

    @Test
    void shouldCreateFileAfterWriting() throws IOException {
        processor.writeToFile(testFile, content);
        File file = new File(testFile);
        Assertions.assertTrue(file.exists());
    }

    @Test
    void shouldThrowIOExceptionWhenFileDoesNotExist() {
        String nonExistentFile = "no_such_file.txt";
        Assertions.assertThrows(IOException.class, () -> processor.readFromFile(nonExistentFile));
    }

}
