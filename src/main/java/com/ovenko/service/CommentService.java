package com.ovenko.service;

import com.ovenko.dao.CommentDao;
import com.ovenko.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentDao commentDao;

    public Comment getComment(Long id){
        return commentDao.findOne(id);
    }

    public List<Comment> getAllComments(){
        List<Comment> comments = new ArrayList<>();
        commentDao.findAll().forEach(comments::add);
        return comments;
    }

    public void createComment(Comment comment){
        commentDao.save(comment);
    }

    public void updateComment(Comment comment){
        commentDao.save(comment);
    }

    public void deleteComment(Long id){
        commentDao.delete(id);
    }
}
