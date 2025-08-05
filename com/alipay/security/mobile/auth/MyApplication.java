package com.alipay.security.mobile.auth;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MyApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static MyApplication mcontext;

    public static /* synthetic */ Object ipc$super(MyApplication myApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        mcontext = this;
    }

    public static Context getAppContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[0]) : mcontext;
    }
}
