package cn.cnhoyun.chapter20.annoa;

/**
 * @author: huakaimay
 * @since: 2020-12-16
 */
@MyAnnotation(name = "tracker")
public class AnnotationHandler {


    public static void main(String[] args) {

        Class<AnnotationHandler> annotationHandlerClass = AnnotationHandler.class;

        MyAnnotation myAnnotation = annotationHandlerClass.getDeclaredAnnotation(MyAnnotation.class);
        String name = myAnnotation.name();
        System.out.println(name);

    }


}
