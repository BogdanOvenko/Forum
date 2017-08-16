package com.ovenko.service;

import com.ovenko.dao.TopicDao;
import com.ovenko.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicDao topicDao;

    public Topic getTopic(Long id){
        return topicDao.findOne(id);
    }

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicDao.findAll().forEach(topics::add);
        return topics;
    }

    public void createTopic(Topic topic){
        topicDao.save(topic);
    }

    public void updateTopic(Topic topic){
        topicDao.save(topic);
    }

    public void deleteTopic(Long id){
        topicDao.delete(id);
    }
}
