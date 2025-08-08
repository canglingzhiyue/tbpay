package com.taobao.phenix.request;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.niu;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f18939a;
    private final com.taobao.phenix.cache.a b;
    private final d c;
    private String d;
    private int e;
    private int f;
    private String g;
    private String h;
    private String i;
    private int j;
    private String k;
    private int l;
    private boolean m = false;

    static {
        kge.a(-121771253);
        f18939a = new int[]{10, 30, 60, 100, 200, 300, 500, 800, 1100, 1500};
    }

    public c(String str, com.taobao.phenix.cache.a aVar) {
        this.l = 0;
        this.b = aVar;
        this.d = str;
        if (str == null) {
            this.c = new d(1);
            return;
        }
        this.c = d.c(str);
        if (!this.c.b() || !this.c.h) {
            return;
        }
        this.j = niu.a(this.c.e, this.c.f);
        this.l = this.c.e;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e = i;
        this.f = i2;
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        int length = f18939a.length;
        int i3 = length / 2;
        char c = 65535;
        while (i3 >= 0 && i3 < length) {
            int i4 = f18939a[i3];
            if (i > i4) {
                if (c >= 0) {
                    if (c == 2) {
                        break;
                    }
                } else {
                    c = 1;
                }
                i3++;
            } else if (i >= i4) {
                break;
            } else {
                if (c >= 0) {
                    if (c == 1) {
                        break;
                    }
                } else {
                    c = 2;
                }
                i3--;
            }
        }
        if (i3 >= 0) {
            if (i3 >= length) {
                i2 = length - 1;
            } else {
                if (c == 1) {
                    int[] iArr = f18939a;
                    if (i <= (iArr[i3 - 1] + iArr[i3]) / 2) {
                        i2 = i3 - 1;
                    }
                }
                if (c == 2) {
                    int[] iArr2 = f18939a;
                    int i5 = i3 + 1;
                    if (i > (iArr2[i3] + iArr2[i5]) / 2) {
                        i2 = i5;
                    }
                }
                i2 = i3;
            }
        }
        return f18939a[i2];
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (this.k == null) {
                this.k = str;
                return;
            }
            this.k += str;
        }
    }

    public String a() {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.g == null) {
            if (this.c.b != null) {
                sb = new StringBuilder(this.c.b);
            } else {
                sb = new StringBuilder();
            }
            if (m() > 0) {
                sb.append(TplMsg.VALUE_T_NATIVE_RETURN);
                sb.append(m());
            }
            if (this.m || !com.taobao.phenix.intf.b.h().M()) {
                sb.append(niu.a(a(this.e), a(this.f)));
                int i = this.j;
                if (i != 0) {
                    sb.append(i);
                }
            } else if (this.j == 0 && (this.e != 0 || this.f != 0)) {
                sb.append(niu.a(a(this.e), a(this.f)));
            } else {
                sb.append(this.j);
            }
            this.g = sb.toString();
            com.taobao.phenix.cache.a aVar = this.b;
            if (aVar != null) {
                this.g = aVar.a(this.d, this.g);
            }
            if (this.g != null && this.k != null) {
                this.g += this.k;
            }
        }
        return this.g;
    }

    public String b() {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (this.h == null) {
            if (this.c.c != null) {
                sb = new StringBuilder(this.c.c);
            } else {
                sb = new StringBuilder();
            }
            this.h = sb.toString();
        }
        return this.h;
    }

    public String c() {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (this.i == null) {
            if (this.c.b != null) {
                sb = new StringBuilder(this.c.b);
            } else {
                sb = new StringBuilder();
            }
            if (m() > 0) {
                sb.append(TplMsg.VALUE_T_NATIVE_RETURN);
                sb.append(m());
            }
            sb.append(this.c.d);
            this.i = sb.toString();
            com.taobao.phenix.cache.a aVar = this.b;
            if (aVar != null) {
                this.i = aVar.b(this.d, this.i);
            }
        }
        return this.i;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        com.taobao.phenix.cache.a aVar = this.b;
        if (aVar != null) {
            return aVar.a(this.d, this.j);
        }
        return this.j;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.l;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.k) || (!StringUtils.isEmpty(this.d) && (this.d.indexOf("#") > 0 || this.d.indexOf("?") > 0));
    }

    public com.taobao.phenix.cache.a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.cache.a) ipChange.ipc$dispatch("4d615895", new Object[]{this}) : this.b;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.c.h;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.d;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.c.a();
    }

    public d i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("74f40b49", new Object[]{this}) : this.c;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.c.e;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.c.f;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.c.d;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.c.g;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "path: " + this.d + "\nscheme info: " + this.c + "\nbase cache catalog: " + d() + "\nmemory cache key: " + a() + "\ndisk cache key: " + c() + "\ndisk cache catalog: " + d();
    }
}
