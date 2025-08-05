package com.alibaba.triver;

import android.app.Application;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.embed.a;
import android.taobao.windvane.jsbridge.q;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.triver.base.taobao.TriverRemoteManager;
import com.alibaba.triver.base.taobao.c;
import com.alibaba.triver.cannal_engine.scene.TRWidgetJsPlugin;
import com.alibaba.triver.cannal_engine.scene.TRWidgetWXModule;
import com.alibaba.triver.cannal_engine.scene.TRWidgetWXView;
import com.alibaba.triver.triver_weex.WXAriverComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.Remo;
import com.taobao.android.remoteso.component.d;
import com.taobao.android.remoteso.component.k;
import com.taobao.android.remoteso.component.l;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.e;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.weex.WXSDKEngine;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes3.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TriverInitializer";
    public static final String TLOG_MODULE = "Triver";

    static {
        kge.a(-1254205580);
    }

    public static void a(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        s.f18233a.d().a("triver_remote_state", TriverRemoteManager.getInstance().checkTriverState());
        a();
        if (AdapterForTLog.isValid()) {
            e.a().a("Triver", LogLevel.D);
        }
        if (c.a(".closeTriverInit").booleanValue()) {
            return;
        }
        TriverRemoteManager.getInstance().install(TAG, "", ITriverRemoteProxy.DependenceMode.TRIVER_ONLY, null, new ITriverRemoteProxy.a() { // from class: com.alibaba.triver.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
            public void a() {
                try {
                    Class.forName("com.alibaba.triver.TriverInitializerImpl").getMethod("init", Application.class).invoke(null, application);
                } catch (Throwable th) {
                    TLog.loge("Triver", f.TAG, th);
                }
            }

            @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    TLog.loge("Triver", f.TAG, str);
                }
            }
        });
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule("triver-widget", TRWidgetWXModule.class);
            a.a("widget", (Class<? extends BaseEmbedView>) Class.forName("com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView"), true);
        } catch (Throwable th) {
            RVLogger.e("TRiverSDK", "register TRWidgetWVEmbedView failed " + th);
        }
        q.a("triver-widget", (Class<? extends android.taobao.windvane.jsbridge.e>) TRWidgetJsPlugin.class);
        try {
            WXSDKEngine.registerComponent("canal", TRWidgetWXView.class);
            WXSDKEngine.registerComponent("widget", TRWidgetWXView.class);
        } catch (Throwable th2) {
            RVLogger.e("TRiverSDK", "register FCanvasWeexComponent failed " + th2);
        }
        try {
            a.a("evagraftview", (Class<? extends BaseEmbedView>) Class.forName("com.alibaba.triver.triver_weex.evagraft.WVEvaGraftView"), true);
        } catch (Throwable th3) {
            RVLogger.e("TRiverSDK", "register TRWidgetWVEmbedView failed " + th3);
        }
        b();
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            Remo.b(k.a().a("flexa", "taobao_weex_adapter").a(false).a(new d() { // from class: com.alibaba.triver.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.component.d
                public void a(l lVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fcc8199", new Object[]{this, lVar});
                        return;
                    }
                    try {
                        WXSDKEngine.registerComponent("ariver", WXAriverComponent.class);
                    } catch (Throwable th) {
                        RVLogger.e(RVConstants.TAG, "Register ariver component failed");
                        RVLogger.e(RVConstants.TAG, th);
                    }
                }
            }).a());
        }
    }
}
