package HomeWork6_2;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanUtils {
    /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to   Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */
    public static void assign(Object to, Object from) {
        Class myClassTo = to.getClass();
        Class myClassFrom = from.getClass();

        Method[] methodsFrom = myClassFrom.getMethods();
        Method[] methodsTo = myClassTo.getMethods();
        for (Method mFrom : methodsFrom) {
            if (mFrom.getName().startsWith("get")) {
                System.out.println("Found getter: " + mFrom);
                String newSetterName = mFrom.getName().replace("get", "set");
                for (Method mTo : methodsTo) {
                    if ((mTo.getName().equals(newSetterName) && (mFrom.getReturnType().isAssignableFrom(mTo.getParameterTypes()[0])))) {
                        System.out.println("Setter Found: " + mTo);

                        try {
                            mTo.invoke(to, mFrom.invoke(from));
                        } catch (IllegalAccessException e) {
                            // e.printStackTrace();
                            System.out.println("Error 1 !");
                        } catch (InvocationTargetException e) {
                            // e.printStackTrace();
                            System.out.println("Error 2 !");
                        }
                    }
                }
            }
        }
    }
}
