package com.alipay.mobile.common.transportext.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.mobile.common.netsdkextdependapi.logger.LoggerManagerFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public abstract class NwRigorousNetworkConnReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f5706a;
    private int b;
    private Boolean c;
    private Context d;

    public static /* synthetic */ Object ipc$super(NwRigorousNetworkConnReceiver nwRigorousNetworkConnReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void onReceivee(Context context, Intent intent);

    public static /* synthetic */ int access$000(NwRigorousNetworkConnReceiver nwRigorousNetworkConnReceiver, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8697c57", new Object[]{nwRigorousNetworkConnReceiver, context})).intValue() : nwRigorousNetworkConnReceiver.a(context);
    }

    public NwRigorousNetworkConnReceiver(Context context) {
        this.f5706a = -1;
        this.b = -1;
        this.c = null;
        this.d = context;
        this.c = null;
        this.f5706a = -1;
        this.b = -1;
    }

    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            return;
        }
        try {
            this.d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            LogCatUtil.warn("NwRigorousNetworkConnReceiver", e);
        }
    }

    public void unregister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            return;
        }
        try {
            this.d.unregisterReceiver(this);
        } catch (Exception e) {
            LogCatUtil.warn("NwRigorousNetworkConnReceiver", e);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            try {
                LoggerManagerFactory.getInstance().getDefaultBean().info("monitor", "onReceive at: " + getClass().getName() + ", Intent: " + intent);
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    return;
                }
                NetworkAsyncTaskExecutor.executeSerial(new Runnable() { // from class: com.alipay.mobile.common.transportext.util.NwRigorousNetworkConnReceiver.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        String str;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int access$000 = NwRigorousNetworkConnReceiver.access$000(NwRigorousNetworkConnReceiver.this, context);
                        if (access$000 != 0) {
                            if (access$000 == 1) {
                                str = "NetworkConnectivityReceiver#onReceive 网络变化";
                            }
                            NwRigorousNetworkConnReceiver.this.onReceivee(context, intent);
                        }
                        str = "NetworkConnectivityReceiver#onReceive 网络不可用";
                        LogCatUtil.debug("NwRigorousNetworkConnReceiver", str);
                        NwRigorousNetworkConnReceiver.this.onReceivee(context, intent);
                    }
                });
            } catch (Throwable th) {
                LogCatUtil.error("NwRigorousNetworkConnReceiver", "onReceive exception:", th);
            }
        }
    }

    private int a(Context context) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue();
        }
        NetworkInfo networkInfo = null;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            LogCatUtil.warn("NwRigorousNetworkConnReceiver", "getActiveNetworkInfo exception. " + th.toString());
        }
        if (networkInfo == null) {
            LogCatUtil.info("NwRigorousNetworkConnReceiver", "当前无网络!");
            this.c = false;
            return 0;
        }
        boolean isAvailable = networkInfo.isAvailable();
        boolean isConnected = networkInfo.isConnected();
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        String extraInfo = networkInfo.getExtraInfo();
        if (this.f5706a == -1 || this.b == -1 || (bool = this.c) == null) {
            LogCatUtil.info("NwRigorousNetworkConnReceiver", " New contivity broadcast！");
        } else if (bool.booleanValue() == isConnected && this.f5706a == type && this.b == subtype) {
            LogCatUtil.info("NwRigorousNetworkConnReceiver", " Old contivity broadcast！");
            return 2;
        }
        this.c = Boolean.valueOf(isConnected);
        this.f5706a = type;
        this.b = subtype;
        LogCatUtil.debug("NwRigorousNetworkConnReceiver", " type=[" + type + "] subType=[" + subtype + "]  available=[" + isAvailable + "] connected=[" + isConnected + "] detailedState=[" + networkInfo.getDetailedState() + "] extraInfo=[" + extraInfo + riy.ARRAY_END_STR);
        StringBuilder sb = new StringBuilder();
        sb.append(" activeNetworkInfo hashcode=");
        sb.append(networkInfo.hashCode());
        sb.append("  activeNetworkInfo = [");
        sb.append(networkInfo.toString());
        sb.append("]\n\n\n");
        LogCatUtil.debug("NwRigorousNetworkConnReceiver", sb.toString());
        return !this.c.booleanValue() ? 0 : 1;
    }
}
