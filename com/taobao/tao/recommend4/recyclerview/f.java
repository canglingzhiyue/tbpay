package com.taobao.tao.recommend4.recyclerview;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ksk;

/* loaded from: classes8.dex */
public class f extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f20981a = -1;
    private int b = -1;
    private int c = 0;
    private int d = 0;
    private long e = 0;
    private long f = 0;
    private boolean g = false;
    private ksk h;

    static {
        kge.a(1640817774);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 2142696127) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public f(ksk kskVar) {
        this.h = null;
        this.h = kskVar;
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        this.f20981a = this.b;
        this.b = recyclerView.getScrollState();
        if (recyclerView.getScrollState() == 1) {
            if (this.g) {
                a(recyclerView);
            }
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            this.f = System.currentTimeMillis();
            com.taobao.android.behavix.h.a(a(), b(), computeHorizontalScrollOffset, computeVerticalScrollOffset, new String[0]);
            this.g = true;
            super.onScrollStateChanged(recyclerView, i);
            return;
        }
        if (this.c != 0 || this.d != 0) {
            a(recyclerView);
        }
        super.onScrollStateChanged(recyclerView, i);
    }

    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        this.c = i + this.c;
        this.d = i2 + this.d;
    }

    public void a(RecyclerView recyclerView) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (!this.g || (i = this.b) == -1 || (i2 = this.f20981a) == -1) {
        } else {
            if (i2 == 1 && i == 2) {
                return;
            }
            if (this.f20981a == 0 && this.b == 1) {
                return;
            }
            this.e = System.currentTimeMillis() - this.f;
            com.taobao.android.behavix.h.b(a(), b(), recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset(), new String[0]);
            com.taobao.android.ai.b.a().a(b(), recyclerView);
            this.c = 0;
            this.d = 0;
            this.g = false;
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            return this.h.c;
        } catch (Throwable unused) {
            return "";
        }
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            return this.h.f30287a;
        } catch (Exception unused) {
            return "";
        }
    }
}
