package com.taobao.calendar.exception;

/* loaded from: classes6.dex */
public enum CalendarResult {
    KTCALENDAR_INVALID_PARAM("6001", "参数错误，如为空等"),
    kTCALENDAR_NO_PERMISSION("6002", "没有权限添加"),
    kTBCALENDAR_REMINDER_EXISTS("6003", "提醒已经存在"),
    kTBCALENDAR_REMINDER_NOT_EXISTS("6004", "该提醒不存在"),
    KTCALENDAR_REMINDER_DATE_ERROR("60005", "开始时间结束时间没有传入或者格式不正确"),
    kTBCALENDAR_OTHER_ERROR("6099", "其他错误"),
    kTBCALENDAR_SYSTEM_ACCOUNT_ERROR("6088", "系统错误日历账户不存在或创建失败"),
    KTCALENDAR_SUCCESS("60000", "查询成功");
    
    public String code;
    public String message;

    CalendarResult(String str, String str2) {
        this.code = str;
        this.message = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
