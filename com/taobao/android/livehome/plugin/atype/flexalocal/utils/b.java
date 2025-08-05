package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.common.GoodItem;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1563462896);
    }

    public static void a(Context context, String str, String str2, String str3, JSONObject jSONObject, boolean z, GoodItem goodItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e3f83f", new Object[]{context, str, str2, str3, jSONObject, new Boolean(z), goodItem});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("timePointPlayUrl", str2);
        if (jSONObject != null) {
            bundle.putString("mediaInfo", jSONObject.toJSONString());
        }
        bundle.putString("coverImage", str3);
        bundle.putBoolean("landScapeVideo", z);
        bundle.putLong("clickCardTime", System.currentTimeMillis());
        if (goodItem != null) {
            bundle.putString("bubbleGoodInfoJson", a(goodItem));
        }
        Nav.from(context).withExtras(bundle).toUri(str);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            Nav.from(context).toUri(i.a(context) ? i.g() : "http://h5.m.taobao.com/taolive/search.html");
        }
    }

    private static String a(GoodItem goodItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8616d1bb", new Object[]{goodItem}) : JSON.toJSONString(goodItem);
    }
}
