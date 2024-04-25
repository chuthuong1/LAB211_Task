/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author TNO
 */
public class Task {
    private int id;
    private String name;
    private String date;
    private double from;
    private double to;
    private String assignee;
    private String reviewer;
    private TypeName getTypeName;
    public static final String STRING_TASK = String.format("%-10s %-20s %-20s %-20s "
            + "%-20s %-20s %-20s\n", "ID", "Name", "Date", "From", "To", "Sssignee", "reviewer", "getTypeName");

    public Task() {
    }

    public Task(int id, String name, String date, double from, double to, String assignee, String reviewer, TypeName getTypeName) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.getTypeName = getTypeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public TypeName getGetTypeName() {
        return getTypeName;
    }

    public void setGetTypeName(TypeName getTypeName) {
        this.getTypeName = getTypeName;
    }

    @Override
    public String toString() {
      return String.format("%-10s %-20s %-20s %-20s "
            + "%-20s %-20s %-20s\n", id, name, date, from, to, assignee, reviewer, getTypeName);
    }
    
    
    
    
}
