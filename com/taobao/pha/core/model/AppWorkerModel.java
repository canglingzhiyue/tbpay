package com.taobao.pha.core.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class AppWorkerModel implements Serializable {
    public String source;
    public String src;
    public String url;
    public boolean prefetch = true;
    @JSONField(name = "enable_scroll_listener")
    public boolean enableScrollListener = false;

    static {
        kge.a(-2034512089);
        kge.a(1028243835);
    }
}
