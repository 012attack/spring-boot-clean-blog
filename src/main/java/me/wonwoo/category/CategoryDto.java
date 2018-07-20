package me.wonwoo.category;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotEmpty;


@Data
public class CategoryDto {

    private Long id;

    @NotEmpty
    private String name;


}
