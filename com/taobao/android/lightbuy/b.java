package com.taobao.android.lightbuy;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.afk;
import tb.arc;
import tb.bxf;
import tb.dui;
import tb.kge;
import tb.tdh;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-327870695);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        if (!(context instanceof FragmentActivity)) {
            arc.a().a("LightBuyDowngrade context not FragmentActivity!!");
        }
        arc.a().b("LightBuy downgrade ", arc.a.a().b("LightBuyDowngrade").a("LightBuy/downgrade").a("code", str).a("info", str2).b());
        afk.a(str, str2);
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        tdh.a("Degrade-Float-Native", dui.c(fragmentActivity.getIntent()));
        fragmentActivity.getIntent().putExtra("needNativeContainer", "true");
        bxf.a(fragmentActivity);
    }
}
