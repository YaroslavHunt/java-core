package task1;

public class Magazine implements Printable{

    private int issueNumber;

    @Override
    public void print() {
        System.out.println("Printing Magazine");
    }

    public Magazine(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
