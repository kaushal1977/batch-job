package com.kfinatech.batch.ingestion.returns.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
//import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.Date;

//import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Visitors {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String address;
    private Date visitDate;

    @Transient
    private String strVisitDate;

}
