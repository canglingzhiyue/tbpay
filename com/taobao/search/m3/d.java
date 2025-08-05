package com.taobao.search.m3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.adapter.d;
import com.taobao.android.weex_framework.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Drawable f19076a;
    private d.a b;
    private final View c;
    private com.taobao.android.weex_framework.adapter.d d;

    static {
        kge.a(-476070788);
    }

    public d(View view, com.taobao.android.weex_framework.adapter.d dVar) {
        q.c(view, "view");
        this.c = view;
        this.d = dVar;
    }

    public /* synthetic */ d(View view, com.taobao.android.weex_framework.adapter.d dVar, int i, o oVar) {
        this(view, (i & 2) != 0 ? null : dVar);
    }

    public static final /* synthetic */ View a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6579ec0a", new Object[]{dVar}) : dVar.c;
    }

    public static final /* synthetic */ void a(d dVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33814ec", new Object[]{dVar, drawable});
        } else {
            dVar.f19076a = drawable;
        }
    }

    public final void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        Drawable drawable = this.f19076a;
        if (drawable == null) {
            return;
        }
        drawable.draw(canvas);
    }

    public final void a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526812", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (this.b != null || TextUtils.isEmpty(str)) {
        } else {
            com.taobao.android.weex_framework.adapter.d dVar = this.d;
            if (dVar == null) {
                l a2 = l.a();
                q.a((Object) a2, "MUSDKManager.getInstance()");
                dVar = a2.f();
            }
            if (dVar == null) {
                return;
            }
            dVar.a(this.c.getContext(), str, new a(i, i2), MUSImageQuality.AUTO);
        }
    }

    /* loaded from: classes7.dex */
    public static final class a implements j {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        private Object d;

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                return;
            }
            d.a(d.this, drawable);
            if (drawable != null) {
                drawable.setBounds(0, 0, this.b, this.c);
            }
            if (drawable != null) {
                drawable.setCallback(d.a(d.this));
            }
            if (!(drawable instanceof com.taobao.phenix.animate.b)) {
                drawable = null;
            }
            com.taobao.phenix.animate.b bVar = (com.taobao.phenix.animate.b) drawable;
            if (bVar != null) {
                bVar.b();
            }
            d.a(d.this).invalidate();
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                this.d = obj;
            }
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public Object b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.d;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c;
        }
    }

    public final void a() {
        d.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.adapter.d dVar = this.d;
        if (dVar == null) {
            l a2 = l.a();
            q.a((Object) a2, "MUSDKManager.getInstance()");
            dVar = a2.f();
        }
        if (dVar == null || (aVar = this.b) == null) {
            return;
        }
        dVar.a("", aVar);
        Drawable drawable = this.f19076a;
        if (drawable != null) {
            if (!(drawable instanceof com.taobao.phenix.animate.b)) {
                drawable = null;
            }
            com.taobao.phenix.animate.b bVar = (com.taobao.phenix.animate.b) drawable;
            if (bVar != null) {
                bVar.f();
            }
            dVar.a(this.f19076a, aVar);
        }
        this.f19076a = null;
        this.b = null;
        this.c.invalidate();
    }
}
