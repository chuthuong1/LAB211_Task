/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.InputerTask;
import bo.ManagerTask;
import entity.Task;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class TaskController {

    private InputerTask inputerr;
    private ManagerTask managerr;

    public TaskController() {
        managerr = new ManagerTask();
    }

    public Task addTask() throws Exception {
        inputerr = new InputerTask();
        Task t = inputerr.getInputTask();
        if (managerr.addTask(t)) {
            return t;
        }
        throw new Exception("Add failed!");
    }

    public String displayTask() {
        return managerr.toString();
    }

    public Task deleteTask() throws Exception {
        int id = GetDataUtils.getInt("Enter code you want to delete: ", 1, Integer.MAX_VALUE);
        return managerr.deleteTaskById(id);
    }

}
