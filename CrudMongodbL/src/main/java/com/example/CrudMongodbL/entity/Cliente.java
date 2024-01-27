package com.example.CrudMongodbL.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "Afiliaciones")
public class Cliente {

    @Id
    private String identificacion;
    private String nombres;
    private Date fechaNacimiento;
    private String planContratar;
    private double valor;

}
