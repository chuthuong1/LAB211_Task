/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Task;
import java.util.ArrayList;

/**
 *
 * @author TNO
 */
public class ManagerTask {

    private ArrayList<Task> task;
    private int lastID;

    public ManagerTask() {
        task = new ArrayList<>();
        lastID = 1;
    }

    public boolean addTask(Task t) throws Exception {
        if (t != null) {
            t.setId(lastID++);
            return task.add(t);
        }
        throw new Exception("Task not found!");
    }

    public Task deleteTaskById(int id) throws Exception {
        int index = searchById(id);
        if (index != -1) {
            return task.remove(index);
        }
        throw new Exception("ID not found !");
    }

    private int searchById(int id) {
        for (int i = 0; i < task.size(); i++) {
            if (task.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
       String listTask = "";
        for (Task o : task) {
            listTask +=o;
        }
        return listTask;
    }
    
    

}
