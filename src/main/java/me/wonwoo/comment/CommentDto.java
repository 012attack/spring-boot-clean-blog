package me.wonwoo.comment;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CommentDto {

  @NotNull
  private Long postId;

  @NotEmpty
  private String content;
}
