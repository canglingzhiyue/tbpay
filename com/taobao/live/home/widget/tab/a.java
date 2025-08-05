package com.taobao.live.home.widget.tab;

import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f17773a;

    static {
        kge.a(735420498);
        f17773a = new FastOutSlowInInterpolator();
    }

    public static int a(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26196deb", new Object[]{new Integer(i), new Integer(i2), new Float(f)})).intValue() : i + Math.round(f * (i2 - i));
    }
}
