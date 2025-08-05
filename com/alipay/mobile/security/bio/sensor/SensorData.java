package com.alipay.mobile.security.bio.sensor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class SensorData {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f5803a;
    public String b;
    public String c;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return riy.ARRAY_START_STR + this.f5803a + "," + this.b + "," + this.c + riy.ARRAY_END_STR;
    }
}
