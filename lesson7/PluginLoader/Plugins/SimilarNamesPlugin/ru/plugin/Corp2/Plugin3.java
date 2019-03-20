package ru.plugin.Corp2;

import ru.sbt.Plugin;

public class Plugin3 implements Plugin {
    @Override
    public void doUsefull() {
        System.out.println("Start Plugin: " + this.getClass());
    }
}
