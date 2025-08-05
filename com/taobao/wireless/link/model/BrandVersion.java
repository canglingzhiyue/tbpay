package com.taobao.wireless.link.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class BrandVersion implements Serializable {
    @JSONField(name = "brand")
    public String brand;
    @JSONField(name = "version")
    public String version;

    static {
        kge.a(-695192690);
        kge.a(1028243835);
    }
}
