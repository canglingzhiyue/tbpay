package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ldf;
import tb.lme;

/* loaded from: classes7.dex */
public class TbRevisionSwitchBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-76678603);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null || intent.getAction() == null) {
        } else {
            String action = intent.getAction();
            ldf.d("TbRevisionSwitchBroadcastReceiver", "revisionSwitchReceiver : " + action);
            lme.a().b(context);
        }
    }
}
