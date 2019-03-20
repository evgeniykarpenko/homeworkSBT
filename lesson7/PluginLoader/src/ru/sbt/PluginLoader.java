package ru.sbt;

import java.net.URL;
import java.net.URLClassLoader;

public class PluginLoader extends URLClassLoader {

    public PluginLoader(URL[] urls) {
        super(urls);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (name.startsWith("ru.plugin")) return this.findClass(name);
        return super.loadClass(name);
    }
}
