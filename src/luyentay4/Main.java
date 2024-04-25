/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentay4;

import controller.TaskController;
import entity.Task;
import utils.DisplayUtils;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class Main {

    public static void main(String[] args) throws Exception {
        TaskController taskController = new TaskController();
        while (true) {
            //display gui
            DisplayUtils.displayMenu();
            // user enter choice
            int choice = GetDataUtils.getChoice("Enter your choice", 1, 4);
            // case
            switch (choice) {
                case 1:
                    try {
                        Task t = taskController.addTask();
                        System.out.println(Task.STRING_TASK);
                        System.out.println(t);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        Task delete = taskController.deleteTask();
                        System.out.println(Task.STRING_TASK);
                        System.out.println(delete);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(Task.STRING_TASK);
                    System.out.println(taskController.displayTask());
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
