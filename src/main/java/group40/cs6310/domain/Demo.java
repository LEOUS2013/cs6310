package group40.cs6310.domain;
import org.hibernate.annotations.ColumnDefault;
import javax.persistence.*;



@Entity
@Table(name="Demo")
public class Demo {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String demoShortName;

    @Column
    private Integer numOfAcc;

    @Column
    private String demoLongName;

    @Column
    private Integer demoAccounts;

    @Column
    private Integer demoCurrentSpending;

    @Column
    private Integer demoPreviousSpending;

    @Column
    private Integer demoTotalSpending;

    @Column
    private Integer chargeFee;

    @Column
    @ColumnDefault("false")
    private boolean offered;



    public Demo(){}
    public Demo(String shortName, String longName, int numOfAcc1) {
        demoShortName = shortName;
        demoLongName = longName;
        numOfAcc = numOfAcc1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDemoShortName() {
        return demoShortName;
    }

    public void setDemoShortName(String demoShortName) {
        this.demoShortName = demoShortName;
    }

    public Integer getNumOfAcc() {
        return numOfAcc;
    }

    public void setNumOfAcc(Integer numOfAcc) {
        this.numOfAcc = numOfAcc;
    }

    public String getDemoLongName() {
        return demoLongName;
    }

    public void setDemoLongName(String demoLongName) {
        this.demoLongName = demoLongName;
    }

    public Integer getDemoAccounts() {
        return demoAccounts;
    }

    public void setDemoAccounts(Integer demoAccounts) {
        this.demoAccounts = demoAccounts;
    }

    public Integer getDemoCurrentSpending() {
        return demoCurrentSpending;
    }

    public void setDemoCurrentSpending(Integer demoCurrentSpending) {
        this.demoCurrentSpending = demoCurrentSpending;
    }

    public Integer getDemoPreviousSpending() {
        return demoPreviousSpending;
    }

    public void setDemoPreviousSpending(Integer demoPreviousSpending) {
        this.demoPreviousSpending = demoPreviousSpending;
    }

    public Integer getDemoTotalSpending() {
        return demoTotalSpending;
    }

    public void setDemoTotalSpending(Integer demoTotalSpending) {
        this.demoTotalSpending = demoTotalSpending;
    }

    public Integer getChargeFee() {
        return chargeFee;
    }

    public void setChargeFee(Integer chargeFee) {
        this.chargeFee = chargeFee;
    }

    public boolean isOffered() {
        return offered;
    }

    public void setOffered(boolean offered) {
        this.offered = offered;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", demoShortName='" + demoShortName + '\'' +
                ", numOfAcc=" + numOfAcc +
                ", demoLongName='" + demoLongName + '\'' +
                ", demoAccounts=" + demoAccounts +
                ", demoCurrentSpending=" + demoCurrentSpending +
                ", demoPreviousSpending=" + demoPreviousSpending +
                ", demoTotalSpending=" + demoTotalSpending +
                ", chargeFee=" + chargeFee +
                ", offered=" + offered +
                '}';
    }
}
