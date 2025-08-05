package com.taobao.android.diagnose.collector;

import android.app.Application;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.NetworkObserver;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes.dex */
public class a extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private c d;
    private NetworkObserver.NetworkStatusListener e;
    private NetworkObserver.a f;
    private boolean g;
    private g h;

    static {
        kge.a(1410833583);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(Application application, com.taobao.android.diagnose.model.a aVar) {
        super(application, aVar);
    }

    @Override // com.taobao.android.diagnose.collector.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.h = new g(this.f11695a, this.b);
            this.h.a();
            c();
            d();
        } catch (Exception e) {
            TLog.loge("Diagnose", "APMCollector", "init failed: ", e);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        g gVar = this.h;
        if (gVar == null) {
            return;
        }
        gVar.a(4);
    }

    public void a(com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc45ab9", new Object[]{this, aVar});
            return;
        }
        g gVar = this.h;
        if (gVar == null) {
            return;
        }
        gVar.a(aVar);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.b.i().isLowDevice()) {
        } else {
            v.a("APMCollector", "initAppLifeCycleListener");
            this.d = new c(this.b, this.c, this.h);
            this.f11695a.registerActivityLifecycleCallbacks(this.d);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        v.a("APMCollector", "initNetworkListener");
        if (this.g) {
            return;
        }
        try {
            NetworkObserver.a(com.taobao.android.diagnose.common.e.a(this.f11695a));
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f11695a.getSystemService("connectivity");
            if (connectivityManager != null && Build.VERSION.SDK_INT >= 26) {
                this.f = new NetworkObserver.a(this.f11695a);
                connectivityManager.registerDefaultNetworkCallback(this.f);
            } else {
                this.e = new NetworkObserver.NetworkStatusListener();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.f11695a.registerReceiver(this.e, intentFilter);
            }
            this.g = true;
        } catch (Exception e) {
            v.a("APMCollector", "initNetworkListener", e);
        }
    }
}
