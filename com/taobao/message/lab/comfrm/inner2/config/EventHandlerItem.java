package com.taobao.message.lab.comfrm.inner2.config;

import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class EventHandlerItem {
    public Map<String, String> data;
    public boolean enable = true;
    public int immediate;
    public Map<String, List<EventHandlerItem>> next;
    public String runtimeType;
    public String type;

    static {
        kge.a(-801003409);
    }
}
