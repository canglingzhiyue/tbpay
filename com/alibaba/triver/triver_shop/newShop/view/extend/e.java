package com.alibaba.triver.triver_shop.newShop.view.extend;

import com.alibaba.triver.triver_shop.web.ShopBaseWebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class e implements ShopBaseWebView.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f3982a;
    private final ruk<t> b;
    private final ruk<t> c;
    private boolean d;
    private Runnable e;
    private long f;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            e.a(e.this, null);
            e.a(e.this);
        }
    }

    static {
        kge.a(-1686594501);
        kge.a(-2135486848);
    }

    public e(int i, ruk<t> onPageStartScrollUp, ruk<t> onPageStopScroll) {
        q.d(onPageStartScrollUp, "onPageStartScrollUp");
        q.d(onPageStopScroll, "onPageStopScroll");
        this.f3982a = i;
        this.b = onPageStartScrollUp;
        this.c = onPageStopScroll;
    }

    public /* synthetic */ e(int i, ruk rukVar, ruk rukVar2, int i2, o oVar) {
        this((i2 & 1) != 0 ? 0 : i, rukVar, rukVar2);
    }

    public static final /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4eccbde", new Object[]{eVar});
        } else {
            eVar.a();
        }
    }

    public static final /* synthetic */ void a(e eVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ad1b5c", new Object[]{eVar, runnable});
        } else {
            eVar.e = runnable;
        }
    }

    @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView.d
    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f97f9ec", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
            return;
        }
        if (i2 > 0 && i4 < i6) {
            z2 = true;
        }
        if (!z2) {
            return;
        }
        this.f = System.currentTimeMillis();
        if (!this.d) {
            this.d = true;
            this.b.mo2427invoke();
            b();
            return;
        }
        b();
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (System.currentTimeMillis() - this.f >= 250) {
            this.d = false;
            this.c.mo2427invoke();
        } else {
            b();
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.e != null) {
        } else {
            this.e = new a();
            com.alibaba.triver.triver_shop.newShop.ext.b.b(this.e, 250L);
        }
    }
}
