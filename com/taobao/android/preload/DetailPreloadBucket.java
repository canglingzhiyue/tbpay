package com.taobao.android.preload;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class DetailPreloadBucket implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_NAME = "bizName";
    private static final String BUCKET_ID = "bucketId";
    private static final String SOURCE_FROM = "sourceFrom";
    private static final String TAG = "DetailPreloadBucket";
    public String bizName;
    public String bucketId;
    public String sourceFrom;

    public static DetailPreloadBucket parser(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailPreloadBucket) ipChange.ipc$dispatch("3760528c", new Object[]{str});
        }
        try {
            DetailPreloadBucket detailPreloadBucket = new DetailPreloadBucket();
            JSONObject parseObject = JSONObject.parseObject(str);
            detailPreloadBucket.bizName = parseObject.getString("bizName");
            detailPreloadBucket.sourceFrom = parseObject.getString(SOURCE_FROM);
            detailPreloadBucket.bucketId = parseObject.getString("bucketId");
            return detailPreloadBucket;
        } catch (Exception e) {
            f.a(e.a(TAG), "DetailPreloadBucket parser error", e);
            return new DetailPreloadBucket();
        }
    }

    public String getBucketId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c33edfbe", new Object[]{this}) : this.bucketId;
    }
}
