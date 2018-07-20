package me.wonwoo.post;

import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
public class PostDto {

    private Long id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String content;

    private String code;

    @NotNull
    private Long categoryId;

    private String categoryName;

}
