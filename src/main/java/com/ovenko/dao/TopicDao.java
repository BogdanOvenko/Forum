package com.ovenko.dao;

import com.ovenko.model.Topic;
import org.springframework.data.repository.CrudRepository;


public interface TopicDao extends CrudRepository<Topic, Long> {
}
