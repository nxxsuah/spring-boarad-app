package kr.co.sboard.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j2
@RequiredArgsConstructor
@Controller
public class FindController {

    @GetMapping("/find/changePassword")
    public String changePassword(){
        return "/find/changePassword";
    }

    @GetMapping("/find/password")
    public String password(){
        return "/find/password";
    }
    @GetMapping("/find/resultUserId")
    public String resultUserId(){
        return "/find/resultUserId";
    }
    @GetMapping("/find/UserId")
    public String UserId(){
        return "/find/UserId";
    }


}
