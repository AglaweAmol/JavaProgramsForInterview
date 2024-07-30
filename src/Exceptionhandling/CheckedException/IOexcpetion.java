package Exceptionhandling.CheckedException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOexcpetion {

    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Attempting to read from a file that doesn't exist
            reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handling IOException
            System.err.println("An IOException occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                // Closing the reader in the finally block to ensure it's closed properly
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                // Handling any exceptions that might occur while closing the reader
                System.err.println("An error occurred while closing the reader: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

