package com.taobao.android.ucp.bridge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavix.j;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONArray f15708a;
    private static volatile JSONArray b;

    static {
        kge.a(146315094);
    }

    public static boolean a(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        JSONObject jSONObject3;
        boolean z2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d85c4ca", new Object[]{str, str2, str3, jSONObject, jSONObject2})).booleanValue();
        }
        if (!com.taobao.android.behavix.behavixswitch.a.a("enableTabbarControl", true)) {
            TLog.loge("UCP", "isTabbarLimitWithBizCode", "false");
            return true;
        }
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = f15708a;
        if (jSONArray3 == null || jSONArray3.isEmpty()) {
            TLog.loge("UCP", "isTabbarLimitWithBizCode", "use default");
            jSONArray3 = a();
            jSONArray2.add("useDefault");
            z = true;
        } else {
            z = false;
        }
        int i = 0;
        boolean z3 = false;
        while (true) {
            if (i >= jSONArray3.size()) {
                jSONObject3 = null;
                break;
            }
            jSONObject3 = jSONArray3.getJSONObject(i);
            if ("0".equals(NativeDelegate.getJavaVariable(NativeDelegate.StaticVariableName.TAO_SETTING_TAB2_BAR.ordinal()))) {
                jSONArray = jSONArray3;
                if ("tab2".equals(jSONObject3.getString("bizCode")) && "bottomBar".equals(jSONObject3.getString(com.taobao.android.weex_framework.util.a.ATOM_EXT_block))) {
                    jSONObject3.put("display", (Object) false);
                    jSONArray2.add("limitBySwitch");
                    z3 = true;
                }
            } else {
                jSONArray = jSONArray3;
            }
            if ("bottomBar".equals(jSONObject3.get(com.taobao.android.weex_framework.util.a.ATOM_EXT_block))) {
                String string = jSONObject3.getString("bizCode");
                String string2 = jSONObject3.getString("materialType");
                String string3 = jSONObject3.getString("materialSubType");
                if (TextUtils.equals(string, str) && TextUtils.equals(string2, str2) && TextUtils.equals(string3, str3)) {
                    break;
                }
            }
            i++;
            jSONArray3 = jSONArray;
        }
        if (jSONObject3 != null) {
            z2 = jSONObject3.getBooleanValue("display");
            if (jSONObject2 != null) {
                if (!z2) {
                    jSONObject2.put("reasons", (Object) jSONArray2);
                }
                JSONObject jSONObject4 = jSONObject3.getJSONObject("extra");
                if (jSONObject4 != null) {
                    jSONObject2.putAll(jSONObject4);
                }
                JSONObject jSONObject5 = jSONObject3.getJSONObject("trackInfo");
                if (jSONObject5 != null) {
                    jSONObject2.putAll(jSONObject5);
                }
            }
        } else {
            z2 = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", String.valueOf(z2));
        hashMap.put("limitBySwitch", String.valueOf(z3));
        hashMap.put("useDefaultPolicies", String.valueOf(z));
        hashMap.put("biz", str);
        hashMap.put("type", str2);
        hashMap.put("subtype", str3);
        UtUtils.a("UCP", (int) UtUtils.CHANGED_UPP_EVENT_ID, "checkTabbarDisplay", (String) null, (String) null, j.b(hashMap));
        TLog.loge("UCP", String.format("isTabbarLimitWithBizCode result:%s, biz:%s, type:%s, subtype:%s, limitBySwitch:%s, useDefaultPolicies:%s", Boolean.valueOf(z2), str, str2, str3, Boolean.valueOf(z3), Boolean.valueOf(z)));
        return z2;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            TLog.loge("UCP", "policiesStr is null");
        } else {
            f15708a = JSON.parseArray(str);
            TLog.loge("UCP", "update policiesStr" + str);
        }
    }

    private static JSONArray a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[0]);
        }
        if (b == null) {
            String a2 = com.taobao.android.behavix.behavixswitch.a.a("enableTabbarControl", "");
            if (TextUtils.isEmpty(a2)) {
                a2 = "[{\"bizCode\":\"homePage\",\"block\":\"bottomBar\",\"materialType\":\"alienEffect\",\"materialSubType\":\"rocket\",\"display\":true,\"trackInfo\":{\"bizType\":\"2\",\"bizCode\":\"homePage\",\"block\":\"bottomBar\",\"materialType\":\"alienEffect\",\"materialSubType\":\"rocket\"}},{\"bizCode\":\"message\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"num\",\"display\":true,\"trackInfo\":{\"bizType\":\"1\",\"bizCode\":\"message\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"num\"}},{\"bizCode\":\"message\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"text\",\"display\":true,\"trackInfo\":{\"bizType\":\"1\",\"bizCode\":\"message\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"text\"}},{\"bizCode\":\"cart\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"num\",\"display\":true,\"trackInfo\":{\"bizType\":\"1\",\"bizCode\":\"cart\",\"block\":\"bottomBar\",\"materialType\":\"commonMark\",\"materialSubType\":\"num\"}}]";
            }
            b = JSON.parseArray(a2);
        }
        return b;
    }
}
