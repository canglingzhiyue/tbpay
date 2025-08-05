package com.taobao.monitor.adapter;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.session.SessionManager;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.mms;
import tb.mqe;

/* loaded from: classes7.dex */
public class TBAPMAdapterLauncherPart2 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean init = false;

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (init) {
        } else {
            init = true;
            initLogin(application, hashMap);
            configOrange(hashMap);
            initBatteryCanary(application);
        }
    }

    private void configOrange(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2e6bbc", new Object[]{this, hashMap});
        } else if (!mms.h || !mqe.a(hashMap.get("needApmListenOrange"), true)) {
        } else {
            OrangeConfig.getInstance().getConfigs(com.taobao.monitor.adapter.init.a.ORANGE_NAMESPACE);
            OrangeConfig.getInstance().registerListener(new String[]{com.taobao.monitor.adapter.init.a.ORANGE_NAMESPACE}, new d() { // from class: com.taobao.monitor.adapter.TBAPMAdapterLauncherPart2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else {
                        com.taobao.monitor.adapter.init.a.a(OrangeConfig.getInstance().getConfigs(com.taobao.monitor.adapter.init.a.ORANGE_NAMESPACE));
                    }
                }
            }, true);
        }
    }

    private void initLogin(final Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8457452b", new Object[]{this, context, hashMap});
        } else if (!mms.b || !mqe.a(hashMap.get("needApmAutoWrapLoginInfo"), true)) {
        } else {
            com.taobao.monitor.common.c.a(new Runnable() { // from class: com.taobao.monitor.adapter.TBAPMAdapterLauncherPart2.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.monitor.procedure.d.n = SessionManager.getInstance(context).getNick();
                    com.taobao.monitor.procedure.d.m = SessionManager.getInstance(context).getUserId();
                }
            });
            LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.monitor.adapter.TBAPMAdapterLauncherPart2.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    } else if (intent == null || LoginAction.valueOf(intent.getAction()) == null) {
                    } else {
                        com.taobao.monitor.procedure.d.n = Login.getNick();
                        com.taobao.monitor.procedure.d.m = Login.getUserId();
                    }
                }
            });
        }
    }

    private static void initBatteryCanary(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5160a83", new Object[]{application});
        } else {
            com.taobao.monitor.impl.data.battery.a.a(application);
        }
    }
}
