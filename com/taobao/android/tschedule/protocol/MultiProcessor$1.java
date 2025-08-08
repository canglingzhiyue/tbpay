package com.taobao.android.tschedule.protocol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.e;
import tb.jkq;
import tb.jmi;

/* loaded from: classes6.dex */
public class MultiProcessor$1 extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        if (StringUtils.isEmpty(action)) {
            return;
        }
        jkq.a("TS.MultiProcessor", "onReceive, action=" + action + ", process=" + jmi.a());
        char c = 65535;
        if (action.hashCode() == -1323302162 && action.equals("com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        e.j().b();
    }
}
