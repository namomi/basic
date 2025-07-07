package sample.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberViewController {

    @GetMapping("/members")
    public String members() {
        return "members";
    }
}
