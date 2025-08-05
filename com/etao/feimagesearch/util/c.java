package com.etao.feimagesearch.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import kotlin.jvm.JvmStatic;
import tb.cov;
import tb.kge;

/* loaded from: classes4.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    static {
        kge.a(1997929460);
        INSTANCE = new c();
    }

    private c() {
    }

    @JvmStatic
    public static final long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        kotlin.jvm.internal.q.c(context, "context");
        long aT = com.etao.feimagesearch.config.b.aT();
        if (!com.etao.feimagesearch.config.b.cQ()) {
            return aT;
        }
        if (com.etao.feimagesearch.config.b.aA() > 0) {
            return com.etao.feimagesearch.config.b.bY();
        }
        long cO = com.etao.feimagesearch.config.b.cO();
        if (!al.a(context)) {
            return cO;
        }
        long j = 1000;
        return System.currentTimeMillis() > (cov.a(com.etao.feimagesearch.album.g.a(), System.currentTimeMillis() / j) + ((long) ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) * j ? aT : cO;
    }
}
