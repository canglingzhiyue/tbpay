package com.taobao.android.launcher.bootstrap.tao.ability;

import android.app.Activity;
import android.app.Instrumentation;
import android.app.Service;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadSystemException;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import tb.guc;
import tb.gve;
import tb.gvk;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Instrumentation f13065a;

    public a(Instrumentation instrumentation) {
        this.f13065a = instrumentation;
    }

    public void a(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18eae0da", new Object[]{this, activity, bundle});
        } else if (!(activity instanceof FragmentActivity)) {
            this.f13065a.callActivityOnCreate(activity, bundle);
        } else if (!com.taobao.flowcustoms.afc.a.a(activity.getIntent())) {
            this.f13065a.callActivityOnCreate(activity, bundle);
        } else if (guc.a(activity, "exceptionViewStateFixOff")) {
            this.f13065a.callActivityOnCreate(activity, bundle);
        } else if (bundle == null) {
            this.f13065a.callActivityOnCreate(activity, null);
        } else if (bundle.getParcelable("android:support:fragments") == null) {
            this.f13065a.callActivityOnCreate(activity, bundle);
        } else {
            a("BadFragmentState", "activityName=" + activity.getClass().getName());
            bundle.remove("android:support:fragments");
            this.f13065a.callActivityOnCreate(activity, bundle);
        }
    }

    public void b(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2626e79", new Object[]{this, activity, bundle});
            return;
        }
        try {
            this.f13065a.callActivityOnRestoreInstanceState(activity, bundle);
        } catch (BadParcelableException e) {
            a(e, activity.getClass().getName());
            if (guc.a(activity, "exceptionRecoveryOff")) {
                throw e;
            }
            if (bundle != null) {
                bundle.clear();
            }
        } finally {
            TLog.loge(gve.MODULE, "ExceptionRecovery", "callActivityOnRestoreInstanceState for activity: " + activity.getComponentName());
        }
    }

    private void a(BadParcelableException badParcelableException, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6259971", new Object[]{this, badParcelableException, str});
            return;
        }
        String message = badParcelableException.getMessage();
        if (TextUtils.isEmpty(message) || !message.startsWith("ClassNotFoundException when unmarshalling:")) {
            return;
        }
        String substring = message.substring(43);
        a("BadParcelable", "className=" + substring + ", activityName=" + str);
    }

    public boolean a(Object obj, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a17b435", new Object[]{this, obj, th})).booleanValue();
        }
        Log.wtf("ExceptionRecovery", th);
        Throwable th2 = th;
        for (Throwable cause = th.getCause(); cause != null && th2 != cause; cause = cause.getCause()) {
            th2 = cause;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        try {
            th.printStackTrace(printStream);
            printStream.close();
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo("ExceptionRecovery", byteArrayOutputStream2);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if ((obj instanceof Service) && (th2 instanceof DeadSystemException)) {
                    a("serviceException", "service=" + obj.getClass().getName());
                    return true;
                }
            } else if ((obj instanceof Service) && (th instanceof RuntimeException)) {
                a("serviceException", "service=" + obj.getClass().getName());
                return true;
            }
            if (obj != null) {
                a("UncaughtException", "obj=" + obj.getClass().getName() + ":" + message);
            } else {
                a("UncaughtException", "exception :" + byteArrayOutputStream2);
            }
            return false;
        } finally {
        }
    }

    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        TLog.loge(gve.MODULE, str, str2);
        String c = gvk.c(gvk.a());
        AppMonitor.Counter.commit(gve.MODULE, "ExceptionRecovery", "type=" + str + ", startupComponent=" + c + ", " + str2, 1.0d);
    }
}
