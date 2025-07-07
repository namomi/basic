package sample.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/member")
    public Member member() {
        Member member = new Member("Kim", 20);
        return member;
    }

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

}
