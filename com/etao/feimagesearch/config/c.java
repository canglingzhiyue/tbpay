package com.etao.feimagesearch.config;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes3.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final c INSTANCE;
    public static final String KEY_DEVICE_LEVEL = "deviceLevel";
    public static final String LEVEL_HIGH = "high";
    public static final String LEVEL_LOW = "low";
    public static final String LEVEL_MED = "medium";
    public static final String LEVEL_UNKNOWN = "unknown";

    /* renamed from: a  reason: collision with root package name */
    private static int f6661a;

    static {
        kge.a(1741537633);
        INSTANCE = new c();
        f6661a = -1;
    }

    private c() {
    }

    @JvmStatic
    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            int b = b();
            return b != 0 ? b != 1 ? b != 2 ? "unknown" : "low" : "medium" : "high";
        } catch (Throwable unused) {
            return "medium";
        }
    }

    @JvmStatic
    public static final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        int i = f6661a;
        int i2 = -1;
        if (i != -1) {
            return i;
        }
        try {
            i2 = com.taobao.application.common.c.a().a("deviceLevel", -1);
        } catch (Throwable unused) {
        }
        f6661a = i2;
        return i2;
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b() == 2;
    }
}
