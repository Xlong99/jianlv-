package com.jianlv.domain;

import lombok.Data;

import java.time.LocalDate;

/**
 * 用户生成的计划表
 *
 * @author 杜奕明
 * @date 2019/5/21 19:45
 */
@Data
public class Schedule {

    private String event;

    private LocalDate beginTime;

    private LocalDate endTime;
}
