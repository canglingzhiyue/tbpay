package com.taobao.client.isv.config.manager.person;

import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopLbsConfigResponse extends BaseOutDo {
    private Map<String, Map<String, String>> data;

    static {
        kge.a(562167033);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public Map<String, Map<String, String>> mo2429getData() {
        return this.data;
    }

    public void setData(Map<String, Map<String, String>> map) {
        this.data = map;
    }
}
