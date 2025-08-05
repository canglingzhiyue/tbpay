package com.taobao.metrickit;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<LowMemoryListener> f18094a;

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final l f18095a = new l();

        public static /* synthetic */ l a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("9d9406d", new Object[0]) : f18095a;
        }
    }

    private l() {
        this.f18094a = new CopyOnWriteArrayList();
    }

    public static l a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("9d9406d", new Object[0]) : a.a();
    }

    public void a(LowMemoryListener lowMemoryListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356d4c8a", new Object[]{this, lowMemoryListener});
        } else {
            this.f18094a.add(lowMemoryListener);
        }
    }

    public List<LowMemoryListener> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.f18094a;
    }
}
