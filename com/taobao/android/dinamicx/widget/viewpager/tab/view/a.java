package com.taobao.android.dinamicx.widget.viewpager.tab.view;

import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f12209a;
    public static final Interpolator b;
    public static final Interpolator c;
    public static final Interpolator d;
    public static final Interpolator e;

    static {
        kge.a(1656922068);
        f12209a = new LinearInterpolator();
        b = new FastOutSlowInInterpolator();
        c = new FastOutLinearInInterpolator();
        d = new LinearOutSlowInInterpolator();
        e = new DecelerateInterpolator();
    }

    public static int a(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26196deb", new Object[]{new Integer(i), new Integer(i2), new Float(f)})).intValue() : i + Math.round(f * (i2 - i));
    }
}
