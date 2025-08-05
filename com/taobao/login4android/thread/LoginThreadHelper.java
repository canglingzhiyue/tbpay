package com.taobao.login4android.thread;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.ReflectionHelper;
import tb.kge;

/* loaded from: classes.dex */
public class LoginThreadHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.LoginThreadHelper";
    private static Handler mMainThreadHandler;

    static {
        kge.a(-667137798);
        mMainThreadHandler = new Handler(Looper.getMainLooper());
    }

    public static void runOnUIThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f52770d", new Object[]{runnable});
            return;
        }
        try {
            if (!isMainThread()) {
                mMainThreadHandler.post(runnable);
            } else {
                runnable.run();
            }
        } catch (Exception e) {
            LoginTLogAdapter.w(TAG, "runOnUIThread failed", e);
            e.printStackTrace();
        }
    }

    public static boolean isMainThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static String getCurProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86b9d1cf", new Object[]{context});
        }
        try {
            Class<?> cls = Class.forName("com.taobao.tao.TaobaoApplication");
            String str = (String) ReflectionHelper.invokeMethod(cls, cls.getDeclaredMethod(ProcessUtils.GET_PROCESS_NAME, Context.class), context);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } catch (Throwable unused) {
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return "ProcessNameNotFound";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "ProcessNameNotFound";
        } catch (Exception e) {
            e.printStackTrace();
            return "GetCurProcessException";
        }
    }
}
