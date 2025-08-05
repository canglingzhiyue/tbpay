package com.taobao.pha.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public abstract class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f18736a = new HashSet();

    /* loaded from: classes7.dex */
    public interface b {
        void onEvent(a aVar);
    }

    static {
        kge.a(1196612820);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca7f4cd", new Object[]{this, bVar});
        } else {
            this.f18736a.add(bVar);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca7806e", new Object[]{this, aVar});
            return;
        }
        for (b bVar : this.f18736a) {
            try {
                bVar.onEvent(aVar);
            } catch (Throwable th) {
                ngr.a("Dispatching event " + aVar.f18737a + " with exception:" + ngn.a(th));
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f18736a.clear();
        }
    }

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f18737a;
        public long b;
        public Map c;

        static {
            kge.a(-321329494);
        }

        public a(String str) {
            this(str, System.currentTimeMillis());
        }

        public a(String str, long j) {
            this(str, j, new HashMap());
        }

        public a(String str, Map map) {
            this(str, System.currentTimeMillis(), map);
        }

        public a(String str, long j, Map map) {
            this.f18737a = str;
            this.b = j;
            this.c = map;
        }
    }
}
