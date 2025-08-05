package com.ap.zoloz.hummer.common;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class ClientConfig {
    @JSONField(name = "clientStartIndex")
    public int clientStartIndex = 0;
    @JSONField(name = "flowId")
    public String flowId = null;
    @JSONField(name = "factorContext")
    public Map<String, Object> factorContext = new HashMap();
    @JSONField(name = "tasks")
    public ArrayList<TaskConfig> tasks = new ArrayList<>();
    @JSONField(name = "zStack")
    public ArrayList<Map<String, String>> zStack = new ArrayList<>();

    static {
        kge.a(-1167340933);
    }
}
