package com.example.Latihan3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping ("/")
    @ResponseBody
    public String index() {
        return " Nama: Erlangga " +
                " Nim: 1912510375 " +
                " Fakultas: FTI Sistem Informasi" +
                " Umur: 21 Tahun " +
                " Email: 1912510375@student.budiluhur.ac.id - from Spring Boot with Gradle ;) -";
    }
}
