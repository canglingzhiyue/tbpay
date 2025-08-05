package com.alipay.mobile.common.logging.util;

import android.content.Context;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LogcatUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void dumpLogcatForException(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1356fad5", new Object[]{context});
            return;
        }
        try {
            File b = b(context);
            if (b == null) {
                return;
            }
            a(b);
            dumpLogcat(new File(b, System.currentTimeMillis() + "_logcat"), 3000);
            a(context);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("LogcatUtil", "dumpLogcatForException", th);
        }
    }

    private static void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
            return;
        }
        b(file);
        c(file);
        d(file);
    }

    private static void b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584201a0", new Object[]{file});
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long millis = currentTimeMillis - TimeUnit.DAYS.toMillis(7L);
        long millis2 = currentTimeMillis + TimeUnit.DAYS.toMillis(7L);
        for (File file2 : listFiles) {
            if (file2 != null && file2.exists() && file2.isFile()) {
                try {
                    long parseLong = Long.parseLong(file2.getName().split("_")[0]);
                    if (parseLong < millis || parseLong > millis2) {
                        if (file2.delete()) {
                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " is too old !");
                        } else {
                            LoggerFactory.getTraceLogger().warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " failed !");
                        }
                    }
                } catch (Throwable th) {
                    LoggerFactory.getTraceLogger().warn("LogcatUtil", file2.getName(), th);
                }
            }
        }
    }

    private static void c(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ec6361", new Object[]{file});
            return;
        }
        file.listFiles();
        Comparator<File> comparator = new Comparator<File>() { // from class: com.alipay.mobile.common.logging.util.LogcatUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public final int compare(File file2, File file3) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("f3a0238d", new Object[]{this, file2, file3})).intValue() : file2.getName().compareTo(file3.getName());
            }
        };
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length < 5) {
            return;
        }
        Arrays.sort(listFiles, comparator);
        for (int i = 0; i < listFiles.length - 4; i++) {
            File file2 = listFiles[i];
            if (file2 != null && file2.exists() && file2.isFile()) {
                if (file2.delete()) {
                    TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                    traceLogger.warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " is over 5 !");
                } else {
                    TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                    traceLogger2.warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " failed !");
                }
            }
        }
    }

    private static void d(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f396c522", new Object[]{file});
            return;
        }
        file.listFiles();
        Comparator<File> comparator = new Comparator<File>() { // from class: com.alipay.mobile.common.logging.util.LogcatUtil.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public final int compare(File file2, File file3) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("f3a0238d", new Object[]{this, file2, file3})).intValue() : file2.getName().compareTo(file3.getName());
            }
        };
        long folderSize = FileUtil.getFolderSize(file);
        if (folderSize < 2097152 || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return;
        }
        long j = folderSize - 1048576;
        Arrays.sort(listFiles, comparator);
        for (File file2 : listFiles) {
            if (file2 != null && file2.exists() && file2.isFile()) {
                long length = file2.length();
                if (file2.delete()) {
                    j -= length;
                    LoggerFactory.getTraceLogger().warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " is too large !");
                } else {
                    LoggerFactory.getTraceLogger().warn("LogcatUtil", "cleanExpiresFile: " + file2.getName() + " failed !");
                }
                if (j <= 0) {
                    return;
                }
            }
        }
    }

    private static void a(Context context) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            File b = b(context);
            File c = c(context);
            if (b != null && c != null) {
                a(c);
                for (File file : b.listFiles()) {
                    if (file != null && file.exists() && file.isFile() && file.length() != 0) {
                        File file2 = new File(c, file.getName());
                        if (file2.isDirectory()) {
                            LoggerFactory.getTraceLogger().error("LogcatUtil", "backupLogcatFiles, bakFile should not be directory: ".concat(String.valueOf(file2)));
                        } else if (!file2.exists() || !file2.isFile() || file2.length() != file.length()) {
                            LoggerFactory.getTraceLogger().info("LogcatUtil", "backupLogcatFiles: ".concat(String.valueOf(file)));
                            FileUtil.copyFile(file, file2);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogcatUtil", "backupOtherFiles", th);
        }
    }

    private static File b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5755eb6e", new Object[]{context});
        }
        File file = new File(context.getFilesDir(), LogCategory.CATEGORY_LOGCAT);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    private static File c(Context context) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3c975a2f", new Object[]{context});
        }
        try {
            file = new File(new File(LoggingUtil.getCommonExternalStorageDir(), context.getPackageName()), "logcatic");
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("LogcatUtil", "getBackupLogcatsDir", th);
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
            LoggerFactory.getTraceLogger().error("LogcatUtil", "getBackupLogcatsDir", th2);
            return file;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static void dumpLogcat(java.io.File r9, int r10) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.LogcatUtil.dumpLogcat(java.io.File, int):void");
    }
}
