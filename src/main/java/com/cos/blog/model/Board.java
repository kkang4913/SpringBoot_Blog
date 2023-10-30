package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor //Lombok 에서 제공하는 어노테이션으로, 모든 필드를 파라미터로 받는 생성자를 자동 생성
@NoArgsConstructor  //Lombok 에서 제공하는 어노테이션으로, 파라미터가 없는 기본 생성자를 자동으로 생성
@Builder            //빌더 패턴을 구현, 객체를 생성할 때 객체의 속성을 명시적으로 지정하여 객체를 생성하거나 초기화하는 방법을 제공
public class Board {

    private int id;         // Board ID, DBTable : BOARD_SEQ 사용
    private String title;   // Board 제목(타이틀)
    private String content; // Board 내용, DB 테이블에서는 CLOB 사용 / 섬머노트 라이브러리 사용 예정
    private int count;      // Board 조회수
    private User user;      // User
    private Timestamp createDate; // Board 생성 시간

    private List<Reply> reply; // 하나의 게시글에 존재하는 댓글 정보를 불러오기 위함
}
