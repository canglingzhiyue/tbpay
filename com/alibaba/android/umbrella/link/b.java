package com.alibaba.android.umbrella.link;

import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f2819a = "";
    private String b = "";
    private String c = "";
    private i d = null;
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private int k = 0;
    private int l = 0;
    private Map<UMDimKey, Object> m = null;
    private c n = null;
    private String o = String.valueOf(System.currentTimeMillis());

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.o;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f2819a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    public i e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("73e02c7f", new Object[]{this}) : this.d;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        i iVar = this.d;
        return iVar == null ? "" : iVar.a();
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.e;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.f;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.g;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.h;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.i;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.j;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.k;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.l;
    }

    public Map<UMDimKey, Object> o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("df66012b", new Object[]{this}) : this.m;
    }

    public c p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("7ec204d0", new Object[]{this}) : this.n;
    }

    public b a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("770aa6b6", new Object[]{this, str, str2});
        }
        if (j.a(str)) {
            return this;
        }
        this.f2819a = str;
        if (str2 == null) {
            return this;
        }
        this.b = str2;
        return this;
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fac2c26c", new Object[]{this, str});
        }
        if (j.a(str)) {
            return this;
        }
        this.c = str;
        return this;
    }

    public b a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("41e2e7f5", new Object[]{this, iVar});
        }
        if (iVar == null) {
            return this;
        }
        this.d = iVar;
        return this;
    }

    public b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b788f2d", new Object[]{this, str});
        }
        if (j.a(str)) {
            return this;
        }
        this.e = str;
        return this;
    }

    public b c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1c2e5bee", new Object[]{this, str});
        }
        if (j.a(str)) {
            return this;
        }
        this.f = str;
        return this;
    }

    public b d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2ce428af", new Object[]{this, str});
        }
        if (j.a(str)) {
            return this;
        }
        this.g = str;
        return this;
    }

    public b b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("77d92537", new Object[]{this, str, str2});
        }
        if (j.a(str)) {
            return this;
        }
        this.h = str;
        if (str2 == null) {
            return this;
        }
        this.i = str2;
        return this;
    }

    public b a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e93c4955", new Object[]{this, new Integer(i)});
        }
        this.k = i;
        return this;
    }

    public b b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f0a17e74", new Object[]{this, new Integer(i)});
        }
        this.l = i;
        return this;
    }

    public b a(Map<UMDimKey, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a0af2ed7", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.m = map;
        }
        return this;
    }

    public b a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("372f42bb", new Object[]{this, cVar});
        }
        if (cVar != null && !cVar.a()) {
            this.n = cVar;
        }
        return this;
    }

    public b e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3d99f570", new Object[]{this, str});
        }
        if (j.a(str)) {
            this.j = "";
        } else {
            this.j = str;
        }
        return this;
    }
}
