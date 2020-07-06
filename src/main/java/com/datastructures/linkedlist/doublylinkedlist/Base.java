package com.datastructures.linkedlist.doublylinkedlist;

import java.util.Base64;

public class Base {
    public static void main(String[] args) {
        String base64String= Base64.getEncoder().encodeToString("00000052209820465".getBytes());
//                BASE64EncoderStream.encode("Digambar@123".getBytes()).toString();
        System.out.print(base64String);

        System.out.print(Base64.getDecoder().decode("MzQ0ODM0").toString());
    }
}
