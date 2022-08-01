package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    /*@OneToOne(mappedBy = "cars")
    private User user;*/

    public Car() {}
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Model: ")
                .append(this.model)
                .append("S: ").append(this.series).toString();
    }
}
