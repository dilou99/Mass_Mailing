package com.example.email_editor_tester.templates;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class template {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Lob
    @Column( nullable = false)
    private String jsonData;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date creationDate;

    public template() {
    }

    public template(Long id, String name, String jsonData, Date creationDate) {
        this.id = id;
        this.name = name;
        this.jsonData = jsonData;
        this.creationDate = creationDate;
    }

    public template(String name, String jsonData, Date creationDate) {
        this.name = name;
        this.jsonData = jsonData;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "template{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jsonData='" + jsonData + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
