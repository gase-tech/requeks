package com.kstech.requeks;

import com.kstech.requeks.util.DefaultProfileUtil;
import com.kstech.requeks.util.InitializeLogUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableScheduling
@EnableAsync
public class RequeksApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RequeksApplication.class);
		DefaultProfileUtil.addDefaultProfile(app);
		Environment env = app.run(args).getEnvironment();
		InitializeLogUtil.logApplicationStartup(env);
	}

}
