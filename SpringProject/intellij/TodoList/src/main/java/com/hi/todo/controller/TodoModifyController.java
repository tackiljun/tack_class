package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/todo/modify")
@Log4j2
public class TodoModifyController {


    // get : 수정할 수 있는 화면.
    @RequestMapping(method = RequestMethod.GET)
    public String getModifyForm(Model model) {
        log.info("get /todo/modify");
        model.addAttribute("todo", "TODO");
        return "todo/modifyForm";
        // /WEB-INF/views/todo/modifyForm.jsp .
    }


    // post : 데이터를 받고 -> 수정 -> list 로 이동.
    @RequestMapping(method = RequestMethod.POST)
    public String modify() {
        log.info("post /todo/modify");

        return "redirect:/todo/list";
    }



}