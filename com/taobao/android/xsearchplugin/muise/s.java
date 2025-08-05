package com.taobao.android.xsearchplugin.muise;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.q;
import tb.imo;
import tb.kge;

/* loaded from: classes6.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-775562096);
    }

    public static com.taobao.android.weex_framework.p a(Context context, com.taobao.android.xsearchplugin.weex.weex.h hVar, MUSInstanceConfig mUSInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.p) ipChange.ipc$dispatch("35320902", new Object[]{context, hVar, mUSInstanceConfig});
        }
        if (mUSInstanceConfig == null) {
            mUSInstanceConfig = new MUSInstanceConfig();
        }
        com.taobao.android.weex_framework.p a2 = q.a().a(context, mUSInstanceConfig);
        if ((context instanceof f) && ((f) context).g()) {
            a2.addInstanceEnv("darkMode", "true");
        }
        if (hVar != null) {
            a2.setTag(SFMuiseSDK.MUISE_EVENT_LISTENER, hVar);
        }
        if (context instanceof g) {
            ((g) context).a(a2);
        }
        if (imo.b() != null && imo.b().c().j().o) {
            a2.setTag("enableSlidePreciseExpose", "true");
        }
        ScreenType a3 = ScreenType.a(context);
        if (a3 != null) {
            a2.addInstanceEnv(com.etao.feimagesearch.p.KEY_SCREEN_STYLE, ScreenType.a(a3.a()));
        }
        return a2;
    }
}
