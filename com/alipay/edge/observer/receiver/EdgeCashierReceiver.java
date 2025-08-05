package com.alipay.edge.observer.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.cjv;
import tb.ckb;
import tb.cke;
import tb.clc;
import tb.clh;
import tb.cli;
import tb.clj;
import tb.ndw;

/* loaded from: classes3.dex */
public class EdgeCashierReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f5277a = false;
    private static volatile EdgeCashierReceiver b;

    private EdgeCashierReceiver() {
    }

    public static EdgeCashierReceiver a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EdgeCashierReceiver) ipChange.ipc$dispatch("916200c6", new Object[0]);
        }
        if (b == null) {
            synchronized (EdgeCashierReceiver.class) {
                if (b == null) {
                    b = new EdgeCashierReceiver();
                }
            }
        }
        return b;
    }

    public static /* synthetic */ cli a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cli) ipChange.ipc$dispatch("83795ffc", new Object[]{context, str});
        }
        cli cliVar = new cli();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ndw.SP_PREFIX_KEY);
        cliVar.j = APSecuritySdk.getInstance(context).getTokenResult().apdid;
        cliVar.i = APSecuritySdk.getInstance(context).getTokenResult().apdidToken;
        ckb.a();
        cliVar.d = ckb.a(context);
        cliVar.c = context.getPackageName();
        cke.a();
        cliVar.g = cke.f();
        cke.a();
        cliVar.h = cke.k();
        cliVar.f = "android";
        cliVar.e = "3.5.0.20240702";
        cliVar.b = str;
        cliVar.l = cjv.a(context);
        cliVar.f26349a = arrayList;
        cliVar.k = clc.d();
        return cliVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        String a2 = clj.a().a("proactive_on", "false");
        if (!"KEnterMiniPayViewNotification".equals(action) || !"true".equals(a2)) {
            return;
        }
        new Thread(new Runnable() { // from class: com.alipay.edge.observer.receiver.EdgeCashierReceiver.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    cli a3 = EdgeCashierReceiver.a(applicationContext, "proactive_enter");
                    clh.a();
                    clh.a(applicationContext, a3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "APSecuritySdk").start();
    }
}
