package com.alibaba.security.ccrc.common.http.model;

import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.service.build.Aa;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BaseRequest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ccrcCode;
    public String clientInfo = JsonUtils.toJSONString(Aa.a(CcrcContextImpl.getContext()));
    public String configInfo;
    public String pId;

    public BaseRequest(String str) {
        this.ccrcCode = str;
    }

    public String body() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("270aae97", new Object[]{this}) : JsonUtils.toJSONString(this);
    }

    public List<String> ccrcCodes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8cfad4ab", new Object[]{this}) : Collections.singletonList(this.ccrcCode);
    }
}
