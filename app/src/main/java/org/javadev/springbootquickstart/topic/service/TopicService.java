package org.javadev.springbootquickstart.topic.service;

import java.util.ArrayList;
import java.util.List;


import org.javadev.springbootquickstart.topic.model.Topic;

import org.springframework.stereotype.Component;


@Component
public interface TopicService {

  public List<Topic> getAllTopics();


  public Topic getTopic(String id);

  public void addTopic(Topic topic);
  public void updateTopic(String id, Topic topic);
  public void deleteTopic(String id);

}
