package com.taobao.android.icart.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.icart.utils.AddCartUtil;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;
import tb.aat;
import tb.kge;

/* loaded from: classes5.dex */
public class MainAddCartEventHandler extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<aat> f12770a;

    static {
        kge.a(-1670337615);
    }

    public MainAddCartEventHandler(aat aatVar) {
        this.f12770a = new WeakReference<>(aatVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Fragment u;
        JSONObject jSONObject;
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        aat aatVar = this.f12770a.get();
        if (aatVar == null || (u = aatVar.h().u()) == null || (jSONObject = (JSONObject) intent.getSerializableExtra("data")) == null || (dXRuntimeContext = (DXRuntimeContext) jSONObject.get("runtimeContext")) == null || dXRuntimeContext.v() == null || !u.isResumed()) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        a(jSONObject2);
        AddCartUtil.a(aatVar.h(), jSONObject2, AddCartUtil.FEED_FLOW_MODULE, true);
    }

    private static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("isAd");
            String string2 = jSONObject.getString("EURL");
            if (string2 == null || string == null) {
                return;
            }
            AlimamaAdvertising.instance().handleAdUrlForClickid(string2, "1".equals(jSONObject.getString("sku")));
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this, new IntentFilter("DXMainAddCart"));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this);
        }
    }
}
