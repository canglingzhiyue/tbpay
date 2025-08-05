package com.taobao.phenix.compat;

import android.content.Context;
import anet.channel.monitor.INetworkQualityChangeListener;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.monitor.QualityChangeFilter;
import anetwork.channel.monitor.Monitor;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import tb.niw;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18902a = false;
    private static boolean b;
    private static boolean c;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            b.h().c().a(new com.taobao.phenix.compat.mtop.b(context));
            b = true;
            niw.b("TBNetwork4Phenix", "http loader setup", new Object[0]);
        } catch (RuntimeException e) {
            niw.d("TBNetwork4Phenix", "http loader setup error=%s", e);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!b) {
        } else {
            Monitor.addListener(new INetworkQualityChangeListener() { // from class: com.taobao.phenix.compat.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.monitor.INetworkQualityChangeListener
                public void onNetworkQualityChanged(NetworkSpeed networkSpeed) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6565bb89", new Object[]{this, networkSpeed});
                        return;
                    }
                    niw.a(LogStrategyManager.SP_STRATEGY_KEY_NETWORK, "network speed detect: %K/s", Integer.valueOf((int) (Monitor.getNetSpeedValue() * 1024.0d)));
                    com.taobao.rxm.schedule.k a2 = b.h().e().a();
                    if (!(a2 instanceof com.taobao.phenix.loader.network.d)) {
                        return;
                    }
                    com.taobao.phenix.loader.network.d dVar = (com.taobao.phenix.loader.network.d) a2;
                    if (networkSpeed == NetworkSpeed.Slow) {
                        z = true;
                    }
                    dVar.a(z);
                }
            }, new QualityChangeFilter() { // from class: com.taobao.phenix.compat.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.monitor.QualityChangeFilter
                public boolean detectNetSpeedSlow(double d) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("75eecd4d", new Object[]{this, new Double(d)})).booleanValue() : d <= 30.0d;
                }
            });
            niw.b("TBNetwork4Phenix", "network quality monitor setup", new Object[0]);
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f18902a = z;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f18902a;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : c;
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }
}
