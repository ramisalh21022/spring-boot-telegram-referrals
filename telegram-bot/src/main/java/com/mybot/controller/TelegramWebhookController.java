package com.mybot.controller;


import com.mybot.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/telegram")
public class TelegramWebhookController {

    private final UserService userService;

    public TelegramWebhookController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/webhook")
    public String handleUpdate(@RequestBody String update) {
        // هنا ستقوم بمعالجة الرسائل الواردة من Telegram
        return "ok";
    }
}
