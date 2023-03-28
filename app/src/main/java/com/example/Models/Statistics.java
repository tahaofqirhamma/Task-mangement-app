package com.example.Models;

public class Statistics {

    private int tasksNbr;
    private int completedTasks;
    private int canceledTasks;


    public Statistics(int tasksNbr,int canceldTasks, int completedTasks){
        this.tasksNbr = tasksNbr;
        this.canceledTasks = canceldTasks;
        this.completedTasks = completedTasks;
    }

    public int getCanceledTasks() {
        return canceledTasks;
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public int getTasksNbr() {
        return tasksNbr;
    }

    public void setTasksNbr(int tasksNbr){
        this.tasksNbr = tasksNbr;
    }

    public void setCompletedTasks(int completedTasks){
        this.canceledTasks = completedTasks;
    }

    public void setCanceledTaks(int canceldTasks){
        this.canceledTasks = canceldTasks;
    }
}
