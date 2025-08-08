package com.alibaba.android.ultron.trade.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.bmz;
import tb.jpy;
import tb.kge;

/* loaded from: classes2.dex */
public class r extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1026530734);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
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
        String string2 = fields.getString("arg1");
        String string3 = fields.getString("arg2");
        String string4 = fields.getString("arg3");
        String str = "";
        String str2 = StringUtils.isEmpty(string3) ? str : string3;
        if (!StringUtils.isEmpty(string4)) {
            str = string4;
        }
        JSONObject jSONObject = fields.getJSONObject("args");
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!StringUtils.isEmpty(key) && (value instanceof String)) {
                    hashMap.put(key, String.valueOf(jpy.a(this.h.getData(), value)));
                }
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, string2, str2, str, hashMap).build());
    }
}
