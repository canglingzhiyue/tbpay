package com.taobao.android.interactive_common.model;

import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes5.dex */
public class BeehiveDetailResponse extends BaseOutDo {
    private Map data;

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public Map mo2429getData() {
        return this.data;
    }

    public void setData(Map map) {
        this.data = map;
    }
}
