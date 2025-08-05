package com.taobao.live.home.dinamic.event;

import com.alibaba.fastjson.JSONObject;
import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes7.dex */
public class NormalResponse extends BaseOutDo {
    private JSONObject data;

    public void setData(JSONObject jSONObject) {
        this.data = jSONObject;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public JSONObject mo2429getData() {
        return this.data;
    }
}
