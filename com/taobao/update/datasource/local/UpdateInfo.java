package com.taobao.update.datasource.local;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class UpdateInfo implements Serializable {
    public String appVersion;
    public long lastUpdateTime;
    public Map<String, UpdateData> updateList = new HashMap();

    /* loaded from: classes9.dex */
    public static class UpdateData implements Serializable {
        public String from;
        public long handleTime;
        public String name;
        public String subFrom;
        public boolean valid = true;
        public JSONObject value;

        static {
            kge.a(-443295739);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-662513646);
        kge.a(1028243835);
    }
}
