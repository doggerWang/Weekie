package com.weekie.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleVO {
    private String title;
    private String startTime;
    private String endTime;
    private String dedaline;
    private boolean importance;
    private boolean urgency;
    private String tag;
    private String desc;
    private String taskID;
}
