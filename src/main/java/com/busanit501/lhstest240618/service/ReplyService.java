package com.busanit501.lhstest240618.service;


import com.busanit501.lhstest240618.dto.PageRequestDTO;
import com.busanit501.lhstest240618.dto.PageResponseDTO;
import com.busanit501.lhstest240618.dto.ReplyDTO;

public interface ReplyService {
    // 댓글 , crud
    Long register(ReplyDTO replyDTO);
    ReplyDTO read(Long rno);
    void update(ReplyDTO replyDTO);
    void delete(Long rno);
    // 댓글 페이징 처리해서 목록 출력.
    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);
}
