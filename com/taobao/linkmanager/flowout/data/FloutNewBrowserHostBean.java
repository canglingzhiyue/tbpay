package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class FloutNewBrowserHostBean implements Serializable {
    @JSONField(name = "defaultStrategy")
    public Integer defaultStrategy;
    @JSONField(name = "path")
    public Map<String, Integer> pathStrategy;

    static {
        kge.a(1213637889);
        kge.a(1028243835);
    }
}
