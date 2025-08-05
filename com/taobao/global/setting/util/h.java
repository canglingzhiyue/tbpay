package com.taobao.global.setting.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG1_CHANGE_LIFE_CICLE_SETTING_STATE = "changeOneClicleSettingStateForSetting";
    public static final String ARG1_CHANGE_SETTING_STATE = "changeSettingState";
    public static final String ARG1_GET_CONSUME_FATIGUE = "consumeFatigue";
    public static final String ARG1_GET_HIT_AB = "isHitABTestForSetting";
    public static final String ARG1_GET_LIFE_CICLE_SETTING_STATE = "getLifeCicleSettingCurrentStateForSetting";
    public static final String ARG1_GET_SETTING_STATE = "getSettingCurrentStateForSetting";
    public static final String ARG1_NEED_SHOW_GUIDE = "needShowGuideForType";
    public static final String PAGE_NAME = "Page_MYTBSettingVC_generic";

    public static <T> String a(String str, String str2, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5e4d948", new Object[]{str, str2, t});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) str);
        jSONObject.put("key", (Object) str2);
        jSONObject.put("value", (Object) t.toString());
        return a(jSONObject);
    }

    public static String a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f592e79", new Object[]{str, str2, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) str);
        jSONObject.put("type", (Object) str2);
        jSONObject.put("resultFatigue", (Object) String.valueOf(i));
        return a(jSONObject);
    }

    public static String a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91186ac8", new Object[]{str, str2, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) str);
        jSONObject.put("type", (Object) str2);
        jSONObject.put("autoConsumeFatigue", (Object) String.valueOf(z));
        return a(jSONObject);
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(600);
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (!TextUtils.isEmpty(string)) {
                sb.append(str);
                sb.append("=");
                sb.append(string);
                sb.append(",");
            }
        }
        if (sb.length() <= 0) {
            return "";
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
