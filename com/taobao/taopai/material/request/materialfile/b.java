package com.taobao.taopai.material.request.materialfile;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends com.taobao.taopai.material.request.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int d;
    private int e;
    private String f;
    private String g;
    private long h;
    private String i;
    private String j;
    private String k;

    static {
        kge.a(-1752215437);
    }

    public b(String str, int i, int i2, String str2, String str3) {
        this(str, i, i2, str2, str3, -1L);
    }

    public b(String str, int i, int i2, String str2, String str3, long j) {
        this.f22073a = str;
        this.d = i;
        this.e = i2;
        this.f = str2;
        this.g = str3;
        this.h = j;
    }

    public b(int i, int i2, String str, String str2) {
        this.d = i;
        this.e = i2;
        this.f = str;
        this.g = str2;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.k;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.d;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.e;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.f;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.g;
    }

    public long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue() : this.h;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.i;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.j;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "materialType=" + this.d + ", version=" + this.e + ", tid='" + this.f + "', url='" + this.g + "', lastModifyTime=" + this.h + ", fileName='" + this.i;
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
            if (h() == bVar.h() && i() == bVar.i() && l() == bVar.l() && Objects.equals(j(), bVar.j()) && Objects.equals(k(), bVar.k())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Integer.valueOf(h()), Integer.valueOf(i()), j(), k(), Long.valueOf(l()));
    }
}
