package com.ut.mini.crashhandler;

import android.content.Context;
import android.os.Process;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.crashhandler.c;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class d implements Thread.UncaughtExceptionHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static d d;
    private static volatile boolean f;

    /* renamed from: a  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f24104a = null;
    private a b = null;
    private Context c = null;
    private boolean e = true;

    static {
        kge.a(-1474295473);
        kge.a(379224950);
        d = new d();
        f = false;
    }

    private d() {
    }

    public static d getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("eb61b345", new Object[0]) : d;
    }

    public boolean isTurnOff() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("792e7fb3", new Object[]{this})).booleanValue() : this.e;
    }

    public void turnOff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd39e339", new Object[]{this});
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f24104a;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            this.f24104a = null;
        }
        this.e = true;
    }

    public void turnOn(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33409765", new Object[]{this, context});
        } else {
            a();
        }
    }

    public void setCrashCaughtListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b052c0", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.e) {
        } else {
            this.f24104a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.e = false;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca89fd43", new Object[]{this, thread, th});
            return;
        }
        try {
            if (f) {
                if (uncaughtExceptionHandler == null) {
                    return;
                }
                return;
            }
            f = true;
            if (th != null) {
                apr.e("Caught Exception By UTCrashHandler.Please see log as follows!", new Object[0]);
                th.printStackTrace();
            }
            c.a parse = c.parse(th);
            if (parse != null && parse.c != null && parse.getExpName() != null && parse.getMd5() != null) {
                Map<String, String> map = null;
                if (this.b != null) {
                    map = this.b.onCrashCaught(thread, th);
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                Map<String, String> map2 = map;
                map2.put("StackTrace", parse.getCrashDetail());
                UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("UT", 1, parse.getMd5(), parse.getExpName(), null, map2);
                uTOriginalCustomHitBuilder.setProperty("_priority", "5");
                uTOriginalCustomHitBuilder.setProperty("_sls", Constants.VAL_YES);
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                if (defaultTracker != null) {
                    defaultTracker.send(uTOriginalCustomHitBuilder.build());
                } else {
                    apr.e("Record crash stacktrace error", "Fatal Error,must call setRequestAuthentication method first.");
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f24104a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
                return;
            }
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f24104a;
                if (uncaughtExceptionHandler3 != null) {
                    uncaughtExceptionHandler3.uncaughtException(thread, th);
                    return;
                }
                Process.killProcess(Process.myPid());
                System.exit(10);
            } finally {
                uncaughtExceptionHandler = this.f24104a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    Process.killProcess(Process.myPid());
                    System.exit(10);
                }
            }
        }
    }
}
