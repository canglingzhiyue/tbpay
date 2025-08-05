package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.Intent;
import android.os.Debug;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class MemoryUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f5462a = false;

    public static boolean isShouldDumpOOMHeap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7dc4253", new Object[0])).booleanValue() : f5462a;
    }

    public static void setShouldDumpOOMHeap(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8aaf9d", new Object[]{new Boolean(z)});
        } else {
            f5462a = z;
        }
    }

    public static synchronized void dumpMemHeap(Context context) {
        synchronized (MemoryUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33efd374", new Object[]{context});
            } else if (!f5462a) {
                LoggerFactory.getTraceLogger().info("MemoryUtil", "mShouldDumpOOMHeap:false, just return.");
            } else if (context == null) {
                LoggerFactory.getTraceLogger().info("MemoryUtil", "dumpMemHeap() context:null, just return.");
            } else {
                File a2 = a(context);
                long currentTimeMillis = System.currentTimeMillis();
                File file = new File(a2, currentTimeMillis + "_dump.hprof");
                File file2 = new File(a2, currentTimeMillis + "_dump.zip");
                clearExpiredFiles(context, true);
                long currentTimeMillis2 = System.currentTimeMillis();
                LoggerFactory.getTraceLogger().info("MemoryUtil", "dump start time = ".concat(String.valueOf(currentTimeMillis2)));
                try {
                    Debug.dumpHprofData(file.getAbsolutePath());
                } catch (IOException e) {
                    LoggerFactory.getTraceLogger().warn("MemoryUtil", e);
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                traceLogger.info("MemoryUtil", "dump end time = " + currentTimeMillis3 + " use time : " + (currentTimeMillis3 - currentTimeMillis2));
                if (file.exists()) {
                    long currentTimeMillis4 = System.currentTimeMillis();
                    LoggerFactory.getTraceLogger().info("MemoryUtil", "zip start time = ".concat(String.valueOf(currentTimeMillis4)));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(file);
                    ZipUtil.zipFile(arrayList, file2.getAbsolutePath(), null, null);
                    long currentTimeMillis5 = System.currentTimeMillis();
                    TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                    traceLogger2.info("MemoryUtil", "zip end time = " + currentTimeMillis5 + " use time : " + (currentTimeMillis5 - currentTimeMillis4));
                } else {
                    LoggerFactory.getTraceLogger().info("MemoryUtil", "dump nothing");
                }
                Intent intent = new Intent();
                intent.setPackage("com.alipay.android.automonkey");
                intent.setAction("ACTION_DUMP_HPROF_FINISHED");
                context.sendBroadcast(intent);
                TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                traceLogger3.info("MemoryUtil", "hprofFile:" + file.getAbsolutePath() + " delete:" + file.delete());
            }
        }
    }

    public static synchronized void clearExpiredFiles(Context context, boolean z) {
        synchronized (MemoryUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3aa352d2", new Object[]{context, new Boolean(z)});
            } else if (context == null) {
                LoggerFactory.getTraceLogger().info("MemoryUtil", "clearExpiredFiles() context:null, just return.");
            } else {
                File[] listFiles = a(context).listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long millis = currentTimeMillis - TimeUnit.DAYS.toMillis(3L);
                    long millis2 = currentTimeMillis + TimeUnit.DAYS.toMillis(3L);
                    for (File file : listFiles) {
                        if (file != null && file.exists() && file.isFile()) {
                            long parseLong = Long.parseLong(file.getName().split("_")[0]);
                            if ((parseLong < millis || parseLong > millis2) ? true : z) {
                                if (file.delete()) {
                                    LoggerFactory.getTraceLogger().warn("MemoryUtil", "cleanExpiresFile: " + file.getName() + " success!");
                                } else {
                                    LoggerFactory.getTraceLogger().warn("MemoryUtil", "cleanExpiresFile: " + file.getName() + " failed !");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static File a(Context context) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("72147cad", new Object[]{context});
        }
        try {
            file = new File(new File(LoggingUtil.getCommonExternalStorageDir(), context.getPackageName()), "memHeaps");
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("MemoryUtil", "getMemHeapDir", th);
            file = null;
        }
        if (file == null) {
            return file;
        }
        try {
            if (file.exists()) {
                return file;
            }
            if (file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th2) {
            LoggerFactory.getTraceLogger().error("MemoryUtil", "getMemHeapDir", th2);
            return file;
        }
    }
}
