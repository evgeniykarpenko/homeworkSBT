package ru.sbt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EncryptedClassLoader extends ClassLoader {
    private final String key;
    private final String dir;

    public EncryptedClassLoader(ClassLoader parent, String key, String dir) {
        super(parent);
        this.key = key;
        this.dir = dir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("Some...");
        try {
            System.out.println("Patch from EncrClassLoader " + Paths.get("").toRealPath().toString());
            byte b[] = tryFind(dir+"\\"+Paths.get("").toRealPath().toString());
            b = descryptB(b,this.key.getBytes());
            return defineClass(name,b,0,b.length);
        } catch (IOException e) {
            return  super.findClass(name);
        }

    }

    byte[] tryFind(String path) throws IOException {
        System.out.println("load plugin from path: " + path);
        Path p = Paths.get(path);
        return Files.readAllBytes(p);
    }

    byte[] descryptB(byte[] b, byte[] key) {
        byte[] resultMas = new byte[b.length];
        for (int i = 0; i < b.length; i++) {
            resultMas[i] = (byte) (b[i] ^ key[i % key.length]);
        }
        return resultMas;
    }
}
