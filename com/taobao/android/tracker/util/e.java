package com.taobao.android.tracker.util;

import tb.kge;
import tb.oup;

/* loaded from: classes6.dex */
public class e {
    public static final int EVENTID_CLICK = 2101;
    public static final int EVENTID_PAGE = 2001;
    public static final int EVENTID_PAG_AND_CLICK = 20012101;
    public static final String INTERCEPT_CONFIG_POINT_TRACKER_TYPE_CLICK = "click";
    public static final String INTERCEPT_CONFIG_POINT_TRACKER_TYPE_EXPOSURE = "exposure";
    public static final String INTERCEPT_CONFIG_POINT_TRACKER_TYPE_JUMP = "jump";

    /* renamed from: a  reason: collision with root package name */
    public static String f15586a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;

    static {
        kge.a(-77241862);
        f15586a = "dynamic_tracker";
        b = oup.CONFIG_DATA_KEY;
        c = "isOpenLog";
        d = "isOpen";
        e = "bucketCursor";
        f = "enableMatchKey";
    }
}
