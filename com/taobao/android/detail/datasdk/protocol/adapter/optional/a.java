package com.taobao.android.detail.datasdk.protocol.adapter.optional;

import java.util.Map;

/* loaded from: classes4.dex */
public interface a {
    public static final String ACTION_TYPE_EXPOSURE = "exposure";
    public static final String ACTION_TYPE_TOUCH = "touch";
    public static final String PAGE_LIFECYCLE_APPEAR = "APPEAR";
    public static final String PAGE_LIFECYCLE_APPEND = "APPEND";
    public static final String PAGE_LIFECYCLE_DISAPPEAR = "DISAPPEAR";
    public static final String PAGE_LIFECYCLE_ENTER = "ENTER";
    public static final String PAGE_LIFECYCLE_LEAVE = "LEAVE";
    public static final String PAGE_LIFECYCLE_LOAD = "LOAD";
    public static final String PAGE_LIFECYCLE_RELOAD = "RELOAD";
    public static final String TEMPLATE_NAME_KEY = "templateName";

    void a(Object obj, Map<String, Object> map);

    void a(String str);

    void a(String str, String str2);

    void a(String str, String str2, long j);

    void a(String str, String str2, String str3);

    void a(String str, String str2, String str3, double d);

    void a(String str, String str2, String str3, long j);

    void a(String str, String str2, String str3, String str4);

    void a(String str, String str2, String str3, String str4, String str5);

    void a(String str, String str2, String str3, Map<String, Object> map);

    void a(String str, String str2, Map<String, String> map);

    void a(String str, String str2, Map<String, String> map, String str3, String str4);

    void a(String str, Map<String, Object> map);

    void a(Map<String, String> map);

    void b(String str);

    void b(String str, String str2);

    void b(String str, String str2, String str3, Map<String, Object> map);

    void b(String str, Map<String, Object> map);

    void c(String str, String str2, String str3, Map<String, Object> map);
}
