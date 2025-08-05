package com.taobao.android.purchase.aura.helper;

import android.content.Context;
import android.content.Intent;
import com.alipay.android.app.pay.PayTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.utils.e;
import tb.arc;
import tb.ard;
import tb.bbh;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2087222872);
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            bbh.a(new Runnable() { // from class: com.taobao.android.purchase.aura.helper.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setAction("com.alipay.phonecashier.prepay");
                    intent.setPackage("com.taobao.taobao");
                    context.sendBroadcast(intent);
                }
            });
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            com.taobao.taobao.internal.helper.b.a(context);
        }
    }

    public static void c(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else if (!e.i()) {
        } else {
            arc.a().a("preGetCupDirectApps");
            bbh.a(new Runnable() { // from class: com.taobao.android.purchase.aura.helper.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PayTask.getCupDirectApps(context, new PayTask.CupDirectAppsCallback() { // from class: com.taobao.android.purchase.aura.helper.a.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.app.pay.PayTask.CupDirectAppsCallback
                            public void onResult(boolean z) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("f9b609d1", new Object[]{this, new Boolean(z)});
                                    return;
                                }
                                ard a2 = arc.a();
                                a2.a("getCupDirectApps result = " + z);
                            }
                        });
                    }
                }
            });
        }
    }

    public static String a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6033d0ac", new Object[]{context, new Boolean(z)}) : com.taobao.taobao.internal.helper.b.a(context, z);
    }
}
