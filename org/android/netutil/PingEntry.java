package org.android.netutil;

import com.android.alibaba.ip.runtime.IpChange;
import tb.mto;

/* loaded from: classes.dex */
public class PingEntry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public double f25063a;
    public int b = 0;
    public int c = 0;

    public PingEntry() {
        this.f25063a = mto.a.GEO_NOT_SUPPORT;
        this.f25063a = -2.0d;
    }

    public void a(int i, int i2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26196676", new Object[]{this, new Integer(i), new Integer(i2), new Double(d)});
            return;
        }
        this.b = i;
        this.c = i2;
        this.f25063a = d;
    }
}
