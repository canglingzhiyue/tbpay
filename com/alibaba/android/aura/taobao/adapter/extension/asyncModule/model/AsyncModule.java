package com.alibaba.android.aura.taobao.adapter.extension.asyncModule.model;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class AsyncModule implements Serializable {
    @JSONField(name = "v-if")
    public String condition;
    @JSONField(name = "dependencyRequest")
    public DependencyRequest dependencyRequest;
    @JSONField(name = "kvmap")
    public List<KVMapping> kvMappings;
    @JSONField(name = "mtopConfig")
    public MTopConfigModel mtopConfigModel;
    @JSONField(name = "R")
    public RModel r;
    @JSONField(name = "relateComponents")
    public List<RelateComponent> relateComponents;

    /* loaded from: classes2.dex */
    public static class DependencyRequest implements Serializable {
        @JSONField(name = "mtopConfig")
        public MTopConfigModel mtopConfigModel;

        static {
            kge.a(-115311659);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes2.dex */
    public static class KVMapping implements Serializable {
        @JSONField(name = "source")
        public String source;
        @JSONField(name = "target")
        public String target;

        static {
            kge.a(1884014868);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes2.dex */
    public static class MTopConfigModel implements Serializable {
        @JSONField(name = "apiMethod")
        public String apiMethod;
        @JSONField(name = "apiVersion")
        public String apiVersion;
        @JSONField(name = "data")
        public JSONObject requestData;

        static {
            kge.a(1730742672);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes2.dex */
    public static class RModel implements Serializable {
        @JSONField(name = "onFailed")
        public ResponseCallbackModel failedCallback;
        @JSONField(name = "onSuccess")
        public ResponseCallbackModel successCallback;

        static {
            kge.a(1106199398);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes2.dex */
    public static class RelateComponent implements Serializable {
        @JSONField(name = "v-if")
        public String condition;
        @JSONField(name = "kvmap")
        public List<KVMapping> kvMappings;
        @JSONField(name = "R")
        public RModel r;
        @JSONField(name = "target")
        public String target;

        static {
            kge.a(-2107526923);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes2.dex */
    public static class ResponseCallbackModel implements Serializable {
        @JSONField(name = "events")
        public List<JSONObject> events;
        @JSONField(name = "payload")
        public JSONObject payload;

        static {
            kge.a(-594859596);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-477073899);
        kge.a(1028243835);
    }
}
