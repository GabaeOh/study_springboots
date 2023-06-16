package com.example.study_springboots;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/firstservlets") // 맵핑하는 기술
public class FirstServlets  extends HttpServlet{ //HttpServlet의 능력을 받아오게 됨 (상속의 개념)
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("성공");
    }
    
}


