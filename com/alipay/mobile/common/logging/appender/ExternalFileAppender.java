package com.alipay.mobile.common.logging.appender;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.util.FileUtil;
import com.alipay.mobile.common.logging.util.LoggingAsyncTaskExecutor;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class ExternalFileAppender extends FileAppender {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int e = 2;
    public static final Comparator<File> f = new Comparator<File>() { // from class: com.alipay.mobile.common.logging.appender.ExternalFileAppender.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, file, file2})).intValue() : file.getName().compareTo(file2.getName());
        }
    };
    public File g;
    public long h;
    public File i;
    public File j;
    public File k;
    public long l;
    public long m;
    public long n;
    public StringBuilder o;
    public int p;
    public boolean q;

    public static /* synthetic */ Object ipc$super(ExternalFileAppender externalFileAppender, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.common.logging.appender.FileAppender
    public final File d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ee166802", new Object[]{this});
        }
        return null;
    }

    public ExternalFileAppender(LogContext logContext, String str, long j, long j2, long j3, int i) {
        super(logContext, str);
        this.l = j;
        this.m = j2;
        this.n = j3;
        this.p = i / 2;
        this.o = new StringBuilder(this.p);
    }

    @Override // com.alipay.mobile.common.logging.appender.Appender
    public synchronized void a(LogEvent logEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f405290", new Object[]{this, logEvent});
        } else if (logEvent == null) {
        } else {
            String logEvent2 = logEvent.toString();
            if (StringUtils.isEmpty(logEvent2)) {
                return;
            }
            if (this.o.length() + logEvent2.length() + e > this.p) {
                f();
                if (this.o.length() + logEvent2.length() + e > this.p) {
                    byte[] bytes = (logEvent2 + "$$").getBytes("UTF-8");
                    a(bytes, bytes.length);
                    return;
                }
                a(logEvent2);
                return;
            }
            a(logEvent2);
        }
    }

    @Override // com.alipay.mobile.common.logging.appender.Appender
    public final synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.o.length() == 0) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(" appender flush: ");
            sb.append(this.o.length());
            f();
        }
    }

    @Override // com.alipay.mobile.common.logging.appender.Appender
    public final synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (LoggingUtil.isOfflineForExternalFile()) {
        } else {
            if (this.g != null && this.g.exists() && this.g.isFile() && this.g.length() != 0) {
                File file = new File(h(), this.g.getName());
                if (this.g.length() > 0) {
                    this.g.length();
                    file.length();
                }
            }
            if (z) {
                e();
            }
        }
    }

    @Override // com.alipay.mobile.common.logging.appender.FileAppender
    public final File c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("298485e3", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.l;
        this.h = (currentTimeMillis / j) * j;
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append("_");
        sb.append(this.d);
        if (LoggingUtil.isOfflineForExternalFile()) {
            sb.append("_dev");
        }
        sb.append(".2nd");
        String sb2 = sb.toString();
        File file = this.g;
        if (file == null || !file.exists() || !this.g.getName().equals(sb2)) {
            File g = g();
            if (g == null) {
                new StringBuilder("currentLogDir is NULl with ").append(this.b);
                return null;
            }
            try {
                a(g, this.m, this.n);
            } catch (Throwable unused) {
            }
            try {
                a(h(), this.m * 3, this.n * 4);
            } catch (Throwable unused2) {
            }
            try {
                a(i(), this.m, this.n);
            } catch (Throwable unused3) {
            }
            this.g = new File(g, sb2);
            if (!LoggingUtil.isOfflineForExternalFile()) {
                LoggingAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.logging.appender.ExternalFileAppender.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ExternalFileAppender externalFileAppender = ExternalFileAppender.this;
                        new StringBuilder("handleExtrasOnGetNewFile, priority: ").append(Thread.currentThread().getPriority());
                        Thread.currentThread().setPriority(5);
                        SystemClock.sleep(TimeUnit.SECONDS.toMillis(20L));
                        externalFileAppender.e();
                    }
                });
            }
        }
        return this.g;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        StringBuilder sb = this.o;
        sb.append(str);
        sb.append("$$");
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
            try {
                byte[] bytes = this.o.toString().getBytes("UTF-8");
                return a(bytes, bytes.length);
            } catch (Throwable unused) {
                if (!this.q) {
                    this.q = true;
                }
                return false;
            }
        } finally {
            this.o.setLength(0);
        }
    }

    private static void a(File file, long j, long j2) {
        File[] fileArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433dfc9f", new Object[]{file, new Long(j), new Long(j2)});
        } else if (file != null && file.isDirectory()) {
            File[] fileArr2 = null;
            try {
                fileArr = file.listFiles();
            } catch (Throwable unused) {
                fileArr = null;
            }
            if (fileArr == null || fileArr.length == 0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - j;
            long j4 = currentTimeMillis + j;
            for (File file2 : fileArr) {
                if (file2 != null && file2.exists() && file2.isFile()) {
                    try {
                        long parseLong = Long.parseLong(file2.getName().split("_")[0]);
                        if (parseLong < j3 || parseLong > j4) {
                            file2.delete();
                            StringBuilder sb = new StringBuilder("cleanExpiresFile: ");
                            sb.append(file2.getName());
                            sb.append(" is too old !");
                        }
                    } catch (Throwable unused2) {
                        file2.getName();
                    }
                }
            }
            if (FileUtil.getFolderSize(file) < j2) {
                return;
            }
            try {
                fileArr2 = file.listFiles();
            } catch (Throwable unused3) {
            }
            if (fileArr2 == null || fileArr2.length < 4) {
                return;
            }
            Arrays.sort(fileArr2, f);
            int length = fileArr2.length / 4;
            for (int i = 0; i < length; i++) {
                File file3 = fileArr2[i];
                if (file3 != null && file3.exists() && file3.isFile()) {
                    try {
                        file3.delete();
                        StringBuilder sb2 = new StringBuilder("cleanExpiresFile: ");
                        sb2.append(file3.getName());
                        sb2.append(" is too large !");
                    } catch (Throwable unused4) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(file3.getName());
                        sb3.append(" cleanExpiresFile");
                    }
                }
            }
        }
    }

    public final void e() {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            for (File file : g().listFiles()) {
                if (!a(file)) {
                    File file2 = new File(h(), file.getName());
                    if (file2.isDirectory()) {
                        new StringBuilder("backupOtherFiles, bakFile should not be directory: ").append(file2);
                    } else if (!file2.exists() || !file2.isFile() || file2.length() != file.length()) {
                        new StringBuilder("backupOtherFiles: ").append(file);
                        try {
                            FileUtil.copyFile(file, file2);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{this, file})).booleanValue();
        }
        if (file == null || !file.exists() || !file.isFile() || file.length() == 0 || !file.getName().contains(this.d)) {
            return true;
        }
        File file2 = this.g;
        if (file2 != null && (file.equals(file2) || file.getAbsolutePath().equals(this.g.getAbsolutePath()))) {
            return true;
        }
        try {
            return Long.parseLong(file.getName().split("_")[0]) >= this.h;
        } catch (Throwable unused) {
            return true;
        }
    }

    private File g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3bcc0e5f", new Object[]{this});
        }
        if (this.i == null) {
            try {
                this.i = LoggingUtil.getStorageFilesDir(this.c, this.b);
            } catch (Throwable unused) {
            }
        }
        try {
            if (this.i != null && !this.i.exists()) {
                this.i.mkdirs();
            }
        } catch (Throwable unused2) {
        }
        return this.i;
    }

    private File h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5df07e", new Object[]{this});
        }
        if (this.j == null) {
            try {
                File file = new File(LoggingUtil.getCommonExternalStorageDir(), this.c.getPackageName());
                this.j = new File(file, this.b + "ic");
            } catch (Throwable unused) {
            }
        }
        try {
            if (this.j != null && !this.j.exists()) {
                this.j.mkdirs();
            }
        } catch (Throwable unused2) {
        }
        return this.j;
    }

    private File i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c4efd29d", new Object[]{this});
        }
        if (this.k == null) {
            try {
                this.k = new File(new File(LoggingUtil.getCommonExternalStorageDir(), this.c.getPackageName()), this.b);
            } catch (Throwable unused) {
            }
        }
        return this.k;
    }
}
