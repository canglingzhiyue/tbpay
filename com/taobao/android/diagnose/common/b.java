package com.taobao.android.diagnose.common;

import android.content.Context;
import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.AppInfo;
import com.taobao.android.diagnose.v;
import java.util.Random;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_EXCEPTION = 8;
    public static final int STATUS_FORMAT_FAILED = 9;
    public static final int STATUS_HAPPEN = 1;
    public static final int STATUS_SAVE = 2;
    public static final int STATUS_SAVE_FAILED = 7;
    public static final int STATUS_UPLOAD = 3;
    public static final int STATUS_UPLOAD_DISABLE = 6;
    public static final int STATUS_UPLOAD_FAILED = 5;
    public static final int STATUS_UPLOAD_SUCCESS = 4;

    /* renamed from: a  reason: collision with root package name */
    private static int f11699a;

    static {
        kge.a(1404517302);
        f11699a = new Random().nextInt(10000);
    }

    public static void a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526812", new Object[]{str, new Integer(i), new Integer(i2)});
        } else if (!a()) {
        } else {
            String format = String.format("snapshotID:%s;exceptionType:%d;status:%d", str, Integer.valueOf(i), Integer.valueOf(i2));
            AppMonitor.Alarm.commitSuccess("diagnose", "exception", format);
            v.a("DiagnoseMonitor", format);
        }
    }

    public static void a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{str, new Integer(i), str2});
        } else if (!a()) {
        } else {
            String format = String.format("snapshotID:%s;exceptionType:%d;status:%d", str, Integer.valueOf(i), 8);
            AppMonitor.Alarm.commitFail("diagnose", "exception", format, "", str2);
            v.a("DiagnoseMonitor", format);
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        int i = com.taobao.android.diagnose.config.a.i();
        return i == 10000 || i >= f11699a;
    }

    public static void a(Context context, AppInfo appInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87fc2d6", new Object[]{context, appInfo});
        } else if (System.currentTimeMillis() - com.taobao.android.diagnose.config.a.d(context) < 86400000) {
        } else {
            String format = String.format("osType:%s,osVer:%s,inner:%b,isDebug:%b,harmonyVer:%s,run64Bit:%b,support64Bit:%b,apkType:%d,bTaoFlag:%d,osSdk:%d", appInfo.os, appInfo.osDisplay, Boolean.valueOf(appInfo.isInner), Boolean.valueOf(appInfo.isDebug), appInfo.harmonyVer, Boolean.valueOf(appInfo.run64Bit), Boolean.valueOf(a.a()), Integer.valueOf(a.a(context)), 0, Integer.valueOf(Build.VERSION.SDK_INT));
            AppMonitor.Alarm.commitSuccess("diagnose", "data", format);
            v.a("DiagnoseMonitor", format);
            com.taobao.android.diagnose.config.a.c(context);
        }
    }

    public static void a(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed98968", new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        String format = String.format("type:TYPE_MEM_EXHAUST;value1:%d;value2:%d;value3:%d;value4:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
        v.a("DiagnoseMonitor", "memoryExhaustInfo: " + format);
        AppMonitor.Alarm.commitSuccess("diagnose", "runtimeInfo", format);
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        AppInfo i2 = com.taobao.android.diagnose.c.a().d().i();
        String format = String.format("type:TYPE_ABNORMAL;value1:%d;value2:%b;value3:%b", Integer.valueOf(i), Boolean.valueOf(i2.isInner), Boolean.valueOf(i2.isDebug));
        v.a("DiagnoseMonitor", "statisticsAbnormal: " + format);
        AppMonitor.Alarm.commitSuccess("diagnose", "runtimeInfo", format);
    }
}
