package com.alibaba.triver.triver_shop.newShop.view.embed;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f3968a;
    private final c b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    private int g;
    private final LinearLayout h;
    private final View i;
    private final TextView j;
    private final TUrlImageView k;
    private final ArrayList<View> l;
    private int m;

    static {
        kge.a(2122434925);
    }

    public a(d shopData, c swipeBigCardComponent) {
        TUrlImageView tUrlImageView;
        q.d(shopData, "shopData");
        q.d(swipeBigCardComponent, "swipeBigCardComponent");
        this.f3968a = shopData;
        this.b = swipeBigCardComponent;
        this.c = o.a(Double.valueOf(1.5d));
        this.d = Color.parseColor("#999999");
        this.e = Color.parseColor("#d8d8d8");
        this.f = this.f3968a.ac();
        JSONArray aT = this.f3968a.aT();
        this.g = aT == null ? 0 : aT.size();
        LinearLayout linearLayout = new LinearLayout(this.f3968a.am());
        linearLayout.setClickable(false);
        t tVar = t.INSTANCE;
        this.h = linearLayout;
        Context am = this.f3968a.am();
        TUrlImageView tUrlImageView2 = null;
        this.i = am == null ? null : o.a(am, R.layout.view_indicator_tips);
        View view = this.i;
        this.j = view == null ? null : (TextView) view.findViewById(R.id.view_indicator_tips_text);
        View view2 = this.i;
        if (view2 != null && (tUrlImageView = (TUrlImageView) view2.findViewById(R.id.view_indicator_right_arrow)) != null) {
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN010yWKey1fzlxyAe11c_!!6000000004078-2-tps-22-16.png");
            t tVar2 = t.INSTANCE;
            tUrlImageView2 = tUrlImageView;
        }
        this.k = tUrlImageView2;
        this.l = new ArrayList<>();
        int i = this.g;
        if (i > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, this.c, 1.0f);
                View view3 = new View(this.h.getContext());
                view3.setLayoutParams(layoutParams);
                o.e(view3, this.c);
                o.f(view3, this.c);
                view3.setClickable(false);
                if (i2 == 0) {
                    view3.setBackgroundColor(this.e);
                } else {
                    view3.setBackgroundColor(this.d);
                }
                this.l.add(view3);
                this.h.addView(view3);
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
            }
        }
        if (this.g == 1) {
            o.e(this.h);
        }
        a(0);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f;
    }

    public final LinearLayout b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("e3daedc0", new Object[]{this}) : this.h;
    }

    public final View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.i;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == -1) {
            if (!this.f) {
                return;
            }
            i = 0;
        }
        b(i);
    }

    private final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator<View> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().setBackgroundColor(this.d);
        }
        if (i >= this.l.size()) {
            return;
        }
        this.l.get(i).setBackgroundColor(this.e);
        this.m = i;
        d();
    }

    private final void d() {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.m == this.l.size() - 1) {
            View view = this.i;
            if (view == null) {
                return;
            }
            o.e(view);
        } else {
            View view2 = this.i;
            if (view2 != null) {
                o.b(view2);
            }
            JSONArray aT = this.f3968a.aT();
            String str = null;
            if (aT != null && (b = com.alibaba.triver.triver_shop.newShop.ext.d.b(aT, this.m + 1)) != null) {
                str = b.getString("name");
            }
            TextView textView = this.j;
            if (textView == null) {
                return;
            }
            textView.setText(str);
        }
    }
}
