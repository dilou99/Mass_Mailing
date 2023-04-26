package com.example.email_editor_tester.templates;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Lob
    @Column(name = "json_data", nullable = false)
    private String jsonData;
    @Lob
    @Column(name = "html_data", nullable = false)
    private String htmlData;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date creationDate;

    public Template() {
    }

    public Template(Long id, String name, String jsonData,String htmlData,Date creationDate) {
        this.id = id;
        this.name = name;
        this.jsonData = jsonData;
        this.htmlData = htmlData;
        this.creationDate = creationDate;
    }

    public Template(String name, String jsonData, String htmlData, Date creationDate) {
        this.name = name;
        this.jsonData = jsonData;
        this.htmlData = htmlData;
        this.creationDate = creationDate;
    }

    public Template(String name, String jsonData, String htmlData) {
        this.name = name;
        this.jsonData = jsonData;
        this.htmlData = htmlData;
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

    public String getHtmlData() {
        return htmlData;
    }

    public void setHtmlData(String htmlData) {
        this.htmlData = htmlData;
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
                ", htmlData='" + htmlData + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
