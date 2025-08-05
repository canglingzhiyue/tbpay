package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b;
    private int c;
    private View d;
    private View e;
    private TextView f;
    private TextView g;
    private View h;
    private ruk<t> i;

    /* renamed from: a  reason: collision with root package name */
    private final int f4125a = CollectionTabLayout.SELECTED_TEXT_COLOR;
    private final Drawable j = o.a(-1, null, null, o.d((Number) 44), 0, 0, 0, 0, o.d((Number) 1), o.a(0, 0.1f), 246, null);

    static {
        kge.a(-476827946);
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

    public final void a(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            this.i = rukVar;
        }
    }

    public final ruk<t> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("16bbe0f5", new Object[]{this}) : this.i;
    }

    public static /* synthetic */ void a(j jVar, ViewGroup viewGroup, int i, int i2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1128f5b2", new Object[]{jVar, viewGroup, new Integer(i), new Integer(i2), new Integer(i3), obj});
            return;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        jVar.a(viewGroup, i, i2);
    }

    public final void a(ViewGroup container, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75913347", new Object[]{this, container, new Integer(i), new Integer(i2)});
            return;
        }
        q.d(container, "container");
        Typeface typeface = Typeface.DEFAULT;
        try {
            typeface = Typeface.createFromAsset(container.getContext().getAssets(), "iconfonts/AlibabaSans102_v1_TaoBao-Md.ttf");
        } catch (Exception e) {
            e.printStackTrace();
        }
        FrameLayout frameLayout = new FrameLayout(container.getContext());
        FrameLayout frameLayout2 = frameLayout;
        a(frameLayout2);
        o.d(frameLayout2);
        frameLayout.setBackground(this.j);
        o.a((View) frameLayout2, true, o.d((Number) 44));
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = 85;
            layoutParams2.width = o.d((Number) 88);
            layoutParams2.height = o.d((Number) 88);
            layoutParams2.bottomMargin = i;
            layoutParams2.rightMargin = i2;
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 85;
            layoutParams3.width = o.d((Number) 88);
            layoutParams3.height = o.d((Number) 88);
            layoutParams3.bottomMargin = i;
            layoutParams3.rightMargin = i2;
            t tVar = t.INSTANCE;
            frameLayout2.setLayoutParams(layoutParams3);
        }
        FrameLayout frameLayout3 = frameLayout;
        TUrlImageView tUrlImageView = new TUrlImageView(frameLayout3.getContext());
        TUrlImageView tUrlImageView2 = tUrlImageView;
        ViewGroup.LayoutParams layoutParams4 = tUrlImageView2.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            tUrlImageView2.setLayoutParams(layoutParams4);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar2 = t.INSTANCE;
            tUrlImageView2.setLayoutParams(marginLayoutParams);
        }
        this.h = tUrlImageView2;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN014xWtcC1tHibJSEmE8_!!6000000005877-2-tps-36-36.png");
        int d = o.d((Number) 26);
        tUrlImageView.setPadding(d, d, d, d);
        ViewGroup.LayoutParams layoutParams5 = tUrlImageView2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            layoutParams6.gravity = 17;
            layoutParams6.width = -1;
            layoutParams6.height = -1;
        } else {
            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams7.gravity = 17;
            layoutParams7.width = -1;
            layoutParams7.height = -1;
            t tVar3 = t.INSTANCE;
            tUrlImageView2.setLayoutParams(layoutParams7);
        }
        tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.CountIconComponent$attachTo$1$2$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ruk<t> b = j.this.b();
                if (b == null) {
                    return;
                }
                b.mo2427invoke();
            }
        });
        frameLayout3.addView(tUrlImageView2);
        t tVar4 = t.INSTANCE;
        LinearLayout linearLayout = new LinearLayout(frameLayout3.getContext());
        LinearLayout linearLayout2 = linearLayout;
        ViewGroup.LayoutParams layoutParams8 = linearLayout2.getLayoutParams();
        if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout2.setLayoutParams(layoutParams8);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar5 = t.INSTANCE;
            linearLayout2.setLayoutParams(marginLayoutParams2);
        }
        this.e = linearLayout2;
        o.d(linearLayout2);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        ViewGroup.LayoutParams layoutParams9 = linearLayout2.getLayoutParams();
        FrameLayout.LayoutParams layoutParams10 = layoutParams9 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams9 : null;
        if (layoutParams10 != null) {
            layoutParams10.gravity = 17;
        } else {
            FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams11.gravity = 17;
            t tVar6 = t.INSTANCE;
            linearLayout2.setLayoutParams(layoutParams11);
        }
        LinearLayout linearLayout3 = linearLayout;
        TextView textView = new TextView(linearLayout3.getContext());
        TextView textView2 = textView;
        ViewGroup.LayoutParams layoutParams12 = textView2.getLayoutParams();
        if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
            textView2.setLayoutParams(layoutParams12);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar7 = t.INSTANCE;
            textView2.setLayoutParams(marginLayoutParams3);
        }
        this.f = textView;
        textView.setSingleLine();
        textView.setText(String.valueOf(this.b));
        o.a(textView, o.d((Number) 24));
        textView.setTextColor(this.f4125a);
        textView.setTypeface(typeface);
        textView.setLetterSpacing(0.06f);
        linearLayout3.addView(textView2);
        t tVar8 = t.INSTANCE;
        View view = new View(linearLayout.getContext());
        ViewGroup.LayoutParams layoutParams13 = view.getLayoutParams();
        if (layoutParams13 instanceof ViewGroup.MarginLayoutParams) {
            view.setLayoutParams(layoutParams13);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar9 = t.INSTANCE;
            view.setLayoutParams(marginLayoutParams4);
        }
        ViewGroup.LayoutParams layoutParams14 = view.getLayoutParams();
        LinearLayout.LayoutParams layoutParams15 = layoutParams14 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams14 : null;
        if (layoutParams15 != null) {
            layoutParams15.width = o.d((Number) 56);
            layoutParams15.height = o.d(Double.valueOf(2.4d));
            layoutParams15.topMargin = o.d((Number) 4);
            layoutParams15.bottomMargin = o.d((Number) 6);
        } else {
            LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams16.width = o.d((Number) 56);
            layoutParams16.height = o.d(Double.valueOf(2.4d));
            layoutParams16.topMargin = o.d((Number) 4);
            layoutParams16.bottomMargin = o.d((Number) 6);
            t tVar10 = t.INSTANCE;
            view.setLayoutParams(layoutParams16);
        }
        o.a(view, true, o.d((Number) 2));
        view.setBackgroundColor(this.f4125a);
        linearLayout3.addView(view);
        t tVar11 = t.INSTANCE;
        TextView textView3 = new TextView(linearLayout3.getContext());
        TextView textView4 = textView3;
        ViewGroup.LayoutParams layoutParams17 = textView4.getLayoutParams();
        if (layoutParams17 instanceof ViewGroup.MarginLayoutParams) {
            textView4.setLayoutParams(layoutParams17);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-2, -2);
            t tVar12 = t.INSTANCE;
            textView4.setLayoutParams(marginLayoutParams5);
        }
        this.g = textView3;
        textView3.setSingleLine();
        textView3.setText(String.valueOf(this.c));
        o.a(textView3, o.d((Number) 24));
        textView3.setTextColor(this.f4125a);
        textView3.setTypeface(typeface);
        textView3.setLetterSpacing(0.06f);
        linearLayout3.addView(textView4);
        t tVar13 = t.INSTANCE;
        frameLayout3.addView(linearLayout2);
        t tVar14 = t.INSTANCE;
        container.addView(frameLayout2);
        t tVar15 = t.INSTANCE;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        int i2 = this.c;
        if (i > i2) {
            TextView textView = this.f;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
            }
            e();
            return;
        }
        TextView textView2 = this.f;
        if (textView2 == null) {
            return;
        }
        textView2.setText(String.valueOf(this.b));
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        TextView textView = this.g;
        if (textView == null) {
            return;
        }
        textView.setText(String.valueOf(this.c));
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        View view = this.e;
        if (view != null) {
            o.d(view);
        }
        View view2 = this.h;
        if (view2 == null) {
            return;
        }
        o.b(view2);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c < this.b) {
            e();
        } else {
            View view = this.e;
            if (view != null) {
                o.b(view);
            }
            View view2 = this.h;
            if (view2 == null) {
                return;
            }
            o.d(view2);
        }
    }
}
