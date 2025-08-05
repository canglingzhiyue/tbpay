package com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class NewDetailBucketModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String bucketId;
    private String bizName = "new_detail";
    private String sourceFrom = "InfoFlow";

    static {
        kge.a(138210107);
        kge.a(1028243835);
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this}) : this.bizName;
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.bizName = str;
        }
    }

    public String getSourceFrom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("916d1f7e", new Object[]{this}) : this.sourceFrom;
    }

    public void setSourceFrom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132057b8", new Object[]{this, str});
        } else {
            this.sourceFrom = str;
        }
    }

    public String getBucketId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c33edfbe", new Object[]{this}) : this.bucketId;
    }

    public void setBucketId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7a7278", new Object[]{this, str});
        } else {
            this.bucketId = str;
        }
    }
}
