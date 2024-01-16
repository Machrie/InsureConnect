package com.example.InsureConnect.Dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserDto {

    private UUID id;

    private Long kakaoId;

    private String nickname;

    private String gender;

    private int age;

    private String type;

    @JsonBackReference
    private PlannerDto planner;

    @JsonBackReference
    private ChatDto chat;

    @JsonBackReference
    private ReviewDto review;

}
