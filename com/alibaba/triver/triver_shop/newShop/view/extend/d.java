package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.content.Context;
import android.view.View;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f3980a;
    private final Scroller b;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;
        public final /* synthetic */ Ref.IntRef c;
        public final /* synthetic */ Ref.FloatRef d;

        public a(View view, Ref.IntRef intRef, Ref.FloatRef floatRef) {
            this.b = view;
            this.c = intRef;
            this.d = floatRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!d.a(d.this).computeScrollOffset()) {
            } else {
                int abs = Math.abs(d.a(d.this).getCurrY());
                this.b.scrollBy(0, (int) ((abs - this.c.element) * this.d.element));
                Ref.IntRef intRef = this.c;
                intRef.element = abs;
                d.a(this.b, d.this, intRef, this.d);
            }
        }
    }

    static {
        kge.a(-706238689);
    }

    public d(Context context) {
        q.d(context, "context");
        this.f3980a = context;
        this.b = new Scroller(this.f3980a);
    }

    public static final /* synthetic */ Scroller a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Scroller) ipChange.ipc$dispatch("5f592d2b", new Object[]{dVar}) : dVar.b;
    }

    public static final /* synthetic */ void a(View view, d dVar, Ref.IntRef intRef, Ref.FloatRef floatRef) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa4ccb6", new Object[]{view, dVar, intRef, floatRef});
        } else {
            b(view, dVar, intRef, floatRef);
        }
    }

    public final void a(int i, View targetScrollView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114f8c8c", new Object[]{this, new Integer(i), targetScrollView, new Integer(i2)});
            return;
        }
        q.d(targetScrollView, "targetScrollView");
        this.b.abortAnimation();
        this.b.fling(0, 0, 0, i, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, 2000);
        int abs = Math.abs(this.b.getFinalY());
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 1.0f;
        if (i2 >= abs) {
            return;
        }
        if (i2 != 0) {
            floatRef.element = (abs - i2) / abs;
        }
        b(targetScrollView, this, new Ref.IntRef(), floatRef);
    }

    private static final void b(View view, d dVar, Ref.IntRef intRef, Ref.FloatRef floatRef) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b9ba95", new Object[]{view, dVar, intRef, floatRef});
        } else {
            view.postOnAnimation(new a(view, intRef, floatRef));
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.abortAnimation();
        }
    }
}
