package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.ya  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1265ya<F, S> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public F f3337a;
    public S b;

    public C1265ya(F f, S s) {
        this.f3337a = f;
        this.b = s;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1265ya.class != obj.getClass()) {
            return false;
        }
        C1265ya c1265ya = (C1265ya) obj;
        if (C1238p.a(this.f3337a, c1265ya.f3337a)) {
            return C1238p.a(this.b, c1265ya.b);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        F f = this.f3337a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }
}
