package team.a9043.yiluwiki.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import team.a9043.yiluwiki.exception.InvalidParameterException;
import team.a9043.yiluwiki.exception.RemoteServerException;
import team.a9043.yiluwiki.service.UserService;
import team.a9043.yiluwiki.service_pojo.TokenResult;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("/tokens/{code}")
    public TokenResult getToken(@PathVariable String code) throws RemoteServerException, InvalidParameterException {
        return userService.getToken(code);
    }
}
