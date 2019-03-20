package ru.plugin;

import ru.sbt.Plugin;

public class Plugin1 implements Plugin {
    @Override
    public void doUsefull() {
        System.out.println("Start Plugin: " + this.getClass());
    }
}
