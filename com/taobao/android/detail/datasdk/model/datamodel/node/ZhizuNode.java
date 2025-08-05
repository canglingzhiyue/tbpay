package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import tb.emu;
import tb.epw;
import tb.kge;

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
            kge.a(-198927065);
        }

        public ZhiZuData(JSONObject jSONObject) {
            super(jSONObject);
            this.buttonIcon = epw.a(jSONObject.getString("buttonIcon"));
            this.buttonText = epw.a(jSONObject.getString("buttonText"));
            this.recommendTip = epw.a(jSONObject.getString("recommendTip"));
            this.recommendSize = epw.a(jSONObject.getString("recommendSize"));
        }
    }

    static {
        kge.a(962133579);
    }

    public ZhizuNode(JSONObject jSONObject) {
        super(jSONObject);
        this.manShoes = jSONObject.getBooleanValue("manShoes");
        this.zhizuData = new ZhiZuData(jSONObject.getJSONObject("skuRecommendEntrace"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.ZhizuNode");
    }

    public void copy2SkuItem(SkuCoreNode.SkuItem skuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09894c", new Object[]{this, skuItem});
            return;
        }
        skuItem.recommendSize = this.zhizuData.recommendSize;
        skuItem.recommendTip = this.zhizuData.recommendTip;
        skuItem.buttonText = this.zhizuData.buttonText;
        skuItem.buttonIcon = this.zhizuData.buttonIcon;
    }
}
