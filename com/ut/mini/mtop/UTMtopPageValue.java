package com.ut.mini.mtop;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class UTMtopPageValue implements Serializable {
    @JSONField(name = "pg")
    public String page;
    @JSONField(name = "v")
    public List<String> valueList;

    static {
        kge.a(88608170);
        kge.a(1028243835);
    }
}
