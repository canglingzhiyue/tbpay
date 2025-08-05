package com.taobao.android.livehome.plugin.atype.flexalocal.business.search;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class TaoLiveHotWordResponse extends BaseOutDo {
    private TaoLiveHotwordResponseData data;

    static {
        kge.a(837877135);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public TaoLiveHotwordResponseData mo2429getData() {
        return this.data;
    }

    public void setData(TaoLiveHotwordResponseData taoLiveHotwordResponseData) {
        this.data = taoLiveHotwordResponseData;
    }
}
