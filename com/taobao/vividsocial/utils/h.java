package com.taobao.vividsocial.utils;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f23467a;
    public static String b;

    static {
        kge.a(265695613);
        f23467a = new HashMap();
        b = "";
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            f23467a.put(str, str2);
        }
    }

    public static void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e6e23", new Object[]{str, str2, strArr});
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (strArr != null && strArr.length > 1) {
                for (int i = 0; i < strArr.length - 1; i += 2) {
                    arrayList.add(strArr[i] + "=" + strArr[i + 1]);
                }
            }
            for (Map.Entry<String, String> entry : f23467a.entrySet()) {
                arrayList.add(entry.getKey() + "=" + entry.getValue());
            }
            TBS.Ext.commitEvent(str, 19999, str2, null, null, (String[]) arrayList.toArray(new String[arrayList.size()]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{str, obj});
        }
        String[] split = str.split("\\.");
        if (split.length != 3 && split.length != 2) {
            return obj;
        }
        String str2 = split[0];
        String str3 = split[1];
        String str4 = split.length == 3 ? split[2] : "";
        VariationSet activate = UTABTest.activate(str2, str3);
        if (activate != null) {
            String valueOf = String.valueOf(activate.getExperimentBucketId());
            if (!b.contains(valueOf)) {
                StringBuilder sb = new StringBuilder();
                sb.append(b);
                sb.append(StringUtils.isEmpty(b) ? "" : ",");
                sb.append(valueOf);
                b = sb.toString();
            }
            JSONObject jSONObject = new JSONObject();
            Variation variation = activate.getVariation(str4);
            if (variation == null && activate.size() > 0) {
                for (Variation variation2 : activate) {
                    if (variation2 != null) {
                        jSONObject.put(variation2.getName(), (Object) variation2.getValueAsString(""));
                    }
                }
                return jSONObject;
            } else if (variation != null && !StringUtils.isEmpty(variation.getValueAsString(""))) {
                return variation.getValueAsString("");
            }
        }
        return obj;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        b = "";
        f23467a.clear();
    }

    public static String a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{intent}) : (intent == null || intent.getData() == null) ? "" : intent.getData().toString();
    }
}
