package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class FloutNewConfigItemData implements Serializable {
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "schemeStrategy")
    public Map<String, Map<String, Integer>> schemeStrategy;
    @JSONField(name = "urlBlack")
    public Map<String, List<String>> urlBlack;
    @JSONField(name = "defaultStrategy")
    public int defaultStrategy = 1;
    @JSONField(name = "needNewTask")
    public boolean needNewTask = false;
    @JSONField(name = "addNewTask")
    public boolean addNewTask = false;

    static {
        kge.a(-51494306);
        kge.a(1028243835);
    }
}
