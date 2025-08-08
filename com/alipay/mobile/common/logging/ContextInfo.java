package com.alipay.mobile.common.logging;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ContextInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, String> v;

    /* renamed from: a  reason: collision with root package name */
    public Bundle f5401a = new Bundle();
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    private Context w;
    private String x;
    private long y;

    static {
        HashMap hashMap = new HashMap();
        v = hashMap;
        hashMap.put("com.eg.android.AlipayGphone", "Android-container");
        v.put("com.eg.android.AlipayGphoneRC", "Android-container-RC");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[Catch: Throwable -> 0x01ce, TryCatch #2 {Throwable -> 0x01ce, blocks: (B:3:0x0019, B:5:0x002a, B:6:0x0035, B:14:0x0053, B:16:0x0057, B:18:0x006e, B:24:0x007e, B:26:0x0082, B:28:0x0088, B:32:0x0091, B:33:0x00ac, B:34:0x00c2, B:36:0x00c6, B:37:0x00d6, B:43:0x00ee, B:44:0x00f2), top: B:51:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ContextInfo(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.ContextInfo.<init>(android.content.Context):void");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (LoggerFactory.getProcessInfo().isExtProcess() && this.g == null) {
            this.g = b(LoggingSPCache.STORAGE_USERID, "");
        }
        return this.g;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (LoggerFactory.getProcessInfo().isExtProcess() && this.i == null) {
            this.i = b("utdid", "");
        }
        return this.i;
    }

    public final synchronized String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        return this.x;
    }

    public final synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (StringUtils.isEmpty(this.x) || Math.abs(System.currentTimeMillis() - this.y) > TimeUnit.MINUTES.toMillis(30L)) {
            this.y = System.currentTimeMillis();
            this.x = UUID.randomUUID().toString();
        }
    }

    public final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || str2 == null) {
        } else {
            this.f5401a.putString(str, str2);
            c(str, str2);
            if (!LoggerFactory.getProcessInfo().isPushProcess()) {
                return;
            }
            b(null, str, str2);
            c(null, str, str2);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            this.f5401a.clear();
        } catch (Throwable unused) {
        }
    }

    public final void a(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abb7e80", new Object[]{this, bundle, str, str2});
        } else if (LoggerFactory.getProcessInfo().isMainProcess()) {
            a(LogContext.PUSH_LOG_SERVICE_CLASS_NAME, bundle, str, str2);
            if (LoggerFactory.getLogContext().isDisableToolsProcess()) {
                return;
            }
            if (LoggerFactory.getLogContext().getToolsUploadInterceptor() != null && LoggerFactory.getLogContext().getToolsUploadInterceptor().isUplaod() == 2) {
                return;
            }
            a(LogContext.TOOLS_SERVICE_CLASS_NAME, bundle, str, str2);
        } else if (LoggerFactory.getProcessInfo().isPushProcess()) {
            if (!LoggerFactory.getLogContext().isDisableToolsProcess()) {
                if (LoggerFactory.getLogContext().getToolsUploadInterceptor() == null || LoggerFactory.getLogContext().getToolsUploadInterceptor().isUplaod() != 2) {
                    a(LogContext.TOOLS_SERVICE_CLASS_NAME, bundle, str, str2);
                } else {
                    HashMap hashMap = new HashMap();
                    try {
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.w.getSystemService("activity")).getRunningAppProcesses()) {
                            hashMap.put(runningAppProcessInfo.processName, runningAppProcessInfo.processName);
                        }
                    } catch (Throwable th) {
                        new StringBuilder("notifyToolProcessToUpdateLogContext: ").append(th);
                    }
                    if (hashMap.containsKey(LogContext.TOOLS_SERVICE_CLASS_NAME)) {
                        Intent intent = new Intent();
                        intent.setClassName(this.w, LogContext.TOOLS_SERVICE_CLASS_NAME);
                        if (bundle == null) {
                            intent.setAction(this.w.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT);
                            intent.putExtra("type", str);
                            intent.putExtra("value", str2);
                        } else {
                            intent.setAction(this.w.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT_BATCH);
                            try {
                                intent.putExtras(bundle);
                            } catch (Throwable th2) {
                                new StringBuilder("notifyToolProcessToUpdateLogContext: ").append(th2);
                            }
                        }
                        try {
                            intent.setPackage(this.w.getPackageName());
                        } catch (Throwable unused) {
                        }
                        try {
                            this.w.startService(intent);
                        } catch (Throwable th3) {
                            new StringBuilder("notifyToolProcessToUpdateLogContext: ").append(th3);
                        }
                    } else if (bundle == null) {
                        a(ProcessInfo.ALIAS_TOOLS, str, str2);
                    } else {
                        try {
                            for (String str3 : bundle.keySet()) {
                                a(ProcessInfo.ALIAS_TOOLS, str3, bundle.getString(str3));
                            }
                        } catch (Throwable th4) {
                            new StringBuilder("notifyToolProcessToUpdateLogContext: ").append(th4);
                        }
                    }
                }
            }
            c(str, str2);
            b(bundle, str, str2);
            c(bundle, str, str2);
        } else if (!LoggerFactory.getProcessInfo().isToolsProcess() && !LoggerFactory.getProcessInfo().isExtProcess()) {
            new StringBuilder("updateLogContext, error: unknown process ").append(LoggerFactory.getProcessInfo().getProcessAlias());
        }
    }

    private void a(String str, Bundle bundle, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77702376", new Object[]{this, str, bundle, str2, str3});
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.w, str);
        if (bundle == null) {
            intent.setAction(this.w.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT);
            intent.putExtra("type", str2);
            intent.putExtra("value", str3);
        } else {
            intent.setAction(this.w.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT_BATCH);
            try {
                intent.putExtras(bundle);
            } catch (Throwable unused) {
            }
        }
        try {
            intent.setPackage(this.w.getPackageName());
        } catch (Throwable unused2) {
        }
        try {
            this.w.startService(intent);
        } catch (Throwable th) {
            new StringBuilder("notifyOtherProcessToUpdateLogContext: ").append(th);
        }
    }

    private void b(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70bf49df", new Object[]{this, bundle, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.w.getSystemService("activity")).getRunningAppProcesses()) {
                hashMap.put(runningAppProcessInfo.processName, runningAppProcessInfo.processName);
            }
        } catch (Throwable th) {
            new StringBuilder("notifyLiteProcessToUpdateLogContext_1: ").append(th);
        }
        for (int i = 1; i <= 5; i++) {
            String concat = "com.alipay.mobile.common.logging.process.LogServiceInlite".concat(String.valueOf(i));
            if (hashMap.containsKey(concat)) {
                Intent intent = new Intent();
                intent.setClassName(this.w, concat);
                if (bundle == null) {
                    intent.setAction(this.w.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT);
                    intent.putExtra("type", str);
                    intent.putExtra("value", str2);
                } else {
                    intent.setAction(this.w.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT_BATCH);
                    try {
                        intent.putExtras(bundle);
                    } catch (Throwable th2) {
                        new StringBuilder("notifyLiteProcessToUpdateLogContext_2: ").append(th2);
                    }
                }
                try {
                    intent.setPackage(this.w.getPackageName());
                } catch (Throwable unused) {
                }
                try {
                    this.w.startService(intent);
                } catch (Throwable th3) {
                    new StringBuilder("notifyLiteProcessToUpdateLogContext_3: ").append(th3);
                }
            } else if (bundle == null) {
                a("lite".concat(String.valueOf(i)), str, str2);
            } else {
                try {
                    for (String str3 : bundle.keySet()) {
                        a("lite".concat(String.valueOf(i)), str3, bundle.getString(str3));
                    }
                } catch (Throwable th4) {
                    new StringBuilder("notifyLiteProcessToUpdateLogContext_4: ").append(th4);
                }
            }
        }
    }

    private void c(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c3153e", new Object[]{this, bundle, str, str2});
            return;
        }
        try {
            if (LoggerFactory.getProcessInfo().isExtProcessExist()) {
                return;
            }
            if (bundle == null) {
                a("ext", str, str2);
                return;
            }
            for (String str3 : bundle.keySet()) {
                a("ext", str3, bundle.getString(str3));
            }
        } catch (Throwable unused) {
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (StringUtils.isEmpty(str2) || str3 == null) {
        } else {
            try {
                Context context = this.w;
                context.getSharedPreferences((this.w.getPackageName() + "-" + str) + '.' + LoggingSPCache.CACHE_FILE_NAME, 0).edit().putString(str2, str3).apply();
            } catch (Throwable unused) {
                StringBuilder sb = new StringBuilder("updateOtherProcessSP: ");
                sb.append(str);
                sb.append(", type: ");
                sb.append(str2);
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (StringUtils.isEmpty(this.p)) {
            this.q = this.p;
        } else {
            int lastIndexOf = this.p.lastIndexOf(45);
            if (lastIndexOf < 0) {
                this.q = null;
            } else {
                this.q = this.p.substring(lastIndexOf + 1);
            }
        }
    }

    private void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (!LoggerFactory.getProcessInfo().isPushProcess() || StringUtils.isEmpty(str) || str2 == null) {
        } else {
            if (!LoggingSPCache.STORAGE_USERID.equals(str) && !LoggingSPCache.STORAGE_CLIENTID.equals(str) && !"utdid".equals(str)) {
                return;
            }
            d(str, str2);
        }
    }

    private void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        try {
            this.w.getSharedPreferences("SharedInfoForMultiProc", 4).edit().putString("key_".concat(String.valueOf(str)), str2).apply();
        } catch (Throwable unused) {
        }
    }

    public final String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        try {
            return this.w.getSharedPreferences("SharedInfoForMultiProc", 4).getString("key_".concat(String.valueOf(str)), str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
