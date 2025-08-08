package com.taobao.collection.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;
import tb.kgf;
import tb.nea;

/* loaded from: classes7.dex */
public class StateReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f16917a = 0;
    private long b = 0;
    private kgf c;
    private kgf d;

    static {
        kge.a(-105705440);
    }

    public StateReceiver(kgf kgfVar, kgf kgfVar2) {
        this.c = null;
        this.d = null;
        this.c = kgfVar;
        this.d = kgfVar2;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        AppMonitor.Counter.commit("passivelocation", "StateReceiver", 1.0d);
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (StringUtils.isEmpty(action)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                if (!this.c.isValid() || intent.getExtras().getInt("wifi_state") != 3 || currentTimeMillis - this.f16917a <= 60000) {
                    return;
                }
                nea.c("lbs_sdk.coll_StateRcv", "wifi enabled state scan");
                WifiManager wifiManager = (WifiManager) Globals.getApplication().getSystemService("wifi");
                if (!wifiManager.isWifiEnabled()) {
                    return;
                }
                wifiManager.startScan();
                this.f16917a = currentTimeMillis;
            } else if (!action.equals("android.bluetooth.adapter.action.STATE_CHANGED") || !this.d.isValid() || intent.getExtras().getInt("android.bluetooth.adapter.extra.STATE") != 12 || currentTimeMillis - this.b <= 60000) {
            } else {
                nea.c("lbs_sdk.coll_StateRcv", "beacon enabled state scan");
                new com.taobao.collection.receiver.a(Globals.getApplication()).a(2000L);
                this.b = currentTimeMillis;
            }
        } catch (Throwable th) {
            nea.a("lbs_sdk.coll_StateRcv", "an error occurred in StateReceiver " + th);
        }
    }
}
