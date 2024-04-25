/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Task;
import entity.TypeName;
import utils.GetDataUtils;

/**
 *
 * @author TNO
 */
public class InputerTask {

    private Task task;

    public InputerTask() {
        task = new Task();
    }

    public Task getInputTask() {
        String rqName = GetDataUtils.getString("Require name: ");
        int choiceTask = GetDataUtils.getInt("Task type", 1, 4);

        TypeName typename = null;

        switch (choiceTask) {
            case 1:
                typename = TypeName.Code;
                break;
            case 2:
                typename = TypeName.Design;
                break;
            case 3:
                typename = TypeName.Review;
                break;
            case 4:
                typename = TypeName.Test;
                break;
            default:
                break;
        }
        
        String date = GetDataUtils.getDate("Date: ");
        Double from = GetDataUtils.getDWithStep("From: ", 8.0, 17, 0.5);
        task.setFrom(from);
        Double to = GetDataUtils.getDWithStep("TO: ", task.getFrom() + 0.5, 17.5, 0.5);
        String assi = GetDataUtils.getString("Assiger: ");
        String reviewer = GetDataUtils.getString("Reviewer: ");
        
        task.setAssignee(assi);
        task.setDate(date);
        task.setFrom(from);
        task.setGetTypeName(typename);
        task.setName(rqName);
        task.setReviewer(reviewer);
        task.setTo(to);
        
        
        return task;
    }

}
