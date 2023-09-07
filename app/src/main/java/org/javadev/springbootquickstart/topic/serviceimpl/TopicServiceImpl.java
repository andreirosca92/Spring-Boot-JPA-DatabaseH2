package org.javadev.springbootquickstart.topic.serviceimpl;

import jakarta.transaction.Transactional;
import org.javadev.springbootquickstart.topic.model.Topic;
import org.javadev.springbootquickstart.topic.repository.TopicRepository;
import org.javadev.springbootquickstart.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TopicServiceImpl implements TopicService {


    @Autowired
    private TopicRepository topicRepository;

    @Transactional
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    @Transactional
    public Topic getTopic(String id) {
        return topicRepository.findById(id).get();
    }

    @Transactional
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    @Transactional
    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    @Transactional
    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
