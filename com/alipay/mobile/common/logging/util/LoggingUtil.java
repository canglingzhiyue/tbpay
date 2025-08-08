package com.alipay.mobile.common.logging.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.Pair;
import com.alibaba.fastjson2.time.e;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.bgy;
import tb.riy;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LoggingUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static int f5461a = -1;
    private static int b = -1;
    private static int c = -1;
    private static int d = -1;
    private static Boolean e;
    private static final String[] f = {"com.eg.android.AlipayGphone"};
    private static Random g;

    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: classes3.dex */
    public interface FillBufferHandler {
        Object handleKey(Object obj);

        Object handleValue(Object obj);
    }

    public static boolean isDebuggable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e5a578d", new Object[]{context})).booleanValue();
        }
        if (f5461a < 0) {
            if (context == null) {
                return false;
            }
            try {
                f5461a = (context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) == 2 ? 1 : 0;
            } catch (Throwable unused) {
                f5461a = 0;
            }
        }
        return f5461a == 1;
    }

    public static void reflectErrorLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda573ca", new Object[]{str});
        } else if (str == null) {
        } else {
            reflectErrorLog("LoggingUtil", str, true);
        }
    }

    public static void reflectErrorLog(String str, String str2, boolean z) {
        try {
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append('[');
                sb.append(Thread.currentThread().getName());
                sb.append(']');
            }
            sb.append(str2);
            Class.forName("android.util.Log").getMethod("e", String.class, String.class).invoke(null, str, sb.toString());
        } catch (Throwable unused) {
        }
    }

    public static void reflectErrorLog(String str, Throwable th) {
        if (str != null && th != null) {
            try {
                Class.forName("android.util.Log").getMethod("e", String.class, String.class, Throwable.class).invoke(null, "LoggingUtil", '[' + Thread.currentThread().getName() + ']' + str, th);
            } catch (Throwable unused) {
            }
        }
    }

    public static void reflectErrorLogAutomationCrash(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53b50e8", new Object[]{str});
            return;
        }
        reflectErrorLog("automationcrash", "Force Start parse for automation", false);
        reflectErrorLog(str);
        reflectErrorLog("automationcrash", "Force End parse for automation", false);
    }

    public static String getNowTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfbca9f0", new Object[]{new Long(j)});
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(e.SHANGHAI_ZONE_ID_NAME));
        calendar.setTimeInMillis(j);
        StringBuilder sb = new StringBuilder();
        int i = calendar.get(1);
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        int i6 = calendar.get(13);
        int i7 = calendar.get(14);
        sb.append(i);
        sb.append('-');
        if (i2 < 10) {
            sb.append('0');
        }
        sb.append(i2);
        sb.append('-');
        if (i3 < 10) {
            sb.append('0');
        }
        sb.append(i3);
        sb.append(' ');
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
        sb.append(riy.CONDITION_IF_MIDDLE);
        if (i5 < 10) {
            sb.append('0');
        }
        sb.append(i5);
        sb.append(riy.CONDITION_IF_MIDDLE);
        if (i6 < 10) {
            sb.append('0');
        }
        sb.append(i6);
        sb.append(riy.CONDITION_IF_MIDDLE);
        if (i7 < 100) {
            sb.append('0');
        }
        if (i7 < 10) {
            sb.append('0');
        }
        sb.append(i7);
        return sb.toString();
    }

    public static String getNowTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9980e68c", new Object[0]) : getNowTime(System.currentTimeMillis());
    }

    public static StringBuilder appendParam(StringBuilder sb, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("3ca85b76", new Object[]{sb, str});
        }
        if (sb == null) {
            return null;
        }
        sb.append(',');
        if (str != null) {
            sb.append(str.replace(',', ' '));
        }
        return sb;
    }

    public static StringBuilder appendExtParam(StringBuilder sb, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("a7b53fc2", new Object[]{sb, map});
        }
        if (sb == null) {
            return null;
        }
        sb.append(',');
        if (map != null && map.size() != 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                if (key != null && value != null) {
                    String fliterChar = fliterChar(value);
                    if (z) {
                        z = false;
                    } else {
                        sb.append('^');
                    }
                    sb.append(key.replace(',', ' ').replace('^', ' ').replace('=', ' '));
                    sb.append('=');
                    sb.append(fliterChar.replace(',', ' ').replace('^', ' '));
                }
            }
        }
        return sb;
    }

    public static File getCommonExternalStorageDir() {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ffe74aa8", new Object[0]);
        }
        try {
            file = new File(Environment.getExternalStorageDirectory(), "alipay");
        } catch (Throwable th) {
            new StringBuilder("getCommonExternalStorageDir: ").append(th);
            file = new File("/sdcard/alipay");
        }
        try {
            if (file.exists()) {
                if (file.isFile()) {
                    FileUtil.deleteFileNotDir(file);
                    file.mkdirs();
                }
            } else {
                file.mkdirs();
            }
        } catch (Throwable unused) {
        }
        return file;
    }

    public static String getCommonExternalStoragePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("924a09a5", new Object[0]);
        }
        File commonExternalStorageDir = getCommonExternalStorageDir();
        if (commonExternalStorageDir != null) {
            return commonExternalStorageDir.getAbsolutePath();
        }
        return null;
    }

    public static File getStorageFilesDir(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("26d867bd", new Object[]{context, str});
        }
        File file = null;
        if (isOfflineForExternalFile() && FileUtil.isCanUseSdCard()) {
            try {
                file = new File(new File(getCommonExternalStorageDir(), context.getPackageName()), str);
            } catch (Throwable unused) {
            }
        }
        if (file == null) {
            try {
                file = new File(context.getFilesDir(), str);
            } catch (Throwable unused2) {
            }
        }
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean isOfflineForExternalFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e4a21c2", new Object[0])).booleanValue();
        }
        if (c < 0) {
            String releaseType = LoggerFactory.getLogContext().getReleaseType();
            c = (isOfflineMode() || LogContext.RELEASETYPE_RC.equals(releaseType) || LogContext.RELEASETYPE_RCPRE.equals(releaseType)) ? 1 : 0;
        }
        return c == 1;
    }

    public static boolean isOfflineMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1a08527", new Object[0])).booleanValue();
        }
        if (b < 0) {
            String releaseType = LoggerFactory.getLogContext().getReleaseType();
            b = ("dev".equals(releaseType) || "test".equals(releaseType) || LogContext.RELEASETYPE_TESTPRE.equals(releaseType)) ? 1 : 0;
        }
        return b == 1;
    }

    public static boolean isOfflineAppendMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef29ffa1", new Object[0])).booleanValue();
        }
        if (d < 0) {
            String releaseType = LoggerFactory.getLogContext().getReleaseType();
            d = ("dev".equals(releaseType) || "test".equals(releaseType) || LogContext.RELEASETYPE_TESTPRE.equals(releaseType) || LogContext.RELEASETYPE_RC.equals(releaseType)) ? 1 : 0;
        }
        return d == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[Catch: Throwable -> 0x004a, TryCatch #0 {Throwable -> 0x004a, blocks: (B:6:0x0019, B:7:0x0029, B:9:0x002f, B:11:0x003f), top: B:17:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isWalletProcessRuning(android.content.Context r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.util.LoggingUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            java.lang.String r5 = "a407d042"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L19:
            java.lang.String r0 = "activity"
            java.lang.Object r5 = r5.getSystemService(r0)     // Catch: java.lang.Throwable -> L4a
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch: java.lang.Throwable -> L4a
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4a
        L29:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L54
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L4a
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "com.eg.android.AlipayGphone"
            java.lang.String r4 = r0.processName     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L49
            java.lang.String r1 = "com.eg.android.AlipayGphoneRC"
            java.lang.String r0 = r0.processName     // Catch: java.lang.Throwable -> L4a
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L29
        L49:
            return r3
        L4a:
            r5 = move-exception
            com.alipay.mobile.common.logging.api.trace.TraceLogger r0 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()
            java.lang.String r1 = "LoggingUtil"
            r0.error(r1, r5)
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.LoggingUtil.isWalletProcessRuning(android.content.Context):boolean");
    }

    public static String stackTraceToString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93fba4e6", new Object[]{str});
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-StackTrace:");
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("###\tat ");
            sb.append(stackTraceElement);
        }
        sb.append("###");
        return sb.toString();
    }

    public static String throwableToString(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8235015e", new Object[]{th});
        }
        String stackTraceString = Log.getStackTraceString(th);
        return stackTraceString != null ? stackTraceString.replace("$$", "<2$>") : stackTraceString;
    }

    public static Pair<String, String> backTrackInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("a7d36447", new Object[0]) : backTrackInvoker(2);
    }

    public static Pair<String, String> backTrackInvoker(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("909f9830", new Object[]{new Integer(i)});
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return Pair.create("", "");
        }
        if (i <= 0) {
            i = 1;
        }
        int i2 = i + 3;
        if (i2 >= stackTrace.length) {
            i2 = stackTrace.length - 1;
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        if (stackTraceElement == null) {
            return Pair.create("", "");
        }
        return Pair.create(stackTraceElement.getClassName(), stackTraceElement.getMethodName());
    }

    public static String[] obtainThreadsStackTrace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("92133fd7", new Object[0]) : getThreadsStackTrace(true);
    }

    public static String acquireThreadsStackTrace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("572a7b09", new Object[0]) : getThreadsStackTrace(false)[0];
    }

    public static String[] getThreadsStackTrace(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f2bf384c", new Object[]{new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(40000);
        StringBuilder sb2 = null;
        if (z) {
            sb2 = new StringBuilder();
        }
        try {
            boolean z2 = true;
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                try {
                    StackTraceElement[] value = entry.getValue();
                    String name = entry.getKey().getName();
                    sb.append('\n');
                    sb.append("ThreadName=");
                    sb.append(name);
                    sb.append("\n");
                    if (sb2 != null) {
                        if (z2) {
                            z2 = false;
                        } else {
                            sb2.append("|");
                        }
                        sb2.append(name);
                    }
                    for (StackTraceElement stackTraceElement : value) {
                        sb.append(String.valueOf(stackTraceElement));
                        sb.append("\n");
                    }
                    sb.append("\n");
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return new String[]{sb.toString(), String.valueOf(sb2)};
    }

    public static byte[] gzipDataByBytes(byte[] bArr, int i, int i2) {
        GZIPOutputStream gZIPOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("38482e9f", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            gZIPOutputStream.write(bArr, i, i2);
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                gZIPOutputStream.close();
            } catch (Throwable unused) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused2) {
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            try {
                throw new IllegalStateException(th);
            } catch (Throwable th3) {
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (Throwable unused3) {
                    }
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused4) {
                }
                throw th3;
            }
        }
    }

    public static byte[] gzipDataByString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fe4f8f60", new Object[]{str});
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return gzipDataByBytes(bytes, 0, bytes.length);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        if (r1.isClosed() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getZhizhiSetting(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "LoggingUtil"
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.common.logging.util.LoggingUtil.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L1d
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r10
            r10 = 1
            r0[r10] = r11
            r10 = 2
            r0[r10] = r12
            java.lang.String r10 = "c62b1165"
            java.lang.Object r10 = r1.ipc$dispatch(r10, r0)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L1d:
            if (r10 == 0) goto L93
            boolean r1 = android.text.StringUtils.isEmpty(r11)
            if (r1 == 0) goto L26
            goto L93
        L26:
            r1 = 0
            android.net.Uri r5 = android.net.Uri.parse(r11)     // Catch: java.lang.Throwable -> L54
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L54
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L46
            int r10 = r1.getCount()     // Catch: java.lang.Throwable -> L54
            if (r10 <= 0) goto L46
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L54
            java.lang.String r12 = r1.getString(r3)     // Catch: java.lang.Throwable -> L54
        L46:
            if (r1 == 0) goto L68
            boolean r10 = r1.isClosed()
            if (r10 != 0) goto L68
        L4e:
            r1.close()     // Catch: java.lang.Throwable -> L68
            goto L68
        L52:
            r10 = move-exception
            goto L87
        L54:
            r10 = move-exception
            com.alipay.mobile.common.logging.api.trace.TraceLogger r2 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = "getZhizhiSetting"
            r2.error(r0, r3, r10)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L68
            boolean r10 = r1.isClosed()
            if (r10 != 0) goto L68
            goto L4e
        L68:
            com.alipay.mobile.common.logging.api.trace.TraceLogger r10 = com.alipay.mobile.common.logging.api.LoggerFactory.getTraceLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getZhizhiSetting, uri: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = ", value: "
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = r1.toString()
            r10.info(r0, r11)
            return r12
        L87:
            if (r1 == 0) goto L92
            boolean r11 = r1.isClosed()
            if (r11 != 0) goto L92
            r1.close()     // Catch: java.lang.Throwable -> L92
        L92:
            throw r10
        L93:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.LoggingUtil.getZhizhiSetting(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String concatArray(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8442705", new Object[]{str, objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        if (objArr.length == 1) {
            return String.valueOf(objArr[0]);
        }
        if (objArr.length == 2) {
            return String.valueOf(objArr[0]) + str + String.valueOf(objArr[1]);
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    public static boolean isScreenOn(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acfc6e90", new Object[]{context})).booleanValue();
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                if (!powerManager.isScreenOn()) {
                    return false;
                }
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LoggingUtil", "isScreenOn error", th);
        }
        return true;
    }

    public static String getSystemProperty(String str, String str2) {
        if (StringUtils.isEmpty(str)) {
            return str2;
        }
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LoggingUtil", "getSystemProperty", th);
            return str2;
        }
    }

    public static String formatTimespanToHHmmssSSS(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("295a6aed", new Object[]{new Long(j)});
        }
        if (j < 0) {
            return "";
        }
        long j2 = j % 1000;
        long j3 = j / 1000;
        long j4 = j3 / 60;
        return (j4 / 60) + "h:" + (j4 % 60) + "m:" + (j3 % 60) + "s:" + j2;
    }

    public static Random getCommonRandom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Random) ipChange.ipc$dispatch("2ecda417", new Object[0]);
        }
        if (g == null) {
            g = new Random();
        }
        return g;
    }

    public static int randomInteger(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5b759d5", new Object[]{new Integer(i), new Integer(i2)})).intValue() : i + ((int) (getCommonRandom().nextFloat() * (i2 - i)));
    }

    public static String getMdapStyleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28e4b76f", new Object[]{str});
        }
        return System.currentTimeMillis() + "_" + str;
    }

    public static boolean loadLibrary(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d11b031a", new Object[]{context, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            System.loadLibrary(str);
            LoggerFactory.getTraceLogger().info("LoggingUtil", "success to System.loadLibrary : ".concat(String.valueOf(str)));
            return true;
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LoggingUtil", "failed to System.loadLibrary : ".concat(String.valueOf(str)), th);
            if (context == null) {
                return false;
            }
            String str2 = "";
            try {
                File dir = context.getDir("plugins_lib", 0);
                str2 = new File(dir, "lib" + str + bgy.SO_EXTENSION).getAbsolutePath();
                System.load(str2);
                LoggerFactory.getTraceLogger().info("LoggingUtil", "success to System.load : ".concat(String.valueOf(str2)));
                return true;
            } catch (Throwable th2) {
                LoggerFactory.getTraceLogger().error("LoggingUtil", "failed to System.load : ".concat(String.valueOf(str2)), th2);
                return false;
            }
        }
    }

    public static String getTopActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fac116b", new Object[0]);
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) LoggerFactory.getLogContext().getApplicationContext().getSystemService("activity")).getRunningTasks(3);
            if (runningTasks == null || runningTasks.size() <= 0) {
                return null;
            }
            String str = null;
            for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                if (runningTaskInfo != null && runningTaskInfo.topActivity.getPackageName().equals(LoggerFactory.getProcessInfo().getPackageName())) {
                    str = runningTaskInfo.topActivity.getClassName();
                }
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void fillBufferWithParams(StringBuilder sb, Map<?, ?> map, FillBufferHandler fillBufferHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788a0abc", new Object[]{sb, map, fillBufferHandler});
        } else if (sb != null && map != null && map.size() != 0) {
            try {
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (fillBufferHandler != null) {
                        key = fillBufferHandler.handleKey(key);
                        value = fillBufferHandler.handleKey(value);
                        if (key != null) {
                        }
                    }
                    sb.append(", ");
                    sb.append(key);
                    sb.append(ResponseProtocolType.COMMENT);
                    sb.append(value);
                }
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("LoggingUtil", "fillBufferWithParams.outer", th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    public static void fillBufferWithParams(StringBuilder sb, Bundle bundle, FillBufferHandler fillBufferHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabc304d", new Object[]{sb, bundle, fillBufferHandler});
        } else if (sb != 0 && bundle != 0 && bundle.size() != 0) {
            try {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (fillBufferHandler != 0) {
                        str = fillBufferHandler.handleKey(str);
                        obj = fillBufferHandler.handleKey(obj);
                        if (str != 0) {
                        }
                    }
                    sb.append(", ");
                    sb.append(str);
                    sb.append(ResponseProtocolType.COMMENT);
                    sb.append(obj);
                }
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("LoggingUtil", "fillBufferWithParams.outer", th);
            }
        }
    }

    public static String fliterChar(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57275a5b", new Object[]{str}) : !StringUtils.isEmpty(str) ? str.replace("\r\n", "###").replace("\n", "###").replace("\r", "###") : str;
    }

    public static boolean isProcessStartByClickLauncherIcon() {
        Map<String, String> startupReason;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3c7f98", new Object[0])).booleanValue();
        }
        if (!LoggerFactory.getProcessInfo().isMainProcess() || (startupReason = LoggerFactory.getProcessInfo().getStartupReason()) == null) {
            return false;
        }
        return "com.eg.android.AlipayGphone.AlipayLogin".equals(startupReason.get(ProcessInfo.SR_COMPONENT_NAME));
    }

    public static final boolean isInAlipayClient(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c322f61", new Object[]{context})).booleanValue();
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        String packageName = context.getPackageName();
        if (StringUtils.isEmpty(packageName)) {
            return false;
        }
        for (String str : f) {
            if (packageName.contains(str)) {
                Boolean bool2 = Boolean.TRUE;
                e = bool2;
                return bool2.booleanValue();
            }
        }
        Boolean bool3 = Boolean.FALSE;
        e = bool3;
        return bool3.booleanValue();
    }
}
