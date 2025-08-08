package com.huawei.hms.framework.network.grs.g;

import mtopsdk.common.util.StringUtils;
import com.taobao.android.detail.datasdk.model.datamodel.node.ServiceNode;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class i {
    public static String a(String str, String str2) {
        return !str.equals(str2) ? b(str, str2) : str;
    }

    private static String b(String str, String str2) {
        HashSet<String> hashSet = new HashSet();
        if (!StringUtils.isEmpty(str)) {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(ServiceNode.TAG);
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.getString(i));
            }
        }
        if (!StringUtils.isEmpty(str2)) {
            JSONArray jSONArray2 = new JSONObject(str2).getJSONArray(ServiceNode.TAG);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                hashSet.add(jSONArray2.getString(i2));
            }
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        for (String str3 : hashSet) {
            jSONArray3.put(str3);
        }
        jSONObject.put(ServiceNode.TAG, jSONArray3);
        return jSONObject.toString();
    }
}
