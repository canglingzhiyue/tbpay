package com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.impl.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ldf;
import tb.lme;

/* loaded from: classes7.dex */
public class TbAreaSwitchBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1345838269);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null || intent.getAction() == null) {
        } else {
            String action = intent.getAction();
            ldf.d("TbAreaSwitchBroadcastReceiver", "areaChangeReceiver : " + action);
            if (!StringUtils.equals(action, "EDITON_SWITCHER_EDITTION_CODE_CHANGED")) {
                return;
            }
            lme.a().b(context);
        }
    }
}
