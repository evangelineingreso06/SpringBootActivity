package com.SpringTask.task.service;

import java.util.List;
import com.SpringTask.task.model.Task;

public interface TaskService {
    List<Task> getAllTasks();
    void saveTasks(Task task);
    Task getTaskById(long id);
    void deleteTaskById(long id);
}