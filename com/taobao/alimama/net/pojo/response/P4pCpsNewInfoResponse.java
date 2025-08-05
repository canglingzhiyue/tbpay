package com.taobao.alimama.net.pojo.response;

import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class P4pCpsNewInfoResponse extends BaseOutDo implements IMTOPDataObject {
    private static final long serialVersionUID = -3871455772294398291L;
    private Map<String, String> data;

    static {
        kge.a(-1381600060);
        kge.a(-350052935);
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
