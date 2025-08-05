package com.alibaba.android.ultron.engine.model;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class TemplateHierarchy implements Serializable {
    public Map<String, Node> nodes;
    public String root;
    public JSONObject structure;

    /* loaded from: classes2.dex */
    public static class Node implements Serializable {
        public JSONObject data;
        public JSONObject event;
        public String position;
        public JSONObject style;
        public String tag;

        static {
            kge.a(422568612);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1412560158);
        kge.a(1028243835);
    }
}
