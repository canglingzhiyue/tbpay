package com.taobao.monitor.adapter.init;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.application.common.impl.d;
import com.taobao.monitor.adapter.test.H5ProcedureGetterBridge;
import java.io.File;
import java.util.HashMap;
import java.util.Random;
import tb.mms;
import tb.mna;
import tb.mpi;
import tb.mqe;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences("apm", 0);
        a(application, sharedPreferences, hashMap);
        c(sharedPreferences);
        a(sharedPreferences);
        b(sharedPreferences);
    }

    private static void a(Application application, SharedPreferences sharedPreferences, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de688086", new Object[]{application, sharedPreferences, hashMap});
        } else if (!mqe.a(hashMap.get(mms.KEY_NEED_TBSPEED), true)) {
        } else {
            boolean z = sharedPreferences.getBoolean("isApm", true);
            d.a().b("isApm", z);
            d.a().b("isApmSpeed", TBSpeed.isSpeedEdition(application, "apm") & z);
        }
    }

    private static void c(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d412eb3a", new Object[]{sharedPreferences});
            return;
        }
        boolean z2 = sharedPreferences.getBoolean(a.GLOBAL_SAMPLE, true);
        mpi.c("ParamCache", a.GLOBAL_SAMPLE, Boolean.valueOf(z2));
        com.taobao.monitor.impl.common.d.d = z2 && sharedPreferences.getBoolean(a.PAGE_LOAD_SAMPLE, com.taobao.monitor.impl.common.d.d);
        mpi.c("ParamCache", a.PAGE_LOAD_SAMPLE, Boolean.valueOf(com.taobao.monitor.impl.common.d.d));
        com.taobao.monitor.impl.common.d.o = z2 && sharedPreferences.getBoolean(a.FRAGMENT_PAGE_LOAD_SAMPLE, com.taobao.monitor.impl.common.d.o);
        mpi.c("ParamCache", a.FRAGMENT_PAGE_LOAD_SAMPLE, Boolean.valueOf(com.taobao.monitor.impl.common.d.o));
        com.taobao.monitor.impl.common.d.G = z2 && sharedPreferences.getBoolean(a.NEXT_LAUNCH_UPLOAD_SAMPLE, com.taobao.monitor.impl.common.d.G);
        mpi.c("ParamCache", a.NEXT_LAUNCH_UPLOAD_SAMPLE, Boolean.valueOf(com.taobao.monitor.impl.common.d.G));
        com.taobao.monitor.impl.common.d.y = !z2 || sharedPreferences.getBoolean(a.NEED_WX_END_RUNTIME_INFO, com.taobao.monitor.impl.common.d.y);
        mpi.c("ParamCache", a.NEED_WX_END_RUNTIME_INFO, Boolean.valueOf(com.taobao.monitor.impl.common.d.y));
        com.taobao.monitor.impl.common.d.O = z2 && sharedPreferences.getBoolean(a.MAIN_THREAD_MONITOR_SAMPLE, com.taobao.monitor.impl.common.d.O);
        mpi.c("ParamCache", a.MAIN_THREAD_MONITOR_SAMPLE, Boolean.valueOf(com.taobao.monitor.impl.common.d.O));
        com.taobao.monitor.impl.common.d.V = z2 && sharedPreferences.getBoolean(a.BATTERY_CANARY_SAMPLE, com.taobao.monitor.impl.common.d.V);
        mpi.c("ParamCache", a.BATTERY_CANARY_SAMPLE, Boolean.valueOf(com.taobao.monitor.impl.common.d.V));
        com.taobao.monitor.impl.common.d.aa = z2 && sharedPreferences.getBoolean(a.BLOCK_STACK_SAMPLE, com.taobao.monitor.impl.common.d.aa);
        mpi.c("ParamCache", a.BLOCK_STACK_SAMPLE, Boolean.valueOf(com.taobao.monitor.impl.common.d.aa));
        com.taobao.monitor.impl.common.d.k = sharedPreferences.getBoolean(a.FILTERED_PAGE_TAG_SAMPLE, com.taobao.monitor.impl.common.d.k);
        mpi.c("ParamCache", a.FILTERED_PAGE_TAG_SAMPLE, Boolean.valueOf(com.taobao.monitor.impl.common.d.k));
        com.taobao.monitor.impl.common.d.c = sharedPreferences.getBoolean(a.CLOSE_SAMPLE_ON_GREY, com.taobao.monitor.impl.common.d.c);
        com.taobao.monitor.impl.common.d.h = z2 && sharedPreferences.getBoolean(a.WINDVANE_H5_SAMPLE, com.taobao.monitor.impl.common.d.h);
        mpi.c("ParamCache", a.WINDVANE_H5_SAMPLE, Boolean.valueOf(com.taobao.monitor.impl.common.d.h));
        com.taobao.monitor.impl.common.d.i = z2 && sharedPreferences.getBoolean(a.WINDVANE_UC_T2_SAMPLE, com.taobao.monitor.impl.common.d.i);
        mpi.c("ParamCache", a.WINDVANE_UC_T2_SAMPLE, Boolean.valueOf(com.taobao.monitor.impl.common.d.i));
        com.taobao.monitor.impl.common.d.ad = z2 && sharedPreferences.getBoolean(a.LOOPER_OBSERVER_SAMPLE, com.taobao.monitor.impl.common.d.ad);
        mpi.c("ParamCache", a.LOOPER_OBSERVER_SAMPLE, Boolean.valueOf(com.taobao.monitor.impl.common.d.ad));
        com.taobao.monitor.impl.common.d.aj = z2 && sharedPreferences.getBoolean(a.NEED_PAGE_PSS, com.taobao.monitor.impl.common.d.aj);
        mpi.c("ParamCache", a.NEED_PAGE_PSS, Boolean.valueOf(com.taobao.monitor.impl.common.d.aj));
        com.taobao.monitor.impl.common.d.al = z2 && sharedPreferences.getBoolean(a.USE_NEW_STANDARD, false);
        if (!z2 || !sharedPreferences.getBoolean(a.FIX_LEAK, false)) {
            z = false;
        }
        com.taobao.monitor.impl.common.d.j = z;
    }

    private static void a(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d7097c", new Object[]{sharedPreferences});
            return;
        }
        String string = sharedPreferences.getString(a.SPECIAL_PAGE_SAMPLE, "");
        try {
            if (TextUtils.isEmpty(string)) {
                return;
            }
            float nextFloat = new Random(System.currentTimeMillis()).nextFloat();
            mpi.c("ParamCache", "computeRandomSample", Float.valueOf(nextFloat));
            String[] split = string.split(",");
            if (split.length <= 0) {
                return;
            }
            for (String str : split) {
                String[] split2 = str.split(":");
                if (split2.length == 2 && nextFloat < Float.parseFloat(split2[1])) {
                    mna.a(split2[0]);
                    mpi.c("ParamCache", a.SPECIAL_PAGE_SAMPLE, split2[0]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void b(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf4fa5b", new Object[]{sharedPreferences});
            return;
        }
        mms.n = sharedPreferences.getString(H5ProcedureGetterBridge.SP_KEY_REALTIME_TRACE_ID, "");
        long j = sharedPreferences.getLong(H5ProcedureGetterBridge.SP_KEY_REALTIME_TRACE_VALID_TIME, -1L);
        mms.o = "scan";
        if (j > 0 && System.currentTimeMillis() >= j) {
            mms.n = "";
            mms.o = "";
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(H5ProcedureGetterBridge.SP_KEY_REALTIME_TRACE_ID);
            edit.remove(H5ProcedureGetterBridge.SP_KEY_REALTIME_TRACE_VALID_TIME);
            edit.apply();
        }
        if (TextUtils.isEmpty(mms.n) && new File("/data/local/tmp/.apm/.traceId").exists()) {
            mms.n = a("/data/local/tmp/.apm/.traceId");
            mms.o = "file";
        }
        if (TextUtils.isEmpty(mms.n)) {
            return;
        }
        mms.h = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r3) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.monitor.adapter.init.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "9f352ae"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L15:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            r1 = 0
            if (r3 != 0) goto L22
            return r1
        L22:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L3b java.lang.NumberFormatException -> L3d java.io.IOException -> L3f
            java.lang.String r2 = "r"
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L3b java.lang.NumberFormatException -> L3d java.io.IOException -> L3f
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.NumberFormatException -> L37 java.io.IOException -> L39 java.lang.Throwable -> L4f
            r3.close()     // Catch: java.io.IOException -> L32
            goto L36
        L32:
            r3 = move-exception
            r3.printStackTrace()
        L36:
            return r0
        L37:
            r0 = move-exception
            goto L41
        L39:
            r0 = move-exception
            goto L41
        L3b:
            r0 = move-exception
            goto L51
        L3d:
            r0 = move-exception
            goto L40
        L3f:
            r0 = move-exception
        L40:
            r3 = r1
        L41:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L4e
            r3.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r3 = move-exception
            r3.printStackTrace()
        L4e:
            return r1
        L4f:
            r0 = move-exception
            r1 = r3
        L51:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.io.IOException -> L57
            goto L5b
        L57:
            r3 = move-exception
            r3.printStackTrace()
        L5b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.monitor.adapter.init.b.a(java.lang.String):java.lang.String");
    }
}
