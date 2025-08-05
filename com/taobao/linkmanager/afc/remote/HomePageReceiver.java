package com.taobao.linkmanager.afc.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.c;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.kog;

/* loaded from: classes.dex */
public class HomePageReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f17676a;
    private boolean b = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static HomePageReceiver f17677a;

        static {
            kge.a(-1611682134);
            f17677a = new HomePageReceiver();
        }
    }

    static {
        kge.a(785071494);
        f17676a = new AtomicBoolean(false);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        c.a("linkx", "HomePageReceiver === onReceive: context：" + context + ", action: " + intent.getAction() + ", reductEnable: " + this.b);
        if (Boolean.parseBoolean(kog.a().a("useHomePageBroadcastOnce", "true"))) {
            if (!f17676a.compareAndSet(false, true)) {
                return;
            }
            com.taobao.linkmanager.launcher.a.a(context, this.b);
            return;
        }
        com.taobao.linkmanager.launcher.a.a(context, this.b);
    }
}
