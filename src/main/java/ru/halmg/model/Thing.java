package ru.halmg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "thing_tbl")
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"photos"})
public class Thing {

    @Id
    private String thingId;

    @Column(name = "code")
    private Long code;

    @Column(name = "name")
    private String name;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private CategoryThing categoryThing;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "thing")
    private List<Photo> photos;

    {
        this.thingId = UUID.randomUUID().toString();
    }

}
