package com.taobao.taolive.sdk.utils;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1394315970);
    }

    public static HashMap<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject.keySet().size() > 0) {
                    for (String str2 : parseObject.keySet()) {
                        String valueOf = String.valueOf(str2);
                        hashMap.put(valueOf, String.valueOf(parseObject.get(valueOf)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public static JSONObject a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4801345", new Object[]{intent});
        }
        JSONObject jSONObject = new JSONObject();
        if (intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            for (String str : extras.keySet()) {
                jSONObject.put(str, extras.get(str));
            }
        }
        return jSONObject;
    }
}
