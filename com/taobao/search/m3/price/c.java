package com.taobao.search.m3.price;

import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class c implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int e;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.search.m3.d f19126a;
    private int b;
    private e c;
    private final View d;

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-607766321);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public c(View view) {
        q.c(view, "view");
        this.d = view;
        this.f19126a = new com.taobao.search.m3.d(this.d, null, 2, null);
    }

    static {
        kge.a(-645318073);
        kge.a(488957804);
        Companion = new a(null);
        e = l.a(12.0f);
    }

    @Override // com.taobao.search.m3.c
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        float height = (this.d.getHeight() - e) - M3PriceView.Companion.a();
        canvas.translate(0.0f, height);
        this.f19126a.a(canvas);
        canvas.translate(0.0f, -height);
    }

    @Override // com.taobao.search.m3.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f19126a.a();
        }
    }

    @Override // com.taobao.search.m3.price.b
    public void a(e priceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5004b42d", new Object[]{this, priceInfo});
            return;
        }
        q.c(priceInfo, "priceInfo");
        this.c = priceInfo;
        if (this.b <= 0) {
            return;
        }
        com.taobao.search.m3.d dVar = this.f19126a;
        d a2 = priceInfo.a();
        if (a2 == null) {
            q.a();
        }
        dVar.a(a2.c(), this.b, e);
    }

    @Override // com.taobao.search.m3.c
    public int c() {
        d a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        e eVar = this.c;
        if (eVar == null) {
            return 0;
        }
        if (this.b == 0) {
            if (eVar == null) {
                q.a();
            }
            d a3 = eVar.a();
            if (a3 == null) {
                q.a();
            }
            float a4 = a3.a();
            e eVar2 = this.c;
            if (eVar2 == null) {
                q.a();
            }
            if (eVar2.a() == null) {
                q.a();
            }
            this.b = (int) ((a4 / a2.b()) * e);
        }
        return this.b;
    }
}
