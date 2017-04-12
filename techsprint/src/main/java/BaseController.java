/**
 * Created by mwoodland on 11/04/2017.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@EnableAutoConfiguration
public class BaseController {
    
    @RequestMapping("/")
    @ResponseBody
    public RedirectView home() {
        return new RedirectView("index.html");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BaseController.class, args);
    }
    
}
