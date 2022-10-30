package com.bipuz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.inject.Inject;

@SpringBootApplication
public class BipuzApplication {
    private static final Logger log = LoggerFactory.getLogger(BipuzApplication.class);

    @Inject
    private Environment env;

    public static void main(String[] args) throws UnknownHostException {
        final SpringApplication app = new SpringApplication(BipuzApplication.class);
//        DefaultProfileUtil.addDefaultProfile(app);
        final Environment env = app.run(args).getEnvironment();
        log.info(
                "\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Local: \t\thttp://127.0.0.1:{}\n\t" +
                        "External: \thttp://{}:{}\n----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port")
        );
    }

}
