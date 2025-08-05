package com.o2o.ad.click.common;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class O2OClickSendResponseData implements Serializable, IMTOPDataObject {
    @JSONField(name = "code")
    public String code;
    @JSONField(name = "o2otrackid")
    public String o2otrackid;

    static {
        kge.a(-449101615);
        kge.a(-350052935);
        kge.a(1028243835);
    }
}
