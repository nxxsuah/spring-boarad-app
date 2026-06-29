package kr.co.sboard.service;

import kr.co.sboard.dao.ArticleDAO;
import kr.co.sboard.dao.FileDAO;
import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.dto.FileDTO;
import kr.co.sboard.repository.ArticleRepository;
import kr.co.sboard.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class FileService {

    private final FileDAO dao;
    private final CommentRepository repository;

    public FileDTO get(int fno){
        return null;
    }

    public List<FileDTO> getAll(){
        return null;
    }

    public void register(FileDTO dto){

    }

    public void modify(FileDTO dto){

    }

    public void remove(int fno){

    }

}
