package com.taobao.android.trade.event;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes6.dex */
public final class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f15628a = true;
    private final int b;
    private final j c;
    private final WeakReference<j> d;
    private final g e;

    static {
        kge.a(1338577648);
    }

    public p(int i, j jVar, g gVar, boolean z) {
        this.b = i;
        this.e = gVar;
        if (z) {
            this.c = null;
            this.d = new WeakReference<>(jVar);
            return;
        }
        this.c = jVar;
        this.d = null;
    }

    public j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("1cc17de6", new Object[]{this});
        }
        j jVar = this.c;
        if (jVar != null) {
            return jVar;
        }
        WeakReference<j> weakReference = this.d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public g b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("7e141a28", new Object[]{this}) : this.e;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.c == pVar.c && this.b == pVar.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.c.hashCode();
    }
}
