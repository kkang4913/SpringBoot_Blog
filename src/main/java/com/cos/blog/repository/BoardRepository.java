package com.cos.blog.repository;

import com.cos.blog.model.Board;
import com.cos.blog.paging.Vo.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.ArrayList;
import java.util.Optional;

@Mapper
public interface BoardRepository {

    //18.ID 찾기
    Optional<Board> findById(int id);

    //18. 게시글(추가)
    void save(Board board);

    //18. 게시글(삭제)
    void deleteById(int id);

    //18. 게시글(수정)
    void boardUpdate(Board board);

    //18.게시글(페이징)
    ArrayList<Board> boardList(PageInfo paging, RowBounds rowBounds);

    //18.게시글(페이징: 게시글 수)
    int boardListCount();
}
