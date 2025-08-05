package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class InfoFlowDeleteResultOutDo extends BaseOutDo {
    private InfoFlowDeleteResult data;

    static {
        kge.a(1838516626);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public InfoFlowDeleteResult mo2429getData() {
        return this.data;
    }

    public void setData(InfoFlowDeleteResult infoFlowDeleteResult) {
        this.data = infoFlowDeleteResult;
    }
}
