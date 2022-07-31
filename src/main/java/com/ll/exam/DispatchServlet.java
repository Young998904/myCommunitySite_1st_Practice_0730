package com.ll.exam;

import com.ll.exam.article.ArticleController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/usr/*")
public class DispatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Rq rq = new Rq(req, resp);

        ArticleController articleController = new ArticleController(rq);

        switch (rq.getActionPath()) {
            case "/usr/article/list" :
                ArticleController.showLIst(rq);
        }
    }
}
