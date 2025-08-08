package com.taobao.search.mmd.datasource.bean;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.search.mmd.util.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.gbk;
import tb.kge;

/* loaded from: classes7.dex */
public class PromotionFilterBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MULTI = "multi";
    public static final String SINGLE = "single";
    public List<a> buttons = new ArrayList(2);
    public String type;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f19158a = false;
        public String b;
        public String c;
        public String d;
        public b e;
        public b f;
        public String g;

        static {
            kge.a(-225412520);
        }
    }

    /* loaded from: classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f19159a;
        public String b;
        public String c = "";
        public int d = 0;
        public int e = 0;
        public int f = 0;
        public int g = 0;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;

        static {
            kge.a(1618316297);
        }
    }

    static {
        kge.a(1346817943);
        kge.a(1028243835);
    }

    public static PromotionFilterBean parse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PromotionFilterBean) ipChange.ipc$dispatch("d734633e", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            return parsePromotionFilter(jSONObject.optJSONObject("newPromotion"));
        }
        return null;
    }

    public static PromotionFilterBean parsePromotionFilter(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PromotionFilterBean) ipChange.ipc$dispatch("986fcd09", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        PromotionFilterBean promotionFilterBean = new PromotionFilterBean();
        promotionFilterBean.type = jSONObject.optString("selectType");
        JSONArray optJSONArray = jSONObject.optJSONArray("filters");
        if (optJSONArray == null) {
            return promotionFilterBean;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                promotionFilterBean.buttons.add(parseButton(optJSONObject));
            }
        }
        return promotionFilterBean;
    }

    private static a parseButton(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a85a8f8f", new Object[]{jSONObject});
        }
        a aVar = new a();
        aVar.d = jSONObject.optString("trace");
        aVar.b = jSONObject.optString("paramKey");
        aVar.c = jSONObject.optString("paramValue");
        aVar.g = jSONObject.optString("actionType");
        aVar.e = parseStyle(jSONObject.optJSONObject("normal"));
        aVar.f = parseStyle(jSONObject.optJSONObject(gbk.TYPE_SELECTED));
        aVar.f19158a = StringUtils.equals(jSONObject.optString("status"), ThemisConfig.SCENE_SELECT);
        return aVar;
    }

    private static b parseStyle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e5b86e55", new Object[]{jSONObject});
        }
        b bVar = new b();
        if (jSONObject == null) {
            return bVar;
        }
        bVar.d = d.a(jSONObject.optString("backgroundColor"), 0);
        bVar.e = d.a(jSONObject.optString("borderColor"), 0);
        bVar.f = d.a(jSONObject.optString("textColor"), 0);
        bVar.g = d.a(jSONObject.optString("replaceColor"), 0);
        bVar.h = d.a(jSONObject.optString("startColor"), 0);
        bVar.i = d.a(jSONObject.optString("endColor"), 0);
        bVar.c = jSONObject.optString("img");
        bVar.j = jSONObject.optInt("imgWidth");
        bVar.k = jSONObject.optInt("imgHeight");
        bVar.f19159a = jSONObject.optString("title");
        bVar.b = jSONObject.optString("replaceText");
        return bVar;
    }
}
