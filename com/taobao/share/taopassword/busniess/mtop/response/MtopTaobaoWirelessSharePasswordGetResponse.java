package com.taobao.share.taopassword.busniess.mtop.response;

import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoWirelessSharePasswordGetResponse extends BaseOutDo {
    private Map<String, String> data;

    static {
        kge.a(-1403714808);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public Map<String, String> mo2429getData() {
        return this.data;
    }

    public void setData(Map<String, String> map) {
        this.data = map;
    }
}
