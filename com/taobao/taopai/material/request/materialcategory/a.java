package com.taobao.taopai.material.request.materialcategory;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends com.taobao.taopai.material.request.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int d;
    private long e;

    static {
        kge.a(1151017706);
    }

    public a(String str, int i, long j) {
        this.f22073a = str;
        this.d = i;
        this.e = j;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.d;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : this.e;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (g() == aVar.g() && h() == aVar.h()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(g()), Long.valueOf(h()));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{materialType=" + this.d + ", templateId=" + this.e + ", bizLine='" + this.f22073a + "', bizScene='" + this.b + "', clientVer=" + this.c + '}';
    }
}
