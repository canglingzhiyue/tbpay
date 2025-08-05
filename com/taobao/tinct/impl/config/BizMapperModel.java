package com.taobao.tinct.impl.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes.dex */
public class BizMapperModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "biz")
    private String bizName;
    @JSONField(name = "orangeNamespace")
    private List<String> orangeNamespace;

    public String getBizName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this}) : this.bizName;
    }

    public List<String> getOrangeNamespace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fa0e8ce9", new Object[]{this}) : this.orangeNamespace;
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.bizName = str;
        }
    }

    public void setOrangeNamespace(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25c7e03", new Object[]{this, list});
        } else {
            this.orangeNamespace = list;
        }
    }
}
