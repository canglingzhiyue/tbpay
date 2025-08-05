package com.alibaba.android.ultron.engine.model;

import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class Block implements Serializable {
    public String blockTypeEnum;
    public List<TemplateComponent> components;
    public String description;
    public String name;
    public String position;

    static {
        kge.a(-2145185004);
        kge.a(1028243835);
    }
}
