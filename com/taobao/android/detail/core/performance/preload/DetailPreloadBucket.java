package com.taobao.android.detail.core.performance.preload;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailPreloadBucket implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_NAME = "bizName";
    private static final String BUCKET_ID = "bucketId";
    private static final String SOURCE_FROM = "sourceFrom";
    private static final String TAG = "DetailPreloadBucket";
    public String bizName;
    public String bucketId;
    public String sourceFrom;

    static {
        kge.a(1791922904);
        kge.a(1028243835);
    }

    public DetailPreloadBucket() {
        emu.a("com.taobao.android.detail.core.performance.preload.DetailPreloadBucket");
    }

    public static DetailPreloadBucket parser(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailPreloadBucket) ipChange.ipc$dispatch("21bd343d", new Object[]{str});
        }
        try {
            DetailPreloadBucket detailPreloadBucket = new DetailPreloadBucket();
            JSONObject parseObject = JSONObject.parseObject(str);
            detailPreloadBucket.bizName = parseObject.getString("bizName");
            detailPreloadBucket.sourceFrom = parseObject.getString(SOURCE_FROM);
            detailPreloadBucket.bucketId = parseObject.getString("bucketId");
            return detailPreloadBucket;
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(l.a(TAG), "DetailPreloadBucket parser error", e);
            return new DetailPreloadBucket();
        }
    }

    public String getBucketId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c33edfbe", new Object[]{this}) : this.bucketId;
    }
}
