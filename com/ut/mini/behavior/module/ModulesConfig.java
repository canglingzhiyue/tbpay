package com.ut.mini.behavior.module;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class ModulesConfig implements Serializable {
    @JSONField(name = "m")
    public List<Module> moduleList;
    @JSONField(name = "t")
    public long timestamp;
    @JSONField(name = "v")
    public int version;

    static {
        kge.a(-1371118995);
        kge.a(1028243835);
    }
}
