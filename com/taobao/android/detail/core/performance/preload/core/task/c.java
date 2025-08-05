package com.taobao.android.detail.core.performance.preload.core.task;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-520306309);
        emu.a("com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntityHelper");
    }

    public static String a(PreloadTaskEntity preloadTaskEntity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1173db56", new Object[]{preloadTaskEntity}) : preloadTaskEntity == null ? "" : preloadTaskEntity.sourceFrom;
    }

    public static String b(PreloadTaskEntity preloadTaskEntity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d9d1fff5", new Object[]{preloadTaskEntity}) : preloadTaskEntity == null ? "0" : preloadTaskEntity.getItemsSize();
    }

    public static String c(PreloadTaskEntity preloadTaskEntity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a2302494", new Object[]{preloadTaskEntity}) : preloadTaskEntity == null ? "" : preloadTaskEntity.getItemsId();
    }
}
