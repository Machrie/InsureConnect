package com.example.InsureConnect.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Lazy;

import java.sql.Timestamp;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Builder
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "planner_id")
    private Planner planner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private int rate;

    @Column
    private Timestamp write;

    @Column
    private Timestamp edit;

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    private List<ReviewImg> reviewImg;

    public void setWriteToCurrentTime() {
        this.write = new Timestamp(System.currentTimeMillis());
    }

    public void setEditToCurrentTime() {
        this.edit = new Timestamp(System.currentTimeMillis());
    }

}

