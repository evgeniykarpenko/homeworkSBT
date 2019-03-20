package ru.sbt;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

public class PluginManager {
    private final String pluginRootDirectory;

    public PluginManager(String pluginRootDirectory) {
        this.pluginRootDirectory = pluginRootDirectory;
    }

    public Plugin load(String pluginName, String pluginClassName) throws MalformedURLException, InstantiationException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {

        URL[] url = {new File(pluginRootDirectory + "\\" + pluginName + "\\").toURI().toURL()};
        System.out.println(url[0].toString());

        PluginLoader pluginLoader = new PluginLoader(url);
        return (Plugin) pluginLoader.loadClass(pluginClassName).getDeclaredConstructor().newInstance();

    }
}
