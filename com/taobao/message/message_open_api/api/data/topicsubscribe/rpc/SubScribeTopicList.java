package com.taobao.message.message_open_api.api.data.topicsubscribe.rpc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class SubScribeTopicList {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String errCode;
    private ExtParams extParams;
    private String status;
    private String topicId;

    static {
        kge.a(1854001544);
    }

    public void setErrCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5370c1", new Object[]{this, str});
        } else {
            this.errCode = str;
        }
    }

    public String getErrCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("49f20fbd", new Object[]{this}) : this.errCode;
    }

    public void setExtParams(ExtParams extParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8637a6f3", new Object[]{this, extParams});
        } else {
            this.extParams = extParams;
        }
    }

    public ExtParams getExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExtParams) ipChange.ipc$dispatch("3da0c347", new Object[]{this}) : this.extParams;
    }

    public void setStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7af285", new Object[]{this, str});
        } else {
            this.status = str;
        }
    }

    public String getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("71829d11", new Object[]{this}) : this.status;
    }

    public void setTopicId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578fac79", new Object[]{this, str});
        } else {
            this.topicId = str;
        }
    }

    public String getTopicId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2be37d05", new Object[]{this}) : this.topicId;
    }
}
