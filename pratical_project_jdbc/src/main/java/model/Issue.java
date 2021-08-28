package model;

import java.sql.Timestamp;

public class Issue {

    private int issueId;
    private int userId;
    private Timestamp dateEntered;
    private Timestamp dateStarted;
    private Timestamp dateFinished;
    private String issueName;
    private String issueDetails;
    private String comment;
    private int projectId;
    private int adminId;
    private int issueStatusId;

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Timestamp dateEntered) {
        this.dateEntered = dateEntered;
    }

    public Timestamp getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(Timestamp dateStarted) {
        this.dateStarted = dateStarted;
    }

    public Timestamp getDateFinished() {
        return dateFinished;
    }

    public void setDateFinished(Timestamp dateFinished) {
        this.dateFinished = dateFinished;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public String getIssueDetails() {
        return issueDetails;
    }

    public void setIssueDetails(String issueDetails) {
        this.issueDetails = issueDetails;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getIssueStatusId() {
        return issueStatusId;
    }

    public void setIssueStatusId(int issueStatusId) {
        this.issueStatusId = issueStatusId;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "issueId=" + issueId +
                ", userId=" + userId +
                ", dateEntered=" + dateEntered +
                ", dateStarted=" + dateStarted +
                ", dateFinished=" + dateFinished +
                ", issueName='" + issueName + '\'' +
                ", issueDetails='" + issueDetails + '\'' +
                ", comment='" + comment + '\'' +
                ", projectId=" + projectId +
                ", adminId=" + adminId +
                ", issueStatusId=" + issueStatusId +
                '}';
    }
}
