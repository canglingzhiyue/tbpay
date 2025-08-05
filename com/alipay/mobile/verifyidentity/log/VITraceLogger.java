package com.alipay.mobile.verifyidentity.log;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.e;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public class VITraceLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile VITraceLogger c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5875a = false;
    private StringBuffer b = new StringBuffer();

    public void setDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{this, new Boolean(z)});
        } else {
            this.f5875a = z;
        }
    }

    private VITraceLogger() {
        try {
            a("com.taobao.taobao,VIFBUnitedView", LogLevel.D);
            a("com.taobao.taobao,EnvInfoUtil", LogLevel.D);
            a("com.taobao.taobao,FingerprintPlugin", LogLevel.D);
            a("com.taobao.taobao,PasswordInputUnifiedPlugin", LogLevel.D);
            a("com.taobao.taobao,PayPwdDialogActivity", LogLevel.D);
            a("com.taobao.taobao,FingerprintCheckActivity", LogLevel.D);
            a("com.taobao.taobao,ZFaceChecker", LogLevel.D);
            a("com.taobao.taobao,FaceIdChecker", LogLevel.D);
            a("com.taobao.taobao,FpBaseHelper", LogLevel.D);
            a("com.taobao.taobao,DecisonLogBehavior", LogLevel.D);
            a("com.taobao.taobao,SafepayChecker", LogLevel.D);
            a("com.taobao.taobao,ViTbDecisionReceiver", LogLevel.D);
            a("com.taobao.taobao,AIManager", LogLevel.D);
        } catch (Throwable unused) {
        }
    }

    public static VITraceLogger getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VITraceLogger) ipChange.ipc$dispatch("893bf25e", new Object[0]);
        }
        if (c == null) {
            synchronized (VITraceLogger.class) {
                if (c == null) {
                    c = new VITraceLogger();
                }
            }
        }
        return c;
    }

    public void info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{this, str, str2});
            return;
        }
        a(str, str2);
        try {
            TLog.logi(str, str, str2);
        } catch (Throwable th) {
            new StringBuilder("recordlogI error:").append(th.getMessage());
        }
        if (!this.f5875a) {
            return;
        }
        a(str2);
    }

    public void verbose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921d919d", new Object[]{this, str, str2});
            return;
        }
        a(str, str2);
        try {
            TLog.logv(str, str, str2);
        } catch (Throwable th) {
            new StringBuilder("recordlogI error:").append(th.getMessage());
        }
        if (!this.f5875a) {
            return;
        }
        a(str2);
    }

    public void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
            return;
        }
        a(str, str2);
        try {
            TLog.logd(str, str, str2);
        } catch (Throwable th) {
            new StringBuilder("recordlogI error:").append(th.getMessage());
        }
        if (!this.f5875a) {
            return;
        }
        a(str2);
    }

    public void warn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b56a1", new Object[]{this, str, str2});
            return;
        }
        a(str, str2);
        a(str, str, str2);
        if (!this.f5875a) {
            return;
        }
        a(str2);
    }

    public void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{this, str, th});
            return;
        }
        a(str, th);
        String throwableToString = throwableToString(th);
        a(str, str, throwableToString);
        if (!this.f5875a) {
            return;
        }
        a(throwableToString);
    }

    public void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
            return;
        }
        a(str, str2);
        try {
            TLog.loge(str, str, str2);
        } catch (Throwable th) {
            new StringBuilder("recordlogI error:").append(th.getMessage());
        }
        if (!this.f5875a) {
            return;
        }
        a(str2);
    }

    public void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{this, str, th});
            return;
        }
        a(str, th);
        a(str, str, th);
        String throwableToString = throwableToString(th);
        if (!this.f5875a) {
            return;
        }
        a(throwableToString);
    }

    public void print(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20a03c8", new Object[]{this, str, str2});
        } else {
            a(str, str2);
        }
    }

    public void print(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cbf137", new Object[]{this, str, th});
        } else {
            a(str, th);
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        this.b.setLength(0);
        StringBuffer stringBuffer = this.b;
        stringBuffer.append('[');
        stringBuffer.append(Thread.currentThread().getName());
        stringBuffer.append("] ");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static String throwableToString(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8235015e", new Object[]{th});
        }
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            Throwable cause = th.getCause();
            if (cause == null) {
                th.printStackTrace(printWriter);
            }
            while (cause != null) {
                cause.printStackTrace(printWriter);
                cause = cause.getCause();
            }
            printWriter.close();
            return stringWriter.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        Class[] clsArr = {String.class, String.class};
        Object[] objArr = {str, str2};
        return false;
    }

    private static boolean a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe179b07", new Object[]{str, th})).booleanValue();
        }
        Class[] clsArr = {String.class, Throwable.class};
        Object[] objArr = {str, th};
        return false;
    }

    private static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        try {
            TLog.logw(str, str2, str3);
        } catch (Throwable th) {
            new StringBuilder("recordlogI error:").append(th.getMessage());
        }
    }

    private static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        try {
            TLog.loge(str, str2, th);
        } catch (Throwable th2) {
            new StringBuilder("recordlogI error:").append(th2.getMessage());
        }
    }

    private static void a(String str, LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a15dac4", new Object[]{str, logLevel});
            return;
        }
        try {
            e.a().a(str, logLevel);
        } catch (Throwable th) {
            new StringBuilder("addLogFilter error:").append(th.getMessage());
        }
    }

    public void error(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c88bb2", new Object[]{this, str, str2, th});
            return;
        }
        Class[] clsArr = {String.class, String.class, Throwable.class};
        Object[] objArr = {str, str2, th};
        a(str, str, th);
        String throwableToString = throwableToString(th);
        if (!this.f5875a) {
            return;
        }
        if (str2 == null) {
            a(throwableToString);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(a(throwableToString));
    }
}
