package com.alipay.mobile.common.transport.http.cookie;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlipayNetCookieSyncManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AlipayNetCookieSyncManager f5568a;
    private static IAlipayNetCookieSyncManager b;

    public static AlipayNetCookieSyncManager get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetCookieSyncManager) ipChange.ipc$dispatch("3e09d6bb", new Object[0]);
        }
        AlipayNetCookieSyncManager alipayNetCookieSyncManager = f5568a;
        if (alipayNetCookieSyncManager != null) {
            return alipayNetCookieSyncManager;
        }
        synchronized (AlipayNetCookieSyncManager.class) {
            if (f5568a != null) {
                return f5568a;
            }
            f5568a = new AlipayNetCookieSyncManager();
            return f5568a;
        }
    }

    private AlipayNetCookieSyncManager() {
        b = new AlipayNetDefaultCookieSyncManager();
    }

    public synchronized void setCustomCookieSyncManager(IAlipayNetCookieSyncManager iAlipayNetCookieSyncManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ef3b05", new Object[]{this, iAlipayNetCookieSyncManager});
            return;
        }
        if (iAlipayNetCookieSyncManager != null) {
            b = iAlipayNetCookieSyncManager;
        }
    }

    public static AlipayNetCookieSyncManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetCookieSyncManager) ipChange.ipc$dispatch("aef590b0", new Object[0]);
        }
        if (b == null) {
            get();
        }
        b.getInstance();
        return get();
    }

    public static AlipayNetCookieSyncManager createInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlipayNetCookieSyncManager) ipChange.ipc$dispatch("d10d2b2e", new Object[]{context});
        }
        if (b == null) {
            get();
        }
        a(context);
        return get();
    }

    private static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            b.createInstance(context);
        }
    }

    public void sync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c36d9a2", new Object[]{this});
        } else {
            b.sync();
        }
    }
}
