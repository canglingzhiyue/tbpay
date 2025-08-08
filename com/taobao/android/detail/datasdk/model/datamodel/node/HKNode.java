package com.taobao.android.detail.datasdk.model.datamodel.node;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

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
        kge.a(-384014670);
    }

    public HKNode(JSONObject jSONObject) {
        super(jSONObject);
        this.delivery = epw.a(jSONObject.getString(ShippingNode.TAG));
        this.fromName = epw.a(jSONObject.getString("fromName"));
        this.nationalIcon = epw.a(jSONObject.getString("nationalIcon"));
        this.serviceLogo = epw.a(jSONObject.getString("serviceLogo"));
        this.shopCertificateIcon = epw.a(jSONObject.getString("shopCertificateIcon"));
        this.shopIcon = epw.a(jSONObject.getString("shopIcon"));
        this.sizingChartUrl = epw.a(jSONObject.getString("sizeCartUrl"));
        this.faq = epw.a(jSONObject.getString("faq"));
        this.taxDescTittle = epw.a(jSONObject.getString("taxDescTittle"));
        this.tariff = initTariff();
        this.taxDesc = initTaxDesc();
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.HKNode");
    }

    private String initTariff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a966d25", new Object[]{this});
        }
        JSONObject jSONObject = this.data.getJSONObject("tariff");
        if (jSONObject == null) {
            return "";
        }
        String a2 = epw.a(jSONObject.getString("name"));
        String a3 = epw.a(jSONObject.getString("value"));
        return a2 + "    " + a3;
    }

    private List<Map<String, List<Pair<String, String>>>> initTaxDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3a54f1b4", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = this.data.getJSONArray("taxDesc");
        return (jSONArray == null || jSONArray.size() == 0) ? arrayList : epw.a(jSONArray, new epy<Map<String, List<Pair<String, String>>>>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.HKNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>>, java.lang.Object] */
            @Override // tb.epy
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
