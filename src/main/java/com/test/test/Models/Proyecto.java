package com.test.test.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "proyecto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Proyecto {
    
    private int idProyecto;

    
}
