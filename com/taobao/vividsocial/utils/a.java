package com.taobao.vividsocial.utils;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1786737147);
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
        } else if (!StringUtils.isEmpty(str)) {
            Intent intent = new Intent(str);
            if (jSONObject != null) {
                for (String str2 : jSONObject.keySet()) {
                    intent.putExtra(str2, jSONObject.getString(str2));
                }
            }
            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
        }
    }
}
