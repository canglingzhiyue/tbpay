package com.taobao.analysis.flow;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import anet.channel.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.stat.ChannelFlowStatistic;
import com.taobao.analysis.stat.SingleFlowStatistic;
import tb.dir;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_MONITOR_SWITCH_KEY = "channel_flow_monitor";

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f8552a;
    private volatile boolean b;
    private SharedPreferences c;

    private f() {
        this.b = true;
        AppMonitor.getInstance().register(SingleFlowStatistic.class);
        AppMonitor.getInstance().register(ChannelFlowStatistic.class);
        Context e = dir.e();
        if (e != null) {
            this.c = PreferenceManager.getDefaultSharedPreferences(e);
            this.b = this.c.getBoolean(CHANNEL_MONITOR_SWITCH_KEY, true);
        }
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("48e9adf8", new Object[0]);
        }
        if (f8552a == null) {
            synchronized (f.class) {
                if (f8552a == null) {
                    f8552a = new f();
                }
            }
        }
        return f8552a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r17, boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, long r23, long r25) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.flow.f.a(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long):void");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.b == z) {
        } else {
            this.b = z;
            SharedPreferences sharedPreferences = this.c;
            if (sharedPreferences == null) {
                return;
            }
            sharedPreferences.edit().putBoolean(CHANNEL_MONITOR_SWITCH_KEY, this.b).apply();
        }
    }
}
