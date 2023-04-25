package com.example.email_editor_tester.user;

import javax.persistence.*;

@Entity
@Table
public class json {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Lob
    @Column( nullable = false)
    private String jsonData;

    public json() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Json{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jsonData='" + jsonData + '\'' +
                '}';
    }

    public json(String name, String jsonData) {
        this.name = name;
        this.jsonData = jsonData;
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

    public json(Long id, String name, String jsonData) {
        this.id = id;
        this.name = name;
        this.jsonData = jsonData;
    }
}
