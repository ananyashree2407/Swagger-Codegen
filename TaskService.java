package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();



    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task getTaskById(Integer taskId) {
        return null;
    }
}

