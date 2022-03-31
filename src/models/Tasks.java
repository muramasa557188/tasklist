package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.protobuf.Timestamp;

@Entity
@Table(name="tasks")

public class Tasks {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="content",length=255,nullable=false)
    private String content;

    @Column(name="created_at",nullable=false)
    private Timestamp created_at;

    @Column(name="update_at,nullable=false")
    private Timestamp updarte_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdarte_at() {
        return updarte_at;
    }

    public void setUpdarte_at(Timestamp updarte_at) {
        this.updarte_at = updarte_at;
    }


}
