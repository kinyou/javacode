package annotation;

/**
 * Created by maogou on 2017/5/10.
 */
public @interface CustomerAnnotation {
    //定义是数组
    //String[] value();
    String value() default "Hello";
}
