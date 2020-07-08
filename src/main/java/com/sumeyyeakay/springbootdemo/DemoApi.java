package com.sumeyyeakay.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//hangi adreste yayinlansin;
@RequestMapping("/mesajj")
public class DemoApi {

    //mesaj adresine get yapildiginda merhaba metodu calissin
    @GetMapping
    //restful controller olarak acacak

    public String merhaba() {
        return "Merhaba";
    }
}
