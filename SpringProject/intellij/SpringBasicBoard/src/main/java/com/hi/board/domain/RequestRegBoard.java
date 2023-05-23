package com.hi.board.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class RequestRegBoard {


    private String title;
    private String content;
    // 회원제 게시판 작성자는 memidx 로 변경.
    //private String writer;
    private int memidx;
    // 파일 업로드를 위해서 변수를 추가.
    private MultipartFile file; // 사용자로부터 받는 파일 객체.
    private String filename; // DB에 저장 할 file이름.



}