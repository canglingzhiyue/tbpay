package com.ut.mini.behavior.trigger;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.android.msoa.c;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class Scene implements Serializable {
    @JSONField(name = c.TAG)
    public String condition;
    @JSONField(name = "ena")
    public int enableSample;
    @JSONField(name = "e")
    public Event event;
    @JSONField(name = "n")
    public String name;

    static {
        kge.a(316541934);
        kge.a(1028243835);
    }
}
