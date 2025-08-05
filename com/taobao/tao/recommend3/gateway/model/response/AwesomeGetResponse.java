package com.taobao.tao.recommend3.gateway.model.response;

import com.taobao.infoflow.protocol.model.datamodel.response.IResponseModel;
import java.io.Serializable;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class AwesomeGetResponse extends BaseOutDo implements IResponseModel, Serializable {
    public AwesomeGetData data;

    static {
        kge.a(323703673);
        kge.a(1028243835);
        kge.a(-1872555264);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public AwesomeGetData mo2429getData() {
        return this.data;
    }

    public void setData(AwesomeGetData awesomeGetData) {
        this.data = awesomeGetData;
    }
}
