package DockerJenkinsGithubIntegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

    @GetMapping
    public void getHello(){
        System.out.println("Hello");
    }
}
