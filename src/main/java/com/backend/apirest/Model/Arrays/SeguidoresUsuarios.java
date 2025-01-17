package com.backend.apirest.Model.Arrays;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SeguidoresUsuarios {
    private ObjectId seguidorId;
    private String nombre;
    private Date fecha;
}
