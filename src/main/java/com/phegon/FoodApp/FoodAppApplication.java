package com.phegon.FoodApp;

import com.phegon.FoodApp.email_notification.dtos.NotificationDTO;
import com.phegon.FoodApp.email_notification.services.NotificationService;
import com.phegon.FoodApp.enums.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
//@RequiredArgsConstructor
public class FoodAppApplication {

//	private final NotificationService notificationService ;

	public static void main(String[] args) {
		SpringApplication.run(FoodAppApplication.class, args);
//		System.out.println("Hello Ritik");
	}

//	for testing the email part:
//	@Bean
//	CommandLineRunner runner() {
//		return args ->
//		{
//			NotificationDTO notificationDTO = NotificationDTO.builder()
//					.recipient("ritiksharmaiiit@gmail.com")
//					.subject("Hello Ritik")
//					.body("This is a test email!!!")
//					.type(NotificationType.EMAIL)
//					.build();
//
//			notificationService.sendEmail(notificationDTO);
//		};
//	}

}
