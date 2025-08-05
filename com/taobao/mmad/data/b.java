package com.taobao.mmad.data;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.kge;
import tb.stv;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_BANNER = "banner";
    public static final String TYPE_FEEDS = "feeds";
    public static final String TYPE_POPVIEW = "popView";
    public static final String TYPE_SEARCHTEXT = "searchText";

    static {
        kge.a(-1127275915);
    }

    public BaseMmAdModel a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseMmAdModel) ipChange.ipc$dispatch("84138f74", new Object[]{this, jSONObject});
        }
        try {
            return (BaseMmAdModel) JSON.parseObject(jSONObject.toJSONString(), BaseMmAdModel.class);
        } catch (Exception e) {
            stv.a("DataParser", "BaseMmAdModel parse error", e);
            return null;
        }
    }

    public String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        for (String str : Arrays.asList("feeds", "searchText", TYPE_BANNER, "popView")) {
            if (jSONObject.getJSONObject(str) != null) {
                return str;
            }
        }
        return null;
    }
}
