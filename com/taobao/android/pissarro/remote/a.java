package com.taobao.android.pissarro.remote;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.tao.util.NetWorkUtils;
import com.taobao.taolive.room.utils.ag;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1932918258);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("TpSoRemote");
        uTCustomHitBuilder.setEventPage("Tixel");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_ENTRY);
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG3, str);
        uTCustomHitBuilder.setProperty("network_state", NetWorkUtils.GetNetworkType(context));
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("TpSoRemote");
        uTCustomHitBuilder.setEventPage("Tixel");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, "InitError");
        uTCustomHitBuilder.setProperty("error_detail", str2);
        uTCustomHitBuilder.setProperty(MUSAppMonitor.ERROR_MSG, str);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("TpSoRemote");
        uTCustomHitBuilder.setEventPage("Tixel");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, "success");
        uTCustomHitBuilder.setProperty(ag.KEY_TAOKE_BIZSCENE, str);
        uTCustomHitBuilder.setProperty("time", String.valueOf(j));
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(String str, int i, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f14bdbf", new Object[]{str, new Integer(i), str2, str3, new Long(j)});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("TpSoRemote");
        uTCustomHitBuilder.setEventPage("Tixel");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, "fail");
        uTCustomHitBuilder.setProperty(ag.KEY_TAOKE_BIZSCENE, str);
        uTCustomHitBuilder.setProperty("status", String.valueOf(i));
        uTCustomHitBuilder.setProperty("time", String.valueOf(j));
        uTCustomHitBuilder.setProperty("error_code", str2);
        uTCustomHitBuilder.setProperty(MUSAppMonitor.ERROR_MSG, str3);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfaf3e", new Object[]{str, str2, str3, new Long(j)});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("TpSoRemote");
        uTCustomHitBuilder.setEventPage("Tixel");
        uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, str);
        uTCustomHitBuilder.setProperty(MUSAppMonitor.ERROR_MSG, str2);
        uTCustomHitBuilder.setProperty("error_detail", str3);
        uTCustomHitBuilder.setProperty("time", String.valueOf(j));
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }
}
