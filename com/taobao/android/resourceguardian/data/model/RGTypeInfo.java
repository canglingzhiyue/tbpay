package com.taobao.android.resourceguardian.data.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes6.dex */
public class RGTypeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_ALL = 999;
    public static final int EVENT_BATTERY_CAPACITY = 401;
    public static final int EVENT_BATTERY_TEMPERATURE = 402;
    public static final int EVENT_CPU_USAGE = 101;
    public static final int EVENT_MEMORY = 201;
    public static final int EVENT_NATIVE_MEMORY = 202;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface RGType {
    }

    static {
        kge.a(-560233237);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != 101 ? i != 201 ? i != 202 ? i != 401 ? i != 402 ? "errorType" : "batteryTemperature" : "leftBattery" : "nativeMemoryLevel" : "memoryLevel" : "cpuLoad";
    }
}
