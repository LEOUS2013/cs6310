package group40.cs6310.domain;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@Table
public class Stream {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String streamShortName;

    @Column
    private String streamLongName;

    @Column
    private Integer streamSubscription;

    @Column
    private Integer streamCurrentRevenue;

    @Column
    private Integer streamPreviousRevenue;

    @Column
    private Integer streamTotalRevenue;

    @Column
    private Integer streamLicensing;

    @Column
    @ColumnDefault("false")
    private boolean offered;

    public Stream() {}
    public Stream(String streamShortName, String streamLongName, int streamSubscription) {
        this.streamShortName = streamShortName;
        this.streamLongName = streamLongName;
        this.streamSubscription = streamSubscription;
    }

    public boolean isOffered() {
        return offered;
    }

    public void setOffered(boolean offered) {
        this.offered = offered;
    }

    public String getStreamShortName() {
        return streamShortName;
    }

    public void setStreamShortName(String streamShortName) {
        this.streamShortName = streamShortName;
    }

    public String getStreamLongName() {
        return streamLongName;
    }

    public void setStreamLongName(String streamLongName) {
        this.streamLongName = streamLongName;
    }

    public int getStreamSubscription() {
        return streamSubscription;
    }

    public void setStreamSubscription(int streamSubscription) {
        this.streamSubscription = streamSubscription;
    }

    public int getStreamCurrentRevenue() {
        return streamCurrentRevenue;
    }

    public void setStreamCurrentRevenue(int streamCurrentRevenue) {
        this.streamCurrentRevenue = streamCurrentRevenue;
    }

    public int getStreamPreviousRevenue() {
        return streamPreviousRevenue;
    }

    public void setStreamPreviousRevenue(int streamPreviousRevenue) {
        this.streamPreviousRevenue = streamPreviousRevenue;
    }

    public int getStreamTotalRevenue() {
        return streamTotalRevenue;
    }

    public void setStreamTotalRevenue(int streamTotalRevenue) {
        this.streamTotalRevenue = streamTotalRevenue;
    }

    public int getStreamLicensing() {
        return streamLicensing;
    }

    public void setStreamLicensing(int streamLicensing) {
        this.streamLicensing = streamLicensing;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "streamShortName='" + streamShortName + '\'' +
                ", streamLongName='" + streamLongName + '\'' +
                ", streamSubscription=" + streamSubscription +
                ", streamCurrentRevenue=" + streamCurrentRevenue +
                ", streamPreviousRevenue=" + streamPreviousRevenue +
                ", streamTotalRevenue=" + streamTotalRevenue +
                ", streamLicensing=" + streamLicensing +
                '}';
    }
}
