package com.springboot.starter.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Profile {
    @Id
    private String id;
    private String type;
    private String fileSize;
    private String personId;
}
