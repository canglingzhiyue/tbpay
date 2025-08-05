package com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

/* loaded from: classes3.dex */
public class JavaSCLogCatImpl implements SCLogCatInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{this, str, str2});
            return;
        }
        a(a(str, TLogTracker.LEVEL_INFO) + ":" + str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void verbose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921d919d", new Object[]{this, str, str2});
            return;
        }
        a(a(str, "V") + ":" + str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
            return;
        }
        a(a(str, TLogTracker.LEVEL_DEBUG) + ":" + str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void warn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b56a1", new Object[]{this, str, str2});
            return;
        }
        a(a(str, "W") + ":" + str2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{this, str, th});
        } else {
            a(a(str, "W"), th);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void warn(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c808bbf4", new Object[]{this, str, str2, th});
            return;
        }
        a(a(str, "W") + ":" + str2, th);
    }

    private void a(String str) {
        try {
            Class<?> cls = Class.forName("java.lang.System");
            Object obj = cls.getField("out").get(cls);
            obj.getClass().getMethod("println", String.class).invoke(obj, str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
            return;
        }
        a(a(str, "E") + ":" + str2, (Throwable) null);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{this, str, th});
        } else {
            a(a(str, "E"), th);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void error(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c88bb2", new Object[]{this, str, str2, th});
            return;
        }
        a(a(str, "E") + ":" + str2, th);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void printInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94d816", new Object[]{this, str, str2});
        } else {
            info(str, str2);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface
    public void printError(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6fc9", new Object[]{this, str, th});
        } else {
            error(str, th);
        }
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        return new Date().toLocaleString() + " " + Thread.currentThread().getId() + " " + Thread.currentThread().getName() + " " + str2 + " " + str + " ";
    }

    private void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{this, str, th});
            return;
        }
        if (th != null) {
            str = str + " " + a(th);
        }
        a(str);
    }

    public String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.getClass().getMethod(String.format("%s%s%s", a.ATOM_EXT_print, "Stack", "Trace"), PrintWriter.class).invoke(th, printWriter);
            printWriter.flush();
        } catch (Throwable unused) {
        }
        return stringWriter.toString();
    }
}
