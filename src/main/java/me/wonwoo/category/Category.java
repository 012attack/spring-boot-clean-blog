package me.wonwoo.category;

import lombok.Data;
import me.wonwoo.post.Post;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private LocalDateTime regDate;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Post> post = new ArrayList<>();

    Category() {
    }

    public Category(Long id) {
        this.id = id;
    }

    public Category(Long id, String name) {
        this.name = name;
        this.id = id;
    }

}
