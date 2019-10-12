package com.ift.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liufei
 * @since 2019-10-12 16:11
 */
@RestController
public class MemberController {

    @GetMapping("/member")
    public String member() {
        return "This is Member Service。";
    }
}
