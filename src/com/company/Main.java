package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("Song");
        writer.write("Nothing else matters\n" +
                "Metallica\n" +
                "So close,no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And mothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words i dont just say\n" +
                "And nothing elsse matters");
        writer.close();
        FileReader reader = new FileReader("Song");
        Scanner scanner = new Scanner(reader);
        Song song = new Song();
        song.setTitle(scanner.nextLine());
        song.setAuthor(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        while (scanner.hasNext()) {
            text.append(scanner.nextLine()).append("\n");
        }
        song.setText(text.toString());
        System.out.println("Songs title is "+song.getTitle());
        System.out.println(song.getAuthor());
        System.out.println(song.getText());
    }

}
