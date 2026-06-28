package com.cognizant.proxy;

public class ProxyTest {

    public static void main(String[] args) {

        Image image = new ProxyImage("student_photo.jpg");

        image.display();
        System.out.println();

        image.display();
    }
}