package com.taobao.orange;

import java.util.Map;

/* loaded from: classes.dex */
public interface d extends c {
    public static final String CONFIG_VERSION = "configVersion";
    public static final String FROM_CACHE = "fromCache";
    public static final String IS_CRITICAL = "isCritical";

    void onConfigUpdate(String str, Map<String, String> map);
}
