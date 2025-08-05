package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.c;
import com.taobao.android.detail.sdk.utils.g;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class InstallmentNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String descUrl;
    public boolean enable;
    public ArrayList<PeriodInfo> period;
    public Map<String, String> skuId2Installment;
    public String subTitle;
    public String title;

    /* loaded from: classes4.dex */
    public static class PeriodInfo {
        public int count;
        public String coupon;
        public long couponPrice;
        public double ratio;

        static {
            kge.a(2045009727);
        }

        public PeriodInfo(JSONObject jSONObject) {
            jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
            this.count = jSONObject.getIntValue("count");
            this.ratio = jSONObject.getDoubleValue("ratio");
            this.coupon = jSONObject.getString("coupon");
            this.couponPrice = jSONObject.getLongValue("couponPrice");
        }
    }

    static {
        kge.a(866066836);
    }

    public InstallmentNode(JSONObject jSONObject) {
        super(jSONObject);
        this.enable = jSONObject.getBooleanValue("enable");
        this.title = c.a(jSONObject.getString("title"));
        this.subTitle = c.a(jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE));
        this.descUrl = c.a(jSONObject.getString("descUrl"));
        this.period = initPeriodInfo();
        this.skuId2Installment = initSkuId2Installment(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.InstallmentNode");
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
        return c.a(jSONObject2, new g<String>() { // from class: com.taobao.android.detail.sdk.model.node.InstallmentNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
            @Override // com.taobao.android.detail.sdk.utils.g
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

    private ArrayList<PeriodInfo> initPeriodInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("faf18520", new Object[]{this}) : c.a(this.root.getJSONArray("period"), new g<PeriodInfo>() { // from class: com.taobao.android.detail.sdk.model.node.InstallmentNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.sdk.model.node.InstallmentNode$PeriodInfo] */
            @Override // com.taobao.android.detail.sdk.utils.g
            public /* synthetic */ PeriodInfo b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public PeriodInfo a(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (PeriodInfo) ipChange2.ipc$dispatch("8ede1e16", new Object[]{this, obj}) : new PeriodInfo((JSONObject) obj);
            }
        });
    }
}
