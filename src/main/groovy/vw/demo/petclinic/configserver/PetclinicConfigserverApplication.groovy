package vw.demo.petclinic.configserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class PetclinicConfigserverApplication {

	static void main(String[] args) {
		SpringApplication.run PetclinicConfigserverApplication, args
	}
}
