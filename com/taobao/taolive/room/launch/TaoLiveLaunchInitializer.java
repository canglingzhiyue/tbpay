package com.taobao.taolive.room.launch;

import android.app.Application;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.c;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.utils.q;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoLiveLaunchInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final AtomicBoolean INIT;
    private static final AtomicBoolean ONCE_APP_BUNDLE;
    private static final AtomicBoolean ONCE_LAUNCHER;
    private static final String TAG = "TaoLiveLaunchInitializer";

    static {
        kge.a(1062306941);
        kge.a(1028243835);
        INIT = new AtomicBoolean(false);
        ONCE_LAUNCHER = new AtomicBoolean(false);
        ONCE_APP_BUNDLE = new AtomicBoolean(false);
    }

    public static synchronized void init() {
        synchronized (TaoLiveLaunchInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            boolean z = Looper.myLooper() == Looper.getMainLooper();
            TLog.loge("TaoLive", TAG, "init, isMainThread: " + z);
            if (z) {
                initInner();
            } else if (Thread.currentThread().getName().contains("launcher-")) {
                if (ONCE_LAUNCHER.compareAndSet(false, true)) {
                    initInner();
                } else {
                    TLog.loge("TaoLive", TAG, "init, already once, no need to once again");
                }
            } else {
                initInner();
            }
            if (ONCE_APP_BUNDLE.compareAndSet(false, true)) {
                c.Companion.a().a("taolive_android", new c.InterfaceC0628c() { // from class: com.taobao.taolive.room.launch.TaoLiveLaunchInitializer.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.appbundle.c.InterfaceC0628c
                    public void a(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        q.b(TaoLiveLaunchInitializer.TAG, "app bundle onFeatureComponentLoaded, try to init live");
                        TaoLiveLaunchInitializer.init();
                    }
                });
            }
        }
    }

    private static synchronized void initInner() {
        synchronized (TaoLiveLaunchInitializer.class) {
            TLog.loge("TaoLive", TAG, "initInner, start. threadName: " + Thread.currentThread().getName());
            if (INIT.get()) {
                TLog.loge("TaoLive", TAG, "initInner, init finish, return");
                return;
            }
            Method declaredMethod = Class.forName("com.taobao.taolive.adapterimpl.global.TaoLiveApplication").getDeclaredMethod("init", Application.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, Globals.getApplication());
            INIT.set(true);
            TLog.loge("TaoLive", TAG, "initInner, success");
        }
    }

    public static synchronized void init(Application application, HashMap<String, Object> hashMap) {
        synchronized (TaoLiveLaunchInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            } else {
                init();
            }
        }
    }
}
