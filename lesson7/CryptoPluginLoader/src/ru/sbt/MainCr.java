package ru.sbt;

import java.io.File;

public class MainCr {
    public static void main(String[] args) {
       // String p = File plugins = File.get
        EncryptedClassManger encryptedClassManger = new EncryptedClassManger("Plugins","111111111");

        try {
            encryptedClassManger.load("Plugin1").doUsefull();
            encryptedClassManger.load("Plugin2").doUsefull();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
