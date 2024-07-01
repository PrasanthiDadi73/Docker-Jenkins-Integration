package DockerJenkinsGithubIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DockerJenkinsGithubIntegrationApplication {

	@GetMapping("/message")
	public void getMessage(){
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsGithubIntegrationApplication.class, args);
	}

}
