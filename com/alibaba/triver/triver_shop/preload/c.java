package com.alibaba.triver.triver_shop.preload;

import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public interface a {
    }

    static {
        kge.a(-1695419252);
    }

    public static void a(com.alibaba.triver.triver_shop.newShop.data.d dVar, JSONObject jSONObject, Map<String, String> map, Bundle bundle, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9797e31", new Object[]{dVar, jSONObject, map, bundle, aVar, new Boolean(z)});
        } else if (bundle == null || jSONObject == null) {
        } else {
            try {
                Uri.parse(dVar.I().getJSONArray(0).getJSONObject(0).getJSONObject("payload").getJSONObject("source").getString("url")).getQueryParameter("pageId");
            } catch (Exception e) {
                try {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
