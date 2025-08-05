package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailOptNode extends DetailNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BATCH_SIZE = "batchSize";
    private static final String BUCKET_ID = "bucketId";
    private static final String CACHE_TIME_TO_LIVE = "cacheTimeToLive";
    private static final String DETAIL_VERSION = "detailVersion";
    private static final String EXPAND_SIZE = "expandSize";
    private static final String OPT_FEATURE = "optFeature";
    private static final String PRELOAD_CHANNEL = "preloadChannel";
    public static final String TAG = "detailOpt";
    public int batchSize;
    public String bucketId;
    public long cacheTimeToLive;
    public String detailVersion;
    public int expandSize;
    public OptFeature optFeature;
    public String preloadChannel;

    static {
        kge.a(1928614903);
    }

    public DetailOptNode() {
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.DetailOptNode");
    }

    public DetailOptNode(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject != null) {
            this.batchSize = jSONObject.getIntValue(BATCH_SIZE);
            this.expandSize = jSONObject.getIntValue(EXPAND_SIZE);
            this.bucketId = epw.a(jSONObject.getString("bucketId"));
            this.preloadChannel = epw.a(jSONObject.getString(PRELOAD_CHANNEL));
            this.detailVersion = epw.a(jSONObject.getString(DETAIL_VERSION));
            this.cacheTimeToLive = jSONObject.getLongValue(CACHE_TIME_TO_LIVE);
            this.optFeature = new OptFeature(jSONObject.getJSONObject(OPT_FEATURE));
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.DetailOptNode");
    }

    public static DetailOptNode parser(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailOptNode) ipChange.ipc$dispatch("100c5ca4", new Object[]{jSONObject});
        }
        DetailOptNode detailOptNode = new DetailOptNode();
        if (jSONObject != null) {
            detailOptNode.batchSize = jSONObject.getIntValue(BATCH_SIZE);
            detailOptNode.expandSize = jSONObject.getIntValue(EXPAND_SIZE);
            detailOptNode.bucketId = epw.a(jSONObject.getString("bucketId"));
            detailOptNode.preloadChannel = epw.a(jSONObject.getString(PRELOAD_CHANNEL));
            detailOptNode.detailVersion = epw.a(jSONObject.getString(DETAIL_VERSION));
            detailOptNode.cacheTimeToLive = jSONObject.getLongValue(CACHE_TIME_TO_LIVE);
            JSONObject jSONObject2 = jSONObject.getJSONObject(OPT_FEATURE);
            if (jSONObject2 != null) {
                detailOptNode.optFeature = OptFeature.parser(jSONObject2);
            }
        }
        return detailOptNode;
    }

    /* loaded from: classes4.dex */
    public static class OptFeature extends DetailNode {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String BUCKET = "bucket";
        private static final String ENABLE_CACHE_REQUEST_DATA = "enableCacheRequestData";
        private static final String ENABLE_NAV_PRELOAD = "enableNavPreload";
        private static final String ENABLE_PRELOAD = "enablePreload";
        public String bucket;
        public String enableCacheRequestData;
        public String enableNavPreload;
        public String enablePreload;

        static {
            kge.a(1563910064);
        }

        public OptFeature() {
        }

        public OptFeature(JSONObject jSONObject) {
            super(jSONObject);
            if (jSONObject != null) {
                this.bucket = jSONObject.getString("bucket");
                this.enablePreload = jSONObject.getString("enablePreload");
                this.enableCacheRequestData = jSONObject.getString(ENABLE_CACHE_REQUEST_DATA);
                this.enableNavPreload = jSONObject.getString(ENABLE_NAV_PRELOAD);
            }
        }

        public static OptFeature parser(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OptFeature) ipChange.ipc$dispatch("b8f8750b", new Object[]{jSONObject});
            }
            OptFeature optFeature = new OptFeature();
            if (jSONObject != null) {
                optFeature.bucket = jSONObject.getString("bucket");
                optFeature.enablePreload = jSONObject.getString("enablePreload");
                optFeature.enableCacheRequestData = jSONObject.getString(ENABLE_CACHE_REQUEST_DATA);
                optFeature.enableNavPreload = jSONObject.getString(ENABLE_NAV_PRELOAD);
            }
            return optFeature;
        }
    }
}
