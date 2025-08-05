package com.alibaba.triver.triver_shop.shop2023.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes3.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f4068a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;

    static {
        kge.a(-1527895964);
    }

    public e() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4068a == eVar.f4068a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h && this.i == eVar.i && this.j == eVar.j && this.k == eVar.k && this.l == eVar.l && this.m == eVar.m && this.n == eVar.n && this.o == eVar.o && this.p == eVar.p;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (((((((((((((((((((((((((((((this.f4068a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ShopHeaderInfo(shopIconHeight=" + this.f4068a + ", shopIconWidth=" + this.b + ", shopLiveIconHeight=" + this.c + ", shopLiveIconWidth=" + this.d + ", shopNameTextSize=" + this.e + ", shopNameMoreTextSize=" + this.f + ", shopIconLeftMargin=" + this.g + ", shopNameLeftMargin=" + this.h + ", shopSignTextSize=" + this.i + ", shopSignBottomMargin=" + this.j + ", focusButtonHeight=" + this.k + ", focusButtonWidth=" + this.l + ", focusButtonRightMargin=" + this.m + ", shopIconTopMargin=" + this.n + ", shopNameTopMargin=" + this.o + ", totalHeight=" + this.p + ')';
    }

    public e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f4068a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
        this.n = i14;
        this.o = i15;
        this.p = i16;
    }

    public /* synthetic */ e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, o oVar) {
        this((i17 & 1) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 100) : i, (i17 & 2) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 100) : i2, (i17 & 4) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 100) : i3, (i17 & 8) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 100) : i4, (i17 & 16) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 38) : i5, (i17 & 32) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 32) : i6, (i17 & 64) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 24) : i7, (i17 & 128) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 20) : i8, (i17 & 256) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 20) : i9, (i17 & 512) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 20) : i10, (i17 & 1024) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 56) : i11, (i17 & 2048) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 114) : i12, (i17 & 4096) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 20) : i13, (i17 & 8192) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 44) : i14, (i17 & 16384) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 44) : i15, (i17 & 32768) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 120) : i16);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f4068a;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f4068a = i;
        }
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f;
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.g;
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.h;
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.i;
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.j;
    }

    public final void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.l;
    }

    public final void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae6e270", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.m;
    }

    public final void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bbb0f", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.n;
    }

    public final void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5093ae", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue() : this.o;
    }

    public final void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0056c4d", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.p;
    }

    public final void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba44ec", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            a(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("shopIconHeight"))));
            b(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("shopIconWidth"))));
            c((int) (a() * 1.35f));
            d((int) (b() * 1.35f));
            e(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("shopNameTextSize"))));
            f(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("shopNameMoreTextSize"))));
            g(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("shopIconLeftMargin"))));
            h(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("shopNameLeftMargin"))));
            i(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("shopSignTextSize"))));
            j(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("shopSignBottomMargin"))));
            k(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("focusButtonHeight"))));
            l(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("focusButtonWidth"))));
            m(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("focusButtonRightMargin"))));
            n(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("shopIconTopMargin"))));
            o(com.alibaba.triver.triver_shop.newShop.ext.o.c(Integer.valueOf(jSONObject.getIntValue("shopNameTopMargin"))));
        }
    }
}
