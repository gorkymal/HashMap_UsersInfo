package org.example;
import java.util.Random;

public class RandomEmailCreator {

        public static String printRandomEmailCreator() {
        String alphabet = "abcdefghigklmnopqrstuvwxyz";
        char[] alphabeticalArray = alphabet.toCharArray();

        Random randomizer = new Random();

        //login length is 10 (before @)
        StringBuilder emailInfo = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            emailInfo.append(alphabeticalArray[randomizer.nextInt(alphabeticalArray.length)]); //randoms a letter from alphabet and adds up to 10 items to StringBuilder
        }
        emailInfo.append("@");

        String[] domen = {"yandex.ru", "gmail.com", "yahoo.com"};
        emailInfo.append(domen[(randomizer.nextInt(domen.length))]);

        return emailInfo.toString();
    }
}

