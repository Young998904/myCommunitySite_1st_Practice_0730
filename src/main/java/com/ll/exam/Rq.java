package com.ll.exam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.UnsupportedEncodingException;

public class Rq {
    HttpServletResponse resp;
    HttpServletRequest req;
    public Rq (HttpServletRequest req, HttpServletResponse resp) {

        this.resp = resp;
        this.req = req;

        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");
    }
}
