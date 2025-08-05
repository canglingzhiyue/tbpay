package com.taobao.android.detail.ttdetail.skeleton.navbar.search.search;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f10937a = new ArrayList();
    public String b;
    public String c;
    public String d;

    static {
        kge.a(-976518749);
    }

    public static b a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2592d9a6", new Object[]{mtopResponse});
        }
        try {
            JSONObject jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
            if (jSONObject == null) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("searchInfo");
            JSONObject jSONObject3 = jSONObject.getJSONObject("searchInfoList");
            if (jSONObject3 != null) {
                b bVar = new b();
                bVar.b = jSONObject3.getString("url");
                bVar.c = jSONObject3.getString("utParams");
                bVar.d = jSONObject.getString(k.KEY_SUGGEST_RN);
                JSONArray jSONArray = jSONObject3.getJSONArray("searchtextList");
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        bVar.f10937a.add(jSONArray.getString(i));
                    }
                } else {
                    bVar.f10937a = null;
                }
                return bVar;
            } else if (jSONObject2 == null) {
                return null;
            } else {
                b bVar2 = new b();
                bVar2.b = jSONObject2.getString("url");
                bVar2.c = jSONObject2.getString("utParams");
                bVar2.d = jSONObject.getString(k.KEY_SUGGEST_RN);
                String string = jSONObject2.getString("searchtext");
                if (string != null) {
                    bVar2.f10937a.add(string);
                } else {
                    bVar2.f10937a = null;
                }
                return bVar2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
