package com.taobao.orange.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.ConfigCenter;
import com.taobao.orange.e;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.a;
import tb.kge;

/* loaded from: classes.dex */
public class OrangeReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f18582a;

    static {
        kge.a(1595620495);
        f18582a = false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
        } else {
            e.a(new Runnable() { // from class: com.taobao.orange.receiver.OrangeReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.d(context)) {
                        OrangeReceiver.f18582a = false;
                    } else if (OrangeReceiver.f18582a) {
                    } else {
                        OrangeReceiver.f18582a = true;
                        OLog.i("OrangeReceiver", "onReceive network valid", new Object[0]);
                        ConfigCenter.getInstance().retryFailRequests();
                    }
                }
            });
        }
    }
}
