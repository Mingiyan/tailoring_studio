package ru.halmg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "photo_tbl")
@NoArgsConstructor
@AllArgsConstructor
public class Photo {

    @Id
    private String photoId;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "thingId")
    private Thing thing;

    {
        this.photoId = UUID.randomUUID().toString();
    }
}
