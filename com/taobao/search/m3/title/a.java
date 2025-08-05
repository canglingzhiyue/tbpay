package com.taobao.search.m3.title;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.adapter.d;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.common.util.l;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class a extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Drawable f19139a;
    private final int b;
    private final int c;
    private d.a d;
    private final SearchDomBean e;
    private final Context f;
    private final int g;

    static {
        kge.a(-956019742);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }

    public static final /* synthetic */ Drawable a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("92b7f778", new Object[]{aVar}) : aVar.f19139a;
    }

    public static final /* synthetic */ void a(a aVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09f0d26", new Object[]{aVar, drawable});
        } else {
            aVar.f19139a = drawable;
        }
    }

    public static final /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a45e82b6", new Object[]{aVar})).intValue() : aVar.b;
    }

    public static final /* synthetic */ int c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b374277", new Object[]{aVar})).intValue() : aVar.g;
    }

    public a(SearchDomBean domBean, Context context, int i) {
        q.c(domBean, "domBean");
        q.c(context, "context");
        this.e = domBean;
        this.f = context;
        this.g = i;
        this.b = (int) ((this.g * this.e.width) / this.e.height);
        this.c = this.b + l.a(3.0f);
        setBounds(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d != null) {
        } else {
            com.taobao.android.weex_framework.l a2 = com.taobao.android.weex_framework.l.a();
            q.a((Object) a2, "MUSDKManager.getInstance()");
            d f = a2.f();
            if (f == null) {
                return;
            }
            f.a(this.f, this.e.image, new C0767a(), MUSImageQuality.AUTO);
        }
    }

    /* renamed from: com.taobao.search.m3.title.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0767a implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object b;

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public C0767a() {
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                return;
            }
            a.a(a.this, drawable);
            Drawable a2 = a.a(a.this);
            if (a2 != null) {
                a2.setBounds(0, 0, a.b(a.this) + 0, a.this.getIntrinsicHeight());
            }
            a.this.invalidateSelf();
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            } else {
                this.b = obj;
            }
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public Object b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b;
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : a.b(a.this);
        }

        @Override // com.taobao.android.weex_framework.adapter.d.a
        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : a.c(a.this);
        }
    }

    public final void b() {
        d.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.l a2 = com.taobao.android.weex_framework.l.a();
        q.a((Object) a2, "MUSDKManager.getInstance()");
        d f = a2.f();
        if (f == null || (aVar = this.d) == null) {
            return;
        }
        f.a(this.e.image, aVar);
        Drawable drawable = this.f19139a;
        if (drawable != null) {
            f.a(drawable, aVar);
        }
        this.d = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Drawable drawable = this.f19139a;
        if (drawable == null) {
            return;
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue() : this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue() : this.g;
    }
}
