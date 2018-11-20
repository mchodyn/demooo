package com.example.jaz3.model;
import javax.persistence.*;

@Entity
@Table(name = "COMMENT")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long Id;

    @Column
    public String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "part_id")
    public Part part;
}
