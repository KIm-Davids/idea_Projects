package com.semicolon.africa.demo_sorosokey.data.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@Document
public class Comment {

    String id;
    String title;
    String comment;
}
