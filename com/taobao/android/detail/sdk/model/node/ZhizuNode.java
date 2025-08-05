package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.SkuCoreNode;
import com.taobao.android.detail.sdk.utils.c;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ZhizuNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean manShoes;
    public ZhiZuData zhizuData;

    /* loaded from: classes4.dex */
    public static class ZhiZuData extends DetailNode {
        public String buttonIcon;
        public String buttonText;
        public String recommendSize;
        public String recommendTip;

        static {
            kge.a(-72911059);
        }

        public ZhiZuData(JSONObject jSONObject) {
            super(jSONObject);
            this.buttonIcon = c.a(jSONObject.getString("buttonIcon"));
            this.buttonText = c.a(jSONObject.getString("buttonText"));
            this.recommendTip = c.a(jSONObject.getString("recommendTip"));
            this.recommendSize = c.a(jSONObject.getString("recommendSize"));
        }
    }

    static {
        kge.a(175998929);
    }

    public ZhizuNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.ZhizuNode");
        this.manShoes = jSONObject.getBooleanValue("manShoes");
        this.zhizuData = new ZhiZuData(jSONObject.getJSONObject("skuRecommendEntrace"));
    }

    public void copy2SkuItem(SkuCoreNode.SkuItem skuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6f4746", new Object[]{this, skuItem});
            return;
        }
        skuItem.recommendSize = this.zhizuData.recommendSize;
        skuItem.recommendTip = this.zhizuData.recommendTip;
        skuItem.buttonText = this.zhizuData.buttonText;
        skuItem.buttonIcon = this.zhizuData.buttonIcon;
    }
}
