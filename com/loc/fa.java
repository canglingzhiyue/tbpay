package com.loc;

import com.taobao.android.detail.core.detail.widget.listview.TRecyclerView;
import com.uc.webview.base.cyclone.BSError;

/* loaded from: classes4.dex */
public final class fa {
    public int l;
    public boolean n;

    /* renamed from: a  reason: collision with root package name */
    public int f7782a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public long e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA;
    public short m = 0;
    public int o = TRecyclerView.ITEM_POSITION_MASK;
    public int p = Integer.MAX_VALUE;
    public int q = Integer.MAX_VALUE;
    public boolean r = true;
    public int s = 99;
    public long t = 0;

    public fa(int i, boolean z) {
        this.l = 0;
        this.n = false;
        this.l = i;
        this.n = z;
    }

    private String e() {
        int i = this.l;
        return this.l + "#" + this.f7782a + "#" + this.b + "#0#" + a();
    }

    private String f() {
        return this.l + "#" + this.h + "#" + this.i + "#" + this.j;
    }

    public final long a() {
        return this.l == 5 ? this.e : this.d;
    }

    public final String b() {
        int i = this.l;
        if (i != 1) {
            if (i == 2) {
                return f();
            }
            if (i != 3 && i != 4 && i != 5) {
                return null;
            }
        }
        return e();
    }

    public final String c() {
        String b = b();
        if (b == null || b.length() <= 0) {
            return "";
        }
        boolean z = this.r;
        return (z ? 1 : 0) + "#" + b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final fa clone() {
        fa faVar = new fa(this.l, this.n);
        faVar.f7782a = this.f7782a;
        faVar.b = this.b;
        faVar.c = this.c;
        faVar.d = this.d;
        faVar.e = this.e;
        faVar.f = this.f;
        faVar.g = this.g;
        faVar.h = this.h;
        faVar.i = this.i;
        faVar.j = this.j;
        faVar.k = this.k;
        faVar.m = this.m;
        faVar.o = this.o;
        faVar.p = this.p;
        faVar.q = this.q;
        faVar.r = this.r;
        faVar.s = this.s;
        faVar.t = this.t;
        return faVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fa)) {
            fa faVar = (fa) obj;
            int i = faVar.l;
            if (i != 1) {
                return i != 2 ? i != 3 ? i != 4 ? i == 5 && this.l == 5 && faVar.c == this.c && faVar.e == this.e && faVar.q == this.q : this.l == 4 && faVar.c == this.c && faVar.d == this.d && faVar.b == this.b : this.l == 3 && faVar.c == this.c && faVar.d == this.d && faVar.b == this.b : this.l == 2 && faVar.j == this.j && faVar.i == this.i && faVar.h == this.h;
            } else if (this.l == 1 && faVar.c == this.c && faVar.d == this.d && faVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = String.valueOf(this.l).hashCode();
        if (this.l == 2) {
            hashCode = String.valueOf(this.j).hashCode() + String.valueOf(this.i).hashCode();
            i = this.h;
        } else {
            hashCode = String.valueOf(this.c).hashCode() + String.valueOf(this.d).hashCode();
            i = this.b;
        }
        return hashCode2 + hashCode + String.valueOf(i).hashCode();
    }
}
