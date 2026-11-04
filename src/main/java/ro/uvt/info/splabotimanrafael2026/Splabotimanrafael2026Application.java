package ro.uvt.info.splabotimanrafael2026;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.uvt.info.splabotimanrafael2026.difexamples.ClientComponent;
import ro.uvt.info.splabotimanrafael2026.difexamples.SingletonComponent;
import ro.uvt.info.splabotimanrafael2026.difexamples.TransientComponent;

@SpringBootApplication
public class Splabotimanrafael2026Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Splabotimanrafael2026Application.class, args);

        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();

        c = (ClientComponent)context.getBean("clientComponent");
        c.operation();
    }
}