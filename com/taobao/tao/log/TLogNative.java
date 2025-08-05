package com.taobao.tao.log;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.statistics.TLogEventHelper;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import tb.jhd;
import tb.kge;

/* loaded from: classes.dex */
public class TLogNative {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TLOG.TLogNative";
    private static int initRet;
    private static int pid;
    private static final ConcurrentLinkedCache<XLoggerInfo> sInitCache;
    private static volatile boolean sOpenSoSuccess;

    /* loaded from: classes.dex */
    public static class XLoggerInfo {
        public LogCategory category;
        public LogLevel level;
        public String log;
        public String module;
        public long pid;
        public String tag;
        public long tid;
        public long ts;

        static {
            kge.a(-933886236);
        }
    }

    @Deprecated
    public static native void addModuleFilter(String str, int i);

    public static native void appenderClose();

    public static native void appenderFlush(boolean z);

    @Deprecated
    public static native void cleanModuleFilter();

    public static native int clearLogFiles(int i);

    public static native int getLogLevel();

    private static native int initNative(int i, String str, String str2, String str3, String str4, String str5, long j, int i2, long j2, boolean z, int i3, int i4, boolean z2, long j3, long j4, int i5, String str6, int i6);

    @Deprecated
    public static native void setAppenderMode(int i);

    @Deprecated
    public static native void setConsoleLogOpen(boolean z);

    public static native void setLogLevel(int i);

    public static native int writeMiniTLogToFile(String str);

    private static native void writeTLogNative(long j, long j2, long j3, int i, int i2, String str, String str2, String str3);

    private static native void writeTraceLogNative(int i, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, int i2, String str9, String str10);

    static {
        kge.a(1152641970);
        sInitCache = new ConcurrentLinkedCache<>();
        pid = -1;
        sOpenSoSuccess = false;
        initRet = 0;
    }

