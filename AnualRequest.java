/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Nhat Anh
 */
public class AnualRequest {
    private int rid;
    private String reason;
    private Date from;
    private Date to;
    private int created_by;
    private int reviewed_by;
    private String status;

    public AnualRequest() {
    }

    public AnualRequest(int rid, String reason, Date from, Date to, int created_by, int reviewed_by, String status) {
        this.rid = rid;
        this.reason = reason;
        this.from = from;
        this.to = to;
        this.created_by = created_by;
        this.reviewed_by = reviewed_by;
        this.status = status;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getReviewed_by() {
        return reviewed_by;
    }

    public void setReviewed_by(int reviewed_by) {
        this.reviewed_by = reviewed_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
