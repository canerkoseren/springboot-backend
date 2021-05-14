package com.example.sample.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SampleEntity implements Serializable {
    
    private String text;
    private Date date;
}
