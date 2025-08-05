package com.alipay.mobile.verifyidentity.log.crash;

import android.os.Looper;
import android.util.Base64;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Thread;

/* loaded from: classes3.dex */
public class VerifyIdentityCrashHandler implements Thread.UncaughtExceptionHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5879a = "VerifyIdentityCrashHandler";
    private static volatile VerifyIdentityCrashHandler b;
    private Thread.UncaughtExceptionHandler c;

    public static VerifyIdentityCrashHandler getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityCrashHandler) ipChange.ipc$dispatch("ce60c0d4", new Object[0]);
        }
        if (b == null) {
            synchronized (VerifyIdentityCrashHandler.class) {
                if (b == null) {
                    b = new VerifyIdentityCrashHandler();
                }
            }
        }
        return b;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.CMStart))) {
        } else {
            this.c = Looper.getMainLooper().getThread().getUncaughtExceptionHandler();
            Looper.getMainLooper().getThread().setUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca89fd43", new Object[]{this, thread, th});
            return;
        }
        Looper.getMainLooper().getThread().setUncaughtExceptionHandler(this.c);
        try {
            VerifyLogCat.e(f5879a, "VI uncaughtException", th);
            VerifyLogCat.e(f5879a, a(th));
            VerifyLogger.getInstance().writeCrashLog(a(th));
        } catch (Throwable th2) {
            VerifyLogCat.w(f5879a, th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.c == null) {
        } else {
            Looper.getMainLooper().getThread().setUncaughtExceptionHandler(this.c);
        }
    }

    private static String a(Throwable th) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        try {
            str = new String(Base64.encode(VerifyLogCat.getExceptionMsg(th).getBytes("UTF-8"), 2));
        } catch (Throwable th2) {
            VerifyLogCat.w(f5879a, "fail to build encodedExceptionMsg：", th2);
            str = "-";
        }
        return "170823-1;20000666;vicrashinfo;" + th.getClass().getName() + ";" + str + ")]";
    }
}
