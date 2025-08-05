package com.taobao.android.detail.ttdetail.widget;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static float f11033a;

    static {
        kge.a(632613658);
        f11033a = Resources.getSystem().getDisplayMetrics().density;
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) ((f * f11033a) + 0.5f);
    }
}
