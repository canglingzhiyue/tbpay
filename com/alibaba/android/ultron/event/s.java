package com.alibaba.android.ultron.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.bga;
import tb.jpy;
import tb.kge;

/* loaded from: classes2.dex */
public class s extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-149339367);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        int i;
        String valueOf;
        String valueOf2;
        Map<String, String> i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        JSONObject fields = b().getFields();
        if (fields == null) {
            return;
        }
        try {
            i = fields.getInteger("eventId").intValue();
        } catch (Exception unused) {
            i = -1;
        }
        if (i < 0) {
            return;
        }
        String string = fields.getString("page");
        if (!TextUtils.isEmpty(string)) {
            String string2 = fields.getString("arg1");
            String string3 = fields.getString("arg2");
            String string4 = fields.getString("arg3");
            String str = "";
            String str2 = TextUtils.isEmpty(string3) ? str : string3;
            if (!TextUtils.isEmpty(string4)) {
                str = string4;
            }
            JSONObject jSONObject = fields.getJSONObject("args");
            com.alibaba.android.ultron.vfw.instance.b h = eVar.h();
            if (h != null && (i2 = h.i()) != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.putAll(i2);
                if (eVar.d() != null) {
                    jSONObject.put("componentId", (Object) eVar.d().getKey());
                }
                UnifyLog.c("UserTrackSubscriber", "utPrams:" + JSON.toJSONString(i2) + " args:" + jSONObject.toJSONString());
            }
            HashMap hashMap = new HashMap();
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null) {
                        if (this.g != null) {
                            valueOf2 = String.valueOf(jpy.a(this.g.getData(), value));
                        } else {
                            valueOf2 = String.valueOf(value);
                        }
                        hashMap.put(key, valueOf2);
                    }
                }
            }
            if (h != null) {
                try {
                    if (h.j() != null) {
                        h.j().a(string, i, string2, str2, str, hashMap);
                    }
                } catch (Throwable th) {
                    bga.a.a(this.f.h(), "UserTrackSubscriber.onHandleEvent", th);
                }
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, string2, str2, str, hashMap).build());
        }
        JSONObject jSONObject2 = fields.getJSONObject("nextPage");
        HashMap hashMap2 = new HashMap();
        if (jSONObject2 == null) {
            return;
        }
        for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
            String key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            if (!TextUtils.isEmpty(key2) && value2 != null) {
                if (this.g != null) {
                    valueOf = String.valueOf(jpy.a(this.g.getData(), value2));
                } else {
                    valueOf = String.valueOf(value2);
                }
                hashMap2.put(key2, valueOf);
            }
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap2);
        } catch (Throwable th2) {
            UnifyLog.d("UserTrackSubscriber", th2.getMessage());
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
        } catch (Throwable th3) {
            UnifyLog.d("UserTrackSubscriber", th3.getMessage());
        }
    }
}
