package me.ele.bridge;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.bhc;
import tb.bhf;

/* loaded from: classes9.dex */
public class BundleRemoteInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BUNDLE_REMOTE_INITIALIZER = "BundleRemoteInitializer";
    private static final String INIT_KEY = "init_key";
    public static final String PIZZA = "pizza_sdk";
    private static Handler mHandler;

    public static /* synthetic */ Handler access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1554edef", new Object[0]) : mHandler;
    }

    public static /* synthetic */ Handler access$002(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7fe0f4fd", new Object[]{handler});
        }
        mHandler = handler;
        return handler;
    }

    public static void sendPizza(final Application application, final Page page, ApiContext apiContext, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final int i, final JSONObject jSONObject4, final JSONObject jSONObject5, final String str3, final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f50560", new Object[]{application, page, apiContext, str, str2, jSONObject, jSONObject2, jSONObject3, new Integer(i), jSONObject4, jSONObject5, str3, bridgeCallback});
            return;
        }
        if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
            HandlerThread handlerThread = new HandlerThread(BUNDLE_REMOTE_INITIALIZER);
            handlerThread.start();
            mHandler = new Handler(handlerThread.getLooper());
        } else {
            mHandler = new Handler();
        }
        Bundle bundle = new Bundle();
        bundle.putString(INIT_KEY, BUNDLE_REMOTE_INITIALIZER);
        h.a(application).a(j.a().a(bhf.a(application, PizzaApi.class).a(new bhc.b<Object>() { // from class: me.ele.bridge.BundleRemoteInitializer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bhc.b
            public void a(final Object obj, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle2});
                    return;
                }
                String string = bundle2.getString(BundleRemoteInitializer.INIT_KEY);
                if (!bundle2.containsKey(BundleRemoteInitializer.INIT_KEY) || string == null || !string.equals(BundleRemoteInitializer.BUNDLE_REMOTE_INITIALIZER) || !(obj instanceof PizzaApi) || BundleRemoteInitializer.access$000() == null) {
                    return;
                }
                BundleRemoteInitializer.access$000().post(new Runnable() { // from class: me.ele.bridge.BundleRemoteInitializer.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ((PizzaApi) obj).sendPizza(application, page.getApp().getAppId(), str, str2, jSONObject, jSONObject2, jSONObject3, i, jSONObject4, jSONObject5, str3, bridgeCallback);
                        Log.e(BundleRemoteInitializer.PIZZA, "BUNDLE_REMOTE_INITIALIZER init success");
                        if (BundleRemoteInitializer.access$000().getLooper() == Looper.getMainLooper()) {
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 18) {
                            BundleRemoteInitializer.access$000().getLooper().quitSafely();
                        } else {
                            BundleRemoteInitializer.access$000().getLooper().quit();
                        }
                        BundleRemoteInitializer.access$002(null);
                    }
                });
            }

            @Override // tb.bhc.b
            public void a(String str4, Bundle bundle2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str4, bundle2});
                } else {
                    Log.e(BundleRemoteInitializer.PIZZA, "BUNDLE_REMOTE_INITIALIZER init failed");
                }
            }
        }).a(bundle).a()).a());
    }
}
