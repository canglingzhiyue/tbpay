package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Iterator;
import kotlin.collections.ai;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int i;
    private static int j;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.data.d f4127a;
    private View b;
    private ViewGroup c;
    private ViewGroup d;
    private View e;
    private boolean f;
    private JSONObject g;
    private ViewGroup h;
    private ruk<Boolean> k;

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView f4128a;

        public b(Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView) {
            this.f4128a = autoScrollAndScrollableTagView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f4128a.startScroll();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f4129a;
        public final /* synthetic */ m b;
        public final /* synthetic */ LinearLayout c;

        public c(Object obj, m mVar, LinearLayout linearLayout) {
            this.f4129a = obj;
            this.b = mVar;
            this.c = linearLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Boolean mo2427invoke;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String string = ((JSONObject) this.f4129a).getString("jumpUrl");
            ceg.Companion.a(q.a("ggg BrandHonorNativeComponent click ", (Object) string));
            ruk<Boolean> e = this.b.e();
            if (e != null && (mo2427invoke = e.mo2427invoke()) != null) {
                z = mo2427invoke.booleanValue();
            }
            if (!z) {
                Context context = this.c.getContext();
                q.b(context, "context");
                com.alibaba.triver.triver_shop.newShop.ext.l.a(context, string);
            }
            com.alibaba.triver.triver_shop.newShop.ext.m.b(this.b.d(), "Page_Shop_BrandBFrameTag_Exp", ai.a(kotlin.j.a("type", ((JSONObject) this.f4129a).getString("type"))));
        }
    }

    public m(com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        q.d(shopData, "shopData");
        this.f4127a = shopData;
    }

    public static final /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : i;
    }

    public final com.alibaba.triver.triver_shop.newShop.data.d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("4cac45bc", new Object[]{this}) : this.f4127a;
    }

    public final View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b;
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.b = view;
        }
    }

    public final void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.c = viewGroup;
        }
    }

    public final void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
        } else {
            this.d = viewGroup;
        }
    }

    public final void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else {
            this.e = view;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(227236234);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : m.c();
        }
    }

    public final void a(ruk<Boolean> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            this.k = rukVar;
        }
    }

    public final ruk<Boolean> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("2dd0d112", new Object[]{this}) : this.k;
    }

    static {
        kge.a(-356386622);
        Companion = new a(null);
        j = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 12);
        i = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 50) + j;
    }

    public final void a(ViewGroup parent, JSONObject jSONObject, boolean z) {
        Iterator<Object> it;
        boolean z2 = z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7f4ccb", new Object[]{this, parent, jSONObject, new Boolean(z2)});
            return;
        }
        q.d(parent, "parent");
        if (jSONObject == null) {
            return;
        }
        this.h = parent;
        this.g = jSONObject;
        com.alibaba.triver.triver_shop.newShop.ext.m.b(this.f4127a, "Page_Shop_Tag", null, 2, null);
        this.f = z2;
        ViewParent parent2 = parent.getParent();
        if (parent2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) parent2).setClipChildren(false);
        ViewParent parent3 = parent.getParent();
        if (parent3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) parent3).setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        FrameLayout frameLayout2 = frameLayout;
        a((View) frameLayout2);
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = i;
            marginLayoutParams.leftMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
            marginLayoutParams.rightMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
            frameLayout2.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = i;
            marginLayoutParams2.leftMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
            marginLayoutParams2.rightMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
            t tVar = t.INSTANCE;
            frameLayout2.setLayoutParams(marginLayoutParams2);
        }
        FrameLayout frameLayout3 = frameLayout;
        Context context = frameLayout.getContext();
        q.b(context, "context");
        Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = new Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView(context);
        ViewGroup.LayoutParams layoutParams2 = autoScrollAndScrollableTagView.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            autoScrollAndScrollableTagView.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar2 = t.INSTANCE;
            autoScrollAndScrollableTagView.setLayoutParams(marginLayoutParams3);
        }
        Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView2 = autoScrollAndScrollableTagView;
        Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView3 = autoScrollAndScrollableTagView2;
        b((ViewGroup) autoScrollAndScrollableTagView3);
        Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView4 = autoScrollAndScrollableTagView2;
        ViewGroup.LayoutParams layoutParams3 = autoScrollAndScrollableTagView4.getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.gravity = 17;
            layoutParams4.width = -1;
            layoutParams4.height = i;
        } else {
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.gravity = 17;
            layoutParams5.width = -1;
            layoutParams5.height = i;
            t tVar3 = t.INSTANCE;
            autoScrollAndScrollableTagView4.setLayoutParams(layoutParams5);
        }
        autoScrollAndScrollableTagView2.post(new b(autoScrollAndScrollableTagView2));
        LinearLayout linearLayout = new LinearLayout(autoScrollAndScrollableTagView3.getContext());
        LinearLayout linearLayout2 = linearLayout;
        ViewGroup.LayoutParams layoutParams6 = linearLayout2.getLayoutParams();
        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout2.setLayoutParams(layoutParams6);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar4 = t.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams4);
        }
        LinearLayout linearLayout3 = linearLayout;
        a((ViewGroup) linearLayout3);
        autoScrollAndScrollableTagView2.setContentView(linearLayout2);
        linearLayout.setGravity(16);
        if (z2) {
            linearLayout.setPadding(com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 20), 0, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 20), 0);
        } else {
            linearLayout.setPadding(0, j, 0, 0);
        }
        ViewGroup.LayoutParams layoutParams7 = linearLayout2.getLayoutParams();
        if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams7;
            marginLayoutParams5.width = -1;
            marginLayoutParams5.height = -1;
            linearLayout2.setLayoutParams(layoutParams7);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams6.width = -1;
            marginLayoutParams6.height = -1;
            t tVar5 = t.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams6);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("tagList");
        q.b(jSONArray, "data.getJSONArray(\"tagList\")");
        Iterator<Object> it2 = jSONArray.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) next;
                com.alibaba.triver.triver_shop.newShop.ext.m.c(d(), "Page_Shop_BrandBFrameTag_Exp", ai.a(kotlin.j.a("type", jSONObject2.getString("type"))));
                LinearLayout linearLayout4 = new LinearLayout(linearLayout3.getContext());
                LinearLayout linearLayout5 = linearLayout4;
                ViewGroup.LayoutParams layoutParams8 = linearLayout5.getLayoutParams();
                it = it2;
                if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                    linearLayout5.setLayoutParams(layoutParams8);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(-2, -2);
                    t tVar6 = t.INSTANCE;
                    linearLayout5.setLayoutParams(marginLayoutParams7);
                }
                linearLayout4.setGravity(17);
                ViewGroup.LayoutParams layoutParams9 = linearLayout5.getLayoutParams();
                if (layoutParams9 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams9;
                    if (z2) {
                        marginLayoutParams8.rightMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
                    } else {
                        marginLayoutParams8.rightMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 12);
                    }
                    linearLayout5.setLayoutParams(layoutParams9);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams9 = new ViewGroup.MarginLayoutParams(-2, -2);
                    if (z2) {
                        marginLayoutParams9.rightMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
                    } else {
                        marginLayoutParams9.rightMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 12);
                    }
                    t tVar7 = t.INSTANCE;
                    linearLayout5.setLayoutParams(marginLayoutParams9);
                }
                linearLayout4.setOnClickListener(new c(next, this, linearLayout4));
                if (!b()) {
                    linearLayout4.setPadding(com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 18), com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 8), com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 18), com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 8));
                    linearLayout4.setBackground(com.alibaba.triver.triver_shop.newShop.ext.o.a(-1, null, null, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 6), 0, 0, 0, 0, 0, 0, 1014, null));
                }
                LinearLayout linearLayout6 = linearLayout4;
                TUrlImageView tUrlImageView = new TUrlImageView(linearLayout6.getContext());
                TUrlImageView tUrlImageView2 = tUrlImageView;
                ViewGroup.LayoutParams layoutParams10 = tUrlImageView2.getLayoutParams();
                if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
                    tUrlImageView2.setLayoutParams(layoutParams10);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams10 = new ViewGroup.MarginLayoutParams(-2, -2);
                    t tVar8 = t.INSTANCE;
                    tUrlImageView2.setLayoutParams(marginLayoutParams10);
                }
                ViewGroup.LayoutParams layoutParams11 = tUrlImageView2.getLayoutParams();
                if (layoutParams11 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams11;
                    marginLayoutParams11.width = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 22);
                    marginLayoutParams11.height = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 22);
                    tUrlImageView2.setLayoutParams(layoutParams11);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams12 = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams12.width = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 22);
                    marginLayoutParams12.height = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 22);
                    t tVar9 = t.INSTANCE;
                    tUrlImageView2.setLayoutParams(marginLayoutParams12);
                }
                tUrlImageView.setImageUrl(jSONObject2.getString("icon"));
                linearLayout6.addView(tUrlImageView2);
                t tVar10 = t.INSTANCE;
                TextView textView = new TextView(linearLayout6.getContext());
                TextView textView2 = textView;
                ViewGroup.LayoutParams layoutParams12 = textView2.getLayoutParams();
                if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
                    textView2.setLayoutParams(layoutParams12);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams13 = new ViewGroup.MarginLayoutParams(-2, -2);
                    t tVar11 = t.INSTANCE;
                    textView2.setLayoutParams(marginLayoutParams13);
                }
                ViewGroup.LayoutParams layoutParams13 = textView2.getLayoutParams();
                if (layoutParams13 instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams13).leftMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 6);
                    textView2.setLayoutParams(layoutParams13);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams14 = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams14.leftMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 6);
                    t tVar12 = t.INSTANCE;
                    textView2.setLayoutParams(marginLayoutParams14);
                }
                com.alibaba.triver.triver_shop.newShop.ext.o.a(textView, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 22));
                textView.setText(jSONObject2.getString("text"));
                if (b()) {
                    textView.getPaint().setShader(a(textView));
                } else {
                    textView.setTextColor(KAPContainerView.DEFAULT_MENU_COLOR);
                }
                linearLayout6.addView(textView2);
                t tVar13 = t.INSTANCE;
                linearLayout3.addView(linearLayout5);
                t tVar14 = t.INSTANCE;
            } else {
                it = it2;
            }
            it2 = it;
            z2 = z;
        }
        autoScrollAndScrollableTagView3.addView(linearLayout2);
        t tVar15 = t.INSTANCE;
        frameLayout3.addView(autoScrollAndScrollableTagView);
        t tVar16 = t.INSTANCE;
        View view = new View(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams14 = view.getLayoutParams();
        if (layoutParams14 instanceof ViewGroup.MarginLayoutParams) {
            view.setLayoutParams(layoutParams14);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams15 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar17 = t.INSTANCE;
            view.setLayoutParams(marginLayoutParams15);
        }
        b(view);
        ViewGroup.LayoutParams layoutParams15 = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams16 = layoutParams15 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams15 : null;
        if (layoutParams16 != null) {
            layoutParams16.height = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 50);
            layoutParams16.gravity = 17;
        } else {
            FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams17.height = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 50);
            layoutParams17.gravity = 17;
            t tVar18 = t.INSTANCE;
            view.setLayoutParams(layoutParams17);
        }
        if (b()) {
            view.setBackground(com.alibaba.triver.triver_shop.newShop.ext.o.a(com.alibaba.triver.triver_shop.newShop.ext.o.a(0, 0.2f), null, null, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 10), 0, 0, 0, 0, 1, 654311423, 246, null));
        }
        frameLayout3.addView(view);
        t tVar19 = t.INSTANCE;
        parent.addView(frameLayout2);
        t tVar20 = t.INSTANCE;
    }

    public final void a(boolean z) {
        int childCount;
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        JSONObject jSONObject2;
        JSONArray jSONArray3;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        if (z) {
            View view = this.b;
            if (view != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.a(view, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 100));
            }
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 100));
            }
            ViewGroup viewGroup2 = this.c;
            if (viewGroup2 != null) {
                viewGroup2.setPadding(com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 20), 0, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 20), 0);
            }
            View view2 = this.e;
            if (view2 != null) {
                view2.setBackground(com.alibaba.triver.triver_shop.newShop.ext.o.a(com.alibaba.triver.triver_shop.newShop.ext.o.a(0, 0.2f), null, null, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 10), 0, 0, 0, 0, 1, 654311423, 246, null));
            }
        } else {
            View view3 = this.b;
            if (view3 != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.a(view3, i);
            }
            ViewGroup viewGroup3 = this.d;
            if (viewGroup3 != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.a(viewGroup3, i);
            }
            ViewGroup viewGroup4 = this.c;
            if (viewGroup4 != null) {
                viewGroup4.setPadding(0, j, 0, 0);
            }
            View view4 = this.e;
            if (view4 != null) {
                view4.setBackground(null);
            }
        }
        ViewGroup viewGroup5 = this.c;
        if (viewGroup5 == null || (childCount = viewGroup5.getChildCount()) <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            View childAt = viewGroup5.getChildAt(i2);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            ViewGroup viewGroup6 = (ViewGroup) childAt;
            View childAt2 = viewGroup6.getChildAt(0);
            if (childAt2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
            }
            TUrlImageView tUrlImageView = (TUrlImageView) childAt2;
            View childAt3 = viewGroup6.getChildAt(1);
            if (childAt3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) childAt3;
            if (b()) {
                textView.getPaint().setShader(a(textView));
                textView.setTextColor(-1717588);
                JSONObject jSONObject4 = this.g;
                tUrlImageView.setImageUrl((jSONObject4 == null || (jSONArray3 = jSONObject4.getJSONArray("tagList")) == null || (jSONObject3 = jSONArray3.getJSONObject(i2)) == null) ? null : jSONObject3.getString("icon"));
                ViewGroup.LayoutParams layoutParams = viewGroup6.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
                viewGroup6.setPadding(0, 0, 0, 0);
                viewGroup6.setBackground(null);
            } else {
                textView.getPaint().setShader(null);
                textView.setTextColor(KAPContainerView.DEFAULT_MENU_COLOR);
                JSONObject jSONObject5 = this.g;
                String string = (jSONObject5 == null || (jSONArray = jSONObject5.getJSONArray("tagList")) == null || (jSONObject = jSONArray.getJSONObject(i2)) == null) ? null : jSONObject.getString("icon2");
                String str = string;
                if (str == null || n.a((CharSequence) str)) {
                    JSONObject jSONObject6 = this.g;
                    tUrlImageView.setImageUrl((jSONObject6 == null || (jSONArray2 = jSONObject6.getJSONArray("tagList")) == null || (jSONObject2 = jSONArray2.getJSONObject(i2)) == null) ? null : jSONObject2.getString("icon"));
                } else {
                    tUrlImageView.setImageUrl(string);
                }
                ViewGroup.LayoutParams layoutParams2 = viewGroup6.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 12);
                viewGroup6.setPadding(com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 18), com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 8), com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 18), com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 8));
                viewGroup6.setBackground(com.alibaba.triver.triver_shop.newShop.ext.o.a(-1, null, null, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 6), 0, 0, 0, 0, 0, 0, 1014, null));
            }
            if (i3 >= childCount) {
                return;
            }
            i2 = i3;
        }
    }

    private final Shader a(TextView textView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Shader) ipChange.ipc$dispatch("25c709c4", new Object[]{this, textView}) : new LinearGradient(0.0f, textView.getLineHeight(), textView.getPaint().measureText(textView.getText().toString()) / 2, 0.0f, -2048359, -857891, Shader.TileMode.MIRROR);
    }
}
