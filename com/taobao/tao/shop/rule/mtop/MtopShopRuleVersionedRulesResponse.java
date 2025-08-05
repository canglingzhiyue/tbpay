package com.taobao.tao.shop.rule.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopShopRuleVersionedRulesResponse extends BaseOutDo {
    private MtopShopRuleVersionedRulesResponseData data;

    static {
        kge.a(-1399642008);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopShopRuleVersionedRulesResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopShopRuleVersionedRulesResponseData mtopShopRuleVersionedRulesResponseData) {
        this.data = mtopShopRuleVersionedRulesResponseData;
    }
}
