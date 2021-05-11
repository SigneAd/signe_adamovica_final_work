package lv.lu.finalwork;

import lv.lu.finalwork.ui.ConsoleUi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@EnableAutoConfiguration
@SpringBootApplication
public class ProductAccountingApplication {

    public static void main(String[] args) {

        final ConfigurableApplicationContext context =
                SpringApplication.run(ProductAccountingApplication.class);
        context.getBean(ConsoleUi.class).run();

    }
}
