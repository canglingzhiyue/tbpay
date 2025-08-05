package com.alipay.mobile.common.transport.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AppStartNetWorkingHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static class ClientStartedReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f5618a;
        private Runnable b;

        public ClientStartedReceiver(Context context, Runnable runnable) {
            this.f5618a = context;
            this.b = runnable;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            try {
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    this.b.run();
                    try {
                        LocalBroadcastManager.getInstance(this.f5618a).unregisterReceiver(this);
                    } catch (Exception e) {
                        LogCatUtil.warn("ClientStartedReceiver", "ClientStartedReceiver#onReceive exception : " + e.toString());
                    }
                } catch (Exception e2) {
                    LogCatUtil.error("AlipayHttpDnsInitHelper", "", e2);
                    try {
                        LocalBroadcastManager.getInstance(this.f5618a).unregisterReceiver(this);
                    } catch (Exception e3) {
                        LogCatUtil.warn("ClientStartedReceiver", "ClientStartedReceiver#onReceive exception : " + e3.toString());
                    }
                }
            } catch (Throwable th) {
                try {
                    LocalBroadcastManager.getInstance(this.f5618a).unregisterReceiver(this);
                } catch (Exception e4) {
                    LogCatUtil.warn("ClientStartedReceiver", "ClientStartedReceiver#onReceive exception : " + e4.toString());
                }
                throw th;
            }
        }
    }

    public static final void runOnAppStart(Runnable runnable, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be15e98", new Object[]{runnable, context});
        } else if (!MiscUtils.isShowUserTip(context)) {
            runnable.run();
        } else {
            try {
                LocalBroadcastManager.getInstance(context).registerReceiver(new ClientStartedReceiver(context, runnable), new IntentFilter("com.alipay.mobile.client.STARTED"));
            } catch (Exception e) {
                LogCatUtil.warn("AppStartNetWorkingHelper", e);
            }
        }
    }
}
