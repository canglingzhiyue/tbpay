package com.taobao.taolive.uikit.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveInfoResponsev2 extends BaseOutDo {
    private VideoInfo data;
    private TBLiveCardTemplate template;

    static {
        kge.a(1465480509);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public VideoInfo mo2429getData() {
        return this.data;
    }

    public void setData(VideoInfo videoInfo) {
        this.data = videoInfo;
    }

    public TBLiveCardTemplate getTemplate() {
        return this.template;
    }

    public void setTemplate(TBLiveCardTemplate tBLiveCardTemplate) {
        this.template = this.template;
    }
}
