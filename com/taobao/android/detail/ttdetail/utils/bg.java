package com.taobao.android.detail.ttdetail.utils;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class bg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(124708926);
    }

    private static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        try {
            return JSONObject.parseObject(str).getJSONObject("param");
        } catch (Throwable th) {
            i.a("TeMaiUtils", "getMultiBottomBarData error ", th);
            return null;
        }
    }

    public static boolean a(com.taobao.android.detail.ttdetail.component.module.d dVar, String str) {
        JSONObject d;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ac32b41", new Object[]{dVar, str})).booleanValue();
        }
        if (dVar == null || (d = dVar.getComponentData().d()) == null || (a2 = a(str)) == null) {
            return false;
        }
        try {
            d.put("lowPriceInfo", (Object) a2.getJSONObject("fields").getJSONObject("lowPriceInfo"));
            d.put("_detailInfo", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.utils.TeMaiUtils$1
                {
                    put("pageToken", (Object) ("uniqueId" + SystemClock.currentThreadTimeMillis()));
                }
            });
            dVar.updateComponent();
            return true;
        } catch (Throwable th) {
            i.a("TeMaiUtils", "update99TmBottomBar error", th);
            return false;
        }
    }
}
