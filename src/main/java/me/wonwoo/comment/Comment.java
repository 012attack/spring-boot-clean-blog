package me.wonwoo.comment;

import lombok.Data;
import me.wonwoo.post.Post;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String content;

    private LocalDateTime regDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID")
    private Post post;

    public Comment(String content, Post post) {
        this.content = content;
        this.post = post;
    }

    Comment() {

    }
}
