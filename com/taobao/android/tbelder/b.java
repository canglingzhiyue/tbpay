package com.taobao.android.tbelder;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.tbelder.jsplugins.TBElderJSBridge;
import com.taobao.android.tbelder.jsplugins.TBElderWXModule;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.util.HashMap;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_REVISION_SWITCH_CHANGE = "taobao.action.ACTION_REVISION_SWITCH_CHANGE";
    public static final String ACTION_TBELDER_VALUE_CHANGED = "taobao.action.ACTION_TBELDER_VALUE_CHANGED";

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        c.a();
        Log.e("TBElder", "init");
        if (!c.a(true)) {
            Log.e("TBElder", "abort init");
            return;
        }
        a(application);
        Log.e("TBElder", "register broadcast receiver.");
        LocalBroadcastManager.getInstance(application).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.tbelder.TBElder$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                Log.e("TBElder", "onReceive.");
                LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(b.ACTION_TBELDER_VALUE_CHANGED));
                b.a(context);
            }
        }, new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        a();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule("TBElder", TBElderWXModule.class);
            i = 1;
            q.a("TBElder", (Class<? extends e>) TBElderJSBridge.class);
        } catch (WXException unused) {
            Log.e("TBElder", "error in registerJSPlugins, step " + i);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!c()) {
            d(context);
            b(context);
        } else {
            c(context);
            a(context, 3);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        Log.e("TBElder", "recover config");
        a(context, 1);
    }

    public static void a(Context context, int i) {
        try {
            Class.forName("com.taobao.mytaobao.newsetting.FontSetting").getMethod("setFontCofficient", Context.class, Integer.TYPE, String.class).invoke(null, context, Integer.valueOf(i), "TBElder");
        } catch (Exception unused) {
            Log.e("TBElder", "error in updateFontGlobalConfig. " + i);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        try {
            Mtop.instance(context).getMtopConfig().mtopGlobalHeaders.put("elderFont", "true");
        } catch (Throwable th) {
            Log.e("TBElder", "error in updateMTopGlobalConfig: " + th.getMessage());
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        try {
            Mtop.instance(context).getMtopConfig().mtopGlobalHeaders.remove("elderFont");
        } catch (Throwable th) {
            Log.e("TBElder", "error in recoverMTopGlobalConfig: " + th.getMessage());
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        String c = TBRevisionSwitchManager.i().c("elderHome");
        Log.e("TBElder", "elderHomeValue" + c);
        return "1".equals(c);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (!c.b(true)) {
            Log.e("TBElder", "orange ab-test switched off");
            return false;
        } else if (!b()) {
            return false;
        } else {
            String c = TBRevisionSwitchManager.i().c("evo_is_large_font");
            Log.e("TBElder", "largeFontValue" + c);
            return "1".equals(c);
        }
    }
}
