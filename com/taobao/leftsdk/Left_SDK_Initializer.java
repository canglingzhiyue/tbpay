package com.taobao.leftsdk;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.bhc;
import tb.bhe;
import tb.cak;

/* loaded from: classes7.dex */
public class Left_SDK_Initializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String Left_SDK_KEY = "init_key";
    private static final String Left_SDK_TAG = "LeftSDKInitializerInternal";
    private volatile boolean inited = false;
    private Handler mHandler;

    public static /* synthetic */ Handler access$000(Left_SDK_Initializer left_SDK_Initializer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("fab5d0", new Object[]{left_SDK_Initializer}) : left_SDK_Initializer.mHandler;
    }

    public static /* synthetic */ Handler access$002(Left_SDK_Initializer left_SDK_Initializer, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a4d0aa2", new Object[]{left_SDK_Initializer, handler});
        }
        left_SDK_Initializer.mHandler = handler;
        return handler;
    }

    public static /* synthetic */ boolean access$100(Left_SDK_Initializer left_SDK_Initializer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b333319", new Object[]{left_SDK_Initializer})).booleanValue() : left_SDK_Initializer.inited;
    }

    public static /* synthetic */ boolean access$102(Left_SDK_Initializer left_SDK_Initializer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16282ee5", new Object[]{left_SDK_Initializer, new Boolean(z)})).booleanValue();
        }
        left_SDK_Initializer.inited = z;
        return z;
    }

    public void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
            HandlerThread handlerThread = new HandlerThread(Left_SDK_TAG);
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper());
        } else {
            this.mHandler = new Handler();
        }
        Bundle bundle = new Bundle();
        if (hashMap != null) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                bundle.putSerializable(entry.getKey(), (Serializable) entry.getValue());
            }
        }
        bundle.putString(Left_SDK_KEY, Left_SDK_TAG);
        h.a(application).a(j.a().a(bhe.a(application, "com.taobao.leftsdk.LeftSDKInitializerInternal").a(new bhc.b<cak>() { // from class: com.taobao.leftsdk.Left_SDK_Initializer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bhc.b
            public void a(final cak cakVar, final Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("35478f09", new Object[]{this, cakVar, bundle2});
                } else if (!bundle2.containsKey(Left_SDK_Initializer.Left_SDK_KEY) || !bundle2.getString(Left_SDK_Initializer.Left_SDK_KEY).equals(Left_SDK_Initializer.Left_SDK_TAG) || Left_SDK_Initializer.access$000(Left_SDK_Initializer.this) == null || Left_SDK_Initializer.access$100(Left_SDK_Initializer.this)) {
                } else {
                    Left_SDK_Initializer.access$000(Left_SDK_Initializer.this).post(new Runnable() { // from class: com.taobao.leftsdk.Left_SDK_Initializer.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            cakVar.init(application, bundle2);
                            Log.e("Left_SDK_Initializer", "Left_SDK_Initializer init success");
                            if (Left_SDK_Initializer.access$000(Left_SDK_Initializer.this).getLooper() == Looper.getMainLooper()) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 18) {
                                Left_SDK_Initializer.access$000(Left_SDK_Initializer.this).getLooper().quitSafely();
                            } else {
                                Left_SDK_Initializer.access$000(Left_SDK_Initializer.this).getLooper().quit();
                            }
                            Left_SDK_Initializer.access$002(Left_SDK_Initializer.this, null);
                        }
                    });
                    Left_SDK_Initializer.access$102(Left_SDK_Initializer.this, true);
                }
            }

            @Override // tb.bhc.b
            public void a(String str, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle2});
                } else {
                    Log.e("Left_SDK_Initializer", "Left_SDK_Initializer init failed");
                }
            }
        }).a(bundle).a()).a());
    }
}
