package com.etao.feimagesearch.regionedit;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DASH_WIDTH = 3.0f;
    public static final float DOT_INNER_RADIUS = 7.0f;
    public static final float DOT_OUTER_RADIUS = 12.0f;
    public static final float LENGTH = 17.0f;
    public static final float RADIUS = 4.0f;

    /* renamed from: a  reason: collision with root package name */
    private static final int f6966a;
    private static final int b;

    static {
        kge.a(-1730290222);
        f6966a = Color.parseColor("#BFBFBF");
        b = Color.parseColor("#111111");
    }

    public static final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : f6966a;
    }

    public static final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : b;
    }
}
