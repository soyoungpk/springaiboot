package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity // JPA API -> create table book
// JAP API (엔진: Hibernate)
// Object -> Table Mapping: ORM (Object Relational Mapping) -> SQL 생성

public class Book {
    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 증가 컬럼
    private Long id;

    @Column(name = "title", unique = true, nullable = false, length = 40)
    private String title;

    private int price;
    private String author;
    private int page;
}

// Book(Entity + DTO) 기능 써도 되지만 Book, BookDTO 나눠서 별도의 DTO 만들어서 씀...