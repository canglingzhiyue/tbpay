package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gbg;
import tb.kge;

/* loaded from: classes8.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f20668a;

    static {
        kge.a(391116379);
        f20668a = com.taobao.homepage.utils.b.c() || com.taobao.homepage.utils.b.b();
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue();
        }
        if (!f20668a) {
            return gbg.b(context, f);
        }
        if (context instanceof Activity) {
            return gbg.a((Activity) context, f);
        }
        return gbg.b(context, f);
    }

    public static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue();
        }
        if (!f20668a) {
            return gbg.c(context, i);
        }
        if (context instanceof Activity) {
            return gbg.b((Activity) context, i);
        }
        return gbg.c(context, i);
    }
}
