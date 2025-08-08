package com.taobao.android.behavix.feature;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.taolive.room.utils.aw;
import tb.dro;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE_CONTENT = "featureContent";
    public static final String FEATURE_JSON = "featureJSON";
    public static final String FEATURE_NAME = "featureName";
    public static final String TRIGGER_CONTENT = "triggerContent";
    public static final String TYPE = "bx_feature";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f9183a;

    /* renamed from: com.taobao.android.behavix.feature.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0355a {
        void a(JSONObject jSONObject);
    }

    static {
        kge.a(2040969619);
    }

    public abstract JSONObject a(JSONObject jSONObject);

    public abstract String a();

    public a(JSONObject jSONObject) {
        this.f9183a = jSONObject;
    }

    public boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        String a2 = a();
        if (StringUtils.isEmpty(a2)) {
            LogUtils.a(LogUtils.BX_BIZ_NAME, "broadcastFeature", "featureName is null");
            return false;
        } else if (jSONObject == null) {
            LogUtils.a(LogUtils.BX_BIZ_NAME, "broadcastFeature", "trigger is null");
            return false;
        } else if (jSONObject2 == null || jSONObject2.size() == 0) {
            LogUtils.a(LogUtils.BX_BIZ_NAME, "broadcastFeature", "feature is empty");
            return false;
        } else {
            Intent intent = new Intent("BehaviX_Feature_" + a2);
            Bundle bundle = new Bundle();
            bundle.putString("scene", jSONObject.getString("scene"));
            bundle.putString("actionType", jSONObject.getString("actionType"));
            bundle.putString("actionName", jSONObject.getString("actionName"));
            bundle.putInt(aw.PARAM_IS_FIRST_ENTER, jSONObject.getIntValue(aw.PARAM_IS_FIRST_ENTER));
            bundle.putInt("destroy", jSONObject.getIntValue("destroy"));
            bundle.putString("fromScene", jSONObject.getString("fromScene"));
            bundle.putString("toScene", jSONObject.getString("toScene"));
            bundle.putLong("actionDuration", jSONObject.getLongValue("actionDuration"));
            bundle.putString("bizArgKVS", jSONObject.getString("bizArgKVS"));
            bundle.putLong("createTime", jSONObject.getLongValue("createTime"));
            bundle.putString("isCloseEdge", dro.a(com.taobao.android.behavix.behavixswitch.a.a("closeAllEdge", 0.05d), false) ? "1" : "0");
            intent.putExtra(TRIGGER_CONTENT, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putString(FEATURE_JSON, jSONObject2.toJSONString());
            intent.putExtra(FEATURE_CONTENT, bundle2);
            intent.setPackage(com.taobao.android.behavix.d.b().getPackageName());
            com.taobao.android.behavix.d.b().sendBroadcast(intent);
            return true;
        }
    }

    public boolean a(JSONObject jSONObject, InterfaceC0355a interfaceC0355a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("623cd60f", new Object[]{this, jSONObject, interfaceC0355a})).booleanValue();
        }
        JSONObject a2 = a(jSONObject);
        if (a2 == null || a2.size() == 0) {
            return false;
        }
        a(jSONObject, a2);
        b(b(jSONObject, a2), interfaceC0355a);
        return true;
    }

    public void b(JSONObject jSONObject, InterfaceC0355a interfaceC0355a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3e27aa", new Object[]{this, jSONObject, interfaceC0355a});
        } else if (interfaceC0355a == null) {
        } else {
            interfaceC0355a.a(jSONObject);
        }
    }

    public JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb3c4ac9", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject2 == null || jSONObject == null) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(FEATURE_CONTENT, (Object) jSONObject2);
        jSONObject3.put(TRIGGER_CONTENT, (Object) jSONObject);
        jSONObject3.put(FEATURE_NAME, (Object) a());
        return jSONObject3;
    }
}
