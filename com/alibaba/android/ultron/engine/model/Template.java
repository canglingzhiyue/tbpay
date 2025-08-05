package com.alibaba.android.ultron.engine.model;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class Template implements Serializable {
    public List<Block> blocks;
    public JSONObject globalStyle;
    public TemplateHierarchy hierarchy;
    public String name;
    public Long templateId;
    public Integer version;

    static {
        kge.a(1250040979);
        kge.a(1028243835);
    }
}
