package com.android.dingtalk.share.ddsharemodule;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class DDShareApiFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-530463292);
    }

    public static IDDShareApi createDDShareApi(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDDShareApi) ipChange.ipc$dispatch("182fcc8c", new Object[]{context, str, new Boolean(z)}) : new DDShareApiV2(context, str, z);
    }
}
