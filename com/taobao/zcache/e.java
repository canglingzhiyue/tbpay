package com.taobao.zcache;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static e f23647a;

    static {
        kge.a(-1700475705);
        f23647a = new e();
    }

    public JSONObject a(String str) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2f58b020", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str2 : str.split(",")) {
            VariationSet activate = UTABTest.activate("AB_", str2);
            if (activate != null && (variation = activate.getVariation("zcache_list")) != null) {
                String valueAsString = variation.getValueAsString("");
                if (!StringUtils.isEmpty(valueAsString)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(valueAsString);
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject.put(next, jSONObject2.get(next));
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }
}
