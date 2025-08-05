package com.taobao.android.diagnose.collector;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.kge;

/* loaded from: classes.dex */
public abstract class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Application f11695a;
    public com.taobao.android.diagnose.model.a b;
    public Executor c = com.taobao.android.diagnose.common.c.a().b();

    static {
        kge.a(54121761);
    }

    public abstract void a();

    public f(Application application, com.taobao.android.diagnose.model.a aVar) {
        this.f11695a = application;
        this.b = aVar;
    }
}
