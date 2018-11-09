package pri.robin;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Integer> annots = new ArrayList<Integer>();
        Collections.addAll(annots, 47, 48, 49, 50);
        trackUseCases(annots, Number.class);
    }

    /**
     * 注解主要给编译器及工具类型的软件用的。
     * 注解的提取需要借助于 Java 的反射技术，反射比较慢，所以注解使用时也需要谨慎计较时间成本。
     *
     * @param useCases
     * @param cl
     */

    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            NumCheck uc = m.getAnnotation(NumCheck.class);
            if (uc != null) {
                System.out.println("Checking condition:" + uc.condtion());
            }
        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }
}
