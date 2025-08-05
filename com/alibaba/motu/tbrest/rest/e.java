package com.alibaba.motu.tbrest.rest;

import android.content.Context;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static final String FIELD_APPKEY = "appkey";
    public static final String FIELD_APPVERSION = "app_version";
    public static final String FIELD_CHANNEL = "channel";
    public static final String FIELD_PLATFORM = "platform";
    public static final String FIELD_SDK_VERSION = "sdk_version";
    public static final String FIELD_T = "t";
    public static final String FIELD_UTDID = "utdid";
    public static final String FIELD_V = "v";

    /* renamed from: a  reason: collision with root package name */
    static boolean f3163a;
    static Context b;

    static {
        kge.a(-681083599);
        f3163a = false;
    }

    public static void a() {
        f3163a = true;
    }

    public static void a(Context context) {
        b = context;
    }
}
