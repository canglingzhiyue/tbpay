package com.taobao.homepage.pop.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i)})).booleanValue() : i == 2 || i == 0 || i == 1;
    }

    public static boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{new Integer(i)})).booleanValue() : i == 0;
    }

    public static boolean d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{new Integer(i)})).booleanValue() : i == 2 || i == 3;
    }

    public static JSONObject a(int i, String str, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9cdba9db", new Object[]{new Integer(i), str, iPopData});
        }
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put(PopConst.POP_UPLOAD_DATA_KEY, (Object) iPopData.getUploadData());
        jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) Integer.valueOf(i));
        jSONObject.put("messageId", (Object) str);
        JSONObject clientParams = iPopData.getClientParams();
        if (clientParams.containsKey(PopConst.POP_KEY_TAG_IDS)) {
            jSONObject.put(PopConst.POP_KEY_TAG_IDS, clientParams.remove(PopConst.POP_KEY_TAG_IDS));
        }
        jSONObject.put(PopConst.POP_CLIENT_PARAMS_KEY, (Object) clientParams);
        return jSONObject;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : "other".equals(str) || "removePop".equals(str) || "endTime".equals(str) || "confirm".equals(str) || "cancel".equals(str);
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == 3 || b(i);
    }
}
