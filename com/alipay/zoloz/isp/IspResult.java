package com.alipay.zoloz.isp;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class IspResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6259a;
    private long b;
    private int c;

    public IspResult(boolean z, long j, int i) {
        this.f6259a = false;
        this.f6259a = z;
        this.b = j;
        this.c = i;
    }

    public boolean isNeedSet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f39f36ed", new Object[]{this})).booleanValue() : this.f6259a;
    }

    public long getExposureTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5213fa65", new Object[]{this})).longValue() : this.b;
    }

    public int getIso() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("baaa8e49", new Object[]{this})).intValue() : this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IspResult{needSet=" + this.f6259a + ", exposureTime=" + this.b + ", iso=" + this.c + '}';
    }
}
