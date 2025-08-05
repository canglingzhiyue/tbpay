package com.taobao.orange.launch;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import java.io.Serializable;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes.dex */
public class TaobaoLaunchOrange implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_LOAD_CONFIG = "orange_load_config_optimize_v2";
    private static final String ORANGE_REGEXP = "orange_regexp_optimize";
    private static final String TAG = "TbLaunchOrange";
    private static final String TAOBAO_MAIN_PROCESS = "com.taobao.taobao";

    static {
        kge.a(-1136581219);
        kge.a(1028243835);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(android.app.Application r10, java.util.HashMap<java.lang.String, java.lang.Object> r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.orange.launch.TaobaoLaunchOrange.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r9
            r1[r2] = r10
            r10 = 2
            r1[r10] = r11
            java.lang.String r10 = "dddb138b"
            r0.ipc$dispatch(r10, r1)
            return
        L18:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "TbLaunchOrange"
            java.lang.String r4 = "init start"
            com.taobao.orange.util.OLog.d(r1, r4, r0)
            java.lang.String r0 = "21646297"
            java.lang.String r4 = "*"
            com.taobao.orange.OConstant$ENV r5 = com.taobao.orange.OConstant.ENV.ONLINE
            int r5 = r5.getEnvMode()
            r6 = 0
            java.lang.String r7 = "appVersion"
            java.lang.Object r7 = r11.get(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = "envIndex"
            java.lang.Object r4 = r11.get(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L7a
            int r5 = r4.intValue()     // Catch: java.lang.Throwable -> L7a
            com.taobao.orange.OConstant$ENV r4 = com.taobao.orange.OConstant.ENV.ONLINE     // Catch: java.lang.Throwable -> L7a
            int r4 = r4.getEnvMode()     // Catch: java.lang.Throwable -> L7a
            if (r5 != r4) goto L55
            java.lang.String r4 = "onlineAppKey"
            java.lang.Object r4 = r11.get(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L7a
        L53:
            r0 = r4
            goto L70
        L55:
            com.taobao.orange.OConstant$ENV r4 = com.taobao.orange.OConstant.ENV.PREPARE     // Catch: java.lang.Throwable -> L7a
            int r4 = r4.getEnvMode()     // Catch: java.lang.Throwable -> L7a
            if (r5 != r4) goto L67
            java.lang.String r4 = "preAppKey"
            java.lang.Object r4 = r11.get(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L7a
            goto L53
        L67:
            java.lang.String r4 = "dailyAppkey"
            java.lang.Object r4 = r11.get(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L7a
            goto L53
        L70:
            java.lang.String r4 = "process"
            java.lang.Object r11 = r11.get(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L7a
            goto L87
        L7a:
            r11 = move-exception
            goto L7e
        L7c:
            r11 = move-exception
            r7 = r4
        L7e:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r8 = "init"
            com.taobao.orange.util.OLog.e(r1, r8, r11, r4)
            r11 = r6
        L87:
            java.lang.String r1 = "com.taobao.taobao"
            boolean r11 = r1.equals(r11)
            if (r11 == 0) goto L92
            r9.initABGlobal(r10)
        L92:
            com.taobao.orange.OConfig$Builder r11 = new com.taobao.orange.OConfig$Builder
            r11.<init>()
            com.taobao.orange.OConfig$Builder r11 = r11.setAppKey(r0)
            com.taobao.orange.OConfig$Builder r11 = r11.setAppVersion(r7)
            com.taobao.orange.OConfig$Builder r11 = r11.setEnv(r5)
            com.taobao.orange.OConstant$SERVER r0 = com.taobao.orange.OConstant.SERVER.TAOBAO
            int r0 = r0.ordinal()
            com.taobao.orange.OConfig$Builder r11 = r11.setServerType(r0)
            com.taobao.orange.OConstant$UPDMODE r0 = com.taobao.orange.OConstant.UPDMODE.O_XMD
            int r0 = r0.ordinal()
            com.taobao.orange.OConfig$Builder r11 = r11.setIndexUpdateMode(r0)
            com.taobao.orange.OConfig$Builder r11 = r11.setReportAck(r3)
            com.taobao.orange.OConfig$Builder r11 = r11.setStatUsedConfig(r2)
            r0 = -1
            com.taobao.orange.OConfig$Builder r11 = r11.setTime(r0)
            com.taobao.orange.OConfig$Builder r11 = r11.setEnableDiffIndex(r2)
            com.taobao.orange.OConfig r11 = r11.build()
            com.taobao.orange.OrangeConfig r0 = com.taobao.orange.OrangeConfig.getInstance()
            r0.init(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.launch.TaobaoLaunchOrange.init(android.app.Application, java.util.HashMap):void");
    }

    private void initABGlobal(Context context) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.ab.api.ABGlobal");
            Method method = cls.getMethod("isFeatureOpened", Context.class, String.class);
            com.taobao.orange.a.F = ((Boolean) method.invoke(cls, context, ORANGE_REGEXP)).booleanValue();
            com.taobao.orange.a.G = ((Boolean) method.invoke(cls, context, ORANGE_LOAD_CONFIG)).booleanValue();
            OLog.e(TAG, "initABGlobal", "regexpOptimize", Boolean.valueOf(com.taobao.orange.a.F), "loadConfigOptimize", Boolean.valueOf(com.taobao.orange.a.G));
        } catch (Throwable th) {
            OLog.e(TAG, "initABGlobal error.", "error", th.getMessage());
        }
    }
}
