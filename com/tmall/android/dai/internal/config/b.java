package com.tmall.android.dai.internal.config;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.walle.bridge.CppApiBridge;
import tb.kge;
import tb.rkq;
import tb.rle;

/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-989171968);
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e8bd4a", new Object[]{bVar});
        } else {
            bVar.b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c.a().b();
        if (a.a().c()) {
            a.a().e();
        }
        rle.a().b();
        CppApiBridge.a().a("onMrtAvaliable", null);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (com.taobao.mrt.c.a()) {
            com.taobao.mrt.utils.a.a("ConfigServiceImpl", "DAI.MRT is availabel!!!, get config from orange!");
            b();
        } else {
            LocalBroadcastManager.getInstance(rkq.d().e()).registerReceiver(new BroadcastReceiver() { // from class: com.tmall.android.dai.internal.config.ConfigServiceImpl$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    com.taobao.mrt.utils.a.a("ConfigServiceImpl", "DAI.MRT broadcast coming!!!, get config from orange!");
                    com.tmall.android.dai.internal.util.b.b().a().execute(new Runnable() { // from class: com.tmall.android.dai.internal.config.ConfigServiceImpl$1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!com.taobao.mrt.c.a()) {
                            } else {
                                b.a(b.this);
                            }
                        }
                    });
                }
            }, new IntentFilter(com.taobao.mrt.c.ACTION_MRT_STATE));
        }
    }
}
