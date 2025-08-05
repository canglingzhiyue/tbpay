package com.taobao.accs.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.d;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class ACCSExceptionsReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1653733875);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        if (intent == null) {
            action = "";
        } else {
            try {
                action = intent.getAction();
            } catch (Throwable th) {
                ALog.e("ACCSExceptionsReceiver", "onReceive err", th, new Object[0]);
                return;
            }
        }
        d.a("accs", BaseMonitor.COUNT_EXCEPTIONS_RECEIVER, action, mto.a.GEO_NOT_SUPPORT);
    }
}
