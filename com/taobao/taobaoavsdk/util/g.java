package com.taobao.taobaoavsdk.util;

import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.player.l;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashSet;
import java.util.Iterator;
import tb.kge;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes8.dex */
public class g implements NetworkQualityMonitor.IGlobalNetworkQualityListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static g f21348a;
    private HashSet<l> b = null;
    private volatile boolean c = false;

    static {
        kge.a(625579294);
        kge.a(1669026611);
    }

    public static synchronized g a() {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("a623f614", new Object[0]);
            }
            if (f21348a == null) {
                f21348a = new g();
            }
            if (!f21348a.c) {
                f21348a.b();
            }
            return f21348a;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            this.c = NetworkQualityMonitor.getInstance().registerGlobalNetworkQualityListener(this);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "NetWorkStateReceive registerGlobalNetworkQualityListener success=" + this.c);
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "NetWorkStateReceive registerGlobalNetworkQualityListener error:" + th.getMessage());
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            NetworkQualityMonitor.getInstance().unregisterGlobalNetworkQualityListener(this);
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "NetWorkStateReceive try to unRegisterGlobalNetworkQualityListener");
            this.c = false;
        } catch (Throwable th) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "NetWorkStateReceive unregisterGlobalNetworkQualityListener error:" + th.getMessage());
        }
    }

    public void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbc1851", new Object[]{this, lVar});
            return;
        }
        synchronized (g.class) {
            if (this.b == null) {
                this.b = new HashSet<>();
            }
            if (lVar != null) {
                this.b.add(lVar);
            }
        }
    }

    public void b(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cffb50b0", new Object[]{this, lVar});
            return;
        }
        synchronized (g.class) {
            if (this.b != null && this.b.contains(lVar)) {
                this.b.remove(lVar);
            }
            if (this.b.size() == 0) {
                c();
            }
        }
    }

    @Override // anetwork.channel.monitor.NetworkQualityMonitor.IGlobalNetworkQualityListener
    public void onNetworkQualityChanged(int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d676f46", new Object[]{this, new Integer(i), new Double(d)});
            return;
        }
        synchronized (g.class) {
            if (this.b != null) {
                Iterator<l> it = this.b.iterator();
                while (it.hasNext()) {
                    l next = it.next();
                    if (next != null && (next instanceof TaobaoMediaPlayer)) {
                        ((TaobaoMediaPlayer) next).onNetworkStateUpdate(i, d);
                    }
                }
            }
        }
    }
}
