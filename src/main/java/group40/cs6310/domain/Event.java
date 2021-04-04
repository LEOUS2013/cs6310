package group40.cs6310.domain;
import org.hibernate.annotations.ColumnDefault;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Event {

    @Id
    @Column
    private Long id;

    @Column
    private String eventType;

    @Column
    private String eventFullName;

    @Column
    private String eventStudioOwner;

    @Column
    private Integer eventYear;

    @Column
    private Integer eventDuration;

    @Column
    private Integer eventLicenseFee;

    @Column
    private Integer Viewing_price;

    @Column
    @ColumnDefault("false")
    private boolean offered;


    public Event() {}
    public Event(String eventType, String eventFullName, String eventStudioOwner, int eventYear, int eventDuration, int eventLicenseFee) {
        this.eventType = eventType;
        this.eventFullName = eventFullName;
        this.eventStudioOwner = eventStudioOwner;
        this.eventYear = eventYear;
        this.eventDuration = eventDuration;
        this.eventLicenseFee = eventLicenseFee;
    }

    public boolean isOffered() {
        return offered;
    }

    public void setOffered(boolean offered) {
        this.offered = offered;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventFullName() {
        return eventFullName;
    }

    public void setEventFullName(String eventFullName) {
        this.eventFullName = eventFullName;
    }

    public String getEventStudioOwner() {
        return eventStudioOwner;
    }

    public void setEventStudioOwner(String eventStudioOwner) {
        this.eventStudioOwner = eventStudioOwner;
    }

    public int getEventYear() {
        return eventYear;
    }

    public void setEventYear(int eventYear) {
        this.eventYear = eventYear;
    }

    public int getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(int eventDuration) {
        this.eventDuration = eventDuration;
    }

    public int getEventLicenseFee() {
        return eventLicenseFee;
    }

    public void setEventLicenseFee(int eventLicenseFee) {
        this.eventLicenseFee = eventLicenseFee;
    }

    public int getViewing_price() {
        return Viewing_price;
    }

    public void setViewing_price(int viewing_price) {
        Viewing_price = viewing_price;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventType='" + eventType + '\'' +
                ", eventFullName='" + eventFullName + '\'' +
                ", eventStudioOwner='" + eventStudioOwner + '\'' +
                ", eventYear=" + eventYear +
                ", eventDuration=" + eventDuration +
                ", eventLicenseFee=" + eventLicenseFee +
                ", Viewing_price=" + Viewing_price +
                '}';
    }

}
