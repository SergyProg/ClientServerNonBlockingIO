package ru.netology;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new Thread(new Server()).start();
        new Thread(new Client()).start();
    }
}