package com.ali.user.open.core.device;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static DeviceInfo INSTANCE = null;
    private static final String TAG = "DeviceInfo";
    public static String deviceId;

    static {
        kge.a(1761606253);
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (!TextUtils.isEmpty(deviceId)) {
        } else {
            initDeviceId(context);
        }
    }

    public static synchronized DeviceInfo getInstance() {
        synchronized (DeviceInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DeviceInfo) ipChange.ipc$dispatch("91b8c366", new Object[0]);
            }
            if (INSTANCE == null) {
                INSTANCE = new DeviceInfo();
            }
            return INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void initDeviceId(final android.content.Context r8) {
        /*
            java.lang.String r0 = "com.ta.utdid2.device.UTDevice"
            java.lang.Class r0 = com.ali.user.open.core.util.ReflectionUtils.loadClassQuietly(r0)
            r1 = 0
            java.lang.String r2 = "DeviceInfo"
            if (r0 == 0) goto L31
            java.lang.String r3 = "getUtdid"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L2c
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Exception -> L2c
            java.lang.reflect.Method r0 = r0.getMethod(r3, r5)     // Catch: java.lang.Exception -> L2c
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L2c
            r3[r7] = r8     // Catch: java.lang.Exception -> L2c
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L2c
            if (r0 != 0) goto L29
            java.lang.String r0 = "get utdid null"
            com.ali.user.open.core.trace.SDKLogger.e(r2, r0)     // Catch: java.lang.Exception -> L2c
            goto L31
        L29:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L2c
            goto L32
        L2c:
            java.lang.String r0 = "get utdid error"
            com.ali.user.open.core.trace.SDKLogger.e(r2, r0)
        L31:
            r0 = r1
        L32:
            if (r0 != 0) goto L3f
            com.ali.user.open.core.service.MemberExecutorService r0 = com.ali.user.open.core.context.KernelContext.executorService
            com.ali.user.open.core.device.DeviceInfo$1 r1 = new com.ali.user.open.core.device.DeviceInfo$1
            r1.<init>()
            r0.postTask(r1)
            return
        L3f:
            com.ali.user.open.core.device.DeviceInfo.deviceId = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "utdid = "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.ali.user.open.core.trace.SDKLogger.e(r2, r0)
            com.ali.user.open.core.service.MemberExecutorService r0 = com.ali.user.open.core.context.KernelContext.executorService
            com.ali.user.open.core.device.DeviceInfo$2 r1 = new com.ali.user.open.core.device.DeviceInfo$2
            r1.<init>()
            r0.postTask(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.core.device.DeviceInfo.initDeviceId(android.content.Context):void");
    }

    public static String getLocale(Context context) {
        Locale locale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce8c2ef", new Object[]{context});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        return locale.getLanguage() + "_" + locale.getCountry();
    }
}
