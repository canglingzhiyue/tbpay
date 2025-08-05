package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes3.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4123a;
    private String b;
    private String c;
    private View d;
    private String e;
    private final int f;
    private boolean g;

    static {
        kge.a(716731182);
    }

    public h() {
        this(0, 1, null);
    }

    public h(int i) {
        this.f = i;
        this.f4123a = "";
        this.b = "";
        this.e = "";
        this.c = "掌柜原因需要离开";
    }

    public /* synthetic */ h(int i, int i2, o oVar) {
        this((i2 & 1) != 0 ? com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 170) : i);
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f;
    }

    public final View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.d;
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.d = view;
        }
    }

    public final void a(JSONObject jSONObject, ViewGroup container) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1f8fc7", new Object[]{this, jSONObject, container});
            return;
        }
        q.d(container, "container");
        if (jSONObject == null) {
            return;
        }
        int intValue = jSONObject.getIntValue("status");
        this.c = com.alibaba.triver.triver_shop.newShop.ext.d.c(jSONObject, "tips");
        this.f4123a = com.alibaba.triver.triver_shop.newShop.ext.d.c(jSONObject, "startTime");
        this.b = com.alibaba.triver.triver_shop.newShop.ext.d.c(jSONObject, "endTime");
        this.e = com.alibaba.triver.triver_shop.newShop.ext.d.c(jSONObject, "closeTime");
        String str = this.e;
        if (str == null || n.a((CharSequence) str)) {
            z = true;
        }
        if (z) {
            this.e = "打烊时间：" + this.f4123a + " ~ " + this.b;
        }
        if (n.a((CharSequence) this.f4123a) && n.a((CharSequence) this.b)) {
            this.g = true;
        }
        if (intValue != 1) {
            return;
        }
        a(container);
    }

    public final void a(ViewGroup container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, container});
            return;
        }
        q.d(container, "container");
        LinearLayout linearLayout = new LinearLayout(container.getContext());
        LinearLayout linearLayout2 = linearLayout;
        ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            linearLayout2.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar = t.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams);
        }
        a((View) linearLayout2);
        ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.width = -1;
            layoutParams3.height = this.g ? -2 : com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 106);
            layoutParams3.leftMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 24);
            layoutParams3.rightMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 24);
            layoutParams3.bottomMargin = b();
            layoutParams3.gravity = 80;
        } else {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.width = -1;
            layoutParams4.height = this.g ? -2 : com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 106);
            layoutParams4.leftMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 24);
            layoutParams4.rightMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 24);
            layoutParams4.bottomMargin = b();
            layoutParams4.gravity = 80;
            t tVar2 = t.INSTANCE;
            linearLayout2.setLayoutParams(layoutParams4);
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.a((View) linearLayout2, true, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 70));
        linearLayout.setBackgroundColor(-135486);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        LinearLayout linearLayout3 = linearLayout;
        TextView textView = new TextView(linearLayout3.getContext());
        TextView textView2 = textView;
        ViewGroup.LayoutParams layoutParams5 = textView2.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            textView2.setLayoutParams(layoutParams5);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar3 = t.INSTANCE;
            textView2.setLayoutParams(marginLayoutParams2);
        }
        ViewGroup.LayoutParams layoutParams6 = textView2.getLayoutParams();
        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6;
            if (this.g) {
                marginLayoutParams3.topMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
                marginLayoutParams3.bottomMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
            } else {
                marginLayoutParams3.topMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 14);
            }
            textView2.setLayoutParams(layoutParams6);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            if (this.g) {
                marginLayoutParams4.topMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
                marginLayoutParams4.bottomMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 30);
            } else {
                marginLayoutParams4.topMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 14);
            }
            t tVar4 = t.INSTANCE;
            textView2.setLayoutParams(marginLayoutParams4);
        }
        textView.setText(this.c);
        textView.setSingleLine();
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        com.alibaba.triver.triver_shop.newShop.ext.o.a(textView, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 26));
        textView.setTextColor(-3037881);
        linearLayout3.addView(textView2);
        t tVar5 = t.INSTANCE;
        if (!this.g) {
            TextView textView3 = new TextView(linearLayout3.getContext());
            TextView textView4 = textView3;
            ViewGroup.LayoutParams layoutParams7 = textView4.getLayoutParams();
            if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                textView4.setLayoutParams(layoutParams7);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-2, -2);
                t tVar6 = t.INSTANCE;
                textView4.setLayoutParams(marginLayoutParams5);
            }
            ViewGroup.LayoutParams layoutParams8 = textView4.getLayoutParams();
            if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 6);
                textView4.setLayoutParams(layoutParams8);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams6.topMargin = com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 6);
                t tVar7 = t.INSTANCE;
                textView4.setLayoutParams(marginLayoutParams6);
            }
            textView3.setText(this.e);
            textView3.setSingleLine();
            com.alibaba.triver.triver_shop.newShop.ext.o.a(textView3, com.alibaba.triver.triver_shop.newShop.ext.o.d((Number) 24));
            textView3.setTextColor(-3037881);
            linearLayout3.addView(textView4);
            t tVar8 = t.INSTANCE;
        }
        container.addView(linearLayout2);
        t tVar9 = t.INSTANCE;
    }
}
