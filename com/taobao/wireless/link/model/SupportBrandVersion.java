package com.taobao.wireless.link.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class SupportBrandVersion implements Serializable {
    @JSONField(name = "supportBrandVersion")
    public List<BrandVersion> supportBrandVersion;

    static {
        kge.a(1281391075);
        kge.a(1028243835);
    }
}
