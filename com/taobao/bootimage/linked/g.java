package com.taobao.bootimage.linked;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.SplashInteractData;
import tb.kge;

/* loaded from: classes6.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1550515829);
    }

    public static SplashInteractData a(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplashInteractData) ipChange.ipc$dispatch("7aad5642", new Object[]{linkedSplashData});
        }
        if (linkedSplashData == null) {
            return null;
        }
        SplashInteractData splashInteractData = new SplashInteractData();
        splashInteractData.data = linkedSplashData.getData();
        splashInteractData.splash = linkedSplashData.getSplashObj();
        splashInteractData.traceId = linkedSplashData.getTraceId();
        splashInteractData.banner = linkedSplashData.getLinkedData(com.taobao.mmad.data.b.TYPE_BANNER);
        return splashInteractData;
    }
}
