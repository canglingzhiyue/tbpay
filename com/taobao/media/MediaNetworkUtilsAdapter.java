package com.taobao.media;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ddf;
import tb.kge;

/* loaded from: classes7.dex */
public class MediaNetworkUtilsAdapter implements ddf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(936961798);
        kge.a(905589270);
    }

    @Override // tb.ddf
    public String getNetworkStutas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b40e8c2f", new Object[]{this});
        }
        try {
            return NetworkStatusHelper.getStatus().getType();
        } catch (Throwable unused) {
            return "Unknown";
        }
    }

    @Override // tb.ddf
    public boolean isConnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue();
        }
        try {
            return NetworkStatusHelper.isConnected();
        } catch (Throwable unused) {
            return true;
        }
    }
}
