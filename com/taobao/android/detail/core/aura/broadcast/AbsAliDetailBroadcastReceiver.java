package com.taobao.android.detail.core.aura.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.alibaba.android.aura.AURAGlobalData;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dxu;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsAliDetailBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(585329278);
    }

    public abstract void a(AURAGlobalData aURAGlobalData);

    public AbsAliDetailBroadcastReceiver(Context context, dxu dxuVar) {
    }
}
