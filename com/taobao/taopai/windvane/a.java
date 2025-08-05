package com.taobao.taopai.windvane;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1989609593);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Windvane");
        uTCustomHitBuilder.setEventPage("TaoPaiSDK");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_ENTRY);
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG3, str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Windvane");
        uTCustomHitBuilder.setEventPage("TaoPaiSDK");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, "success");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG3, str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Windvane");
        uTCustomHitBuilder.setEventPage("TaoPaiSDK");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, "fail");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG3, str);
        uTCustomHitBuilder.setProperty(MUSAppMonitor.ERROR_MSG, str2);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }
}
