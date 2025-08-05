package com.taobao.android.trade.event;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ExecutorService g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15621a = true;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public ExecutorService f = g;

    static {
        kge.a(1524906143);
        g = Executors.newCachedThreadPool();
    }

    public e a(ExecutorService executorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("ae8462e6", new Object[]{this, executorService});
        }
        this.f = executorService;
        return this;
    }
}
