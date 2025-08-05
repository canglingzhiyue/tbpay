package com.alibaba.android.split.core.splitinstall;

import android.app.PendingIntent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1893171696);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract long e();

    public abstract long f();

    public abstract List<String> g();

    public abstract PendingIntent i();

    public abstract List j();

    public List h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : h() != null ? new ArrayList(h()) : new ArrayList();
    }
}
