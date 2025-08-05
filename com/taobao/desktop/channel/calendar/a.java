package com.taobao.desktop.channel.calendar;

import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static final String CALENDAR_ERROR_ACCOUNT_INVALID = "CALENDAR_ACCOUNT_INVALID";
    public static final String CALENDAR_ERROR_ACCOUNT_INVALID_CODE = "1004";
    public static final String CALENDAR_ERROR_ADD_EVENT_FAILED = "ADD_EVENT_FAILED";
    public static final String CALENDAR_ERROR_ADD_EVENT_FAILED_CODE = "1005";
    public static final String CALENDAR_ERROR_CATCH = "CATCH_ERROR";
    public static final String CALENDAR_ERROR_CATCH_CODE = "1001";
    public static final String CALENDAR_ERROR_DELETE_FAILED = "DELETE_FAILED";
    public static final String CALENDAR_ERROR_DELETE_FAILED_CODE = "1007";
    public static final String CALENDAR_ERROR_INVALIDATE_END_TIME = "INVALIDATE_END_TIME";
    public static final String CALENDAR_ERROR_INVALIDATE_END_TIME_CODE = "1008";
    public static final String CALENDAR_ERROR_NO_PERMISSION = "NO_PERMISSION";
    public static final String CALENDAR_ERROR_NO_PERMISSION_CODE = "1002";
    public static final String CALENDAR_ERROR_PARAM_INVALID = "PARAM_INVALID";
    public static final String CALENDAR_ERROR_PARAM_INVALID_CODE = "1003";
    public static final String CALENDAR_ERROR_REMINDER_INVALID = "ADD_EVENT_REMINDER_FAILED";
    public static final String CALENDAR_ERROR_REMINDER_INVALID_CODE = "1006";
    public static final String CALENDAR_EVENT_ADD = "addEvent";
    public static final String CALENDAR_EVENT_PERMISSION_CHECK = "checkPermission";
    public static final String CALENDAR_EVENT_QUERY = "checkEventExist";
    public static final String CALENDAR_EVENT_REMOVE = "removeEvent";
    public static final String ORANGE_CALENDER_ADD_REPEAT_ENABLE = "calender_add_repeat_enable";
    public static final String ORANGE_CALENDER_HUAWEI_ENABLE = "calender_huawei_enable";
    public static final String ORANGE_CALENDER_OPPO_ENABLE = "calender_oppo_enable";
    public static final String ORANGE_CALENDER_READ_LOCAL_ENABLE = "calender_read_local_enable";
    public static final String SP_CALENDER_QUERY_LOCAL = "calender_read_local";

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, String> f16939a;

    static {
        kge.a(-1719168063);
        HashMap<String, String> hashMap = new HashMap<>(10);
        f16939a = hashMap;
        hashMap.put(CALENDAR_ERROR_CATCH, "1001");
        f16939a.put("NO_PERMISSION", "1002");
        f16939a.put("PARAM_INVALID", "1003");
        f16939a.put(CALENDAR_ERROR_ACCOUNT_INVALID, "1004");
        f16939a.put(CALENDAR_ERROR_ADD_EVENT_FAILED, "1005");
        f16939a.put(CALENDAR_ERROR_REMINDER_INVALID, "1006");
        f16939a.put(CALENDAR_ERROR_DELETE_FAILED, CALENDAR_ERROR_DELETE_FAILED_CODE);
        f16939a.put(CALENDAR_ERROR_INVALIDATE_END_TIME, CALENDAR_ERROR_INVALIDATE_END_TIME_CODE);
    }
}
