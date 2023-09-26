public class Periodical extends Item{
    private String issueNum;
    Periodical(){

    }
    Periodical(String issueNum,String title){
        super(title);
        this.issueNum = issueNum;
    }
    public String getIssueNum(){
        return issueNum;
    }
    public void setIssueNum(String issueNum){
        this.issueNum = issueNum;
    }
    public String getListing(){
        return "Periodical title:\n" + getTitle() +
                "Issue#:" + getIssueNum();
    }
}
