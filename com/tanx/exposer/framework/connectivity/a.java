package com.tanx.exposer.framework.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.d;
import java.util.LinkedList;
import java.util.List;
import tb.dha;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f8165a;
    public int b;
    private Context c;
    private List<InterfaceC0311a> d;
    private ConnectivityManager e;
    private final BroadcastReceiver f;
    private ConnectivityManager.NetworkCallback g;

    /* renamed from: com.tanx.exposer.framework.connectivity.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0311a {
        void a(int i);
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static final a tanxc_do;

        static {
            kge.a(-1006714323);
            tanxc_do = new a((byte) 0);
        }
    }

    static {
        kge.a(-309628683);
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    private a() {
        this.f8165a = -1;
        this.b = -1;
        this.f = new BroadcastReceiver() { // from class: com.tanx.exposer.framework.connectivity.NetworkStateObserver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if (dha.f26745a) {
                    dha.a("NetworkStateObserver", "onReceive: action = " + action);
                }
                if (!StringUtils.equals(action, "android.net.conn.CONNECTIVITY_CHANGE")) {
                    return;
                }
                a.this.b();
                if (a.this.f8165a == a.this.b) {
                    return;
                }
                a.this.c();
                a aVar = a.this;
                aVar.f8165a = aVar.b;
            }
        };
        this.c = d.a().c();
        this.d = new LinkedList();
        try {
            this.e = (ConnectivityManager) this.c.getSystemService("connectivity");
        } catch (Exception e) {
            dha.a("NetworkStateObserver", "get ConnectivityManager exception", e);
        }
        d();
        b();
    }

    public synchronized void a(InterfaceC0311a interfaceC0311a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10496417", new Object[]{this, interfaceC0311a});
            return;
        }
        if (dha.f26745a) {
            dha.a("NetworkStateObserver", "addNetworkChangeListener: listener = " + interfaceC0311a);
        }
        this.d.add(interfaceC0311a);
        interfaceC0311a.a(this.b);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b != -1;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkRequest build = new NetworkRequest.Builder().build();
                if (this.g == null) {
                    this.g = new ConnectivityManager.NetworkCallback() { // from class: com.tanx.exposer.framework.connectivity.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                            int hashCode = str.hashCode();
                            if (hashCode == 435028944) {
                                super.onCapabilitiesChanged((Network) objArr[0], (NetworkCapabilities) objArr[1]);
                                return null;
                            } else if (hashCode != 2071672155) {
                                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                            } else {
                                super.onLost((Network) objArr[0]);
                                return null;
                            }
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onLost(Network network) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                                return;
                            }
                            super.onLost(network);
                            if (dha.f26745a) {
                                dha.a("NetworkStateObserver", "onLost: currentType = " + a.this.b + ", prev = " + a.this.f8165a + ", network = " + network);
                            }
                            a.this.b();
                            if (a.this.f8165a == a.this.b) {
                                return;
                            }
                            a.this.c();
                            a aVar = a.this;
                            aVar.f8165a = aVar.b;
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("19ee03d0", new Object[]{this, network, networkCapabilities});
                                return;
                            }
                            super.onCapabilitiesChanged(network, networkCapabilities);
                            if (networkCapabilities.hasCapability(16)) {
                                if (!networkCapabilities.hasTransport(1)) {
                                    if (!networkCapabilities.hasTransport(0)) {
                                        if (networkCapabilities.hasTransport(3)) {
                                            a.this.b = 9;
                                        }
                                    } else {
                                        a.this.b();
                                    }
                                } else {
                                    a.this.b = 1;
                                }
                            }
                            if (dha.f26745a) {
                                dha.a("NetworkStateObserver", "onCapabilitiesChanged: cap = " + networkCapabilities + ", network = " + network + ", currentType = " + a.this.b + ", prevType = " + a.this.f8165a);
                            }
                            if (a.this.f8165a == a.this.b) {
                                return;
                            }
                            a.this.c();
                            a aVar = a.this;
                            aVar.f8165a = aVar.b;
                        }
                    };
                }
                this.e.registerNetworkCallback(build, this.g);
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.c.registerReceiver(this.f, intentFilter);
        } catch (Throwable th) {
            dha.a("NetworkStateObserver", "registerNetworkState exception.", th);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        NetworkInfo networkInfo = null;
        try {
            networkInfo = this.e.getActiveNetworkInfo();
        } catch (Exception e) {
            dha.a("NetworkStateObserver", "getActiveNetworkType exception.", e);
        }
        if (networkInfo == null) {
            this.b = -1;
            if (!dha.f26745a) {
                return;
            }
            dha.a("NetworkStateObserver", "getActiveNetworkType with null network info.");
            return;
        }
        if (networkInfo.getType() == 1 && networkInfo.isConnected()) {
            this.b = 1;
        } else if (networkInfo.getType() == 0 && networkInfo.isConnected()) {
            this.b = 0;
        } else if (networkInfo.getType() == 9 && networkInfo.isConnected()) {
            this.b = 9;
        } else {
            this.b = -1;
        }
        if (!dha.f26745a) {
            return;
        }
        dha.a("NetworkStateObserver", "getActiveNetworkType: mPrevNetworkType = " + this.f8165a + ", mCurrentNetworkType = " + this.b + ", networkInfo = " + networkInfo);
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (dha.f26745a) {
            dha.a("NetworkStateObserver", "notifyNetworkStateChanged: mPrevNetworkType = " + this.f8165a + ", mCurrentNetworkType = " + this.b);
        }
        for (InterfaceC0311a interfaceC0311a : this.d) {
            interfaceC0311a.a(this.b);
        }
    }
}
