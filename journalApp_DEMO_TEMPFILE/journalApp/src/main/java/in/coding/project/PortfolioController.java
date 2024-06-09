package in.coding.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
    @GetMapping("/profile")
    public String index() {
        return "index.html";
    }
}
