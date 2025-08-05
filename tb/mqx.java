package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Rate;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.data.meta.SkuBase;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.event.a;
import com.taobao.android.detail.ttdetail.utils.af;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.l;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.itemrates.entity.RateKeyword;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class mqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1224465613);
    }

    public static mqw a(a aVar, boolean z, long j, RuntimeAbilityParam... runtimeAbilityParamArr) {
        mqw a2;
        JSONObject d;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqw) ipChange.ipc$dispatch("f1681b10", new Object[]{aVar, new Boolean(z), new Long(j), runtimeAbilityParamArr});
        }
        Object[] a3 = af.a(runtimeAbilityParamArr);
        if (z) {
            String c = c(a3);
            if (!TextUtils.isEmpty(c) && aVar != null && aVar.b() != null) {
                aVar.b().put("feedId", (Object) c);
            }
        }
        Rate.Keywords a4 = a(a3);
        if (a4 != null) {
            a2 = mqw.a(a4, b(a3));
        } else {
            a2 = mqw.a(aVar.b());
        }
        if (aVar != null && (b = aVar.b()) != null) {
            mqw.a(a2, b);
        }
        d a5 = com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr);
        if (a5 != null && (d = a5.getComponentData().d()) != null) {
            String string = d.getString("pageTitle");
            boolean booleanValue = d.getBooleanValue("supportFavorableRate");
            a2.a(string);
            a2.a(booleanValue);
            a2.b(d);
        }
        a2.a(j);
        return a2;
    }

    private static Rate.Keywords a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rate.Keywords) ipChange.ipc$dispatch("3e75066", new Object[]{objArr});
        }
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(JSON.toJSONString(objArr[0]));
            if (parseObject == null) {
                return null;
            }
            return Rate.Keywords.a(parseObject);
        } catch (Exception e) {
            i.a("RateUtils", "getKeyWord() exception", e);
            return null;
        }
    }

    private static List<Rate.Keywords> b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("59ac289f", new Object[]{objArr});
        }
        if (objArr == null || objArr.length < 2 || !(objArr[1] instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) objArr[1];
        ArrayList arrayList = new ArrayList();
        try {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    arrayList.add(Rate.Keywords.a(jSONObject));
                }
            }
        } catch (Exception e) {
            i.a("RateUtils", "getMultiLevelKeywords() exception", e);
        }
        return arrayList;
    }

    private static String c(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ec43ff9", new Object[]{objArr});
        }
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(JSON.toJSONString(objArr[0]));
            if (parseObject == null) {
                return null;
            }
            return parseObject.getString("feedId");
        } catch (Exception e) {
            i.a("RateUtils", "getFeedId exception", e);
            return null;
        }
    }

    public static com.taobao.detail.rate.d a(eyx eyxVar, mqw mqwVar) {
        Vertical.a askAll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.detail.rate.d) ipChange.ipc$dispatch("d2ebeab4", new Object[]{eyxVar, mqwVar});
        }
        com.taobao.detail.rate.d dVar = new com.taobao.detail.rate.d();
        Item item = (Item) eyxVar.a().a(Item.class);
        Seller seller = (Seller) eyxVar.a().a(Seller.class);
        Rate rate = (Rate) eyxVar.a().a(Rate.class);
        RateInfo.a b = new RateInfo.a().a(com.taobao.android.detail.ttdetail.utils.d.b(item, "")).b(com.taobao.android.detail.ttdetail.utils.d.b(seller, ""));
        RateInfo.a e = b.e("" + com.taobao.android.detail.ttdetail.utils.d.b(seller));
        RateInfo.a g = e.d("" + com.taobao.android.detail.ttdetail.utils.d.a(item, 0L)).g(com.taobao.android.detail.ttdetail.utils.d.a(seller, ""));
        g.a(mqwVar.d());
        g.a(mqwVar.e());
        g.h(mqwVar.c());
        g.i(com.taobao.android.detail.ttdetail.utils.d.a(item, ""));
        g.c(com.taobao.android.detail.ttdetail.utils.d.a((SkuBase) eyxVar.a().a(SkuBase.class), new JSONObject()));
        g.d(a(item));
        g.e(a(mqwVar));
        Vertical vertical = (Vertical) eyxVar.a().a(Vertical.class);
        if (vertical != null && (askAll = vertical.getAskAll()) != null) {
            g.b(com.taobao.android.detail.ttdetail.utils.d.a(askAll));
        }
        List<Rate.Keywords> b2 = mqwVar.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = com.taobao.android.detail.ttdetail.utils.d.a(rate, new ArrayList());
        }
        if (j.ao() && mqwVar.o() && b2.isEmpty()) {
            b2 = mqwVar.n();
        }
        ArrayList arrayList = new ArrayList();
        for (Rate.Keywords keywords : b2) {
            String b3 = keywords.b();
            String c = keywords.c();
            String a2 = keywords.a();
            String f = keywords.f();
            String g2 = keywords.g();
            RateKeyword rateKeyword = new RateKeyword();
            if (TextUtils.isEmpty(b3)) {
                b3 = "";
            }
            rateKeyword.count = b3;
            if (TextUtils.isEmpty(c)) {
                c = "";
            }
            rateKeyword.attribute = c;
            if (TextUtils.isEmpty(a2)) {
                a2 = "";
            }
            rateKeyword.word = a2;
            rateKeyword.type = keywords.d().ordinal();
            rateKeyword.status = keywords.i();
            if (TextUtils.isEmpty(f)) {
                f = "";
            }
            rateKeyword.level = f;
            if (TextUtils.isEmpty(g2)) {
                g2 = "";
            }
            rateKeyword.attributeId = g2;
            rateKeyword.subImprList = keywords.e();
            String h = keywords.h();
            if (!TextUtils.isEmpty(h)) {
                rateKeyword.setRateType(Integer.parseInt(h));
            }
            arrayList.add(rateKeyword);
        }
        g.a(arrayList);
        Rate.Keywords a3 = mqwVar.a();
        if (a3 != null) {
            String c2 = a3.c();
            if (TextUtils.isEmpty(c2)) {
                c2 = "";
            }
            g.c(c2);
        }
        g.a(a(rate, mqwVar));
        g.j(mqwVar.l());
        String a4 = a3 == null ? null : a3.a();
        if (TextUtils.isEmpty(a4)) {
            a4 = "";
        }
        g.f(a4);
        if (mqwVar.o()) {
            g.f(mqwVar.k());
        }
        g.b(mqwVar.j());
        g.c(System.currentTimeMillis());
        dVar.a(g.b());
        return dVar;
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        return ((jSONObject == null || jSONObject.isEmpty()) ? false : jSONObject.getBooleanValue("enableRateFloat")) && j.Q();
    }

    private static JSONObject a(Item item) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1e6f35ae", new Object[]{item});
        }
        JSONObject jSONObject = new JSONObject();
        if (item != null) {
            String itemId = item.getItemId();
            String title = item.getTitle();
            String firstImageUrl = item.getFirstImageUrl();
            if (TextUtils.isEmpty(itemId)) {
                itemId = "";
            }
            jSONObject.put("itemId", (Object) itemId);
            if (TextUtils.isEmpty(title)) {
                title = "";
            }
            jSONObject.put("title", (Object) title);
            if (TextUtils.isEmpty(firstImageUrl)) {
                firstImageUrl = "";
            }
            jSONObject.put("image", (Object) firstImageUrl);
            jSONObject.put("exParams", (Object) item.getExParams());
        }
        return jSONObject;
    }

    public static boolean a(Context context, eyx eyxVar, mqw mqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fa2e04d", new Object[]{context, eyxVar, mqwVar})).booleanValue();
        }
        Bundle bundle = new Bundle();
        Uri a2 = a(eyxVar, bundle, mqwVar);
        if (a2 == null) {
            return false;
        }
        l.a(context, bundle, a2.toString());
        return true;
    }

    private static Uri a(eyx eyxVar, Bundle bundle, mqw mqwVar) {
        Vertical.a askAll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("9bfa63b4", new Object[]{eyxVar, bundle, mqwVar});
        }
        try {
            Seller seller = (Seller) eyxVar.a().a(Seller.class);
            Rate rate = (Rate) eyxVar.a().a(Rate.class);
            Uri.Builder path = new Uri.Builder().scheme("https").authority("h5.m.taobao.com").path("/ratedisplay/vivid_ratelist.htm");
            path.appendQueryParameter("itemId", com.taobao.android.detail.ttdetail.utils.d.b((Item) eyxVar.a().a(Item.class), ""));
            path.appendQueryParameter("shopId", com.taobao.android.detail.ttdetail.utils.d.b(seller, ""));
            path.appendQueryParameter("sellerId", com.taobao.android.detail.ttdetail.utils.d.a(seller, ""));
            path.appendQueryParameter("feedId", String.valueOf(mqwVar.d()));
            path.appendQueryParameter("invokeSource", String.valueOf(mqwVar.e()));
            path.appendQueryParameter("skuvids", mqwVar.c());
            path.appendQueryParameter("exParams", a(mqwVar).toString());
            try {
                path.appendQueryParameter("skuInfo", com.taobao.android.detail.ttdetail.utils.d.a((SkuBase) eyxVar.a().a(SkuBase.class), new JSONObject()).toJSONString());
            } catch (Exception unused) {
            }
            Vertical vertical = (Vertical) eyxVar.a().a(Vertical.class);
            if (vertical != null && (askAll = vertical.getAskAll()) != null) {
                path.appendQueryParameter("askInfo", com.taobao.android.detail.ttdetail.utils.d.a(askAll).toJSONString());
            }
            List<Rate.Keywords> b = mqwVar.b();
            if (b == null || b.isEmpty()) {
                b = com.taobao.android.detail.ttdetail.utils.d.a(rate, new ArrayList());
            }
            JSONArray jSONArray = new JSONArray();
            for (Rate.Keywords keywords : b) {
                RateKeyword rateKeyword = new RateKeyword();
                rateKeyword.count = keywords.b();
                rateKeyword.attribute = keywords.c();
                rateKeyword.word = keywords.a();
                rateKeyword.type = keywords.d().ordinal();
                rateKeyword.status = keywords.i();
                rateKeyword.level = keywords.f();
                rateKeyword.attributeId = keywords.g();
                rateKeyword.subImprList = keywords.e();
                String h = keywords.h();
                if (!TextUtils.isEmpty(h)) {
                    rateKeyword.setRateType(Integer.parseInt(h));
                }
                jSONArray.add(rateKeyword);
            }
            bundle.putSerializable("rateKeywordList", jSONArray);
            Rate.Keywords a2 = mqwVar.a();
            if (a2 != null) {
                String c = a2.c();
                if (TextUtils.isEmpty(c)) {
                    c = "";
                }
                path.appendQueryParameter("expression", c);
            }
            path.appendQueryParameter("rateExtParams", a(rate, mqwVar).toJSONString());
            String a3 = a2 == null ? null : a2.a();
            if (TextUtils.isEmpty(a3)) {
                a3 = "";
            }
            path.appendQueryParameter("selectTag", a3);
            return path.build();
        } catch (Exception unused2) {
            i.a("RateUtils", "getRateFeedsUri Exception");
            return null;
        }
    }

    private static JSONObject a(mqw mqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e4779c5", new Object[]{mqwVar});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject g = mqwVar.g();
        if (g != null) {
            jSONObject.putAll(g);
        }
        jSONObject.put("jutrack_Ab", (Object) "true");
        jSONObject.put("multi_tab_count", (Object) Integer.valueOf(mqwVar.m()));
        return jSONObject;
    }

    private static JSONObject a(Rate rate, mqw mqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f15a1fe", new Object[]{rate, mqwVar});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject a2 = com.taobao.android.detail.ttdetail.utils.d.a(rate);
        if (a2 != null) {
            jSONObject.putAll(a2);
        }
        JSONObject f = mqwVar.f();
        if (f != null) {
            jSONObject.putAll(f);
        }
        return jSONObject;
    }
}
