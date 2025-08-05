package com.ut.mini.behavior.module;

import com.alibaba.fastjson.annotation.JSONField;
import com.ut.mini.behavior.data.Data;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class Module implements Serializable {
    @JSONField(name = "ds")
    public Data data;
    @JSONField(name = "n")
    public String name;

    static {
        kge.a(730983976);
        kge.a(1028243835);
    }
}
