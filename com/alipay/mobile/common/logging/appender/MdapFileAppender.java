package com.alipay.mobile.common.logging.appender;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.io.LogBuffer;
import com.alipay.mobile.common.logging.strategy.LogStrategyInfo;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.common.logging.util.FileUtil;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class MdapFileAppender extends FileAppender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String e = "mdap" + File.separatorChar + "upload";
    public File f;
    public File g;
    public int h;
    public int i;
    public boolean j;
    public LogBuffer k;
    public int l;
    private boolean m;
    private boolean n;

    public static /* synthetic */ Object ipc$super(MdapFileAppender mdapFileAppender, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MdapFileAppender(LogContext logContext, String str) {
        super(logContext, str);
        this.j = true;
        this.k = null;
        this.l = 0;
        this.m = false;
        this.n = false;
    }

    @Override // com.alipay.mobile.common.logging.appender.Appender
    public final synchronized void a(LogEvent logEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f405290", new Object[]{this, logEvent});
            return;
        }
        TianyanLoggingStatus.acceptTimeTicksMadly();
        e();
        if (this.j) {
            this.j = false;
            String readFile = FileUtil.readFile(c());
            if (!TextUtils.isEmpty(readFile)) {
                this.h = readFile.split("\\$\\$").length;
            }
        }
        if (LoggingUtil.isDebuggable(LoggerFactory.getLogContext().getApplicationContext()) && this.f5426a.getLogAppenderistener() != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f5426a.getLogAppenderistener().onLogAppend(logEvent);
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 > 1000) {
                LoggerFactory.getTraceLogger().error("Appender", "\n\n\nexternal appender listener spend too much time: ".concat(String.valueOf(uptimeMillis2)));
            }
        }
        String logEvent2 = logEvent.toString();
        if (this.l + logEvent2.length() >= 32768) {
            a(this.k.toString(), LogStrategyManager.getInstance().needEncrypt(this.b));
            this.h += this.i;
            this.k.setLength(0);
            this.i = 0;
            this.l = 0;
        }
        if (logEvent2.length() >= 32768) {
            a(logEvent2, LogStrategyManager.getInstance().needEncrypt(this.b));
            this.h++;
        } else {
            this.k.append(logEvent2);
            this.i++;
            this.l += logEvent2.length();
        }
        if (!LoggerFactory.getProcessInfo().isMainProcess() || this.i >= 3 || LoggingUtil.isOfflineMode() || LogStrategyManager.getInstance().isLogUpload(this.b, this.i, this.f5426a)) {
            a(this.k.toString(), LogStrategyManager.getInstance().needEncrypt(this.b));
            this.h += this.i;
            this.k.setLength(0);
            this.i = 0;
            this.l = 0;
        }
        if (LogStrategyManager.getInstance().isLogUpload(this.b, this.h, this.f5426a)) {
            new StringBuilder("upload: ").append(this.b);
            Bundle bundle = new Bundle();
            bundle.putString("event", "maxLogCount");
            a((String) null, bundle);
            this.h = 0;
        }
    }

    public final synchronized void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        e();
        if (this.i > 0) {
            LoggerFactory.getTraceLogger().info("Appender", this.b + " appender flush: " + this.i);
        }
        if (this.k.getLength() == 0) {
            b(bundle);
            return;
        }
        a(this.k.toString(), LogStrategyManager.getInstance().needEncrypt(this.b));
        this.k.setLength(0);
        this.h += this.i;
        this.i = 0;
        this.l = 0;
        b(bundle);
    }

    private void b(Bundle bundle) {
        File c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47681e4b", new Object[]{this, bundle});
        } else if (bundle == null || !bundle.getBoolean(LogContext.NEED_MOVE, false)) {
        } else {
            try {
                c = c();
            } catch (Throwable unused) {
            }
            if (!c.exists()) {
                return;
            }
            FileUtil.moveFile(c, f());
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.info("Appender", this.b + " appender flush move " + this.h);
            this.h = 0;
        }
    }

    @Override // com.alipay.mobile.common.logging.appender.Appender
    public final synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a((Bundle) null);
        }
    }

    @Override // com.alipay.mobile.common.logging.appender.Appender
    public final synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alipay.mobile.common.logging.appender.FileAppender
    public final File c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("298485e3", new Object[]{this});
        }
        if (this.f == null && LoggingUtil.isOfflineMode()) {
            File file = null;
            try {
                file = this.c.getExternalFilesDir("mdap");
            } catch (Throwable unused) {
            }
            if (file != null) {
                try {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    this.f = new File(file, this.d + "_" + this.b);
                } catch (Throwable unused2) {
                }
            }
        }
        if (this.f == null) {
            File file2 = new File(this.c.getFilesDir(), "mdap");
            try {
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            } catch (Throwable unused3) {
            }
            this.f = new File(file2, this.d + "_" + this.b);
        }
        return this.f;
    }

    @Override // com.alipay.mobile.common.logging.appender.FileAppender
    public final File d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ee166802", new Object[]{this});
        }
        if (this.g == null) {
            File filesDir = this.c.getFilesDir();
            if (filesDir == null) {
                return null;
            }
            File file = new File(filesDir, ".logbuffer");
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable unused) {
            }
            this.g = new File(file, "logbuffer_" + this.d + "_" + this.b);
        }
        return this.g;
    }

    private synchronized void e() {
        LogStrategyInfo logStrategyInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.n) {
        } else {
            this.n = true;
            if (LogCategory.CATEGORY_LOGMONITOR.equals(this.b) && (logStrategyInfo = LogStrategyManager.getInstance().getLogStrategyInfo(this.b)) != null && logStrategyInfo.getThreshold() == 19) {
                this.m = true;
            }
            File d = d();
            if (d == null || !LoggerFactory.getProcessInfo().isMainProcess()) {
                this.m = false;
            }
            if (this.m) {
                if (this.f5426a == null) {
                    a(this.m, d);
                    return;
                }
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f5426a.getApplicationContext());
                if (defaultSharedPreferences == null) {
                    a(this.m, d);
                    return;
                }
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                if (edit == null) {
                    a(this.m, d);
                    return;
                } else if (defaultSharedPreferences.getInt("mmapsucc", 0) == 0) {
                    edit.putInt("mmapsucc", 1).commit();
                    a(this.m, d);
                    edit.putInt("mmapsucc", 0).commit();
                    return;
                } else {
                    a(false, d);
                    return;
                }
            }
            this.k = new LogBuffer(false, d, 32768);
        }
    }

    private void a(boolean z, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bba6fe3", new Object[]{this, new Boolean(z), file});
            return;
        }
        this.k = new LogBuffer(z, file, 32768);
        this.l = this.k.getLength();
    }

    private File f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("773a2c40", new Object[]{this});
        }
        File file = new File(this.c.getFilesDir(), e);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, LoggingUtil.getMdapStyleName(c().getName()));
    }

    private File g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3bcc0e5f", new Object[]{this});
        }
        File file = new File(this.c.getExternalFilesDir("mdap"), "upload");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, LoggingUtil.getMdapStyleName(c().getName()));
    }

    public final void a(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
        } else if (this.h == 0) {
        } else {
            try {
                if (LoggingUtil.isOfflineMode()) {
                    try {
                        FileUtil.copyFile(c(), g());
                    } catch (Throwable unused) {
                    }
                }
                try {
                    FileUtil.moveFile(c(), f());
                } catch (Throwable unused2) {
                }
                this.h = 0;
                this.f5426a.upload(this.b, str, bundle);
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("Appender", this.b, th);
            }
        }
    }
}
