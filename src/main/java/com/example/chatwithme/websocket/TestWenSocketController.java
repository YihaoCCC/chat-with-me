package com.example.chatwithme.websocket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestWenSocketController {


    @Resource
    private WebSocket webSocket;

    @GetMapping("/testwsdemo")
    private void test() {
        webSocket.sendOneMessage("");
    }
}
