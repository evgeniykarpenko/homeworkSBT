package Crypto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Encryptor {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("");
        //System.out.println(p.toAbsolutePath());
       // System.out.println(p.toRealPath()+"\\lesson7\\CryptoPluginLoader\\Plugins\\Plugin1.class");
        encrypt(p.toRealPath()+"\\lesson7\\CryptoPluginLoader\\Plugins\\Plugin1.class","111111111");
        encrypt(p.toRealPath()+"\\lesson7\\CryptoPluginLoader\\Plugins\\Plugin2.class","111111111");
    }

    static void encrypt(String path, String key)throws IOException {
        Path p = Paths.get(path);
        //System.out.println(p.toRealPath());
        byte[] b = Files.readAllBytes(p);

        System.out.println("Encrypt: "+ p.toString());
        b = encryptB(b,key.getBytes());
        Files.write(p,b);
        System.out.println("File: "+p.getFileName()+ "  ready");

    }

    static  byte[] encryptB(byte[] b, byte[] key){
        byte[] resultMas = new byte[b.length];
        for (int i = 0; i < b.length; i++) {
            resultMas[i] = (byte)(b[i]^key[i%key.length]);
        }
        return resultMas;
    }
}
