package com.alibaba.android.ultron.engine.protocol;

import com.alibaba.fastjson.JSONObject;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class Component extends BaseProtocol {
    public String cardGroup;
    public Map<String, List<Event>> events;
    public JSONObject fields;
    public String id;
    public String position;
    public String status;
    public Boolean submit;
    public String tag;
    public String type;

    static {
        kge.a(1841109113);
    }
}
