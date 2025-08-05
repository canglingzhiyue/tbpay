package com.taobao.android.behavix.feature;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;
import com.taobao.statistic.TBS;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import tb.kge;

/* loaded from: classes.dex */
public class IPVBaseFeature extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1369641528);
    }

    public static /* synthetic */ Object ipc$super(IPVBaseFeature iPVBaseFeature, String str, Object... objArr) {
        if (str.hashCode() == 1865601132) {
            return new Boolean(super.a((JSONObject) objArr[0], (JSONObject) objArr[1]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.behavix.feature.a
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.android.behavix.feature.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "IPV";
    }

    public IPVBaseFeature(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject == null) {
        }
    }

    @Override // com.taobao.android.behavix.feature.a
    public boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject2 == null || jSONObject2.size() == 0) {
            return false;
        }
        if (super.a(jSONObject, jSONObject2)) {
            TBS.Ext.commitEvent("BehaviX", UtUtils.CHANGED_UPP_EVENT_ID, "ipv_broadcast", null, null, "ipvFeatures=" + jSONObject2.toJSONString());
        }
        b bVar = new b();
        bVar.b = jSONObject2.getLongValue("createTime");
        bVar.f9184a = "IPV";
        bVar.c = jSONObject2.getString("fromScene");
        bVar.d = jSONObject2;
        c.a().a(bVar);
        return true;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            LocalBroadcastManager.getInstance(com.taobao.android.behavix.d.b()).registerReceiver(new IPVGenReceiver(), new IntentFilter("BehaviX_ipv_gen"));
        }
    }

    /* loaded from: classes.dex */
    public static class IPVGenReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-240188372);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            JSONObject jSONObject = (JSONObject) intent.getSerializableExtra("feature");
            JSONObject jSONObject2 = (JSONObject) intent.getSerializableExtra("event");
            if (jSONObject == null || jSONObject2 == null) {
                return;
            }
            if (jSONObject.get(e.BIZ_ARGS) instanceof JSONObject) {
                jSONObject.put(e.BIZ_ARGS, (Object) ((JSONObject) jSONObject.get(e.BIZ_ARGS)).toJSONString());
            }
            if (jSONObject2.get("destroy") instanceof Boolean) {
                jSONObject2.put("destroy", (Object) Integer.valueOf(jSONObject2.getBooleanValue("destroy") ? 1 : 0));
            }
            new IPVBaseFeature(null).a(jSONObject2, jSONObject);
            BHXCXXInnerBridge.transferFeatureToBUFS(jSONObject, "ipv");
        }
    }
}
