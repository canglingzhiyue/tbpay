package com.taobao.tao.welcome;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.welcome.d;
import tb.kge;

/* loaded from: classes.dex */
public abstract class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d.a f21197a;
    public final Activity b;

    static {
        kge.a(561978385);
    }

    public abstract void a();

    public e(Activity activity, d.a aVar) {
        if (activity == null || aVar == null) {
            throw new IllegalArgumentException();
        }
        this.b = activity;
        this.f21197a = aVar;
    }
}
