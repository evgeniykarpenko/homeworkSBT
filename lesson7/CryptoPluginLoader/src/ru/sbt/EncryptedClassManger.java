package ru.sbt;

import java.io.File;

public class EncryptedClassManger {
    private final EncryptedClassLoader encryptedClassLoader;

    public EncryptedClassManger(String file, String key) {
        System.out.println("Encr f m: "+ file.toString());
        this.encryptedClassLoader = new EncryptedClassLoader(ClassLoader.getSystemClassLoader(),key,file);
    }

    public  Plugin load(String pluginName) throws ClassNotFoundException,IllegalAccessException,InstantiationException {
        Class<?> clazz = encryptedClassLoader.loadClass(pluginName);
        return (Plugin) clazz.newInstance();
    }
}
