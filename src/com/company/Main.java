package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<>();
    var code = "404";

    switch (code){

        case "401","402","403","404" -> System.out.println("Client's error");
        case "501","502","503","504" -> System.out.println("Servers's error");
        default -> System.out.println("Code not recognized");
    }
}
}
