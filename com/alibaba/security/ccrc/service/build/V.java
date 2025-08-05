package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class V {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3280a = "PrepareWatcher";
    public final List<D> b = new ArrayList();

    public synchronized void a(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4212ae80", new Object[]{this, d});
        } else {
            this.b.add(d);
        }
    }

    public void a(boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499ee8f", new Object[]{this, new Boolean(z), str, map});
        } else if (!this.b.isEmpty()) {
            for (D d : this.b) {
                d.a(z, str, map);
            }
            this.b.clear();
        }
    }
}
