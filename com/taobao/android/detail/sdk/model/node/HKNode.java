package com.taobao.android.detail.sdk.model.node;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class HKNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String delivery;
    public String faq;
    public String fromName;
    public String nationalIcon;
    public String serviceLogo;
    public String shopCertificateIcon;
    public String shopIcon;
    public String sizingChartUrl;
    public String tariff;
    public List<Map<String, List<Pair<String, String>>>> taxDesc;
    public String taxDescTittle;

    static {
        kge.a(-1541293332);
    }

    public HKNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.HKNode");
        this.delivery = c.a(jSONObject.getString(com.taobao.android.detail.datasdk.model.datamodel.node.ShippingNode.TAG));
        this.fromName = c.a(jSONObject.getString("fromName"));
        this.nationalIcon = c.a(jSONObject.getString("nationalIcon"));
        this.serviceLogo = c.a(jSONObject.getString("serviceLogo"));
        this.shopCertificateIcon = c.a(jSONObject.getString("shopCertificateIcon"));
        this.shopIcon = c.a(jSONObject.getString("shopIcon"));
        this.sizingChartUrl = c.a(jSONObject.getString("sizeCartUrl"));
        this.faq = c.a(jSONObject.getString("faq"));
        this.taxDescTittle = c.a(jSONObject.getString("taxDescTittle"));
        this.tariff = initTariff();
        this.taxDesc = initTaxDesc();
    }

    private String initTariff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a966d25", new Object[]{this});
        }
        JSONObject jSONObject = this.root.getJSONObject("tariff");
        if (jSONObject == null) {
            return "";
        }
        String a2 = c.a(jSONObject.getString("name"));
        String a3 = c.a(jSONObject.getString("value"));
        return a2 + "    " + a3;
    }

    private List<Map<String, List<Pair<String, String>>>> initTaxDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3a54f1b4", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = this.root.getJSONArray("taxDesc");
        return (jSONArray == null || jSONArray.size() == 0) ? arrayList : c.a(jSONArray, new g<Map<String, List<Pair<String, String>>>>() { // from class: com.taobao.android.detail.sdk.model.node.HKNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>>, java.lang.Object] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ Map<String, List<Pair<String, String>>> b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public Map<String, List<Pair<String, String>>> a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("42d7dd79", new Object[]{this, obj});
                }
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = (JSONObject) obj;
                for (String str : jSONObject.keySet()) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : jSONObject2.keySet()) {
                        String string = jSONObject2.getString(str2);
                        if (!StringUtils.isEmpty(str2)) {
                            arrayList2.add(new Pair(str2, string));
                        }
                    }
                    hashMap.put(str, arrayList2);
                }
                return hashMap;
            }
        });
    }
}
