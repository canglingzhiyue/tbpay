package com.taobao.tao.recommend4.manager.weex2.container.drawer.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f20964a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;

    static {
        kge.a(-1273503016);
        f20964a = DensityUtil.dip2px(Globals.getApplication(), 30.0f);
        b = DensityUtil.dip2px(Globals.getApplication(), 40.0f);
        c = DensityUtil.dip2px(Globals.getApplication(), 6.0f);
        d = DensityUtil.dip2px(Globals.getApplication(), 3.0f);
        e = HomePageUtility.b(Globals.getApplication(), 12.0f);
    }

    public View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, f20964a));
        View view = new View(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#C1C1C1"));
        gradientDrawable.setCornerRadius(d);
        view.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b, c);
        layoutParams.gravity = 17;
        frameLayout.addView(view, layoutParams);
        return frameLayout;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#FFFFFF"), Color.parseColor("#F7F7F7")});
        gradientDrawable.setGradientType(0);
        int i = e;
        gradientDrawable.setCornerRadii(new float[]{i, i, i, i, 0.0f, 0.0f, 0.0f, 0.0f});
        view.setBackground(gradientDrawable);
    }
}
