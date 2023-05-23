package com.hi.board.domain;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class BoardDTO {


    private int bno;
    private String title;
    private String content;
    private String writer;
    // 업로드 한 파일의 이름.
    private String file; // 이 file 은 컬럼이름.
    private String regdate;
    private String updatedate;
    // 작성자의 idx.
    private int memidx;



}