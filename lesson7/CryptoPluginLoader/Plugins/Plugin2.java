import ru.sbt.PluginCr;

public class Plugin2 implements PluginCr {
    @Override
    public void doUsefull() {
        System.out.println("Start Plugin: " + this.getClass());
    }
}