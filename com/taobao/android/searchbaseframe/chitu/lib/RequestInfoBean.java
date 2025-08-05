package com.taobao.android.searchbaseframe.chitu.lib;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class RequestInfoBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String request;
    public String response;

    static {
        kge.a(-721346709);
    }

    public RequestInfoBean(String str, String str2) {
        this.request = "";
        this.response = "";
        this.request = str;
        this.response = str2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : JSON.toJSONString(this);
    }
}
