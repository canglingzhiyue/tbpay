package com.taobao.android.weex_framework.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jwa;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class o extends jwa implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile String f16095a = "RunnableEx.run";

    static {
        kge.a(-1900732479);
        kge.a(-1390502639);
    }

    public abstract void a() throws Exception;

    public void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f16095a = str;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (b()) {
                return;
            }
            a();
        } catch (Throwable th) {
            g.c(this.f16095a, th);
            a(th);
        }
    }
}
