package com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class PreLoadModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String bucketId;
    private List<PreLoadItem> items;
    private String bizName = "new_detail";
    private String sourceFrom = "InfoFlow";
    private String pageIndex = "-1";

    static {
        kge.a(563917357);
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

    public List<PreLoadItem> getItems() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this}) : this.items;
    }

    public void setItems(List<PreLoadItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1ea0f6", new Object[]{this, list});
        } else {
            this.items = list;
        }
    }

    public String getPageIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("483184c", new Object[]{this}) : this.pageIndex;
    }

    public void setPageIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dad12", new Object[]{this, str});
        } else {
            this.pageIndex = str;
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
