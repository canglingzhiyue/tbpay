package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.ruw;

/* loaded from: classes3.dex */
public class c implements ViewPager.OnPageChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4100a;
    private final com.alibaba.triver.triver_shop.newShop.data.d b;
    private final ViewGroup c;
    private final LinearLayout d;
    private final ShopIndicatorView e;
    private int f;
    private int g;
    private final List<View> h;
    private ruw<? super Integer, ? super Integer, t> i;
    private int j;
    private JSONArray k;
    private boolean l;
    private int m;
    private final Drawable n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;

    /* loaded from: classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ JSONObject c;

        public a(JSONObject jSONObject, int i) {
            this.c = jSONObject;
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.m.a(c.this.b(), this.c.getString("utArg1"), (Map) null, 2, (Object) null);
            c.this.f(this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f4103a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ ValueAnimator d;

        public b(int i, int i2, c cVar, ValueAnimator valueAnimator) {
            this.c = i;
            this.b = i2;
            this.f4103a = cVar;
            this.d = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            if (this.c - this.b <= 0) {
                i = -1;
            }
            c cVar = this.f4103a;
            float f = i;
            Object animatedValue = this.d.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
            float floatValue = f * ((Float) animatedValue).floatValue();
            int i2 = this.b;
            c.a(cVar, floatValue, i2, Math.abs(this.c - i2));
        }
    }

    static {
        kge.a(633865655);
        kge.a(1848919473);
    }

    public c(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, int i) {
        q.d(context, "context");
        q.d(shopData, "shopData");
        this.f4100a = context;
        this.b = shopData;
        View a2 = o.a(this.f4100a, R.layout.shop_top_nar_bar_layout);
        if (a2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.c = (ViewGroup) a2;
        this.d = (LinearLayout) this.c.findViewById(R.id.ll_tab_container);
        this.e = (ShopIndicatorView) this.c.findViewById(R.id.indicator);
        this.f = this.b.p();
        this.h = new ArrayList();
        this.j = o.d((Number) 6);
        this.n = o.a(-1, null, null, 0, o.d((Number) 30), o.d((Number) 30), 0, 0, 0, 0, 974, null);
        ShopIndicatorView indicator = this.e;
        q.b(indicator, "indicator");
        o.b(indicator, o.d((Number) 50), o.d((Number) 4));
        ShopIndicatorView indicator2 = this.e;
        q.b(indicator2, "indicator");
        o.a((View) indicator2, true, o.d((Number) 4));
        ShopIndicatorView indicator3 = this.e;
        q.b(indicator3, "indicator");
        o.c(indicator3, (i / 2) + o.d((Number) 26));
        this.e.setOnLayoutListener(new Shop2023TopNavBarNativeComponent$1(this));
        this.k = d();
        int i2 = 0;
        int i3 = 0;
        for (Object obj : this.k) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p.b();
            }
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            a((JSONObject) obj, i3);
            i3 = i4;
        }
        Object obj2 = this.b.h(0).get("tabData");
        JSONArray jSONArray = obj2 instanceof JSONArray ? (JSONArray) obj2 : null;
        this.m = jSONArray != null ? jSONArray.size() : i2;
        this.c.post(new Runnable() { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c cVar = c.this;
                c.a(cVar, c.a(cVar));
            }
        });
        this.q = this.k.size() - 1;
    }

    public static final /* synthetic */ int a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7221b348", new Object[]{cVar})).intValue() : cVar.g;
    }

    public static final /* synthetic */ void a(c cVar, float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a157e8ab", new Object[]{cVar, new Float(f), new Integer(i), new Integer(i2)});
        } else {
            cVar.a(f, i, i2);
        }
    }

    public static final /* synthetic */ void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2152a4e", new Object[]{cVar, new Integer(i)});
        } else {
            cVar.b(i);
        }
    }

    public final com.alibaba.triver.triver_shop.newShop.data.d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("c5960a3a", new Object[]{this}) : this.b;
    }

    public final ViewGroup a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8c7138ad", new Object[]{this}) : this.c;
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final void a(ruw<? super Integer, ? super Integer, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, ruwVar});
        } else {
            this.i = ruwVar;
        }
    }

    public final ruw<Integer, Integer, t> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruw) ipChange.ipc$dispatch("1e6d87c8", new Object[]{this}) : this.i;
    }

    public JSONArray d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("38dcc9f3", new Object[]{this}) : this.b.bc().j();
    }

    private final void a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78e87b", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.m.b(this.b, jSONObject.getString("utArg1"), null, 2, null);
        View a2 = o.a(this.f4100a, R.layout.shop_top_nav_bar_tab);
        q.a(a2);
        TextView tvName = (TextView) a2.findViewById(R.id.tv_name);
        View dot = a2.findViewById(R.id.dot);
        q.b(tvName, "tvName");
        o.a(tvName, o.d((Number) 32));
        q.b(dot, "dot");
        o.b(dot, o.d((Number) 12), o.d((Number) 12));
        tvName.setText(jSONObject.getString("title"));
        tvName.setContentDescription(((Object) tvName.getText()) + " 按钮");
        if (i == this.g) {
            tvName.setTextColor(-44800);
            tvName.setTypeface(Typeface.DEFAULT_BOLD);
            tvName.setContentDescription(((Object) tvName.getText()) + " 已选中 按钮");
        }
        this.d.addView(a2);
        this.h.add(a2);
        if (this.k.size() > 4) {
            o.b(a2, o.d((Number) 118));
        } else {
            o.b(a2, o.d((Number) 130));
        }
        a2.setOnClickListener(new a(jSONObject, i));
    }

    public void f(int i) {
        ruw<? super Integer, ? super Integer, t> ruwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.f;
        if (i2 == 1) {
            ruw<? super Integer, ? super Integer, t> ruwVar2 = this.i;
            if (ruwVar2 == null) {
                return;
            }
            ruwVar2.mo2423invoke(Integer.valueOf(i2), Integer.valueOf(i - this.m));
        } else if (i2 != 0 || (ruwVar = this.i) == null) {
        } else {
            ruwVar.mo2423invoke(Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i > this.h.size() - 1) {
        } else {
            if (!this.s) {
                int i2 = this.g;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new b(i, i2, this, ofFloat));
                ofFloat.start();
            } else if (this.f >= 2) {
                b(i);
            }
            int i3 = this.g;
            if (i == i3) {
                return;
            }
            if (i3 < this.h.size()) {
                TextView textView = (TextView) this.h.get(this.g).findViewById(R.id.tv_name);
                textView.setTextColor(KAPContainerView.DEFAULT_MENU_COLOR);
                textView.setTypeface(Typeface.DEFAULT);
                textView.setContentDescription(((Object) textView.getText()) + " 按钮");
            }
            TextView textView2 = (TextView) this.h.get(i).findViewById(R.id.tv_name);
            textView2.setTextColor(-44800);
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            textView2.setContentDescription(((Object) textView2.getText()) + " 已选中 按钮");
            this.g = i;
        }
    }

    private final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.e.setLeft((int) d(i));
        this.e.setRight((int) c(i));
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (i < 2) {
            if (i == 1) {
                a(i2 + this.m);
            } else {
                a(i2);
            }
        }
        if (i <= 1) {
            c(this.c.getLeft());
        } else {
            c(this.c.getLeft() - this.c.getWidth());
        }
        this.f = i;
    }

    private final float c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44c9", new Object[]{this, new Integer(i)})).floatValue();
        }
        View view = (View) p.a((List<? extends Object>) this.h, i);
        if (view == null) {
            return 0.0f;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_name);
        return ((view.getRight() - ((view.getWidth() - textView.getPaint().measureText(textView.getText().toString())) / 2)) - this.j) + (this.d.getLeft() - ((int) this.e.getTranslationX()));
    }

    private final float d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401d68", new Object[]{this, new Integer(i)})).floatValue();
        }
        View view = (View) p.a((List<? extends Object>) this.h, i);
        if (view == null) {
            return 0.0f;
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_name);
        return view.getLeft() + ((view.getWidth() - textView.getPaint().measureText(textView.getText().toString())) / 2) + this.j + (this.d.getLeft() - ((int) this.e.getTranslationX()));
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (!this.s) {
        } else {
            a(this, (f + i) - this.r, this.p, 0, 4, null);
        }
    }

    private final double a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8218846", new Object[]{this, new Float(f)})).doubleValue();
        }
        double d = 1;
        return d - Math.pow(d - f, 1.4d);
    }

    private final double b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660e5", new Object[]{this, new Float(f)})).doubleValue() : Math.pow(f, 1.4d);
    }

    public static /* synthetic */ void a(c cVar, float f, int i, int i2, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d61194", new Object[]{cVar, new Float(f), new Integer(i), new Integer(i2), new Integer(i3), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveLine");
        } else {
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            cVar.a(f, i, i2);
        }
    }

    private final void a(float f, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ef32b8", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
        } else if (f > 0.0f) {
            if (i >= 0 && i < this.q) {
                z = true;
            }
            if (z) {
                float d = d(i);
                float c = c(i);
                int i4 = i + i2;
                this.e.setLeft((int) (d + (b(f) * (d(i4) - d))));
                this.e.setRight((int) (c + (a(f) * (c(i4) - c))));
                return;
            }
            c(this.c.getLeft() - (((i - this.q) + f) * this.c.getWidth()));
        } else {
            if (i > 0 && i <= this.q) {
                z = true;
            }
            if (z) {
                float d2 = d(i);
                float c2 = c(i);
                c(this.c.getLeft());
                float d3 = d(i - i2) - d2;
                double d4 = d2;
                float f2 = -f;
                this.e.setLeft((int) (d4 + (a(f2) * d3)));
                this.e.setRight((int) (c2 + (b(f2) * (c(i3) - c2))));
            }
            if (i <= this.q) {
                return;
            }
            c(this.c.getLeft() - (((i - this.q) + f) * this.c.getWidth()));
        }
    }

    public void c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
        } else {
            this.c.setX(f);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.s = false;
        } else if (i != 1) {
        } else {
            this.s = true;
            this.p = this.o;
            this.q = this.k.size() - 1;
            this.r = this.o;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.c.setBackgroundDrawable(this.n);
        } else if (this.f == 0) {
            if (this.t || this.l) {
                this.c.setBackgroundColor(-1);
            } else {
                this.c.setBackgroundDrawable(this.n);
            }
        } else {
            this.c.setBackgroundDrawable(this.n);
        }
    }
}
