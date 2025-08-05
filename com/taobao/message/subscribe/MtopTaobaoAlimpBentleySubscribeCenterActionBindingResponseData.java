package com.taobao.message.subscribe;

import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionBindingResponseData implements IMTOPDataObject {
    SubScribeCenterResultDTO model;

    static {
        kge.a(1878529895);
        kge.a(-350052935);
    }

    public SubScribeCenterResultDTO getModel() {
        return this.model;
    }

    public void setModel(SubScribeCenterResultDTO subScribeCenterResultDTO) {
        this.model = subScribeCenterResultDTO;
    }
}
