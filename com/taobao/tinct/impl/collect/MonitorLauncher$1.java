package com.taobao.tinct.impl.collect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.qro;

/* loaded from: classes.dex */
public class MonitorLauncher$1 extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: lambda$F2oUBXuZ9nj7cV-U2xZ64qzA1Do */
    public static /* synthetic */ void m1536lambda$F2oUBXuZ9nj7cVU2xZ64qzA1Do(Intent intent) {
        a(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            qro.a().a(new Runnable() { // from class: com.taobao.tinct.impl.collect.-$$Lambda$MonitorLauncher$1$F2oUBXuZ9nj7cV-U2xZ64qzA1Do
                @Override // java.lang.Runnable
                public final void run() {
                    MonitorLauncher$1.m1536lambda$F2oUBXuZ9nj7cVU2xZ64qzA1Do(intent);
                }
            });
        }
    }

    public static /* synthetic */ void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
            return;
        }
        try {
            Thread.sleep(1000L);
            String stringExtra = intent.getStringExtra("namespace");
            String stringExtra2 = intent.getStringExtra("version");
            String.format("The orange %s is gray update to %s", stringExtra, stringExtra2);
            d.a(stringExtra, stringExtra2, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
