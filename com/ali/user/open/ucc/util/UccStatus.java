package com.ali.user.open.ucc.util;

import android.content.Context;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes2.dex */
public class UccStatus {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.LoginStatus";
    private static HashMap<String, AtomicBoolean> isUccLogining;
    private static HashMap<String, AtomicLong> lastUccLoginTime;
    private static Context mContext;

    static {
        kge.a(1021030132);
        isUccLogining = new HashMap<>();
        lastUccLoginTime = new HashMap<>();
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            SDKLogger.e("login.LoginStatus", "init Login Status");
        }
    }

    public static boolean isLogining(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0499978", new Object[]{str})).booleanValue();
        }
        AtomicBoolean atomicBoolean = isUccLogining.get(str);
        return atomicBoolean != null && atomicBoolean.get();
    }

    public static void setLogining(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f00b1a8", new Object[]{str, new Boolean(z)});
            return;
        }
        SDKLogger.e("login.LoginStatus", "set isLogining=" + z);
        AtomicBoolean atomicBoolean = isUccLogining.get(str);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
        }
        atomicBoolean.compareAndSet(!z, z);
        isUccLogining.put(str, atomicBoolean);
    }

    public static synchronized boolean compareAndSetLogining(String str, boolean z, boolean z2) {
        synchronized (UccStatus.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d1fe521e", new Object[]{str, new Boolean(z), new Boolean(z2)})).booleanValue();
            }
            SDKLogger.e("login.LoginStatus", "compareAndSetLogining  expect=" + z + ",update=" + z2);
            AtomicBoolean atomicBoolean = isUccLogining.get(str);
            if (atomicBoolean == null) {
                atomicBoolean = new AtomicBoolean(false);
            }
            atomicBoolean.compareAndSet(z, z2);
            isUccLogining.put(str, atomicBoolean);
            if (atomicBoolean.get()) {
                AtomicLong atomicLong = lastUccLoginTime.get(str);
                if (atomicLong == null) {
                    atomicLong = new AtomicLong(0L);
                }
                atomicLong.set(System.currentTimeMillis());
                lastUccLoginTime.put(str, atomicLong);
            }
            return atomicBoolean.get();
        }
    }

    public static long getLastLoginTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47270b2f", new Object[]{str})).longValue();
        }
        AtomicLong atomicLong = lastUccLoginTime.get(str);
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public static void resetLoginFlag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ce3bf7", new Object[]{str});
            return;
        }
        SDKLogger.e("login.LoginStatus", "reset login status");
        AtomicBoolean atomicBoolean = isUccLogining.get(str);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
        }
        atomicBoolean.compareAndSet(true, false);
        isUccLogining.put(str, atomicBoolean);
    }
}
