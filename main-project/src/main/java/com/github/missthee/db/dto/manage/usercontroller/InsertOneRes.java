package com.github.missthee.db.dto.manage.usercontroller;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InsertOneRes {
    @ApiModelProperty(value = "新增用户的id")
    private Long id;
}