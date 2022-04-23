package com.xyc.xo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static private int stepPlayer = 0;
    static private char player = '?';
    static private boolean flag = true;

    public static void main(String[] args) {

        char[][] field = createField();
        printField(field);

        while (flag) {

            stepPlayer(field);
            victoryInPlay(field);
            stopGame(field);

            printField(field);
        }
    }

    private static void stopGame(char[][] field) {

        int count = 0;

        for (char[] chars : field) {
            for (char aChar : chars) {
                if (aChar == '#') count++;
            }
        }
        if (count == 0) {
            flag = false;
        }

    }

    private static void victoryInPlay(char[][] field) {

        if (field[0][0] == player && field[0][1] == player && field[0][2] == player) {
            if (player == 'X') {
                System.out.println("*** Победил игрок 1 ***");
            } else {
                System.out.println("*** Победил игрок 2 ***");
            }
            flag = false;
        } else if (field[0][0] == player && field[1][0] == player && field[2][0] == player) {
            if (player == 'X') {
                System.out.println("*** Победил игрок 1 ***");
            } else {
                System.out.println("*** Победил игрок 2 ***");
            }
            flag = false;
        } else if (field[1][0] == player && field[1][1] == player && field[1][2] == player) {
            if (player == 'X') {
                System.out.println("*** Победил игрок 1 ***");
            } else {
                System.out.println("*** Победил игрок 2 ***");
            }
            flag = false;
        } else if (field[2][0] == player && field[2][1] == player && field[2][2] == player) {
            if (player == 'X') {
                System.out.println("*** Победил игрок 1 ***");
            } else {
                System.out.println("*** Победил игрок 2 ***");
            }
            flag = false;
        } else if (field[0][1] == player && field[1][1] == player && field[2][1] == player) {
            if (player == 'X') {
                System.out.println("*** Победил игрок 1 ***");
            } else {
                System.out.println("*** Победил игрок 2 ***");
            }
            flag = false;
        } else if (field[0][2] == player && field[1][2] == player && field[2][2] == player) {
            if (player == 'X') {
                System.out.println("*** Победил игрок 1 ***");
            } else {
                System.out.println("*** Победил игрок 2 ***");
            }
            flag = false;
        } else if (field[0][0] == player && field[1][1] == player && field[2][2] == player) {
            if (player == 'X') {
                System.out.println("*** Победил игрок 1 ***");
            } else {
                System.out.println("*** Победил игрок 2 ***");
            }
            flag = false;
        } else if (field[0][2] == player && field[1][1] == player && field[2][0] == player) {
            if (player == 'X') {
                System.out.println("*** Победил игрок 1 ***");
            } else {
                System.out.println("*** Победил игрок 2 ***");
            }
            flag = false;
        }

    }


    private static void stepPlayer(char[][] field) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Пример ввода: A3 or a3, C1 or c1");
        System.out.print("Ход игрока ");
        if (stepPlayer % 2 == 0) {
            System.out.println(1 + "-X");
        } else {
            System.out.println(2 + "-O");
        }
        System.out.print("Ваш ход: ");
        String move = sc.next();

        addMove(move, field);
    }


    private static void addMove(String move, char[][] field) {


        if (stepPlayer % 2 == 0) {
            player = 'X';
        } else {
            player = 'O';
        }

        if (flag) {
            if (move.equalsIgnoreCase("A3") && field[0][0] == '#') {
                field[0][0] = player;
                stepPlayer++;
            } else if (move.equalsIgnoreCase("B3") && field[0][1] == '#') {
                field[0][1] = player;
                stepPlayer++;
            } else if (move.equalsIgnoreCase("C3") && field[0][2] == '#') {
                field[0][2] = player;
                stepPlayer++;
            } else if (move.equalsIgnoreCase("A2") && field[1][0] == '#') {
                field[1][0] = player;
                stepPlayer++;
            } else if (move.equalsIgnoreCase("B2") && field[1][1] == '#') {
                field[1][1] = player;
                stepPlayer++;
            } else if (move.equalsIgnoreCase("C2") && field[1][2] == '#') {
                field[1][2] = player;
                stepPlayer++;
            } else if (move.equalsIgnoreCase("A1") && field[2][0] == '#') {
                field[2][0] = player;
                stepPlayer++;
            } else if (move.equalsIgnoreCase("B1") && field[2][1] == '#') {
                field[2][1] = player;
                stepPlayer++;
            } else if (move.equalsIgnoreCase("C1") && field[2][2] == '#') {
                field[2][2] = player;
                stepPlayer++;
            } else {
                System.out.println("*** Поле занято ***");
            }
        }


    }

    private static char[][] createField() {
        char[][] field = new char[3][3];

        for (char[] c : field) {
            Arrays.fill(c, '#');
        }
        return field;
    }

    private static void printField(char[][] field) {

        int countField = 3;
        for (char[] chars : field) {
            System.out.print(countField + " ");
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            countField--;
            System.out.println();
        }
        System.out.print("  " + "A " + "B " + "C ");

        System.out.println("\n-------");
    }


}
