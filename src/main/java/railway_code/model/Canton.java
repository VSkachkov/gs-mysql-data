package railway_code.model;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Canton {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String cantonName;


    @OneToMany(mappedBy = "canton")
    private List<Station> stations;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCantonName() {
        return cantonName;
    }

    public void setCantonName(String cantonName) {
        this.cantonName = cantonName;
    }

    @OneToMany(mappedBy = "canton")
    public List<Station> getStations() {
        return stations;
    }
//
//    public void setStations(List<Station> stations) {
//        this.stations = stations;
//    }
}
