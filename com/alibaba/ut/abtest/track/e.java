package com.alibaba.ut.abtest.track;

import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.l;
import tb.kge;

/* loaded from: classes.dex */
public class e extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1552030008);
    }

    @Override // com.alibaba.ut.abtest.track.d
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "TrackUTPluginV2";
    }

    @Override // com.ut.mini.module.plugin.a
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this}) : "Yixiu";
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            e eVar = new e();
            UTAnalytics.getInstance().registerPlugin(eVar);
            l.addPageChangerListener(eVar);
            return true;
        } catch (Throwable th) {
            h.c("TrackUTPluginV2", "UT插件注册失败", th);
            return false;
        }
    }
}
