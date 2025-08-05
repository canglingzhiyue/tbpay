package com.taobao.wetao.home.tnode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes9.dex */
public class GuangGuangBroadcastModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap<String, NormalBroadcastReceiver> receivers = new HashMap<>();

    /* loaded from: classes9.dex */
    public class NormalBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ArrayList<JSCallback> b = new ArrayList<>();

        public NormalBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                Bundle extras = intent.getExtras();
                JSONObject jSONObject = null;
                if (extras != null) {
                    Set<String> keySet = extras.keySet();
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str : keySet) {
                        Object obj = extras.get(str);
                        jSONObject2.put(str, (Object) (obj == null ? null : obj.toString()));
                    }
                    jSONObject = jSONObject2;
                }
                Iterator<JSCallback> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().invokeAndKeepAlive(jSONObject);
                }
            }
        }

        public void a(JSCallback jSCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de4bab20", new Object[]{this, jSCallback});
            } else {
                this.b.add(jSCallback);
            }
        }
    }

    @JSMethod(alias = "registerBroadcast")
    public void registerBroadcast(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414520b9", new Object[]{this, str, jSCallback});
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.mWXSDKInstance.O());
        NormalBroadcastReceiver normalBroadcastReceiver = this.receivers.get(str);
        if (normalBroadcastReceiver == null) {
            normalBroadcastReceiver = new NormalBroadcastReceiver();
            this.receivers.put(str, normalBroadcastReceiver);
            localBroadcastManager.registerReceiver(normalBroadcastReceiver, new IntentFilter(str));
        }
        normalBroadcastReceiver.a(jSCallback);
    }

    @JSMethod(alias = "unregisterBroadcast")
    public void unRegisterBroadcast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f893a096", new Object[]{this, str});
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.mWXSDKInstance.O());
        NormalBroadcastReceiver remove = this.receivers.remove(str);
        if (remove == null) {
            return;
        }
        localBroadcastManager.unregisterReceiver(remove);
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        Collection<NormalBroadcastReceiver> values = this.receivers.values();
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.mWXSDKInstance.O());
        if (values != null) {
            for (NormalBroadcastReceiver normalBroadcastReceiver : values) {
                localBroadcastManager.unregisterReceiver(normalBroadcastReceiver);
            }
        }
        this.receivers.clear();
    }
}
