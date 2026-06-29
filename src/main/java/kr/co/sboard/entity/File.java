package kr.co.sboard.entity;

import jakarta.persistence.Entity;
import kr.co.sboard.dto.FileDTO;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class File {

    private int fno;
    private int ano;
    private String ofname;
    private String sfname;
    private int download;
    private String rdate;

    @CreationTimestamp
    private LocalDateTime wdate;

    public FileDTO toDTO(){

        return FileDTO.builder()
                .fno(fno)
                .ano(ano)
                .ofname(ofname)
                .sfname(sfname)
                .download(download)
                .build();
    }
}
