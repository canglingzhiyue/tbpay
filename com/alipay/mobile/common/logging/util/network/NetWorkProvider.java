package com.alipay.mobile.common.logging.util.network;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class NetWorkProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static NetWorkProvider INSTANCE = null;
    public static final String NETWORK_UNKNOWN = "unknown";
    private static long b = 0;
    private static int c = -1;

    /* renamed from: a  reason: collision with root package name */
    private Context f5472a;
    private LogNetworkConnReceiver d;

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public class LogNetworkConnReceiver extends RigorousNetworkConnReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public LogNetworkConnReceiver(Context context) {
            super(context);
        }

        @Override // com.alipay.mobile.common.logging.util.network.RigorousNetworkConnReceiver
        public void onReceivee(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30528f9d", new Object[]{this, context, intent});
            } else {
                NetWorkProvider.access$000(NetWorkProvider.this, context);
            }
        }
    }

    public static /* synthetic */ int access$000(NetWorkProvider netWorkProvider, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("44314160", new Object[]{netWorkProvider, context})).intValue() : a(context);
    }

    public static synchronized NetWorkProvider createInstance(Context context) {
        synchronized (NetWorkProvider.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetWorkProvider) ipChange.ipc$dispatch("ed709212", new Object[]{context});
            }
            if (INSTANCE == null) {
                INSTANCE = new NetWorkProvider(context);
            }
            return INSTANCE;
        }
    }

    public static synchronized NetWorkProvider getInstance() {
        synchronized (NetWorkProvider.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetWorkProvider) ipChange.ipc$dispatch("30b3aa94", new Object[0]);
            } else if (INSTANCE == null) {
                throw new IllegalStateException("need createInstance before use");
            } else {
                return INSTANCE;
            }
        }
    }

    public NetWorkProvider(Context context) {
        this.f5472a = context;
        registerLogNetworkConnReceiver(this.f5472a);
    }

    public void registerLogNetworkConnReceiver(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864e7ef9", new Object[]{this, context});
            return;
        }
        this.d = new LogNetworkConnReceiver(context);
        this.d.register();
    }

    public String getCurrentNetworkType2Str() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e4c3215", new Object[]{this});
        }
        int currentNetworkType = getCurrentNetworkType();
        return currentNetworkType != 1 ? currentNetworkType != 2 ? currentNetworkType != 3 ? currentNetworkType != 4 ? "unknown" : "4g" : "wifi" : "3g" : "2g";
    }

    public int getCurrentNetworkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa41473f", new Object[]{this})).intValue();
        }
        int i = c;
        if (i == -1 || i == 0) {
            a(this.f5472a);
        }
        return c;
    }

    private static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - b > 2000) {
            c = NetworkUtils.getNetworkType(context);
            b = uptimeMillis;
        }
        return c;
    }
}
