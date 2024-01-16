package com.cos.blog.controller.api;

import com.cos.blog.config.auth.PrincipalDetail;
import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.Board;
import com.cos.blog.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class BoardApiController {

    @Autowired
    private BoardService boardService;

    /**
     * 게시글 등록 API
     * @param board
     * @param principal
     * @return
     */
    @PostMapping("/api/board")
    public ResponseDto<Integer> save(@RequestBody Board board,
                                     @AuthenticationPrincipal PrincipalDetail principal){
        boardService.글쓰기(board,principal.getUser());

        return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
    }

    /**
     * 게시글 삭제 API
     * @param id
     * @return
     */
    @DeleteMapping("/api/board/{id}")
    public ResponseDto<Integer> deleteById(@PathVariable int id){
        boardService.글삭제하기(id);

        return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
    }

    /**
     * 게시글 수정 API
     * @param id
     * @param board
     * @return
     */
    @PutMapping("/api/board/{id}")
    public ResponseDto<Integer> update(@PathVariable int id, @RequestBody Board board){
        boardService.글수정하기(id,board);
        return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
    }
}
