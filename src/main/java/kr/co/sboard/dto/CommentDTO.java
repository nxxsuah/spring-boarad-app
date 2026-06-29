package kr.co.sboard.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentDTO {

    private int cno;
    private int parent;
    private String content;
    private String writer;
    private String regip;
    private String wdate;


    public CommentDTO toEntity(){

        return CommentDTO.builder()
                .cno(cno)
                .parent(parent)
                .content(content)
                .writer(writer)
                .regip(regip)
                .wdate(wdate)
                .build();
    }
}
