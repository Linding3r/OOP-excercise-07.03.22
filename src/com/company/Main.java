package com.company;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("Thomas", "Little Fuckboy Street 69");
        Client client2 = new Client("Theo", "Little Fuckboy Street 69");

        System.out.println(client1.getName());
        System.out.println(client1.getAddress());

        client1.setAddress("Big Fuckboy Street 69");
        System.out.println(client1.getAddress());

        client1 = client2;
        System.out.println(client1.getName());

    }
}
