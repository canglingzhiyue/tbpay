package com.taobao.android.detail.core.utils;

import android.content.Context;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import tb.bax;
import tb.emu;
import tb.fgo;
import tb.kge;
import tb.nyf;

/* loaded from: classes4.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1062645433);
        emu.a("com.taobao.android.detail.core.utils.VideoUtils");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a(Globals.getApplication()) && b();
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            nyf nyfVar = (nyf) AliAdaptServiceManager.getInstance().findAliAdaptService(nyf.class);
            if (nyfVar != null) {
                return nyfVar.isAutoPlayVideoUnderCurrentNetwork(context);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (!c()) {
            return false;
        }
        boolean z = bax.a().f25741a == 1;
        String a2 = com.taobao.android.detail.core.performance.a.a("VideoUtils");
        i.c(a2, "是否低端机=" + z);
        if (!z) {
            return true;
        }
        if (d()) {
            i.c(com.taobao.android.detail.core.performance.a.a("VideoUtils"), "命中，低端机头图视频默认不播放");
            return false;
        }
        i.c(com.taobao.android.detail.core.performance.a.a("VideoUtils"), "未命中，低端机头图视频默认播放");
        return com.taobao.android.detail.core.aura.utils.f.p();
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_detail", fgo.ENABLE_VIDEO_AUTO_PLAY, "true"));
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_detail", "not_auto_play_video_low_device", "true"));
    }
}
