package com.comarch.szkolenia.maven;

import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {
        String haslo = "tajnehaslo";
        String hash = DigestUtils.md5Hex(haslo);

        System.out.println(hash);
    }
}
