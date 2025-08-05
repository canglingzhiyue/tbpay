package com.taobao.accs.net;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.internal.AccsJobService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.m;
import com.taobao.weex.common.Constants;
import tb.kge;

/* loaded from: classes.dex */
public abstract class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile d b;

    /* renamed from: a  reason: collision with root package name */
    public Context f8269a;

    static {
        kge.a(-996793235);
    }

    public abstract String a();

    public abstract void a(int i);

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 270;
    }

    public d(Context context) {
        this.f8269a = context;
    }

    public static d a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("40b50269", new Object[]{context});
        }
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    if (UtilityImpl.isAppKeepAlive()) {
                        b = new b(context);
                    } else if (Build.VERSION.SDK_INT >= 21 && b(context)) {
                        ALog.i("HeartbeatManager", "hb use job", new Object[0]);
                        b = new f(context);
                    } else {
                        ALog.i("HeartbeatManager", "hb use alarm", new Object[0]);
                        b = new b(context);
                    }
                }
            }
        }
        return b;
    }

    private static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), AccsJobService.class.getName()), 0).isEnabled();
        } catch (Throwable th) {
            ALog.e("HeartbeatManager", "isJobServiceExist", th, new Object[0]);
            return false;
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (m.r()) {
        } else {
            int c = c();
            ALog.e("HeartbeatManager", "set sys heartbeat", Constants.Name.INTERVAL, Integer.valueOf(c), "type", a());
            a(c);
        }
    }

    public synchronized void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        ALog.e("HeartbeatManager", "set sys heartbeat", Constants.Name.INTERVAL, Integer.valueOf(i), "type", a());
        a(i);
    }
}
