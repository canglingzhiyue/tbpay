package com.alibaba.security.realidentity;

import android.app.Activity;
import com.alibaba.security.realidentity.service.sensor.api.RpSecException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class u3<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f3531a;
    public z3 b;

    public u3(Activity activity) {
        this.f3531a = activity;
    }

    public void a(z3 z3Var) throws RpSecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b07839", new Object[]{this, z3Var});
        } else {
            this.b = z3Var;
        }
    }

    public abstract T b();

    public abstract void c() throws RpSecException;

    public abstract void d() throws RpSecException;

    public abstract boolean e() throws RpSecException;

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : System.currentTimeMillis();
    }
}
