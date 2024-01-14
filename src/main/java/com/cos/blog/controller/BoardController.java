package com.cos.blog.controller;

import com.cos.blog.model.Board;
import com.cos.blog.paging.Pagination;
import com.cos.blog.paging.Vo.PageInfo;
import com.cos.blog.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Slf4j
@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

//    @GetMapping("/")
//    public String index(@AuthenticationPrincipal PrincipalDetail principal){ //컨트롤러에서 세션을 찾는 법
//        return "index";
//    }

    @GetMapping("/")
    public String index(Model model,
                             @RequestParam(value = "currentPage",required = false,defaultValue = "1") int currentPage){
        //게시글 총 갯수
        int listCount = boardService.글목록갯수();

        //클릭한 페이지, 총 게시글 수 전달
        PageInfo paging = Pagination.getPageInfo(currentPage,listCount);

        //게시글 목록
        ArrayList<Board> boardList = boardService.글목록(paging);


        model.addAttribute("boards",boardList);
        model.addAttribute("paging",paging);

        return "index";
    }
    //18. 게시글 등록 페이지(추가)
    @GetMapping("/board/saveForm")
    public String saveForm(){
        return "board/saveForm";
    }

    @GetMapping("/board/{id}")
    public String findById(@PathVariable int id, Model model){
        model.addAttribute("board",boardService.글상세보기(id));
        return "board/detail";
    }
}
