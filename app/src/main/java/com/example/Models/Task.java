package com.example.Models;

public class Task {
    private int id;
    private String taskName;
    private String taskDescription;
    private String taskDate;
    private String taskStatus;

    public Task(int id, String taskName, String taskDescription, String taskDate, String taskStatus){
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDate = taskDate;
        this.taskStatus = taskStatus;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
    public void setTaskDescription(String taskName){
        this.taskName = taskDescription;
    }
    public void setTaskDate(String taskName){
        this.taskName = taskDate;
    }

    public void setTaskStatus(String taskStatus){
        this.taskStatus = taskStatus;
    }

    public int getId(){
        return id;
    }
    public  String getTaskName(){
        return  taskName;
    }
    public  String getTaskDescription(){
        return  taskDescription;
    }
    public String getTaskDate(){
        return  taskDate;
    }
    public  String getTaskStatus(){
        return  taskStatus;
    }

    
}
