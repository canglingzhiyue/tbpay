package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.web.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValue;
import com.taobao.themis.widget.group.c;
import java.util.Map;
import tb.ceg;
import tb.jvs;
import tb.kge;
import tb.mto;

/* loaded from: classes3.dex */
public final class s extends com.alibaba.triver.triver_shop.newShop.view.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f4021a;
    private final com.alibaba.triver.triver_shop.newShop.data.g b;
    private final WeexV2WidgetGroupContentRender$rootView$1 c;
    private com.taobao.themis.widget.group.c d;
    private WeexInstance e;
    private boolean f;

    /* loaded from: classes3.dex */
    public static final class a implements a.InterfaceC0159a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
            s.this = r1;
        }

        @Override // com.alibaba.triver.triver_shop.web.a.InterfaceC0159a
        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : s.a(s.this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements jvs {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
            s.this = r1;
        }

        @Override // tb.jvs
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            Object obj = map.get("pixels");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
            }
            double doubleValue = ((Double) obj).doubleValue();
            Object obj2 = map.get("velocity");
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
            }
            double doubleValue2 = ((Double) obj2).doubleValue();
            Object obj3 = map.get("axis");
            String str = obj3 instanceof String ? (String) obj3 : null;
            ceg.Companion.b(kotlin.jvm.internal.q.a("velocity : ", (Object) Double.valueOf(doubleValue2)));
            if (!kotlin.jvm.internal.q.a((Object) str, (Object) "vertical") || doubleValue <= mto.a.GEO_NOT_SUPPORT) {
                return;
            }
            s.a(s.this, true);
        }
    }

    static {
        kge.a(1627879450);
    }

    public static /* synthetic */ Object ipc$super(s sVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 92838762) {
            super.c();
            return null;
        } else if (hashCode == 95609325) {
            super.f();
            return null;
        } else if (hashCode != 96532846) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.g();
            return null;
        }
    }

    public static final /* synthetic */ void a(s sVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88bd1245", new Object[]{sVar, new Boolean(z)});
        } else {
            sVar.f = z;
        }
    }

    public static final /* synthetic */ boolean a(s sVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25716e73", new Object[]{sVar})).booleanValue() : sVar.f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.alibaba.triver.triver_shop.newShop.view.WeexV2WidgetGroupContentRender$rootView$1] */
    public s(Context context, com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel) {
        super(context, tabBarItemDataModel);
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(tabBarItemDataModel, "tabBarItemDataModel");
        this.f4021a = context;
        this.b = tabBarItemDataModel;
        this.c = new FrameLayout(this.f4021a) { // from class: com.alibaba.triver.triver_shop.newShop.view.WeexV2WidgetGroupContentRender$rootView$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(WeexV2WidgetGroupContentRender$rootView$1 weexV2WidgetGroupContentRender$rootView$1, String str, Object... objArr) {
                if (str.hashCode() == 2075560917) {
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
                }
                if (com.alibaba.triver.triver_shop.newShop.ext.o.b(motionEvent) || com.alibaba.triver.triver_shop.newShop.ext.o.c(motionEvent)) {
                    s.a(s.this, false);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.j(this.c);
        com.alibaba.triver.triver_shop.newShop.ext.o.k(this.c);
        return this.c;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        if (this.d != null) {
            return;
        }
        a();
    }

    private final void a() {
        com.alibaba.triver.triver_shop.web.a n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String h = this.b.h();
        if (h == null) {
            ceg.Companion.b("WeexV2WidgetGroupContentRender bundle url is null");
            return;
        }
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g != null && (n = g.n(this.b.f())) != null) {
            n.a(new a());
        }
        this.d = new com.taobao.themis.widget.group.c((Activity) this.f4021a, h, new b());
        com.taobao.themis.widget.group.c cVar = this.d;
        kotlin.jvm.internal.q.a(cVar);
        this.e = cVar.a();
        com.taobao.themis.widget.group.c cVar2 = this.d;
        kotlin.jvm.internal.q.a(cVar2);
        cVar2.a(new c());
        WeexV2WidgetGroupContentRender$rootView$1 weexV2WidgetGroupContentRender$rootView$1 = this.c;
        com.taobao.themis.widget.group.c cVar3 = this.d;
        kotlin.jvm.internal.q.a(cVar3);
        weexV2WidgetGroupContentRender$rootView$1.addView(cVar3.b());
        com.taobao.themis.widget.group.c cVar4 = this.d;
        kotlin.jvm.internal.q.a(cVar4);
        cVar4.a((WeexValue) null);
    }

    /* loaded from: classes3.dex */
    public static final class b implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.widget.group.c.a
        public void a(String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, errorCode, errorMsg});
                return;
            }
            kotlin.jvm.internal.q.d(errorCode, "errorCode");
            kotlin.jvm.internal.q.d(errorMsg, "errorMsg");
            ceg.Companion.b("WeexV2WidgetGroupContentRender onRenderError");
        }

        @Override // com.taobao.themis.widget.group.c.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                ceg.Companion.b("WeexV2WidgetGroupContentRender onRenderSuccess");
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        com.taobao.themis.widget.group.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.themis.widget.group.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.c();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        com.taobao.themis.widget.group.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        cVar.d();
    }
}
