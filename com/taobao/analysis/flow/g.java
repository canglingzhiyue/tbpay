package com.taobao.analysis.flow;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f8553a;
    private long b;
    private long c;

    private g() {
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("48e9ae17", new Object[0]);
        }
        if (f8553a == null) {
            synchronized (g.class) {
                if (f8553a == null) {
                    f8553a = new g();
                }
            }
        }
        return f8553a;
    }

    public synchronized void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        this.b += j;
        this.c += j2;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f.a().a(BHRTaskConfigBase.TYPE_CONFIG_UT, true, null, null, null, null, this.b, this.c);
        this.b = 0L;
        this.c = 0L;
    }
}
