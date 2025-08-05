package com.taobao.taopai.material.request.musiclovelist;

import com.taobao.taopai.material.bean.MusicListBean;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicLoveListResponse extends BaseOutDo {
    private MusicListBean data;

    static {
        kge.a(-172133990);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MusicListBean mo2429getData() {
        return this.data;
    }

    public void setData(MusicListBean musicListBean) {
        this.data = musicListBean;
    }
}
