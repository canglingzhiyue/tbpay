package com.taobao.taopai.material.request.musicetype;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicTypeListResponse extends BaseOutDo {
    private MusicTypeListResponseData data;

    static {
        kge.a(1180842443);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MusicTypeListResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MusicTypeListResponseData musicTypeListResponseData) {
        this.data = musicTypeListResponseData;
    }
}
