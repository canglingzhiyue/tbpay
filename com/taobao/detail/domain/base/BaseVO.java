package com.taobao.detail.domain.base;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.rjq;

/* loaded from: classes7.dex */
public class BaseVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Unit actionUrl;
    public Unit asynUrl;
    public Unit h5Url;
    public String hide;
    public String html;

    static {
        kge.a(-580181688);
        kge.a(1028243835);
    }

    public boolean visuable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7858f43a", new Object[]{this})).booleanValue() : rjq.a(this.hide);
    }
}
