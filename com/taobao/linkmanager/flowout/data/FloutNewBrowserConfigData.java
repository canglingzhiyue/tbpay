package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class FloutNewBrowserConfigData implements Serializable {
    @JSONField(name = "defaultStrategy")
    public Integer defaultStrategy;
    @JSONField(name = "hostStrategy")
    public Map<String, Integer> hostStrategy;
    @JSONField(name = "hostStrategyPlus")
    public Map<String, FloutNewBrowserHostBean> hostStrategyPlus;
    @JSONField(name = "name")
    public String name;

    static {
        kge.a(510718805);
        kge.a(1028243835);
    }
}
