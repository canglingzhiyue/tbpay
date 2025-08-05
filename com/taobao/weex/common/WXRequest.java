package com.taobao.weex.common;

import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class WXRequest {
    public static final int DEFAULT_TIMEOUT_MS = 3000;
    public String body;
    public String instanceId;
    public String method;
    public Map<String, String> paramMap;
    public int timeoutMs = 3000;
    public String url;

    static {
        kge.a(1527715141);
    }
}
