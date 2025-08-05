package com.alipay.mobile.common.logging.util.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public abstract class RigorousNetworkConnReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f5473a;
    private int b;
    private Boolean c;
    private Context d;

    public static /* synthetic */ Object ipc$super(RigorousNetworkConnReceiver rigorousNetworkConnReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void onReceivee(Context context, Intent intent);

    public RigorousNetworkConnReceiver(Context context) {
        this.f5473a = -1;
        this.b = -1;
        this.c = null;
        this.d = context;
        this.c = null;
        this.f5473a = -1;
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
        } catch (Exception unused) {
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
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            try {
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    return;
                }
                int a2 = a(context);
                if (a2 == 0) {
                    onReceivee(context, intent);
                } else if (a2 != 1) {
                } else {
                    onReceivee(context, intent);
                }
            } catch (Throwable unused) {
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
            new StringBuilder("getActiveNetworkInfo exception. ").append(th.toString());
        }
        if (networkInfo == null) {
            this.c = Boolean.FALSE;
            return 0;
        }
        boolean isAvailable = networkInfo.isAvailable();
        boolean isConnected = networkInfo.isConnected();
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        String extraInfo = networkInfo.getExtraInfo();
        if (this.f5473a != -1 && this.b != -1 && (bool = this.c) != null && bool.booleanValue() == isConnected && this.f5473a == type && this.b == subtype) {
            return 2;
        }
        this.c = Boolean.valueOf(isConnected);
        this.f5473a = type;
        this.b = subtype;
        StringBuilder sb = new StringBuilder(" type=[");
        sb.append(type);
        sb.append("] subType=[");
        sb.append(subtype);
        sb.append("]  available=[");
        sb.append(isAvailable);
        sb.append("] connected=[");
        sb.append(isConnected);
        sb.append("] detailedState=[");
        sb.append(networkInfo.getDetailedState());
        sb.append("] extraInfo=[");
        sb.append(extraInfo);
        sb.append(riy.ARRAY_END_STR);
        StringBuilder sb2 = new StringBuilder(" activeNetworkInfo hashcode=");
        sb2.append(networkInfo.hashCode());
        sb2.append("  activeNetworkInfo = [");
        sb2.append(networkInfo.toString());
        sb2.append("]\n\n\n");
        return !this.c.booleanValue() ? 0 : 1;
    }
}
