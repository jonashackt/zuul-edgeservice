package de.jonashackt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulEdgeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEdgeserviceApplication.class, args);
	}
}
