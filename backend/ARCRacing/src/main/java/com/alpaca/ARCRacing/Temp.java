package com.alpaca.ARCRacing;

// DB 생성 테스트
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Temp {
    @Id
    private Long id;

    private String hi;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
