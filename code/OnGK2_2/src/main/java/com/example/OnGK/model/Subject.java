package com.example.OnGK.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
public class Subject implements Serializable {
    private int SubId;
    private String Name;
    private String Credit;
}
