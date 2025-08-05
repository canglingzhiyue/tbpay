package com.taobao.android.purchase.aura.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import tb.bbh;
import tb.kge;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f14756a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;

    static {
        kge.a(-401351956);
        f14756a = "/sre.buy.init_container";
        b = "/sre.buy.halfbuy_init_container";
        c = "/sre.buy.full_init_container";
        d = "/sre.buy.lightbuy_init_container";
        e = "/sre.buy.lightbuy_close_container";
        f = "/sre.buy.halfbuy_close_container";
    }

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            bbh.a(new Runnable() { // from class: com.taobao.android.purchase.aura.utils.k.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Order", 19997, str, null, null, null).build());
                    }
                }
            });
        }
    }
}
