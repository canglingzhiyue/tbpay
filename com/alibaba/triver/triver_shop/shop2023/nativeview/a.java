package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.extension.dianmicX.Tab3AnimationIcon;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public final class a implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final d Companion;
    public static final int bottomBarHeightWithBottomMarginRpxValue = 162;
    private int A;
    private boolean B;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.d C;
    private JSONObject D;

    /* renamed from: a */
    private final Context f4088a;
    private final com.alibaba.triver.triver_shop.newShop.data.d b;
    private FrameLayout c;
    private FrameLayout d;
    private final List<View> e;
    private View f;
    private rul<? super Integer, t> g;
    private int h;
    private int i;
    private int j;
    private final JSONArray k;
    private JSONArray l;
    private LinearLayout m;
    private View n;
    private final int o;
    private boolean p;
    private Drawable q;
    private Drawable r;
    private Drawable s;
    private boolean t;
    private final int u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* renamed from: com.alibaba.triver.triver_shop.shop2023.nativeview.a$a */
    /* loaded from: classes3.dex */
    public static final class View$OnClickListenerC0155a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ int d;

        public View$OnClickListenerC0155a(JSONObject jSONObject, JSONObject jSONObject2, int i) {
            a.this = r1;
            this.b = jSONObject;
            this.c = jSONObject2;
            this.d = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a aVar = a.this;
            JSONObject jSONObject = this.b;
            String str = null;
            String string = jSONObject == null ? null : jSONObject.getString("clkUtArg1");
            String string2 = this.c.getString("name");
            q.b(string2, "info.getString(\"name\")");
            a.a(aVar, string, string2, null, 4, null);
            Object obj = a.this.b().h(this.d).get("tabData");
            JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
            if (jSONArray == null) {
                return;
            }
            a aVar2 = a.this;
            int i = this.d;
            JSONObject jSONObject2 = this.c;
            if (jSONArray.size() > 0) {
                a.b(aVar2, i);
                rul<Integer, t> c = aVar2.c();
                if (c == null) {
                    return;
                }
                c.mo2421invoke(Integer.valueOf(i));
            } else if (!q.a((Object) jSONObject2.getString("name"), (Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_WANG_WANG)) {
                com.alibaba.triver.triver_shop.newShop.ext.l.a(aVar2.a(), aVar2.b().aQ());
            } else {
                Context a2 = aVar2.a();
                JSONObject W = aVar2.b().W();
                if (W != null) {
                    str = W.getString("wangWangLink");
                }
                com.alibaba.triver.triver_shop.newShop.ext.l.a(a2, str);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a aVar = a.this;
            a.a(aVar, (((View) a.d(aVar).get(0)).getLeft() + o.d((Number) 24)) - o.d((Number) 20));
            View e = a.e(a.this);
            if (e != null) {
                e.setX(a.f(a.this) + (a.g(a.this) * a.b(a.this)));
            } else {
                q.b("slide");
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View e = a.e(a.this);
            if (e != null) {
                e.setX(a.f(a.this) + (a.g(a.this) * a.b(a.this)));
            } else {
                q.b("slide");
                throw null;
            }
        }
    }

    static {
        kge.a(-699162860);
        kge.a(1848919473);
        Companion = new d(null);
    }

    public a(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData) {
        q.d(context, "context");
        q.d(shopData, "shopData");
        this.f4088a = context;
        this.b = shopData;
        this.d = new FrameLayout(this.f4088a);
        this.e = new ArrayList();
        this.i = this.b.p();
        Object obj = this.b.M().get("tabData");
        JSONArray jSONArray = null;
        this.k = obj instanceof JSONArray ? (JSONArray) obj : null;
        Object obj2 = this.b.h(this.i).get("tabData");
        this.l = obj2 instanceof JSONArray ? (JSONArray) obj2 : jSONArray;
        int d2 = o.d((Number) 662);
        JSONArray jSONArray2 = this.k;
        this.o = d2 / (jSONArray2 == null ? 1 : jSONArray2.size());
        this.q = o.a(0, null, new int[]{-1291845632, 1291845632}, 0, 0, 0, 0, 0, 0, 0, 1019, null);
        this.r = o.a(o.a(16777215, 0.95f), null, null, 0, 0, 0, 0, 0, o.d((Number) 1), -1, 254, null);
        this.s = o.a(0, GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1, 16777215}, 0, 0, 0, 0, 0, 0, 0, 1017, null);
        this.t = true;
        this.u = o.d(Integer.valueOf((int) bottomBarHeightWithBottomMarginRpxValue));
    }

    public static final /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f8fb4c", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.h = i;
        }
    }

    public static final /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("82d6974b", new Object[]{aVar})).intValue() : aVar.o;
    }

    public static final /* synthetic */ void b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fcc6ab", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.b(i);
        }
    }

    public static final /* synthetic */ List d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("bfd4922d", new Object[]{aVar}) : aVar.e;
    }

    public static final /* synthetic */ View e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("967a851d", new Object[]{aVar}) : aVar.n;
    }

    public static final /* synthetic */ int f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5adca4f", new Object[]{aVar})).intValue() : aVar.h;
    }

    public static final /* synthetic */ int g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6639710", new Object[]{aVar})).intValue() : aVar.i;
    }

    public static final /* synthetic */ JSONArray h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("18d0baa0", new Object[]{aVar}) : aVar.k;
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.shop2023.nativeview.d i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.shop2023.nativeview.d) ipChange.ipc$dispatch("2863dbe3", new Object[]{aVar}) : aVar.C;
    }

    public final Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f4088a;
    }

    public final com.alibaba.triver.triver_shop.newShop.data.d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("c5960a3a", new Object[]{this}) : this.b;
    }

    /* loaded from: classes3.dex */
    public static final class d {
        static {
            kge.a(1963376988);
        }

        public /* synthetic */ d(kotlin.jvm.internal.o oVar) {
            this();
        }

        private d() {
        }
    }

    public final void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
        } else {
            this.c = frameLayout;
        }
    }

    public final FrameLayout i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("88151a69", new Object[]{this}) : this.c;
    }

    public final void a(rul<? super Integer, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, rulVar});
        } else {
            this.g = rulVar;
        }
    }

    public final rul<Integer, t> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("1e6d8673", new Object[]{this}) : this.g;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.u;
    }

    public final void a(ViewGroup container, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4273c", new Object[]{this, container, new Integer(i)});
            return;
        }
        q.d(container, "container");
        b(this, "Page_Shop_Bottom_Bar_Root_Click_23", null, null, 6, null);
        container.setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(container.getContext());
        a(frameLayout);
        frameLayout.setBackground(this.s);
        FrameLayout frameLayout2 = frameLayout;
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = null;
        FrameLayout.LayoutParams layoutParams3 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 != null) {
            layoutParams3.width = -1;
            layoutParams3.height = d();
        } else {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.width = -1;
            layoutParams4.height = d();
            t tVar = t.INSTANCE;
            frameLayout2.setLayoutParams(layoutParams4);
        }
        FrameLayout frameLayout3 = frameLayout;
        FrameLayout frameLayout4 = new FrameLayout(frameLayout3.getContext());
        this.d = frameLayout4;
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout4.setPadding(o.d((Number) 24), 0, o.d((Number) 24), 0);
        FrameLayout frameLayout5 = frameLayout4;
        ViewGroup.LayoutParams layoutParams5 = frameLayout5.getLayoutParams();
        FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            layoutParams6.width = o.d((Number) 750);
            layoutParams6.height = d();
            layoutParams6.gravity = 1;
        } else {
            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams7.width = o.d((Number) 750);
            layoutParams7.height = d();
            layoutParams7.gravity = 1;
            t tVar2 = t.INSTANCE;
            frameLayout5.setLayoutParams(layoutParams7);
        }
        FrameLayout frameLayout6 = frameLayout4;
        View view = new View(frameLayout4.getContext());
        ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
        if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
            view.setLayoutParams(layoutParams8);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar3 = t.INSTANCE;
            view.setLayoutParams(marginLayoutParams);
        }
        o.a(view, e());
        ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
        if (layoutParams9 instanceof FrameLayout.LayoutParams) {
            layoutParams2 = (FrameLayout.LayoutParams) layoutParams9;
        }
        if (layoutParams2 != null) {
            layoutParams2.width = this.o + o.d((Number) 40);
            layoutParams2.height = o.d((Number) 100);
            layoutParams2.gravity = 48;
            layoutParams2.topMargin = o.d((Number) 7);
        } else {
            FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams10.width = this.o + o.d((Number) 40);
            layoutParams10.height = o.d((Number) 100);
            layoutParams10.gravity = 48;
            layoutParams10.topMargin = o.d((Number) 7);
            t tVar4 = t.INSTANCE;
            view.setLayoutParams(layoutParams10);
        }
        view.setAlpha(0.0f);
        t tVar5 = t.INSTANCE;
        frameLayout6.addView(view);
        t tVar6 = t.INSTANCE;
        this.n = view;
        LinearLayout linearLayout = new LinearLayout(frameLayout6.getContext());
        LinearLayout linearLayout2 = linearLayout;
        ViewGroup.LayoutParams layoutParams11 = linearLayout2.getLayoutParams();
        if (layoutParams11 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout2.setLayoutParams(layoutParams11);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar7 = t.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams2);
        }
        linearLayout.setBackgroundDrawable(this.r);
        o.a((View) linearLayout2, true, o.d((Number) 100));
        linearLayout.setElevation(o.d((Number) 10));
        ViewGroup.LayoutParams layoutParams12 = linearLayout2.getLayoutParams();
        if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams12;
            marginLayoutParams3.width = -1;
            marginLayoutParams3.height = o.d((Number) 114);
            linearLayout2.setLayoutParams(layoutParams12);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams4.width = -1;
            marginLayoutParams4.height = o.d((Number) 114);
            t tVar8 = t.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams4);
        }
        int i2 = 0;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(o.d((Number) 20), 0, o.d((Number) 20), 0);
        t tVar9 = t.INSTANCE;
        frameLayout6.addView(linearLayout2);
        t tVar10 = t.INSTANCE;
        this.m = linearLayout;
        frameLayout3.addView(frameLayout5);
        t tVar11 = t.INSTANCE;
        container.addView(frameLayout2);
        t tVar12 = t.INSTANCE;
        JSONArray jSONArray = this.k;
        if (jSONArray != null) {
            for (Object obj : jSONArray) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p.b();
                }
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                a((JSONObject) obj, i2);
                i2 = i3;
            }
            t tVar13 = t.INSTANCE;
        }
        b(this.b.p());
        this.d.post(new b());
    }

    public final Drawable e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7af0e7ce", new Object[]{this});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(o.d((Number) 100));
        gradientDrawable.setColor(-1);
        return gradientDrawable;
    }

    private final void a(JSONObject jSONObject, int i) {
        String string;
        int b2;
        int b3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        View a2 = o.a(this.f4088a, R.layout.shop_bottom_nav_bar_tab);
        q.a(a2);
        a2.setTag(Integer.valueOf(i));
        TUrlImageView ivTab = (TUrlImageView) a2.findViewById(R.id.iv_tab_icon);
        TextView tvTab = (TextView) a2.findViewById(R.id.tv_tab_text);
        if (i == 0 && (string = jSONObject.getString("superscriptDefaultPic")) != null) {
            TUrlImageView ivMark = (TUrlImageView) a2.findViewById(R.id.shop_bottom_nav_bar_tab_item_hover_flag_img);
            q.b(ivMark, "ivMark");
            TUrlImageView tUrlImageView = ivMark;
            String string2 = jSONObject.getString("superscriptPicWidth");
            if (string2 == null || (b2 = n.b(string2)) == null) {
                b2 = 50;
            }
            o.b(tUrlImageView, o.d(b2));
            String string3 = jSONObject.getString("superscriptPicHeight");
            if (string3 == null || (b3 = n.b(string3)) == null) {
                b3 = 22;
            }
            o.a(tUrlImageView, o.d(b3));
            ivMark.setTranslationY(o.d((Number) 10));
            ivMark.setTranslationX(o.d((Number) (-22)));
            ivMark.setImageUrl(string);
        }
        tvTab.setText(jSONObject.getString("title"));
        ivTab.setImageUrl(jSONObject.getString("defaultPic"));
        a2.setContentDescription(((Object) tvTab.getText()) + " 按钮");
        if (b(jSONObject)) {
            ivTab.setSkipAutoSize(true);
        }
        q.b(ivTab, "ivTab");
        TUrlImageView tUrlImageView2 = ivTab;
        o.b(tUrlImageView2, o.d((Number) 48));
        o.a(tUrlImageView2, o.d((Number) 48));
        q.b(tvTab, "tvTab");
        o.a(tvTab, o.d((Number) 20));
        LinearLayout linearLayout = this.m;
        String str = null;
        if (linearLayout == null) {
            q.b("tabContainer");
            throw null;
        }
        linearLayout.addView(a2);
        this.e.add(a2);
        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.weight = 1.0f;
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        JSONObject jSONObject2 = jSONObject.getJSONObject("userTrackInfo");
        if (jSONObject2 != null) {
            str = jSONObject2.getString("expUtArg1");
        }
        b(this, str, jSONObject.getString("name"), null, 4, null);
        a2.setOnClickListener(new View$OnClickListenerC0155a(jSONObject2, jSONObject, i));
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            b(i);
        }
    }

    private final void b(int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        View view = (View) p.a((List<? extends Object>) this.e, i);
        if (view == null || q.a(this.f, view)) {
            return;
        }
        this.i = i;
        Object obj = this.b.h(this.i).get("tabData");
        this.l = obj instanceof JSONArray ? (JSONArray) obj : null;
        JSONArray jSONArray = this.k;
        if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(i)) != null) {
            if (b(jSONObject)) {
                b(true);
            } else {
                b(false);
            }
        }
        d(i);
        this.f = view;
        this.d.post(new c());
        if (this.t) {
            this.t = false;
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.a(new Shop2023BottomBarNativeComponent$changeTo$3(this), 200L);
        }
    }

    private final boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue() : q.a((Object) jSONObject.getString("name"), (Object) "livebar");
    }

    private final void b(boolean z) {
        String string;
        JSONObject jSONObject;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.v = z;
        String str = null;
        if (z) {
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                frameLayout.setBackground(null);
            }
            LinearLayout linearLayout = this.m;
            if (linearLayout == null) {
                q.b("tabContainer");
                throw null;
            }
            linearLayout.setBackgroundDrawable(this.q);
            for (View view : this.e) {
                TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.iv_tab_icon);
                if (tUrlImageView != null) {
                    JSONArray jSONArray = this.k;
                    if (jSONArray != null) {
                        Object tag = view.getTag();
                        if (tag == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                        JSONObject jSONObject2 = jSONArray.getJSONObject(((Integer) tag).intValue());
                        if (jSONObject2 != null) {
                            string2 = jSONObject2.getString("defaultPic4Darkmode");
                            tUrlImageView.setImageUrl(string2);
                        }
                    }
                    string2 = null;
                    tUrlImageView.setImageUrl(string2);
                }
                TextView textView = (TextView) view.findViewById(R.id.tv_tab_text);
                if (textView != null) {
                    textView.setTextColor(-1);
                    view.setContentDescription(((Object) textView.getText()) + " 按钮");
                }
            }
        } else {
            FrameLayout frameLayout2 = this.c;
            if (frameLayout2 != null) {
                o.a(frameLayout2, this.s);
            }
            LinearLayout linearLayout2 = this.m;
            if (linearLayout2 == null) {
                q.b("tabContainer");
                throw null;
            }
            linearLayout2.setBackgroundDrawable(this.r);
            for (View view2 : this.e) {
                TUrlImageView tUrlImageView2 = (TUrlImageView) view2.findViewById(R.id.iv_tab_icon);
                if (tUrlImageView2 != null) {
                    JSONArray jSONArray2 = this.k;
                    if (jSONArray2 != null) {
                        Object tag2 = view2.getTag();
                        if (tag2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(((Integer) tag2).intValue());
                        if (jSONObject3 != null) {
                            string = jSONObject3.getString("defaultPic");
                            tUrlImageView2.setImageUrl(string);
                        }
                    }
                    string = null;
                    tUrlImageView2.setImageUrl(string);
                }
                TextView textView2 = (TextView) view2.findViewById(R.id.tv_tab_text);
                if (textView2 != null) {
                    textView2.setTextColor(KAPContainerView.DEFAULT_MENU_COLOR);
                    view2.setContentDescription(((Object) textView2.getText()) + " 按钮");
                }
            }
        }
        TUrlImageView tUrlImageView3 = (TUrlImageView) this.e.get(0).findViewById(R.id.shop_bottom_nav_bar_tab_item_hover_flag_img);
        if (tUrlImageView3 == null) {
            return;
        }
        JSONArray jSONArray3 = this.k;
        if (jSONArray3 != null && (jSONObject = jSONArray3.getJSONObject(0)) != null) {
            str = jSONObject.getString("superscriptDefaultPic");
        }
        tUrlImageView3.setImageUrl(str);
    }

    private final void c(int i) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        View view = (View) p.a((List<? extends Object>) this.e, i);
        if (view == null || (jSONArray = this.k) == null || (jSONObject = jSONArray.getJSONObject(i)) == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_tab_text);
        if (this.v) {
            TUrlImageView tUrlImageView2 = (TUrlImageView) view.findViewById(R.id.iv_tab_icon);
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(jSONObject.getString("defaultPic4Darkmode"));
            }
            if (textView != null) {
                textView.setTextColor(-1);
            }
        } else {
            TUrlImageView tUrlImageView3 = (TUrlImageView) view.findViewById(R.id.iv_tab_icon);
            if (tUrlImageView3 != null) {
                tUrlImageView3.setImageUrl(jSONObject.getString("defaultPic"));
            }
            if (textView != null) {
                textView.setTextColor(KAPContainerView.DEFAULT_MENU_COLOR);
            }
        }
        if (i == 0 && (tUrlImageView = (TUrlImageView) view.findViewById(R.id.shop_bottom_nav_bar_tab_item_hover_flag_img)) != null) {
            tUrlImageView.setImageUrl(jSONObject.getString("superscriptDefaultPic"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) (textView == null ? null : textView.getText()));
        sb.append(" 按钮");
        view.setContentDescription(sb.toString());
    }

    private final void d(int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        View view = (View) p.a((List<? extends Object>) this.e, i);
        if (view == null) {
            return;
        }
        String str = null;
        if (i == 0) {
            JSONArray jSONArray = this.k;
            String string = (jSONArray == null || (jSONObject3 = jSONArray.getJSONObject(i)) == null) ? null : jSONObject3.getString("superscriptSelectedPic");
            TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.shop_bottom_nav_bar_tab_item_hover_flag_img);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(string);
            }
        }
        JSONArray jSONArray2 = this.k;
        String string2 = (jSONArray2 == null || (jSONObject = jSONArray2.getJSONObject(i)) == null) ? null : jSONObject.getString("selectedPic");
        String str2 = string2;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        if (z) {
            JSONArray jSONArray3 = this.k;
            if (jSONArray3 != null && (jSONObject2 = jSONArray3.getJSONObject(i)) != null) {
                str = jSONObject2.getString("selectedPic4Darkmode");
            }
            string2 = str;
        }
        TUrlImageView tUrlImageView2 = (TUrlImageView) view.findViewById(R.id.iv_tab_icon);
        if (tUrlImageView2 != null) {
            tUrlImageView2.setImageUrl(string2);
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_tab_text);
        if (textView == null) {
            return;
        }
        textView.setTextColor(-49664);
        view.setContentDescription(((Object) textView.getText()) + " 已选中 按钮");
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (!this.B) {
        } else {
            float f2 = (i + f) - this.A;
            if (f2 > 0.0f) {
                if (this.y == this.z) {
                    View view = this.n;
                    if (view == null) {
                        q.b("slide");
                        throw null;
                    }
                    view.setX(this.h + ((this.x + f2) * this.o));
                    g();
                    a(f2);
                    return;
                }
                h();
            } else if (f2 >= 0.0f) {
            } else {
                if (this.y == 0) {
                    View view2 = this.n;
                    if (view2 == null) {
                        q.b("slide");
                        throw null;
                    }
                    view2.setX(this.h + ((this.x + f2) * this.o));
                    g();
                    a(f2);
                    return;
                }
                h();
            }
        }
    }

    private final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (f > 0.2f) {
            if (this.x >= this.e.size() - 1) {
                return;
            }
            d(this.x + 1);
        } else if (f > 0.0f) {
            if (this.x >= this.e.size() - 1) {
                return;
            }
            c(this.x + 1);
        } else if (f > -0.2f) {
            int i = this.x;
            if (i <= 0) {
                return;
            }
            c(i - 1);
        } else {
            int i2 = this.x;
            if (i2 <= 0) {
                return;
            }
            d(i2 - 1);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        this.w = i;
        a(this.b.i(i));
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.B = false;
            h();
        } else if (i != 1) {
        } else {
            this.B = true;
            this.x = this.i;
            this.y = this.j;
            JSONArray jSONArray = this.l;
            if (jSONArray != null) {
                i2 = jSONArray.size();
            }
            this.z = i2 - 1;
            this.A = this.w;
        }
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.p) {
        } else {
            this.p = true;
            View view = this.n;
            if (view == null) {
                q.b("slide");
                throw null;
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.n.a(view, 1.0f, 100L, (Animator.AnimatorListener) null, 4, (Object) null).start();
            }
        }
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        View view = this.n;
        if (view == null) {
            q.b("slide");
            throw null;
        }
        if (view.getAlpha() != 1.0f) {
            z = false;
        }
        if (z) {
            View view2 = this.n;
            if (view2 == null) {
                q.b("slide");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.n.a(view2, 0.0f, 100L, (Animator.AnimatorListener) null, 4, (Object) null).start();
        }
        this.p = false;
    }

    public final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ceg.Companion.c("hhh switchTabBySwipe");
        this.i = i;
        this.j = i2;
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25061e5", new Object[]{aVar, str, str2, map, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        aVar.a(str, str2, map);
    }

    private final void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.m.a(ShopConstants.PAGE_SHOP, str, a(str2, map));
        }
    }

    public static /* synthetic */ void b(a aVar, String str, String str2, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60f51e6", new Object[]{aVar, str, str2, map, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        aVar.b(str, str2, map);
    }

    private final void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.m.b(ShopConstants.PAGE_SHOP, str, a(str2, map));
        }
    }

    private final HashMap<String, String> a(String str, Map<String, String> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6589bb6", new Object[]{this, str, map});
        }
        HashMap<String, String> J = this.b.J();
        HashMap<String, String> hashMap = J;
        hashMap.put("shop_id", this.b.T());
        hashMap.put("seller_id", this.b.U());
        hashMap.put("identityCode", this.b.ba());
        JSONObject jSONObject2 = this.D;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject(q.a("behaviorSequencePayload_", (Object) str))) != null) {
            hashMap.put("behaviorSquencePayload", jSONObject.toJSONString());
            hashMap.put("bubble_click", q.a((Object) jSONObject.getString("type"), (Object) "bubbleText") ? "true" : "");
        }
        if (map != null) {
            J.putAll(map);
        }
        return J;
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        FrameLayout.LayoutParams layoutParams = null;
        ceg.Companion.c(q.a("hhh tab3 ", (Object) (jSONObject == null ? null : jSONObject.toJSONString())));
        if (this.i == 2 || ((View) p.a((List<? extends Object>) this.e, 2)) == null) {
            return;
        }
        this.D = jSONObject;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("behaviorSequencePayload_livebar")) == null) {
            return;
        }
        FrameLayout frameLayout = this.d;
        com.alibaba.triver.triver_shop.shop2023.nativeview.d dVar = this.C;
        frameLayout.removeView(dVar == null ? null : dVar.a());
        View view = (View) p.a((List<? extends Object>) this.e, 2);
        if (view != null) {
            o.b(view);
        }
        if (!q.a((Object) jSONObject2.getString("type"), (Object) "heterotype")) {
            return;
        }
        View view2 = (View) p.a((List<? extends Object>) this.e, 2);
        if (view2 != null) {
            o.d(view2);
        }
        this.C = new com.alibaba.triver.triver_shop.shop2023.nativeview.d(a(), jSONObject);
        FrameLayout frameLayout2 = this.d;
        com.alibaba.triver.triver_shop.shop2023.nativeview.d dVar2 = this.C;
        q.a(dVar2);
        Tab3AnimationIcon a2 = dVar2.a();
        ViewGroup.LayoutParams layoutParams2 = a2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            a2.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar = t.INSTANCE;
            a2.setLayoutParams(marginLayoutParams);
        }
        final Tab3AnimationIcon tab3AnimationIcon = a2;
        tab3AnimationIcon.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023BottomBarNativeComponent$refreshWidgetData$1$1$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                    return;
                }
                a.this.f();
                JSONArray h = a.h(a.this);
                String str = null;
                Object obj = h == null ? null : h.get(2);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                JSONObject jSONObject3 = ((JSONObject) obj).getJSONObject("userTrackInfo");
                a aVar = a.this;
                if (jSONObject3 != null) {
                    str = jSONObject3.getString("clkUtArg1");
                }
                a.a(aVar, str, "livebar", null, 4, null);
                a.b(a.this, 2);
                rul<Integer, t> c2 = a.this.c();
                if (c2 == null) {
                    return;
                }
                c2.mo2421invoke(2);
            }
        });
        Tab3AnimationIcon tab3AnimationIcon2 = tab3AnimationIcon;
        ViewGroup.LayoutParams layoutParams3 = tab3AnimationIcon2.getLayoutParams();
        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams3;
        }
        if (layoutParams != null) {
            tab3AnimationIcon.setZ(o.d((Number) 11));
            layoutParams.gravity = 1;
        } else {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            tab3AnimationIcon.setZ(o.d((Number) 11));
            layoutParams4.gravity = 1;
            t tVar2 = t.INSTANCE;
            tab3AnimationIcon2.setLayoutParams(layoutParams4);
        }
        tab3AnimationIcon.post(new Runnable() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023BottomBarNativeComponent$refreshWidgetData$1$1$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Tab3AnimationIcon tab3AnimationIcon3 = Tab3AnimationIcon.this;
                a aVar = this;
                ViewGroup.LayoutParams layoutParams5 = tab3AnimationIcon3.getLayoutParams();
                FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    int d2 = o.d((Number) 114);
                    d i = a.i(aVar);
                    q.a(i);
                    layoutParams6.topMargin = (d2 - i.a().getHeight()) / 2;
                    return;
                }
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
                int d3 = o.d((Number) 114);
                d i2 = a.i(aVar);
                q.a(i2);
                layoutParams7.topMargin = (d3 - i2.a().getHeight()) / 2;
                t tVar3 = t.INSTANCE;
                tab3AnimationIcon3.setLayoutParams(layoutParams7);
            }
        });
        frameLayout2.addView(a2);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.d;
        com.alibaba.triver.triver_shop.shop2023.nativeview.d dVar = this.C;
        frameLayout.removeView(dVar == null ? null : dVar.a());
        View view = (View) p.a((List<? extends Object>) this.e, 2);
        if (view == null) {
            return;
        }
        o.b(view);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            FrameLayout frameLayout = this.c;
            if (frameLayout == null) {
                return;
            }
            o.d(frameLayout);
        } else {
            FrameLayout frameLayout2 = this.c;
            if (frameLayout2 == null) {
                return;
            }
            o.b(frameLayout2);
        }
    }
}
