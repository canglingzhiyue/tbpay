package com.taobao.tinct.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class ABChangeInfo extends BaseChangeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bid")
    public String bucketId;
    @JSONField(name = "eid")
    public String experimentId;
    @JSONField(name = MspDBHelper.BizEntry.COLUMN_NAME_PID)
    public String publishId;

    public static ABChangeInfo builder(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ABChangeInfo) ipChange.ipc$dispatch("32bc6a94", new Object[]{str, str2, str3}) : new ABChangeInfo(str, str2, str3);
    }

    public ABChangeInfo() {
        this(null, null, null);
    }

    private ABChangeInfo(String str, String str2, String str3) {
        super(ChangeType.AB);
        this.experimentId = str;
        this.bucketId = str2;
        this.publishId = str3;
    }

    public ABChangeInfo setExperimentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABChangeInfo) ipChange.ipc$dispatch("7bf3c89f", new Object[]{this, str});
        }
        this.experimentId = str;
        return this;
    }

    public ABChangeInfo setBucketId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABChangeInfo) ipChange.ipc$dispatch("22501e0c", new Object[]{this, str});
        }
        this.bucketId = str;
        return this;
    }

    public ABChangeInfo setPublishId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABChangeInfo) ipChange.ipc$dispatch("a54f3ed", new Object[]{this, str});
        }
        this.publishId = str;
        return this;
    }

    public ABChangeInfo setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABChangeInfo) ipChange.ipc$dispatch("a5142e21", new Object[]{this, str});
        }
        this.bizName = str;
        return this;
    }

    public String getExperimentId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("edc7734b", new Object[]{this}) : this.experimentId;
    }

    public String getBucketId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c33edfbe", new Object[]{this}) : this.bucketId;
    }

    public String getPublishId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c260ba5", new Object[]{this}) : this.publishId;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.experimentId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bucketId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @Override // com.taobao.tinct.model.BaseChangeInfo
    public String getTinctTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f9becd3", new Object[]{this}) : String.format("ab|%s|%s", this.experimentId, this.bucketId);
    }
}
