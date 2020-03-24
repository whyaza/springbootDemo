package com.study.yoe.pojo;/*
 *   created by why on 2020/3/23
 */

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResultBean<T> {
    private String respCode;
    private T data;
}
