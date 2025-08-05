package com.taobao.homepage.pop.ucp;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.lag;

/* loaded from: classes7.dex */
public class UCPConfig implements Serializable, lag {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizCode;
    public boolean enable;
    public String popType;

    @Override // tb.lag
    public boolean enable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue() : this.enable;
    }

    public String popType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c10482ae", new Object[]{this}) : this.popType;
    }

    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : this.bizCode;
    }
}
