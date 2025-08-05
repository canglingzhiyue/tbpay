package com.taobao.agoo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.a;
import com.taobao.accs.utl.ALog;
import tb.dcd;
import tb.kge;

/* loaded from: classes4.dex */
public class AgooCommondReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-969268852);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else {
            a.a(new Runnable() { // from class: com.taobao.agoo.AgooCommondReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String a2 = com.taobao.accs.client.a.a(context.getPackageName());
                        intent.setFlags(0);
                        intent.setClassName(context, a2);
                        dcd.a(context, intent);
                    } catch (Throwable th) {
                        ALog.e("AgooCommondReceiver", "onReceive error", th, new Object[0]);
                    }
                }
            });
        }
    }
}
