package com.example.day5;
import javax.persistence.*;

@Table (name = "TestTable")
@Entity
public class TestTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    public TestTable() {
    }
}
