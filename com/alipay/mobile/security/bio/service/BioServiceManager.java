package com.alipay.mobile.security.bio.service;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.exception.InvalidCallException;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.service.impl.BioServiceManagerForTest;
import com.alipay.mobile.security.bio.service.impl.BioServiceManagerImpl;
import com.alipay.mobile.security.bio.service.local.LocalService;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.workspace.Env;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BioServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BioServiceManager";
    public static BioServiceManager b;
    private static Env d = Env.ONLINE;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5806a;
    private final String c;

    public abstract void destroy();

    public abstract <T> T getBioService(Class<T> cls);

    public abstract <T> T getBioService(String str);

    public abstract int preLoad();

    public abstract <T extends BioService> T putBioService(String str, Class<T> cls);

    public abstract String startBioActivity(BioAppDescription bioAppDescription, MicroModule microModule);

    public static Env getEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Env) ipChange.ipc$dispatch("fabdfe14", new Object[0]) : d;
    }

    public static void setEnv(Env env) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31205fee", new Object[]{env});
        } else if (d == env) {
        } else {
            d = env;
            BioLog.i("setEnv: " + env.name);
        }
    }

    public BioServiceManager(Context context, String str) {
        if (context == null) {
            throw new BioIllegalArgumentException();
        }
        this.f5806a = context;
        this.c = str;
    }

    @Deprecated
    public static synchronized void createInstance(Context context) {
        synchronized (BioServiceManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49084910", new Object[]{context});
            } else if (b == null) {
                BioLog.w(TAG, "BioServiceManager.createInstance()");
                b = new BioServiceManagerImpl(context, null);
            } else {
                BioLog.w(TAG, new InvalidCallException("BioServiceManager.createInstance(Context) : null != sInstance"));
            }
        }
    }

    public static synchronized void createInstanceForTest(Context context, String str) {
        synchronized (BioServiceManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf4c1961", new Object[]{context, str});
            } else if (b == null) {
                BioLog.w(TAG, "BioServiceManager.createInstanceForTest()");
                b = new BioServiceManagerForTest(context, str);
            } else {
                BioLog.w(TAG, new InvalidCallException("BioServiceManager.createInstanceForTest(Context) : null != sInstance"));
            }
        }
    }

    public static synchronized void createInstance(Context context, String str) {
        synchronized (BioServiceManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a534eda", new Object[]{context, str});
            } else if (b == null) {
                BioLog.w(TAG, "BioServiceManager.createInstance() zimId=" + str);
                b = new BioServiceManagerImpl(context, str);
            } else if (TextUtils.isEmpty(b.c)) {
                BioLog.w(TAG, new InvalidCallException("BioServiceManager already exist with zimId=null"));
                b.destroy();
                b = new BioServiceManagerImpl(context, str);
            } else if (TextUtils.equals(b.c, str)) {
                BioLog.w(TAG, "Reuse the BioServiceManager.sInstance for zimId=" + str);
            } else {
                MonitorLogService monitorLogService = (MonitorLogService) b.getBioService(MonitorLogService.class);
                if (monitorLogService != null) {
                    monitorLogService.trigUpload();
                }
                BioLog.w(TAG, new InvalidCallException("BioServiceManager already exist with zimId=" + b.c));
                b.destroy();
                b = new BioServiceManagerImpl(context, str);
            }
        }
    }

    public static BioServiceManager getCurrentInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioServiceManager) ipChange.ipc$dispatch("19dd2bc0", new Object[0]) : b;
    }

    public static void destroyInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31293b6", new Object[0]);
            return;
        }
        BioServiceManager bioServiceManager = b;
        if (bioServiceManager == null) {
            return;
        }
        bioServiceManager.destroy();
        BioLog.w(TAG, "BioServiceManager.destroyInstance() zimId=" + b.c);
        b = null;
    }

    public Context getBioApplicationContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b9402b0", new Object[]{this}) : this.f5806a;
    }

    public boolean hasCollide(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82a423d9", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.c;
        return str2 != null && !str2.equals(str);
    }

    public static <T extends LocalService> T getLocalService(Context context, Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("38f82985", new Object[]{context, cls}) : (T) getLocalService(context, Runtime.getBioServiceDescriptionByInterface(context, cls.getName()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends com.alipay.mobile.security.bio.service.local.LocalService> T getLocalService(android.content.Context r1, com.alipay.mobile.security.bio.service.BioServiceDescription r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L14
            java.lang.Class r2 = r2.getClazz()
            if (r2 == 0) goto L14
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Throwable -> L10
            com.alipay.mobile.security.bio.service.local.LocalService r2 = (com.alipay.mobile.security.bio.service.local.LocalService) r2     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r2 = move-exception
            com.alipay.mobile.security.bio.utils.BioLog.e(r2)
        L14:
            r2 = r0
        L15:
            if (r2 == 0) goto L21
            android.content.Context r1 = r1.getApplicationContext()
            r2.setContext(r1)
            r2.create(r0)
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.service.BioServiceManager.getLocalService(android.content.Context, com.alipay.mobile.security.bio.service.BioServiceDescription):com.alipay.mobile.security.bio.service.local.LocalService");
    }
}
