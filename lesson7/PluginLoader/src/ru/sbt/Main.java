package ru.sbt;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("lesson7\\PluginLoader");

        try {
            String current = path.toRealPath().toString();
            System.out.println(current);

            PluginManager pluginManager = new PluginManager(current + "\\plugins");

            Plugin pl1 = pluginManager.load("Plugin1", "ru.plugin.Plugin1");
            pl1.doUsefull();

            Plugin pl2 = pluginManager.load("Plugin2", "ru.plugin.Plugin2");
            pl2.doUsefull();

            Plugin pl3_type1 = pluginManager.load("SimilarNamesPlugin", "ru.plugin.Corp1.Plugin3");
            pl3_type1.doUsefull();

            Plugin pl3_type2 = pluginManager.load("SimilarNamesPlugin", "ru.plugin.Corp2.Plugin3");
            pl3_type2.doUsefull();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
