package com.taobao.android.weex_framework.module.builtin;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_framework.util.o;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import tb.jvb;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSDevModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "weexdebug";

    static {
        kge.a(1802657385);
    }

    public MUSDevModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = false)
    public JSONObject getInstanceLocationOnScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("38b9052", new Object[]{this});
        }
        final FutureTask futureTask = new FutureTask(new Callable<JSONObject>() { // from class: com.taobao.android.weex_framework.module.builtin.MUSDevModule.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ JSONObject call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public JSONObject a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (JSONObject) ipChange2.ipc$dispatch("709f7788", new Object[]{this});
                }
                View rootView = ((jvb) MUSDevModule.this.getInstance()).a().getRootView();
                if (Build.VERSION.SDK_INT >= 19 && !rootView.isAttachedToWindow()) {
                    return null;
                }
                int[] iArr = new int[2];
                rootView.getLocationOnScreen(iArr);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", (Object) Integer.valueOf(iArr[0]));
                jSONObject.put("y", (Object) Integer.valueOf(iArr[1]));
                jSONObject.put("width", (Object) Integer.valueOf(rootView.getWidth()));
                jSONObject.put("height", (Object) Integer.valueOf(rootView.getHeight()));
                return jSONObject;
            }
        });
        j.b(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSDevModule.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    futureTask.run();
                }
            }
        });
        try {
            return (JSONObject) futureTask.get(Constants.STARTUP_TIME_LEVEL_1, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
            return null;
        }
    }

    @MUSMethod(uiThread = true)
    public void switchForceThemis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ab6544", new Object[]{this});
        } else if (!m.c() && !com.taobao.android.riverlogger.inspector.a.a()) {
        } else {
            if (com.taobao.android.weex_framework.util.d.e == null) {
                com.taobao.android.weex_framework.util.d.e = true;
            } else {
                com.taobao.android.weex_framework.util.d.e = Boolean.valueOf(!com.taobao.android.weex_framework.util.d.e.booleanValue());
            }
            Context uIContext = getInstance().getUIContext();
            StringBuilder sb = new StringBuilder();
            sb.append("强制使用Themis: ");
            sb.append(com.taobao.android.weex_framework.util.d.e.booleanValue() ? "开" : "关");
            Toast.makeText(uIContext, sb.toString(), 0).show();
        }
    }
}
