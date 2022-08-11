package com.techm.ProjectsService;

import static springfox.documentation.builders.PathSelectors.regex;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonIgnore;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin(origins = "*")
@SpringBootApplication
@ComponentScan("com.techm.*")
@EnableSwagger2
@EnableAutoConfiguration(exclude = { HypermediaAutoConfiguration.class })
@EnableMongoRepositories(value = { "com.techm.designer.dao" })
public class ProjectsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectsServiceApplication.class, args);
	}

//	@Bean
//	public Docket newsApi() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("businessDataService").apiInfo(apiInfo()).select()
//				.paths(regex("/businessDataService/.*")).build();
//	}

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("businessDataService").apiInfo(apiInfo()).select()
				.paths(regex("/businessDataService/.*")).build()
				.directModelSubstitute(XMLGregorianCalendar.class, MixIn.class);
	}

	public static interface MixIn {
		@JsonIgnore
		public void setYear(int year);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Catalog Service REST APIs").description("Microservice REST APIs")
				.termsOfServiceUrl("http://....").contact("TechMahindra").license("TechMahindra Licensed")
				.licenseUrl("https://techmahindra.com").version("2.0").build();
	}

}
