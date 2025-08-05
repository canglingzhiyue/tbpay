package com.taobao.passivelocation.features.power;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes7.dex */
public class PowerStateChangedReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f18670a = "lbs_passive.loc_PowCRcv";

    static {
        kge.a(-362831839);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            AppMonitor.Counter.commit("passivelocation", "PowerStateChangedReceiver", 1.0d);
            if ("off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "passivelocationoption", "off"))) {
                return;
            }
            String action = intent.getAction();
            String str = "action=" + action + ", Intent.ACTION_BATTERY_LOW=android.intent.action.BATTERY_LOW,Intent.ACTION_BATTERY_OKAY=android.intent.action.BATTERY_OKAY";
            if (!"android.intent.action.BATTERY_LOW".equals(action) && !"android.intent.action.BATTERY_OKAY".equals(action)) {
                return;
            }
            String str2 = "onNotifyBatteryStateChanged invoked, action = " + action;
            new a().a(action);
        } catch (Exception unused) {
        }
    }
}
