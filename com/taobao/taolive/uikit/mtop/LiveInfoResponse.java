package com.taobao.taolive.uikit.mtop;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveInfoResponse extends BaseOutDo {
    private VideoInfo data;

    static {
        kge.a(341189377);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public VideoInfo mo2429getData() {
        return this.data;
    }

    public void setData(VideoInfo videoInfo) {
        this.data = videoInfo;
    }
}
