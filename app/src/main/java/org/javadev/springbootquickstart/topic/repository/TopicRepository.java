package org.javadev.springbootquickstart.topic.repository;

import org.javadev.springbootquickstart.topic.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, String> {

}
