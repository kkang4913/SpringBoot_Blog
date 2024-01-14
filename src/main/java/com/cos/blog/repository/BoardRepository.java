package com.cos.blog.repository;

import com.cos.blog.model.Board;
import com.cos.blog.paging.Vo.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.ArrayList;
import java.util.Optional;

@Mapper
public interface BoardRepository {
    void save(Board board);

    ArrayList<Board> boardList(PageInfo paging, RowBounds rowBounds);

    int boardListCount();

    Optional<Board> findById(int id);
}
