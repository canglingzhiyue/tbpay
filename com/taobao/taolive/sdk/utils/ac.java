package com.taobao.taolive.sdk.utils;

import android.support.v4.os.TraceCompat;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public final class ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1447140012);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!s.a(s.SWITCH_ENABLE_T_LIVE_TRACE)) {
        } else {
            TraceCompat.beginSection("TLiveTrace/" + str);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!s.a(s.SWITCH_ENABLE_T_LIVE_TRACE)) {
        } else {
            TraceCompat.beginSection("TLiveTrace/" + (str + "/" + str2));
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!s.a(s.SWITCH_ENABLE_T_LIVE_TRACE)) {
        } else {
            TraceCompat.endSection();
        }
    }
}
