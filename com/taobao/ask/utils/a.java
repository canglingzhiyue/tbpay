package com.taobao.ask.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, Object> f16395a;

    static {
        kge.a(1014416085);
        f16395a = new HashMap<>();
    }

    public static String a(String str, String str2, String str3, String str4) {
        String str5;
        String valueAsString;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4});
        }
        String str6 = str + "." + str2 + "." + str3;
        Object obj = f16395a.get(str6);
        String str7 = obj;
        if (obj == null) {
            VariationSet activate = UTABTest.activate(str, str2);
            if (activate != null) {
                JSONObject jSONObject = new JSONObject();
                Variation variation = activate.getVariation(str3);
                if (variation == null && activate.size() > 0) {
                    for (Variation variation2 : activate) {
                        if (variation2 != null) {
                            jSONObject.put(variation2.getName(), (Object) variation2.getValueAsString(""));
                        }
                    }
                    valueAsString = jSONObject.toJSONString();
                } else if (variation != null && !StringUtils.isEmpty(variation.getValueAsString(""))) {
                    valueAsString = variation.getValueAsString("");
                }
                str5 = valueAsString;
                f16395a.put(str6, str5);
                str7 = str5;
            }
            str5 = str4;
            f16395a.put(str6, str5);
            str7 = str5;
        }
        return d.a(str7, str4);
    }
}
