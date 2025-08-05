package com.taobao.trtc.utils;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.common.inspector.DeviceInspector;
import java.util.Map;
import tb.eoe;
import tb.kge;
import tb.kgj;
import tb.sad;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NETWORK = "nwtp";
    public static final String NETWORN_2G = "2G";
    public static final String NETWORN_3G = "3G";
    public static final String NETWORN_4G = "4G";
    public static final String NETWORN_MOBILE = "mobile";
    public static final String NETWORN_NONE = "unknown";
    public static final String NETWORN_WIFI = "wifi";

    /* renamed from: a  reason: collision with root package name */
    private DeviceInspector f23189a = null;

    static {
        kge.a(1848074898);
    }

    public void a(Context context, com.taobao.common.inspector.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07e0ac7", new Object[]{this, context, cVar});
        } else {
            this.f23189a = new DeviceInspector(context, cVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f23189a == null) {
        } else {
            this.f23189a.a(com.taobao.artc.utils.a.a(), sad.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DeviceInspector deviceInspector = this.f23189a;
        if (deviceInspector == null) {
            return;
        }
        deviceInspector.e();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        DeviceInspector deviceInspector = this.f23189a;
        if (deviceInspector == null) {
            return 0;
        }
        return deviceInspector.c() / 1000;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        DeviceInspector deviceInspector = this.f23189a;
        if (deviceInspector == null) {
            return 0;
        }
        return (int) (deviceInspector.d() * 100.0d);
    }

    public void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        a(map);
        map.put(NETWORK, a(context));
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        DeviceInspector deviceInspector = this.f23189a;
        if (deviceInspector == null) {
            return;
        }
        Intent b = deviceInspector.b();
        if (b != null) {
            float a2 = com.taobao.common.inspector.a.a(b, 0.0f);
            float a3 = com.taobao.common.inspector.a.a(b, 0);
            map.put("bat", String.valueOf(a2));
            map.put("tem", String.valueOf(a3));
        }
        map.put("mem", String.valueOf(this.f23189a.c() / 1000.0f));
        map.put(eoe.TYPE_CPU, "" + (this.f23189a.d() * 100.0d));
    }

    public kgj e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgj) ipChange.ipc$dispatch("2dcd6dcc", new Object[]{this});
        }
        DeviceInspector deviceInspector = this.f23189a;
        if (deviceInspector == null) {
            return null;
        }
        return deviceInspector.a();
    }

    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        try {
            return b(context);
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    private String b(Context context) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{this, context});
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                return "wifi";
            }
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo2 != null) {
                NetworkInfo.State state2 = networkInfo2.getState();
                String subtypeName = networkInfo2.getSubtypeName();
                if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? "3G" : "mobile";
                    }
                }
            }
        }
        return "unknown";
    }
}
