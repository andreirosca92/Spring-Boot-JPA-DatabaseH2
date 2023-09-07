package org.javadev.springbootquickstart.course.model;



import jakarta.persistence.*;
import org.javadev.springbootquickstart.topic.model.Topic;

import java.util.List;

@Entity
@Table
public class Course {

  @Id
  private String id;
  private String name;
  private String description;


  @ManyToOne( cascade = CascadeType.ALL)
  @JoinColumn(name="topic_id", nullable=false)
  private Topic topic;
  public Course(){

  }

  public Course (String id, String name, String description, String topicId){
     super();
     this.id = id;
     this.name = name;
     this.description = description;
     this.topic = new Topic(topicId, "", "");

  }

  public String getId(){
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription(){
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setTopic(Topic topic) {
    this.topic= topic;
  }
}
