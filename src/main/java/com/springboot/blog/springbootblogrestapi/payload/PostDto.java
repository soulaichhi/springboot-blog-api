package com.springboot.blog.springbootblogrestapi.payload;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private long id;
//    title shod not be null or empty
//    title should have at least 2 chars
    @NotEmpty
    @Size(min = 2, message = "title should have at least 2 chars")
    private String title;
    //    description shod not be null or empty
//    description should have at least 10 chars
    @NotEmpty
    @Size(min = 10, message = "description should have at least 10 chars")
    private String description;
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
