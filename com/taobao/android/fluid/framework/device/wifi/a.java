package com.taobao.android.fluid.framework.device.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.device.IDeviceService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.kge;
import tb.obu;
import tb.occ;
import tb.ocd;
import tb.oce;
import tb.skc;
import tb.snd;

/* loaded from: classes5.dex */
public class a implements skc, snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static boolean f12552a;
    private final Context b;
    private final Handler c = new Handler(Looper.getMainLooper());
    private final FluidContext d;
    private BroadcastReceiver e;
    private boolean f;

    static {
        kge.a(-2124504695);
        kge.a(1755210026);
        kge.a(1113596639);
    }

    @Override // tb.skc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d6a1c0", new Object[]{aVar});
        } else {
            aVar.g();
        }
    }

    public static /* synthetic */ boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : b(context);
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322af701", new Object[]{aVar});
        } else {
            aVar.f();
        }
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b7f4c42", new Object[]{aVar});
        } else {
            aVar.h();
        }
    }

    public a(FluidContext fluidContext) {
        this.d = fluidContext;
        ((ILifecycleService) this.d.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        ((IContainerService) this.d.getService(IContainerService.class)).addRenderLifecycleListener(this);
        this.b = fluidContext.getContext();
    }

    private static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        } else {
            cx_();
        }
    }

    @Override // tb.skc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            b();
        }
    }

    private void cx_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471eb211", new Object[]{this});
            return;
        }
        this.c.removeMessages(0);
        h();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f) {
        } else {
            this.f = true;
            this.c.postDelayed(new Runnable() { // from class: com.taobao.android.fluid.framework.device.wifi.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.a(obu.e())) {
                        a.a(a.this);
                    } else {
                        a.b(a.this);
                    }
                }
            }, 1000L);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.e = new BroadcastReceiver() { // from class: com.taobao.android.fluid.framework.device.wifi.NoWifiTipHelper$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (!intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    } else {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                        int type = activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
                        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || type != 0) {
                            return;
                        }
                        a.a(a.this);
                        a.c(a.this);
                    }
                }
            };
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        BroadcastReceiver broadcastReceiver = this.e;
        if (broadcastReceiver == null) {
            e();
        } else {
            try {
                this.b.unregisterReceiver(broadcastReceiver);
            } catch (Throwable th) {
                FluidException.throwException(this.d, IDeviceService.ERROR_CODE_NETWORK_RECEIVER_UNREGISTER_ERROR, th);
            }
        }
        try {
            this.b.registerReceiver(this.e, intentFilter);
        } catch (Throwable th2) {
            FluidException.throwException(this.d, IDeviceService.ERROR_CODE_NETWORK_RECEIVER_REGISTER_ERROR, th2);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (f12552a || ocd.a(occ.c(this.b, "fullscreen_no_wifi_tip_last_time"), System.currentTimeMillis())) {
        } else {
            oce.b(this.b, "当前为非Wi-Fi环境，请注意流量消耗");
            f12552a = true;
            occ.a(this.b, "fullscreen_no_wifi_tip_last_time", System.currentTimeMillis());
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        try {
            if (this.e == null) {
                return;
            }
            this.b.unregisterReceiver(this.e);
            this.e = null;
        } catch (Throwable th) {
            FluidException.throwException(this.d, IDeviceService.ERROR_CODE_NETWORK_RECEIVER_UNREGISTER_ERROR, th);
        }
    }
}
