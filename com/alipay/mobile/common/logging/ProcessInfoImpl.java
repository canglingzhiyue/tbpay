package com.alipay.mobile.common.logging;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.riy;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ProcessInfoImpl implements ProcessInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long B;

    /* renamed from: a  reason: collision with root package name */
    private Context f5410a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private Map<String, String> y = null;
    private Bundle z = null;
    private Uri A = null;

    public ProcessInfoImpl(Context context) {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.B = -1L;
        if (context == null) {
            return;
        }
        this.f5410a = context;
        this.b = context.getPackageName();
        this.d = a();
        this.e = this.b;
        this.f = this.b + ":push";
        this.g = this.b + ":tools";
        this.h = this.b + ":ext";
        this.i = this.b + riy.CONDITION_IF_MIDDLE + ProcessInfo.ALIAS_REGION_HELPER;
        this.j = this.b + riy.CONDITION_IF_MIDDLE + ProcessInfo.ALIAS_SSS;
        this.p = this.e.equals(this.d);
        this.q = this.f.equals(this.d);
        this.r = this.g.equals(this.d);
        this.s = this.h.equals(this.d);
        this.w = this.i.equals(this.d);
        this.x = this.j.equals(this.d);
        String str = this.d;
        this.t = str.startsWith(this.b + ":lite");
        String str2 = this.d;
        this.u = str2.startsWith(this.b + ":sandboxed_");
        this.v = isCurrentProcessIsolated();
        if (this.t) {
            new StringBuilder("loggingi mIsLiteProcess: ").append(this.t);
        }
        if (this.p) {
            this.c = "main";
        } else if (this.q) {
            this.c = "push";
        } else if (this.r) {
            this.c = ProcessInfo.ALIAS_TOOLS;
        } else if (this.s) {
            this.c = "ext";
        } else if (this.w) {
            this.c = ProcessInfo.ALIAS_REGION_HELPER;
        } else if (this.x) {
            this.c = ProcessInfo.ALIAS_SSS;
        } else {
            new StringBuilder("unknown process: ").append(this.d);
            if (StringUtils.isEmpty(this.d)) {
                this.c = "unknown";
            } else {
                String str3 = this.d;
                this.c = str3.replace(this.b + ":", "");
            }
        }
        this.k = this.b + "-" + this.c;
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("-main");
        this.l = sb.toString();
        this.m = this.b + "-push";
        this.n = this.b + "-tools";
        this.o = this.b + "-ext";
        this.B = System.currentTimeMillis();
    }

    private String a() {
        String str;
        String str2;
        try {
            Class<?> loadClass = getClass().getClassLoader().loadClass(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = loadClass.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = loadClass.getDeclaredMethod(ProcessUtils.GET_PROCESS_NAME, new Class[0]);
            declaredMethod2.setAccessible(true);
            str = (String) declaredMethod2.invoke(invoke, new Object[0]);
        } catch (Throwable unused) {
            str = null;
        }
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            Method declaredMethod3 = getClass().getClassLoader().loadClass("android.ddm.DdmHandleAppName").getDeclaredMethod("getAppName", new Class[0]);
            declaredMethod3.setAccessible(true);
            str2 = (String) declaredMethod3.invoke(null, new Object[0]);
        } catch (Throwable unused2) {
            str2 = str;
        }
        return !StringUtils.isEmpty(str2) ? str2 : getProcessNameById(getProcessId());
    }

    public static boolean isCurrentProcessIsolated() {
        try {
            Method declaredMethod = Process.class.getDeclaredMethod("isIsolated", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (invoke instanceof Boolean)) {
                    return ((Boolean) invoke).booleanValue();
                }
            }
        } catch (Throwable unused) {
        }
        int myUid = Process.myUid() % 100000;
        return myUid >= 99000 && myUid <= 99999;
    }

    public void prepareStartupReason() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b53ce1", new Object[]{this});
        } else if (this.y != null) {
        } else {
            this.y = a(Looper.getMainLooper());
        }
    }

    public void addStartupReasonParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5900db2d", new Object[]{this});
            return;
        }
        prepareStartupReason();
        try {
            if (this.y == null) {
                LoggerFactory.getTraceLogger().warn("ProcessInfo", "addStartupReasonParams mStartupReason is null");
                return;
            }
            this.y.get("toString");
            CrashBridge.d();
            this.y.get(ProcessInfo.SR_ACTION_NAME);
            CrashBridge.d();
            this.y.get(ProcessInfo.SR_COMPONENT_NAME);
            CrashBridge.d();
            if (StringUtils.isEmpty(this.y.get(LogContext.STORAGE_APPID))) {
                return;
            }
            LoggerFactory.getLogContext().putContextParam(LogContext.STORAGE_APPID, this.y.get(ProcessInfo.SR_APP_ID));
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("ProcessInfo", "add CrashHeader StartupReason", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[Catch: Throwable -> 0x03ca, TRY_ENTER, TryCatch #1 {Throwable -> 0x03ca, blocks: (B:3:0x0004, B:10:0x0049, B:14:0x0054, B:18:0x0066, B:21:0x006d, B:25:0x007d, B:28:0x0085, B:30:0x008b, B:32:0x0097, B:33:0x00b2, B:34:0x00b3, B:9:0x0041), top: B:154:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[Catch: Throwable -> 0x03ca, TRY_LEAVE, TryCatch #1 {Throwable -> 0x03ca, blocks: (B:3:0x0004, B:10:0x0049, B:14:0x0054, B:18:0x0066, B:21:0x006d, B:25:0x007d, B:28:0x0085, B:30:0x008b, B:32:0x0097, B:33:0x00b2, B:34:0x00b3, B:9:0x0041), top: B:154:0x0004 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006c -> B:8:0x003f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> a(android.os.Looper r17) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.ProcessInfoImpl.a(android.os.Looper):java.util.Map");
    }

    private static boolean a(String str, Object obj) {
        if (ProcessInfo.RECORD_ACTIVITY.equals(str) || ProcessInfo.RECORD_RECEIVER.equals(str) || ProcessInfo.RECORD_SERVICE_CREATE.equals(str) || ProcessInfo.RECORD_SERVICE_BIND.equals(str) || ProcessInfo.RECORD_SERVICE_ARGS.equals(str) || ProcessInfo.RECORD_BACKUP_AGENT.equals(str) || ProcessInfo.RECORD_PROVIDER.equals(str) || ProcessInfo.RECORD_NEW_INTENT.equals(str) || ProcessInfo.RECORD_APP_BIND.equals(str)) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 28 || !ProcessInfo.CLIENT_TRANSACTION.equals(str)) {
            return false;
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField("mActivityCallbacks");
            declaredField.setAccessible(true);
            List<Object> list = (List) declaredField.get(obj);
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (Object obj2 : list) {
                if (obj2.getClass().getSimpleName().equals(ProcessInfo.LAUNCH_ACTIVITY_ITEM)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Intent a(Object obj, String str) {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return (Intent) declaredField.get(obj);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getPackageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4fb6b1e", new Object[]{this}) : this.b;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getProcessAlias() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6d25dbc2", new Object[]{this}) : this.c;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getMainProcessName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f644bee", new Object[]{this}) : this.e;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getPushProcessName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f540314f", new Object[]{this}) : this.f;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getToolsProcessName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1620f5e4", new Object[]{this}) : this.g;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getExtProcessName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d9a828aa", new Object[]{this}) : this.h;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getRegionHelperProcessName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f8d27f7", new Object[]{this}) : this.i;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getProcessName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62fd1115", new Object[]{this}) : this.d;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getMainProcessTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("285e3cff", new Object[]{this}) : this.l;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getPushProcessTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dcafa77e", new Object[]{this}) : this.m;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getToolsProcessTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7097c49", new Object[]{this}) : this.n;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getExtProcessTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e40dd8c3", new Object[]{this}) : this.o;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public String getProcessTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b94b6f8", new Object[]{this}) : this.k;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public Set<Integer> getProcessIdsByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("9d39ce61", new Object[]{this, str});
        }
        HashSet hashSet = new HashSet();
        if (StringUtils.isEmpty(str)) {
            return hashSet;
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f5410a.getSystemService("activity")).getRunningAppProcesses()) {
                if (str.equals(runningAppProcessInfo.processName)) {
                    hashSet.add(Integer.valueOf(runningAppProcessInfo.pid));
                }
            }
        } catch (Throwable th) {
            new StringBuilder("getProcessIdsByName: ").append(th);
        }
        return hashSet;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getProcessIdByName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61577bda", new Object[]{this, str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return -1;
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f5410a.getSystemService("activity")).getRunningAppProcesses()) {
                if (str.equals(runningAppProcessInfo.processName)) {
                    return runningAppProcessInfo.pid;
                }
            }
            return -1;
        } catch (Throwable th) {
            new StringBuilder("getProcessIdByName: ").append(th);
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        r0 = r2.processName;
     */
    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getProcessNameById(int r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.ProcessInfoImpl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1d
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            r1[r2] = r3
            java.lang.String r5 = "123a169a"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L1d:
            r0 = 0
            android.content.Context r1 = r4.f5410a     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L43
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> L43
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L43
        L30:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L43
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Throwable -> L43
            int r3 = r2.pid     // Catch: java.lang.Throwable -> L43
            if (r3 != r5) goto L30
            java.lang.String r0 = r2.processName     // Catch: java.lang.Throwable -> L43
            goto L4e
        L43:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getProcessNameById: "
            r1.<init>(r2)
            r1.append(r5)
        L4e:
            if (r0 != 0) goto L52
            java.lang.String r0 = ""
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.ProcessInfoImpl.getProcessNameById(int):java.lang.String");
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getMainProcessId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("78724d75", new Object[]{this})).intValue() : this.p ? getProcessId() : getProcessIdByName(this.e);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isMainProcessExist() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("32b32a76", new Object[]{this})).booleanValue() : this.p || getProcessIdByName(this.e) > 0;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getPushProcessId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4134a9b4", new Object[]{this})).intValue() : this.q ? getProcessId() : getProcessIdByName(this.f);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isPushProcessExist() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c49ff1d7", new Object[]{this})).booleanValue() : this.q || getProcessIdByName(this.f) > 0;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getToolsProcessId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8e9ab3f", new Object[]{this})).intValue() : this.r ? getProcessId() : getProcessIdByName(this.g);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isToolsProcessExist() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f956344", new Object[]{this})).booleanValue() : this.r || getProcessIdByName(this.g) > 0;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getExtProcessId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8a181239", new Object[]{this})).intValue() : this.s ? getProcessId() : getProcessIdByName(this.h);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isExtProcessExist() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3ca9d0a", new Object[]{this})).booleanValue() : this.s || getProcessIdByName(this.h) > 0;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getRegionHelperProcessId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1f3240c", new Object[]{this})).intValue() : this.w ? getProcessId() : getProcessIdByName(this.i);
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isRegionHelperProcessExist() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26f0247f", new Object[]{this})).booleanValue() : this.w || getProcessIdByName(this.i) > 0;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getProcessId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa1a83ae", new Object[]{this})).intValue() : Process.myPid();
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3b14d7b6", new Object[]{this})).intValue() : Process.myUid();
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public int getThreadId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2a77e935", new Object[]{this})).intValue() : Process.myTid();
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[]{this})).booleanValue() : this.p;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isPushProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6d91a976", new Object[]{this})).booleanValue() : this.q;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isToolsProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48cc47e9", new Object[]{this})).booleanValue() : this.r;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isExtProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c7f8a63", new Object[]{this})).booleanValue() : this.s;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isLiteProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("472ca362", new Object[]{this})).booleanValue() : this.t;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isSandboxProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a35d1cfd", new Object[]{this})).booleanValue() : this.u;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isIsolatedProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3de19317", new Object[]{this})).booleanValue() : this.v;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isRegionHelperProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57c66dce", new Object[]{this})).booleanValue() : this.w;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isSSSProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5fca4f31", new Object[]{this})).booleanValue() : this.x;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public Map<String, String> getStartupReason() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b45ea527", new Object[]{this}) : this.y;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public Bundle getStartupBundle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("d19a6274", new Object[]{this}) : this.z;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public Uri getStartupData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("6829d3cf", new Object[]{this}) : this.A;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public long getProcessStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("95784991", new Object[]{this})).longValue() : this.B;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isStartupByAnyActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e1cb11c", new Object[]{this})).booleanValue();
        }
        Map<String, String> startupReason = getStartupReason();
        if (startupReason != null) {
            return "true".equals(startupReason.get(ProcessInfo.SR_BY_ACTIVITY));
        }
        return false;
    }

    @Override // com.alipay.mobile.common.logging.api.ProcessInfo
    public boolean isStartupByLauncherIcon() {
        Map<String, String> startupReason;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3243420e", new Object[]{this})).booleanValue();
        }
        if (!isMainProcess() || (startupReason = getStartupReason()) == null) {
            return false;
        }
        return "com.eg.android.AlipayGphone.AlipayLogin".equals(startupReason.get(ProcessInfo.SR_COMPONENT_NAME));
    }

    public boolean isHuaweiPreloadDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84c2ff19", new Object[]{this})).booleanValue();
        }
        try {
            return PreferenceManager.getDefaultSharedPreferences(this.f5410a).getBoolean("huawei_preload_launch_models", "PAR-TL00 PAR-LX9 PAR-LX1 PAR-LX1M PAR-AL00 PAR-TL20".contains(Build.MODEL));
        } catch (Throwable unused) {
            return false;
        }
    }
}
