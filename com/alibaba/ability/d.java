package com.alibaba.ability;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f1820a;
    private static c b;

    static {
        kge.a(-1229374558);
        INSTANCE = new d();
        f1820a = new AtomicBoolean(false);
    }

    private d() {
    }

    @JvmStatic
    public static final void a(c initExecutor, Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4cae230", new Object[]{initExecutor, application, hashMap});
            return;
        }
        q.d(initExecutor, "initExecutor");
        b = initExecutor;
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        c cVar = b;
        if (cVar == null || !f1820a.compareAndSet(false, true)) {
            return;
        }
        cVar.a(null, null);
        b = null;
    }
}
