package org.example;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String path = "C:/Users/gmalyshev/Desktop/users.txt";
        Path pathToFile = Paths.get(path);

        Map<Integer, User> userMap = new HashMap<>();
        User user;

        Scanner scan = null;
        try {
            scan = new Scanner(pathToFile);
        } catch (IOException e) {
            System.out.println("error");
        }

        for (int i = 0; i < 20; i++) { // -> change via while hasNextLine
            String[] info = scan.nextLine().split(" ");
            user = new User(
                    Integer.parseInt(info[0].trim()),
                    info[1],
                    info[2],
                    info[3],
                    info[4]);
            userMap.put(user.getID(), user);
        }
        scan.close();
        printEmailWhenKnowID(userMap);
    }

    public static void printEmailWhenKnowID (Map<Integer, User> userMap) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What ID do you have? Type: ");
        int tempID = scan.nextInt();

        Set<Integer> keysMap = userMap.keySet();
        for (Integer key : keysMap) {
            if (key == tempID) {
                System.out.println(userMap.get(key).getEmail());
            }
        }
    }
}

