package com.taobao.login4android.thread;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class LoginTask implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "logni.LoginTask";

    static {
        kge.a(-1437047257);
        kge.a(-1390502639);
    }

    public abstract void excuteTask();

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            excuteTask();
        } catch (Exception e) {
            LoginStatus.resetLoginFlag();
            LoginTLogAdapter.w(TAG, "LoginTask excute failed, reset login status", e);
            e.printStackTrace();
        }
    }
}
