package com.taobao.alimama.net.pojo.response;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaZzAdGetResponseData implements IMTOPDataObject {
    @JSONField(name = "httpStatusCode")
    public String httpStatusCode;
    @JSONField(name = "model")
    public List<AlimamaZzAd> model;

    static {
        kge.a(-1741780855);
        kge.a(-350052935);
    }
}
