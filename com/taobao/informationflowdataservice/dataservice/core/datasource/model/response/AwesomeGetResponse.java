package com.taobao.informationflowdataservice.dataservice.core.datasource.model.response;

import com.taobao.infoflow.protocol.model.datamodel.response.IResponseModel;
import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class AwesomeGetResponse extends BaseOutDo implements IResponseModel {
    private AwesomeGetData data;

    static {
        kge.a(1321968339);
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
