package com.example.bonnus_vieccanlam; // LƯU Ý: Giữ nguyên dòng package gốc của máy bạn!

public class Task {
    private String id;
    private String name;
    private String message;
    private String date;
    private String priority;


    public Task() {
    }

    public Task(String name, String message, String date, String priority) {
        this.name = name;
        this.message = message;
        this.date = date;
        this.priority = priority;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
}