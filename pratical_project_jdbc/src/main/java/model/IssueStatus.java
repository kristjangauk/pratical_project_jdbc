package model;

public class IssueStatus {

    private int issueStatusId;
    private String issueStatus;

    public int getIssueStatusId() {
        return issueStatusId;
    }

    public void setIssueStatusId(int issueStatusId) {
        this.issueStatusId = issueStatusId;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }

    @Override
    public String toString() {
        return "IssueStatus{" +
                "issueStatusId=" + issueStatusId +
                ", issueStatus='" + issueStatus + '\'' +
                '}';
    }
}
