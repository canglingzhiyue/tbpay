package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.newShop.ext.p;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.ui.view.refresh.circlebar.CircleProgressBar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import kotlin.t;
import tb.kge;
import tb.rva;

/* loaded from: classes3.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final com.alibaba.triver.triver_shop.newShop.data.g f4106a;
    private final JSONArray b;
    private final String c;
    private final String d;
    private int e;
    private TUrlImageView f;
    private TextView g;
    private View h;
    private RecyclerView i;
    private View j;
    private final int k;
    private final Drawable l;
    private final Drawable m;
    private final Drawable n;
    private final Drawable o;
    private final int p;
    private boolean q;
    private rva<? super JSONObject, ? super String, ? super JSONObject, t> r;
    private final kotlin.d s;
    private final String t;
    private View u;
    private ViewGroup v;

    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public final /* synthetic */ e f4112a;

            public a(e eVar) {
                this.f4112a = eVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                float floatValue = ((Float) animatedValue).floatValue();
                RecyclerView b = e.b(this.f4112a);
                if (b == null) {
                    q.b(OrderConfigs.RECYCLERVIEW);
                    throw null;
                }
                b.setTranslationX((-floatValue) * e.c(this.f4112a));
                View d = e.d(this.f4112a);
                if (d != null) {
                    o.e(d, (int) ((1 - floatValue) * e.c(this.f4112a)));
                }
                View e = e.e(this.f4112a);
                if (e == null) {
                    q.b(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
                    throw null;
                }
                View e2 = e.e(this.f4112a);
                if (e2 != null) {
                    e.setTranslationX((-(e2.getLeft() + o.d((Number) 1))) * floatValue);
                } else {
                    q.b(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
                    throw null;
                }
            }
        }

        /* loaded from: classes3.dex */
        public static final class b extends AnimatorListenerAdapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public final /* synthetic */ e f4113a;

            public b(e eVar) {
                this.f4113a = eVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                e eVar = this.f4113a;
                e.a(eVar, !e.a(eVar));
                TUrlImageView f = e.f(this.f4113a);
                if (f == null) {
                    q.b("icon");
                    throw null;
                }
                f.setImageUrl(e.a(this.f4113a) ? e.g(this.f4113a) : e.h(this.f4113a));
                TextView i = e.i(this.f4113a);
                if (i == null) {
                    q.b("tvClose");
                    throw null;
                }
                i.setText(e.a(this.f4113a) ? "分类" : "收起");
                View e = e.e(this.f4113a);
                if (e == null) {
                    q.b(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
                    throw null;
                }
                e.setBackground(e.a(this.f4113a) ? e.j(this.f4113a) : e.k(this.f4113a));
                if (!e.a(this.f4113a)) {
                    RecyclerView b = e.b(this.f4113a);
                    if (b == null) {
                        q.b(OrderConfigs.RECYCLERVIEW);
                        throw null;
                    }
                    o.b(b);
                    e.s(this.f4113a);
                    return;
                }
                RecyclerView b2 = e.b(this.f4113a);
                if (b2 == null) {
                    q.b(OrderConfigs.RECYCLERVIEW);
                    throw null;
                } else if (b2.getVisibility() != 0) {
                } else {
                    e.r(this.f4113a);
                }
            }
        }

        public d() {
            e.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            float f = 1.0f;
            float f2 = e.a(e.this) ? 1.0f : 0.0f;
            if (e.a(e.this)) {
                f = 0.0f;
            }
            if (e.a(e.this)) {
                e.this.d();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            e eVar = e.this;
            ofFloat.addUpdateListener(new a(eVar));
            ofFloat.addListener(new b(eVar));
            ofFloat.setDuration(0L);
            ofFloat.start();
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
            e.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View e = e.e(e.this);
            if (e != null) {
                e.performClick();
            } else {
                q.b(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
                throw null;
            }
        }
    }

    static {
        kge.a(1887067026);
    }

    /* renamed from: com.alibaba.triver.triver_shop.shop2023.nativeview.e$e */
    /* loaded from: classes3.dex */
    public static final class View$OnAttachStateChangeListenerC0157e implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.data.h f4114a;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        public View$OnAttachStateChangeListenerC0157e(com.alibaba.triver.triver_shop.shop2023.data.h hVar) {
            this.f4114a = hVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                return;
            }
            com.alibaba.triver.triver_shop.shop2023.data.h hVar = this.f4114a;
            Set<com.alibaba.triver.triver_shop.shop2023.data.h<com.alibaba.triver.triver_shop.shop2023.data.g>> set = com.alibaba.triver.triver_shop.shop2023.data.g.Companion.a().get(com.alibaba.triver.triver_shop.shop2023.data.f.class);
            if (set == null) {
                return;
            }
            x.c(set).remove(hVar);
        }
    }

    public e(com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel) {
        q.d(tabBarItemDataModel, "tabBarItemDataModel");
        this.f4106a = tabBarItemDataModel;
        this.b = this.f4106a.t();
        JSONObject u = this.f4106a.u();
        String str = null;
        this.c = u == null ? null : u.getString("url");
        JSONObject v = this.f4106a.v();
        this.d = v != null ? v.getString("url") : str;
        this.t = this.f4106a.x();
        this.e = -1;
        this.k = -592138;
        this.l = o.a(this.k, null, null, 0, 0, 0, 0, o.d((Number) 24), 0, 0, 894, null);
        this.m = o.a(this.k, null, null, 0, 0, o.d((Number) 24), 0, 0, 0, 0, 990, null);
        this.n = o.a(-1, null, null, 0, 0, o.d((Number) 10), 0, o.d((Number) 10), o.d((Number) 1), o.a(0, 0.1f), 94, null);
        this.o = o.a(CircleProgressBar.DEFAULT_CIRCLE_BG_LIGHT, null, null, o.d((Number) 10), 0, 0, 0, 0, o.d((Number) 1), o.a(0, 0.1f), 246, null);
        this.p = o.d((Number) 132);
        this.s = kotlin.e.a(new Shop2023CategoryNativeComponent$list$2(this));
    }

    public static final /* synthetic */ void a(e eVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf84e41", new Object[]{eVar, recyclerView});
        } else {
            eVar.i = recyclerView;
        }
    }

    public static final /* synthetic */ void a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2319921", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.q = z;
        }
    }

    public static final /* synthetic */ boolean a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("72229c17", new Object[]{eVar})).booleanValue() : eVar.q;
    }

    public static final /* synthetic */ RecyclerView b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("c01bc970", new Object[]{eVar}) : eVar.i;
    }

    public static final /* synthetic */ int c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("938e3588", new Object[]{eVar})).intValue() : eVar.p;
    }

    public static final /* synthetic */ View d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("afc2f118", new Object[]{eVar}) : eVar.h;
    }

    public static final /* synthetic */ View e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b0916f99", new Object[]{eVar}) : eVar.j;
    }

    public static final /* synthetic */ TUrlImageView f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("bbcb8924", new Object[]{eVar}) : eVar.f;
    }

    public static final /* synthetic */ String g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2881b127", new Object[]{eVar}) : eVar.c;
    }

    public static final /* synthetic */ String h(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a98de86", new Object[]{eVar}) : eVar.d;
    }

    public static final /* synthetic */ TextView i(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5f8bc98f", new Object[]{eVar}) : eVar.g;
    }

    public static final /* synthetic */ Drawable j(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("d5590d5e", new Object[]{eVar}) : eVar.n;
    }

    public static final /* synthetic */ Drawable k(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("a51940fd", new Object[]{eVar}) : eVar.o;
    }

    public static final /* synthetic */ List m(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e476db48", new Object[]{eVar}) : eVar.b();
    }

    public static final /* synthetic */ Drawable n(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("1459dbda", new Object[]{eVar}) : eVar.l;
    }

    public static final /* synthetic */ Drawable o(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("e41a0f79", new Object[]{eVar}) : eVar.m;
    }

    public static final /* synthetic */ View q(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ba3f5da5", new Object[]{eVar}) : eVar.u;
    }

    public static final /* synthetic */ void r(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3534e4", new Object[]{eVar});
        } else {
            eVar.f();
        }
    }

    public static final /* synthetic */ void s(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eeb01a5", new Object[]{eVar});
        } else {
            eVar.e();
        }
    }

    public final com.alibaba.triver.triver_shop.newShop.data.g c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.g) ipChange.ipc$dispatch("9212858", new Object[]{this}) : this.f4106a;
    }

    public final void a(rva<? super JSONObject, ? super String, ? super JSONObject, t> rvaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc9531b", new Object[]{this, rvaVar});
        } else {
            this.r = rvaVar;
        }
    }

    private final List<a> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : (List) this.s.getValue();
    }

    public final void a(ViewGroup container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, container});
            return;
        }
        q.d(container, "container");
        this.v = container;
        if (container.getChildCount() == 1) {
            this.h = container.getChildAt(0);
        }
        View view = this.h;
        if (view != null) {
            o.e(view, this.p);
        }
        b(container);
        a(0, false);
        View view2 = this.j;
        if (view2 == null) {
            q.b(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
            throw null;
        }
        view2.setOnClickListener(new d());
        if (q.a((Object) this.t, (Object) "close")) {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                q.b(OrderConfigs.RECYCLERVIEW);
                throw null;
            }
            o.d(recyclerView);
            View view3 = this.j;
            if (view3 == null) {
                q.b(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
                throw null;
            }
            view3.post(new f());
        }
        b(q.a((Object) this.t, (Object) "close"));
        View view4 = this.j;
        if (view4 == null) {
            q.b(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
            throw null;
        }
        g gVar = new g();
        LinkedHashSet linkedHashSet = com.alibaba.triver.triver_shop.shop2023.data.g.Companion.a().get(com.alibaba.triver.triver_shop.shop2023.data.f.class);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            com.alibaba.triver.triver_shop.shop2023.data.g.Companion.a().put(com.alibaba.triver.triver_shop.shop2023.data.f.class, linkedHashSet);
        }
        linkedHashSet.add(gVar);
        view4.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0157e(gVar));
    }

    /* loaded from: classes3.dex */
    public static final class g implements com.alibaba.triver.triver_shop.shop2023.data.h<com.alibaba.triver.triver_shop.shop2023.data.f> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
            e.this = r1;
        }

        @Override // com.alibaba.triver.triver_shop.shop2023.data.h
        public void onEvent(com.alibaba.triver.triver_shop.shop2023.data.f event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e36951e", new Object[]{this, event});
                return;
            }
            q.d(event, "event");
            View e = e.e(e.this);
            if (e == null) {
                q.b(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
                throw null;
            }
            e.setTranslationY(event.a());
            View q = e.q(e.this);
            if (q == null) {
                return;
            }
            q.setTranslationY(event.a());
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final String f4107a;
        private final String b;
        private final JSONObject c;
        private final String d;
        private int e;
        private JSONObject f;
        private JSONObject g;

        static {
            kge.a(268756386);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return q.a((Object) this.f4107a, (Object) aVar.f4107a) && q.a((Object) this.b, (Object) aVar.b) && q.a(this.c, aVar.c) && q.a((Object) this.d, (Object) aVar.d) && this.e == aVar.e && q.a(this.f, aVar.f) && q.a(this.g, aVar.g);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f4107a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c.hashCode()) * 31;
            String str3 = this.d;
            int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31;
            JSONObject jSONObject = this.f;
            int hashCode4 = (hashCode3 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
            JSONObject jSONObject2 = this.g;
            if (jSONObject2 != null) {
                i = jSONObject2.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Bean(name=" + ((Object) this.f4107a) + ", id=" + ((Object) this.b) + ", queryStringMap=" + this.c + ", url=" + ((Object) this.d) + ", state=" + this.e + ", utParam=" + this.f + ", utLogMap=" + this.g + ')';
        }

        public a(String str, String str2, JSONObject queryStringMap, String str3, int i, JSONObject jSONObject, JSONObject jSONObject2) {
            q.d(queryStringMap, "queryStringMap");
            this.f4107a = str;
            this.b = str2;
            this.c = queryStringMap;
            this.d = str3;
            this.e = i;
            this.f = jSONObject;
            this.g = jSONObject2;
        }

        public /* synthetic */ a(String str, String str2, JSONObject jSONObject, String str3, int i, JSONObject jSONObject2, JSONObject jSONObject3, int i2, kotlin.jvm.internal.o oVar) {
            this(str, str2, jSONObject, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? 0 : i, jSONObject2, jSONObject3);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f4107a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public final JSONObject c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.c;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.e = i;
            }
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
        }

        public final JSONObject f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this}) : this.f;
        }

        public final JSONObject g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : this.g;
        }
    }

    /* loaded from: classes3.dex */
    public final class c extends RecyclerView.Adapter<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ e f4110a;

        static {
            kge.a(15681873);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public c(e this$0) {
            q.d(this$0, "this$0");
            this.f4110a = this$0;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public /* synthetic */ void onBindViewHolder(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, bVar, new Integer(i)});
            } else {
                a(bVar, i);
            }
        }

        /* JADX WARN: Type inference failed for: r4v6, types: [android.support.v7.widget.RecyclerView$ViewHolder, com.alibaba.triver.triver_shop.shop2023.nativeview.e$b] */
        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public /* synthetic */ b mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
        }

        public b a(ViewGroup parent, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("672bb607", new Object[]{this, parent, new Integer(i)});
            }
            q.d(parent, "parent");
            return new b(this.f4110a, new FrameLayout(parent.getContext()));
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : e.m(this.f4110a).size();
        }

        public void a(b holder, int i) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5691dce", new Object[]{this, holder, new Integer(i)});
                return;
            }
            q.d(holder, "holder");
            a aVar = (a) e.m(this.f4110a).get(i);
            String d = aVar.d();
            if (d == null || d.length() == 0) {
                z = true;
            }
            if (!z) {
                holder.a().setImageUrl(aVar.d());
                holder.b().setText((CharSequence) null);
            } else {
                holder.a().setImageUrl(null);
                holder.b().setText(aVar.a());
            }
            int e = aVar.e();
            if (e == 0) {
                holder.itemView.setBackground(null);
                holder.c().setBackground(null);
                holder.b().setTypeface(Typeface.DEFAULT);
            } else if (e == 1) {
                holder.itemView.setBackgroundColor(-1);
                holder.c().setBackground(null);
                holder.b().setTypeface(Typeface.DEFAULT_BOLD);
            } else if (e == 2) {
                holder.itemView.setBackgroundColor(-1);
                holder.c().setBackground(e.n(this.f4110a));
                holder.b().setTypeface(Typeface.DEFAULT);
            } else if (e != 3) {
            } else {
                holder.itemView.setBackgroundColor(-1);
                holder.c().setBackground(e.o(this.f4110a));
                holder.b().setTypeface(Typeface.DEFAULT);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public TUrlImageView f4108a;
        public TextView b;
        public FrameLayout c;
        public final /* synthetic */ e d;

        static {
            kge.a(758180638);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(com.alibaba.triver.triver_shop.shop2023.nativeview.e r10, android.view.ViewGroup r11) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.nativeview.e.b.<init>(com.alibaba.triver.triver_shop.shop2023.nativeview.e, android.view.ViewGroup):void");
        }

        public final TUrlImageView a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TUrlImageView) ipChange.ipc$dispatch("41d38e94", new Object[]{this});
            }
            TUrlImageView tUrlImageView = this.f4108a;
            if (tUrlImageView != null) {
                return tUrlImageView;
            }
            q.b("ivIcon");
            throw null;
        }

        public final void a(TUrlImageView tUrlImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc3e34e", new Object[]{this, tUrlImageView});
                return;
            }
            q.d(tUrlImageView, "<set-?>");
            this.f4108a = tUrlImageView;
        }

        public final void a(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
                return;
            }
            q.d(textView, "<set-?>");
            this.b = textView;
        }

        public final TextView b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("f7e0415d", new Object[]{this});
            }
            TextView textView = this.b;
            if (textView != null) {
                return textView;
            }
            q.b("tvName");
            throw null;
        }

        public final void a(FrameLayout frameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
                return;
            }
            q.d(frameLayout, "<set-?>");
            this.c = frameLayout;
        }

        public final FrameLayout c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout) ipChange.ipc$dispatch("56f39b2f", new Object[]{this});
            }
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                return frameLayout;
            }
            q.b("flBg");
            throw null;
        }
    }

    public static /* synthetic */ void a(e eVar, int i, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e17ee1b", new Object[]{eVar, new Integer(i), new Boolean(z), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        eVar.a(i, z);
    }

    private final void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i <= b().size() - 1 && this.e != i) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject g2 = b().get(i).g();
            linkedHashMap.put("utLogMap", g2 == null ? null : g2.toJSONString());
            linkedHashMap.putAll(com.alibaba.triver.triver_shop.newShop.ext.b.d(b().get(i).c().getInnerMap()));
            if (z) {
                a(b().get(i).b(), linkedHashMap);
            }
            for (a aVar : b()) {
                aVar.a(0);
            }
            b().get(i).a(1);
            if (i > 0) {
                b().get(i - 1).a(2);
            }
            if (i < b().size() - 1) {
                b().get(i + 1).a(3);
            }
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                q.b(OrderConfigs.RECYCLERVIEW);
                throw null;
            }
            recyclerView.getAdapter().notifyDataSetChanged();
            String a2 = i < b().size() - 1 ? b().get(i + 1).a() : null;
            rva<? super JSONObject, ? super String, ? super JSONObject, t> rvaVar = this.r;
            if (rvaVar != null) {
                rvaVar.invoke(b().get(i).c(), a2, b().get(i).f());
            }
            this.e = i;
            RecyclerView recyclerView2 = this.i;
            if (recyclerView2 == null) {
                q.b(OrderConfigs.RECYCLERVIEW);
                throw null;
            }
            recyclerView2.scrollToPosition(i);
        }
    }

    private final void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.m.a(ShopConstants.PAGE_SHOP, "Page_Shop_allitem_category_tab", c(str, map));
        }
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.m.a(ShopConstants.PAGE_SHOP, "Page_Shop_allitem_category_switch_On", c(null, null));
        }
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.m.a(ShopConstants.PAGE_SHOP, "Page_Shop_allitem_category_switch_Off", c(null, null));
        }
    }

    public static /* synthetic */ void a(e eVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b357315e", new Object[]{eVar, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = eVar.q;
        }
        eVar.b(z);
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        Pair[] pairArr = new Pair[1];
        pairArr[0] = kotlin.j.a("state", z ? "1" : "2");
        com.alibaba.triver.triver_shop.newShop.ext.m.b(ShopConstants.PAGE_SHOP, "Page_Shop_allitem_category_tab_exp", c(null, ai.c(pairArr)));
    }

    private final HashMap<String, String> c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8c54174", new Object[]{this, str, map});
        }
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.f4106a.g();
        HashMap<String, String> hashMap = new HashMap<>();
        if (g2 != null) {
            hashMap = g2.J();
            HashMap<String, String> hashMap2 = hashMap;
            hashMap2.put("shop_id", g2.T());
            hashMap2.put("seller_id", g2.U());
            hashMap2.put("identityCode", g2.ba());
        }
        hashMap.put("category_id", str);
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(this, this.e + 1, false, 2, null);
        }
    }

    public final boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!z) {
            d();
            return false;
        }
        ViewGroup viewGroup = this.v;
        if (viewGroup != null) {
            return c(viewGroup);
        }
        q.b("container");
        throw null;
    }

    private final boolean c(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecb829ad", new Object[]{this, viewGroup})).booleanValue();
        }
        if (this.u != null) {
            return true;
        }
        if (!this.q) {
            return false;
        }
        TextView textView = new TextView(viewGroup.getContext());
        TextView textView2 = textView;
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            textView2.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar = t.INSTANCE;
            textView2.setLayoutParams(marginLayoutParams);
        }
        this.u = textView2;
        textView.setPadding(o.d((Number) 20), 0, 0, 0);
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.width = o.d((Number) 390);
            layoutParams3.height = o.d((Number) 78);
            layoutParams3.leftMargin = o.d((Number) 100);
            layoutParams3.bottomMargin = o.d((Number) 180);
            layoutParams3.gravity = 80;
        } else {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.width = o.d((Number) 390);
            layoutParams4.height = o.d((Number) 78);
            layoutParams4.leftMargin = o.d((Number) 100);
            layoutParams4.bottomMargin = o.d((Number) 180);
            layoutParams4.gravity = 80;
            t tVar2 = t.INSTANCE;
            textView2.setLayoutParams(layoutParams4);
        }
        textView.setBackgroundResource(R.drawable.shop_category_tip);
        textView.setText("点击展开分类 选购更便捷");
        textView.setGravity(17);
        o.a(textView, o.d((Number) 28));
        textView.setTextColor(-1);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        viewGroup.addView(textView2);
        return true;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        View view = this.u;
        if (view != null) {
            o.j(view);
        }
        this.u = null;
    }

    private final void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        FrameLayout frameLayout2 = frameLayout;
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = this.p;
            marginLayoutParams.height = -1;
            frameLayout2.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams2.width = this.p;
            marginLayoutParams2.height = -1;
            t tVar = t.INSTANCE;
            frameLayout2.setLayoutParams(marginLayoutParams2);
        }
        FrameLayout frameLayout3 = frameLayout;
        p.a(frameLayout3, new Shop2023CategoryNativeComponent$initView$1$2(this), new Shop2023CategoryNativeComponent$initView$1$3(viewGroup, this));
        FrameLayout frameLayout4 = new FrameLayout(frameLayout3.getContext());
        FrameLayout frameLayout5 = frameLayout4;
        this.j = frameLayout5;
        frameLayout4.setBackground(this.o);
        ViewGroup.LayoutParams layoutParams2 = frameLayout5.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = null;
        FrameLayout.LayoutParams layoutParams4 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams4 != null) {
            layoutParams4.width = o.d((Number) 96);
            layoutParams4.height = o.d((Number) 96);
            layoutParams4.bottomMargin = o.d((Number) 170);
            layoutParams4.gravity = 81;
        } else {
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.width = o.d((Number) 96);
            layoutParams5.height = o.d((Number) 96);
            layoutParams5.bottomMargin = o.d((Number) 170);
            layoutParams5.gravity = 81;
            t tVar2 = t.INSTANCE;
            frameLayout5.setLayoutParams(layoutParams5);
        }
        FrameLayout frameLayout6 = frameLayout4;
        LinearLayout linearLayout = new LinearLayout(frameLayout6.getContext());
        LinearLayout linearLayout2 = linearLayout;
        ViewGroup.LayoutParams layoutParams6 = linearLayout2.getLayoutParams();
        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout2.setLayoutParams(layoutParams6);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar3 = t.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams3);
        }
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams layoutParams7 = linearLayout2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.gravity = 17;
        } else {
            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams9.gravity = 17;
            t tVar4 = t.INSTANCE;
            linearLayout2.setLayoutParams(layoutParams9);
        }
        LinearLayout linearLayout3 = linearLayout;
        TUrlImageView tUrlImageView = new TUrlImageView(linearLayout3.getContext());
        TUrlImageView tUrlImageView2 = tUrlImageView;
        ViewGroup.LayoutParams layoutParams10 = tUrlImageView2.getLayoutParams();
        if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams10);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar5 = t.INSTANCE;
            tUrlImageView2.setLayoutParams(marginLayoutParams4);
        }
        this.f = tUrlImageView;
        ViewGroup.LayoutParams layoutParams11 = tUrlImageView2.getLayoutParams();
        LinearLayout.LayoutParams layoutParams12 = layoutParams11 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams11 : null;
        if (layoutParams12 != null) {
            layoutParams12.width = o.d((Number) 32);
            layoutParams12.height = o.d((Number) 32);
            layoutParams12.gravity = 1;
        } else {
            LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams13.width = o.d((Number) 32);
            layoutParams13.height = o.d((Number) 32);
            layoutParams13.gravity = 1;
            t tVar6 = t.INSTANCE;
            tUrlImageView2.setLayoutParams(layoutParams13);
        }
        tUrlImageView.setImageUrl(this.d);
        linearLayout3.addView(tUrlImageView2);
        t tVar7 = t.INSTANCE;
        TextView textView = new TextView(linearLayout3.getContext());
        TextView textView2 = textView;
        ViewGroup.LayoutParams layoutParams14 = textView2.getLayoutParams();
        if (layoutParams14 instanceof ViewGroup.MarginLayoutParams) {
            textView2.setLayoutParams(layoutParams14);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar8 = t.INSTANCE;
            textView2.setLayoutParams(marginLayoutParams5);
        }
        this.g = textView;
        ViewGroup.LayoutParams layoutParams15 = textView2.getLayoutParams();
        if (layoutParams15 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams15;
        }
        if (layoutParams3 != null) {
            layoutParams3.topMargin = o.d((Number) 6);
            layoutParams3.gravity = 1;
        } else {
            LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams16.topMargin = o.d((Number) 6);
            layoutParams16.gravity = 1;
            t tVar9 = t.INSTANCE;
            textView2.setLayoutParams(layoutParams16);
        }
        textView.setText("收起");
        o.a(textView, o.d((Number) 20));
        textView.setTextColor(KAPContainerView.DEFAULT_MENU_COLOR);
        linearLayout3.addView(textView2);
        t tVar10 = t.INSTANCE;
        frameLayout6.addView(linearLayout2);
        t tVar11 = t.INSTANCE;
        frameLayout3.addView(frameLayout5);
        t tVar12 = t.INSTANCE;
        viewGroup.addView(frameLayout2);
        t tVar13 = t.INSTANCE;
    }
}
