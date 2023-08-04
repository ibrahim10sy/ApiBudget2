package com.groupe_8.tp_api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Depenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDepenses;
    private String description;
    private String montant;
    private Date date;


}
