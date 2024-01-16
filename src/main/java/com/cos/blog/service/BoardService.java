package com.cos.blog.service;

import com.cos.blog.model.Board;
import com.cos.blog.model.User;
import com.cos.blog.paging.Vo.PageInfo;
import com.cos.blog.repository.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

@Slf4j
@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    public void 글쓰기(Board board, User user){
        board.setCount(0);
        board.setUser(user);

        boardRepository.save(board);
    }
    @Transactional
    public void 글삭제하기(int id){
        boardRepository.deleteById(id);
    }

    @Transactional
    public void 글수정하기(int id, Board requestBoard){
        Board board = boardRepository.findById(id)
                .orElseThrow(() ->{
                    return new IllegalArgumentException("글 찾기 실패: 아이디를 찾을 수 없습니다.");
                });
        board.setTitle(requestBoard.getTitle());
        board.setContent(requestBoard.getContent());

        boardRepository.boardUpdate(board);
    }


    public Board 글상세보기(int id) {
        Optional<Board> boardDetail = boardRepository.findById(id);
        return boardDetail.orElseThrow(() -> new IllegalArgumentException("글 상세보기 실패 : 아이디를 찾을 수 없습니다."));
    }
    public ArrayList<Board> 글목록(PageInfo paging) {
        int offset =(paging.getCurrentPage()-1) * paging.getBoardLimit();

        RowBounds rowBounds = new RowBounds(offset,paging.getBoardLimit());

        return boardRepository.boardList(paging,rowBounds);
    }

    public int 글목록갯수() {
        return boardRepository.boardListCount();
    }
}
