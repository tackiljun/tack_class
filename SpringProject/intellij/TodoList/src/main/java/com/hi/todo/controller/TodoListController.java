package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Log4j2
public class TodoListController {

    @RequestMapping("/todo/list")
    public void getTodoList(Model model) {

        log.info("/todo/list");
        // view 로 결과데이터를 공유.
        model.addAttribute("todoList", "리스트");
        // /WEB-INF/views/todo/list.jsp
    }



}