package kr.co.sboard.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class FileDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fno;
    private int ano;
    private String ofname;
    private String sfname;
    private int download;
    private String rdate;


    public FileDTO toEntity(){

        return FileDTO.builder()
                .fno(fno)
                .ano(ano)
                .ofname(ofname)
                .sfname(sfname)
                .download(download)
                .build();
    }
}
