import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat simon =
                (Cat) applicationContext.getBean("Cat");
        simon.setCat("Simon");
        Cat sonic =
                (Cat)  applicationContext.getBean("Cat");
        sonic.setCat("Sonic");

        System.out.println(simon.getCat());
        System.out.println(sonic.getCat());

        System.out.println(bean == bean2);
        System.out.println(simon == sonic);

    }
}