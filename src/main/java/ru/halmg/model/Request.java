package ru.halmg.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "request_tbl")
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    @Id
    private String requestId;

    @Column(name = "name")
    private String name;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "area")
    private String area;

    @Column(name = "date")
    private LocalDateTime localDateTime;

    {
        this.requestId = UUID.randomUUID().toString();
        this.localDateTime = LocalDateTime.now();
    }

    public Request(String requestId, String name, String description, String phoneNumber, String contactName, String area) {
        this.requestId = requestId;
        this.name = name;
        this.description = description;
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
        this.area = area;
    }
}
