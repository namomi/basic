package sample.basic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@SequenceGenerator(
        name = "member_seq",
        sequenceName = "MEMBER_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
    private String id;

    private String name;

    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
