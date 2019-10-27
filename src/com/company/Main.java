package com.company;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NameSetter n = new NameSetter();
        String Inptut;
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        System.out.println("Insert yourname :");
        Inptut=scanner.nextLine();
        list.add(Inptut);
        System.out.println("Insert your last name :");
        Inptut=scanner.nextLine();
        list.add(Inptut);
        System.out.println("Insert your Reshte :");
        Inptut=scanner.nextLine();
        list.add(Inptut);
        System.out.println("Insert your Gerayesh :");
        Inptut=scanner.nextLine();
        list.add(Inptut);
        System.out.println("Insert your shomare daneshjoii :");
        Inptut=scanner.nextLine();
        list.add(Inptut);
        System.out.println("Insert your age :");
        Inptut=scanner.nextLine();
        list.add(Inptut);
        for (String s : list) {
            System.out.println(s);
        }




        }
    }

