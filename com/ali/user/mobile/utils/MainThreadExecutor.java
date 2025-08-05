package com.ali.user.mobile.utils;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.kge;

/* loaded from: classes2.dex */
public class MainThreadExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler mHandler;

    static {
        kge.a(-1744877956);
        mHandler = new Handler(Looper.getMainLooper());
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        try {
            mHandler.post(runnable);
        } catch (Exception e) {
            LoginTLogAdapter.e("login.MainThreadExecutor", "MainThreadExecutor.excute failed.", e);
            e.printStackTrace();
        }
    }

    public static void postDelayed(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f55df7d", new Object[]{runnable, new Long(j)});
            return;
        }
        try {
            mHandler.postDelayed(runnable, j);
        } catch (Exception e) {
            LoginTLogAdapter.e("login.MainThreadExecutor", "MainThreadExecutor.excute failed.", e);
            e.printStackTrace();
        }
    }
}
