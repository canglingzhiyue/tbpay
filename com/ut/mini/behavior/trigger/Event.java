package com.ut.mini.behavior.trigger;

import com.alibaba.fastjson.annotation.JSONField;
import com.ut.mini.behavior.data.Data;
import com.ut.mini.behavior.data.DataType;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class Event implements Serializable {
    @JSONField(name = "ds")
    public Data data;
    @JSONField(name = "t")
    public String type = DataType.Event.getValue();

    static {
        kge.a(304178684);
        kge.a(1028243835);
    }
}
