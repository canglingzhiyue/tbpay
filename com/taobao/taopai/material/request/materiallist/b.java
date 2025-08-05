package com.taobao.taopai.material.request.materiallist;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends com.taobao.taopai.material.request.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int d;
    private int e;
    private int f;
    private long g;
    private long h;
    private int i;
    private String j;

    static {
        kge.a(-373192781);
    }

    public b(int i, int i2, int i3, long j, long j2, int i4) {
        this.i = 720;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = j;
        this.h = j2;
        this.i = i4;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.j;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.d;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.e;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.f;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : this.g;
    }

    public long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue() : this.h;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.i;
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
            b bVar = (b) obj;
            if (h() == bVar.h() && i() == bVar.i() && j() == bVar.j() && k() == bVar.k() && l() == bVar.l() && m() == bVar.m()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(h()), Integer.valueOf(i()), Integer.valueOf(j()), Long.valueOf(k()), Long.valueOf(l()), Integer.valueOf(m()));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{currentPage=" + this.d + ", pageSize=" + this.e + ", materialType=" + this.f + ", templateId=" + this.g + ", categoryId=" + this.h + ", version=" + this.i + ", frontIdsStr='" + this.j + "', bizLine='" + this.f22073a + "', bizScene='" + this.b + "', clientVer=" + this.c + '}';
    }
}
