package kr.co.sboard.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TermsDTO {

    private int no;
    private String basic;
    private String privacy;


    public TermsDTO toEntity(){
        return TermsDTO.builder()
                .no(no)
                .basic(basic)
                .privacy(privacy)
                .build();
    }
}
