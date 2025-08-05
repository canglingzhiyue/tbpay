package com.taobao.android.detail.sdk.utils;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f10343a;

    static {
        kge.a(-337261466);
        f10343a = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        tpc.a("com.taobao.android.detail.sdk.utils.TimeUtils");
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : SystemClock.elapsedRealtime() + f10343a;
    }
}
