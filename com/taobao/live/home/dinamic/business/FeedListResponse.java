package com.taobao.live.home.dinamic.business;

import com.taobao.live.home.dinamic.model.FeedListData;
import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes7.dex */
public class FeedListResponse<responseData extends FeedListData> extends BaseOutDo {
    private responseData data;

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public responseData mo2429getData() {
        return this.data;
    }

    public void setData(responseData responsedata) {
        this.data = responsedata;
    }
}
