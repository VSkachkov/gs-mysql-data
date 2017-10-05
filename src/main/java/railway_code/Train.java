package railway_code;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table
public class Train {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private boolean departureMon;

    @Column
    private boolean departureTue;

    @Column
    private boolean departureWed;

    @Column
    private boolean departureThu;

    @Column
    private boolean departureFri;

    @Column
    private boolean departureSat;

    @Column
    private boolean departureSun;

    @Column   // ADD MANY TO ONE !!!!!!!!!!!!!!!!!!!!!!!!!!!
    private Long trainTypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDepartureMon() {
        return departureMon;
    }

    public void setDepartureMon(boolean departureMon) {
        this.departureMon = departureMon;
    }

    public boolean isDepartureTue() {
        return departureTue;
    }

    public void setDepartureTue(boolean departureTue) {
        this.departureTue = departureTue;
    }

    public boolean isDepartureWed() {
        return departureWed;
    }

    public void setDepartureWed(boolean departureWed) {
        this.departureWed = departureWed;
    }

    public boolean isDepartureThu() {
        return departureThu;
    }

    public void setDepartureThu(boolean departureThu) {
        this.departureThu = departureThu;
    }

    public boolean isDepartureFri() {
        return departureFri;
    }

    public void setDepartureFri(boolean departureFri) {
        this.departureFri = departureFri;
    }

    public boolean isDepartureSat() {
        return departureSat;
    }

    public void setDepartureSat(boolean departureSat) {
        this.departureSat = departureSat;
    }

    public boolean isDepartureSun() {
        return departureSun;
    }

    public void setDepartureSun(boolean departureSun) {
        this.departureSun = departureSun;
    }

    public Long getTrainTypeId() {
        return trainTypeId;
    }

    public void setTrainTypeId(Long trainTypeId) {
        this.trainTypeId = trainTypeId;
    }
}
