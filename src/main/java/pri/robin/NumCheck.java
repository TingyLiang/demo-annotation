package pri.robin;

import java.lang.annotation.*;

// 指定注解可以作用的类型
@Target(ElementType.METHOD)
//注解的保存级别SOURCE：注解将被编译器丢弃
//
//CLASS：注解在class文件中可用，但会被VM丢弃
//
//RUNTIME：VM将在运行期间保留注解，因此可以通过反射机制读取注解的信息。
@Retention(RetentionPolicy.CLASS)
//将注解包含在javadoc 中
@Documented
@Inherited
public @interface NumCheck {
    public String condtion();



}
