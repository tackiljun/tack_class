package com.hi.board.service;

import com.hi.board.domain.RequestModifyRequest;
import com.hi.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


@Service
@Log4j2
public class BoardModifyService {


    @Autowired
    private BoardMapper boardMapper;


    public int modifyBoardDTO(
            RequestModifyRequest modifyRequest,
            HttpServletRequest request
    ) {

        // 파일 저장 : 파일이 존재하면 저장.
        if(modifyRequest.getFile() != null && modifyRequest.getFile().getSize() > 0) {

            // 웹 경로.
            String uri = "/board";
            // 실제 경로.
            String realPath = request.getSession().getServletContext().getRealPath(uri);
            // (저장이 된다면) 새로운 파일 이름.
            String newFilename = UUID.randomUUID().toString() + modifyRequest.getFile().getOriginalFilename();
            // 저장.
            File newFile = new File(realPath, newFilename);
            try {
                modifyRequest.getFile().transferTo(newFile);

                // filename 속성에 새로운 파일 이름을 저장.
                modifyRequest.setFilename(newFilename);
            } catch (IOException e) {
                //throw new RuntimeException(e);
                // filename 에 oldfile 이 가지고 있는 파일 이름 설정.
                modifyRequest.setFilename(modifyRequest.getOldfile());
            }
        } else {
            // filename 속성에 이전에 업로드되어 있는 파일 이름을 저장.
            modifyRequest.setFilename(modifyRequest.getOldfile());
        }

        log.info(modifyRequest);

        // BoardMapper 에 update 요청.
        return boardMapper.updateBoard(modifyRequest);
    }



}