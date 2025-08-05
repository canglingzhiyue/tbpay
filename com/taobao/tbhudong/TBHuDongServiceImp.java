package com.taobao.tbhudong;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.task.Coordinator;
import com.taobao.tbreachflow.shortcuts.windvane.WVShortcutsPlugin;
import com.taobao.tbreachflow.shortcuts.windvane.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.qoe;

/* loaded from: classes.dex */
public class TBHuDongServiceImp implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicBoolean INIT_STATED = new AtomicBoolean(false);
    private static Application mApplication;

    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
        }
    }

    public void setup(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1141d359", new Object[]{this, application, new Boolean(z)});
        } else {
            doInit(application);
        }
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (!ABGlobal.isFeatureOpened(application, "poplayer_launch_task_opt")) {
        } else {
            doInit(application);
        }
    }

    private static void doInit(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac14ddd", new Object[]{application});
        } else if (INIT_STATED.getAndSet(true)) {
        } else {
            mApplication = application;
            qoe.a().b();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.tbhudong.-$$Lambda$TBHuDongServiceImp$Ttjz-865Wo49h32mOCwHIHGqIuE
                @Override // java.lang.Runnable
                public final void run() {
                    TBHuDongServiceImp.lambda$doInit$1(application);
                }
            }, 5000L);
            q.a("WVShortcutsPlugin", (Class<? extends e>) WVShortcutsPlugin.class, true);
            a.a();
        }
    }

    public static /* synthetic */ void lambda$doInit$1(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b84c813", new Object[]{application});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tbhudong.-$$Lambda$TBHuDongServiceImp$316cAb-I1nvR8RYPVvl8EZKhJUU
                @Override // java.lang.Runnable
                public final void run() {
                    TBHuDongServiceImp.lambda$null$0(application);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$null$0(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bb3268", new Object[]{application});
        } else {
            StorageMonitor.a(application);
        }
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("5749e470", new Object[0]) : mApplication;
    }
}