    public static void appenderOpen(int i, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, int i2, int i3, boolean z2, long j3, long j4) {
        String str6;
        Object obj;
        String str7;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7853f11d", new Object[]{new Integer(i), str, str2, str3, str4, str5, new Long(j), new Long(j2), new Boolean(z), new Integer(i2), new Integer(i3), new Boolean(z2), new Long(j3), new Long(j4)});
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str2);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            System.loadLibrary("c++_shared");
            Log.e(TAG, "loadLibrary AliHALogEngine");
            System.loadLibrary("AliHALogEngine");
            try {
                int initNative = initNative(i, str, str2, str3, str4, str5, j * 1048576, d.k, j2 << 10, z, i2, i3, z2, j3 * 1048576, j4 * 1048576, d.H, d.y, d.n());
                initRet = initNative;
                sOpenSoSuccess = initNative == 1;
                pid = Process.myPid();
                format = String.format("Init TLOG at process %d result %d", Integer.valueOf(pid), Integer.valueOf(initRet));
                str6 = TAG;
            } catch (Throwable th) {
                th = th;
                str6 = TAG;
            }
        } catch (Throwable th2) {
            th = th2;
            str6 = TAG;
            obj = "errMsg";
            str7 = com.taobao.tao.log.statistics.d.UT_TLOG_INIT_ERR;
        }
        try {
            Log.e(str6, format);
            if (sOpenSoSuccess) {
                return;
            }
            HashMap hashMap = new HashMap();
            obj = "errMsg";
            try {
                hashMap.put(obj, String.valueOf(initRet));
                str7 = com.taobao.tao.log.statistics.d.UT_TLOG_INIT_ERR;
                try {
                    TLogEventHelper.a(str7, hashMap);
                } catch (Throwable th3) {
                    th = th3;
                    th.printStackTrace();
                    Log.e(str6, "appenderOpen exception: " + th.getMessage());
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(obj, th.getMessage());
                    TLogEventHelper.a(str7, hashMap2);
                }
            } catch (Throwable th4) {
                th = th4;
                str7 = com.taobao.tao.log.statistics.d.UT_TLOG_INIT_ERR;
                th.printStackTrace();
                Log.e(str6, "appenderOpen exception: " + th.getMessage());
                HashMap hashMap22 = new HashMap();
                hashMap22.put(obj, th.getMessage());
                TLogEventHelper.a(str7, hashMap22);
            }
        } catch (Throwable th5) {
            th = th5;
            obj = "errMsg";
            str7 = com.taobao.tao.log.statistics.d.UT_TLOG_INIT_ERR;
            th.printStackTrace();
            Log.e(str6, "appenderOpen exception: " + th.getMessage());
            HashMap hashMap222 = new HashMap();
            hashMap222.put(obj, th.getMessage());
            TLogEventHelper.a(str7, hashMap222);
        }
    }

    public static void appenderFlushData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578c1446", new Object[]{new Boolean(z)});
            return;
        }
        try {
            if (pid != Process.myPid()) {
                return;
            }
            appenderFlush(z);
        } catch (Exception e) {
            Log.e("TLogNative", "appenderFlushData failure", e);
        } catch (UnsatisfiedLinkError e2) {
            Log.e("TLogNative", "appenderFlushData failure, unsatisfied link error", e2);
        }
    }

    public static boolean isSoOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6dc8c91b", new Object[0])).booleanValue() : sOpenSoSuccess;
    }

    public static String getSecurityKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("876e28d0", new Object[0]);
        }
        String str = d.m;
        return TextUtils.isEmpty(str) ? "t_remote_debugger" : str;
    }

    public static String getRc4EncryptSecretyKeyValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac8e7d76", new Object[0]);
        }
        try {
            return jhd.a().b(d.m);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getRsaPublicKeyMd5Value() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2346325a", new Object[0]) : jhd.a().b();
    }

    public static void eventForNative(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93517c", new Object[]{str, hashMap});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                TLogEventHelper.a(str, hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isModuleEnabledForLevel(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb8633e4", new Object[]{new Integer(i), str})).booleanValue();
        }
        if (e.a().a("").getIndex() <= i) {
            return true;
        }
        LogLevel a2 = e.a().a(str);
        return a2 != null && a2.getIndex() <= i;
    }

    public static void writeCodeLog(LogLevel logLevel, String str, String str2, String str3, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f50425", new Object[]{logLevel, str, str2, str3, new Boolean(z), new Long(j)});
            return;
        }
        long j2 = j;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        if (f.a().d() == 2) {
            writeCacheTLog();
            if (pid != Process.myPid()) {
                Log.e(TAG, String.format("在fork的进程%d, 写CodeLog (%d). Module=%s", Integer.valueOf(Process.myPid()), Integer.valueOf(pid), str));
                return;
            } else if (!sOpenSoSuccess) {
                Log.e(TAG, String.format("[ERR:%d] [%s][%s] %s", Integer.valueOf(initRet), str, str2, str3));
                return;
            } else {
                if (z) {
                    com.taobao.tao.log.interceptor.g.a(pid, j, logLevel, LogCategory.CodeLog, str, str2, str3);
                } else {
                    com.taobao.tao.log.interceptor.g.a(logLevel, LogCategory.CodeLog, str, str2, str3);
                }
                try {
                    if (!isModuleEnabledForLevel(logLevel.getIndex(), str)) {
                        return;
                    }
                    writeTLogNative(pid, z ? pid : 0L, j, LogCategory.CodeLog.getIndex(), logLevel.getIndex(), str, str2, str3);
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
        }
        XLoggerInfo xLoggerInfo = new XLoggerInfo();
        xLoggerInfo.level = logLevel;
        if (!z) {
            j2 = System.currentTimeMillis();
        }
        xLoggerInfo.ts = j2;
        xLoggerInfo.category = LogCategory.CodeLog;
        xLoggerInfo.pid = d.J;
        xLoggerInfo.tid = z ? d.J : Process.myTid();
        xLoggerInfo.module = str;
        xLoggerInfo.tag = str2;
        xLoggerInfo.log = str3;
        sInitCache.add(xLoggerInfo);
    }

    public static void writeTraceLog(LogLevel logLevel, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, int i, String str9, String str10) {
        String str11;
        char c;
        char c2;
        String str12;
        char c3;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        LogLevel logLevel2;
        String str19;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac575f8", new Object[]{logLevel, str, str2, str3, str4, str5, new Long(j), str6, str7, str8, new Integer(i), str9, str10});
        } else if (TextUtils.isEmpty(str6)) {
        } else {
            if (f.a().d() == 2) {
                writeCacheTLog();
                if (pid != Process.myPid()) {
                    c = 4;
                    c2 = 2;
                    str11 = str;
                    Log.e(TAG, String.format("在fork的进程%d, 写tlog (%d). Module=%s", Integer.valueOf(Process.myPid()), Integer.valueOf(pid), str11));
                    logLevel2 = logLevel;
                } else if (!sOpenSoSuccess) {
                    Log.e(TAG, String.format("[TRACE-ERR:%d] [%s][%s] %s", Integer.valueOf(initRet), str, str2, str6));
                    return;
                } else {
                    c2 = 2;
                    try {
                        c = 4;
                    } catch (Throwable th) {
                        th = th;
                        c = 4;
                    }
                    try {
                        writeTraceLogNative(logLevel.getIndex(), str, str2, str3, str4, str5, j, str6, str7, str8, i, str9, str10);
                        com.taobao.tao.log.interceptor.g.a(logLevel, str, str2, str3, str4, str5, j, str6, str7, str8, i, str9, str10);
                    } catch (Throwable th2) {
                        th = th2;
                        th.printStackTrace();
                        logLevel2 = logLevel;
                        str11 = str;
                        str19 = str2;
                        str16 = str3;
                        str17 = str4;
                        str18 = str5;
                        str12 = str6;
                        str13 = str7;
                        str14 = str8;
                        str15 = str9;
                        c3 = 3;
                        if (!f.a().q()) {
                            return;
                        }
                        return;
                    }
                    logLevel2 = logLevel;
                    str11 = str;
                }
                str19 = str2;
                str16 = str3;
                str17 = str4;
                str18 = str5;
                str12 = str6;
                str13 = str7;
                str14 = str8;
                str15 = str9;
                c3 = 3;
            } else {
                str11 = str;
                c = 4;
                c2 = 2;
                StringBuilder sb = new StringBuilder();
                str12 = str6;
                sb.append(str12);
                sb.append((char) 31);
                sb.append(i);
                sb.append((char) 31);
                c3 = 3;
                sb.append(str10);
                sb.append((char) 31);
                str13 = str7;
                sb.append(str13);
                sb.append((char) 31);
                str14 = str8;
                sb.append(str14);
                sb.append((char) 31);
                sb.append(j);
                sb.append((char) 31);
                str15 = str9;
                sb.append(str15);
                sb.append((char) 31);
                str16 = str3;
                sb.append(str16);
                sb.append((char) 31);
                str17 = str4;
                sb.append(str17);
                sb.append((char) 31);
                str18 = str5;
                sb.append(str18);
                String sb2 = sb.toString();
                XLoggerInfo xLoggerInfo = new XLoggerInfo();
                logLevel2 = logLevel;
                xLoggerInfo.level = logLevel2;
                xLoggerInfo.ts = System.currentTimeMillis();
                xLoggerInfo.category = LogCategory.TraceEventLog;
                xLoggerInfo.module = str11;
                str19 = str2;
                xLoggerInfo.tag = str19;
                xLoggerInfo.log = sb2;
                xLoggerInfo.pid = d.J;
                xLoggerInfo.tid = Process.myTid();
                sInitCache.add(xLoggerInfo);
            }
            if (!f.a().q() || "empty".equals(str17)) {
                return;
            }
            Object[] objArr = new Object[9];
            objArr[0] = str12;
            objArr[1] = str10;
            objArr[c2] = Integer.valueOf(i);
            objArr[c3] = str13;
            objArr[c] = str14;
            objArr[5] = str18;
            objArr[6] = str16;
            objArr[7] = str17;
            objArr[8] = str15;
            TLog.toLogcat(logLevel2, str11, str19, String.format("event=%s\next=%s\neventType=%s\neventCode=%s\ncodeMsg=%s\nsceneID=%s\ncntID=%s\nrefID=%s\nbizCode", objArr));
        }
    }

    public static void writeLog(LogCategory logCategory, LogLevel logLevel, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac840cd0", new Object[]{logCategory, logLevel, str, str2, str3});
        } else if (TextUtils.isEmpty(str3)) {
        } else {
            if (f.a().d() == 2) {
                writeCacheTLog();
                if (pid != Process.myPid()) {
                    Log.e(TAG, String.format("在fork的进程%d, 写tlog (%d). Module=%s", Integer.valueOf(Process.myPid()), Integer.valueOf(pid), str));
                } else if (!sOpenSoSuccess) {
                    Log.e(TAG, String.format("[OTHER-ERR:%d] [%s][%s] %s", Integer.valueOf(initRet), str, str2, str3));
                    return;
                } else {
                    try {
                        writeTLogNative(0L, 0L, 0L, logCategory.getIndex(), logLevel.getIndex(), str, str2, str3);
                        com.taobao.tao.log.interceptor.g.a(logLevel, logCategory, str, str2, str3);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            } else {
                XLoggerInfo xLoggerInfo = new XLoggerInfo();
                xLoggerInfo.level = LogLevel.E;
                xLoggerInfo.ts = System.currentTimeMillis();
                xLoggerInfo.category = logCategory;
                xLoggerInfo.module = str;
                xLoggerInfo.tag = str2;
                xLoggerInfo.pid = d.J;
                xLoggerInfo.tid = Process.myTid();
                xLoggerInfo.log = str3;
                sInitCache.add(xLoggerInfo);
            }
            if (!f.a().q()) {
                return;
            }
            TLog.toLogcat(logLevel, str, str2, str3);
        }
    }

    private static void writeCacheTLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97e1eba", new Object[0]);
        } else if (!sOpenSoSuccess || sInitCache.size() <= 0) {
        } else {
            Iterator<XLoggerInfo> iteratorAndClear = sInitCache.getIteratorAndClear();
            while (iteratorAndClear.hasNext()) {
                XLoggerInfo next = iteratorAndClear.next();
                com.taobao.tao.log.interceptor.g.a(next.tid, next.ts, next.level, next.category, next.module, next.tag, next.log);
                if (!d.j && d.i) {
                    TLog.toLogcat(next.level, next.module, next.tag, next.log);
                }
                if (next.category != LogCategory.CodeLog || isModuleEnabledForLevel(next.level.getIndex(), next.module)) {
                    if (next.pid != pid) {
                        Log.e(TAG, String.format("在fork的进程%d, 写tlog (%d). Module=%s", Integer.valueOf(Process.myPid()), Integer.valueOf(pid), next.module));
                    } else if (TextUtils.isEmpty(next.log)) {
                        return;
                    } else {
                        try {
                            writeTLogNative(next.pid, next.tid, next.ts, next.category.getIndex(), next.level.getIndex(), next.module, next.tag, next.log);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
