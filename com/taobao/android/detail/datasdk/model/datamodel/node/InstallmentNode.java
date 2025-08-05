package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;
import tb.emu;
import tb.epw;
import tb.epy;
import tb.kge;

/* loaded from: classes4.dex */
public class InstallmentNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String descUrl;
    public boolean enable;
    public ArrayList<a> period;
    public Map<String, String> skuId2Installment;
    public String subTitle;
    public String title;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9967a;
        public double b;
        public String c;
        public long d;

        static {
            kge.a(1747545093);
        }

        public a(JSONObject jSONObject) {
            jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
            this.f9967a = jSONObject.getIntValue("count");
            this.b = jSONObject.getDoubleValue("ratio");
            this.c = jSONObject.getString("coupon");
            this.d = jSONObject.getLongValue("couponPrice");
        }
    }

    static {
        kge.a(-415083378);
    }

    public InstallmentNode(JSONObject jSONObject) {
        super(jSONObject);
        this.enable = jSONObject.getBooleanValue("enable");
        this.title = epw.a(jSONObject.getString("title"));
        this.subTitle = epw.a(jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE));
        this.descUrl = epw.a(jSONObject.getString("descUrl"));
        this.period = initPeriodInfo();
        this.skuId2Installment = initSkuId2Installment(jSONObject);
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.InstallmentNode");
    }

    private Map<String, String> initSkuId2Installment(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8434df8f", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sku2Installment");
        if (jSONObject2 == null) {
            return null;
        }
        return epw.a(jSONObject2, new epy<String>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.InstallmentNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // tb.epy
            public /* synthetic */ String b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public String a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8a5b32dc", new Object[]{this, obj}) : (String) obj;
            }
        });
    }

    private ArrayList<a> initPeriodInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("faf18520", new Object[]{this}) : epw.a(this.data.getJSONArray("period"), new epy<a>() { // from class: com.taobao.android.detail.datasdk.model.datamodel.node.InstallmentNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [com.taobao.android.detail.datasdk.model.datamodel.node.InstallmentNode$a, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("ea85ead6", new Object[]{this, obj}) : new a((JSONObject) obj);
            }
        });
    }
}
