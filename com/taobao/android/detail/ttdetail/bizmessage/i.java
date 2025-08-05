package com.taobao.android.detail.ttdetail.bizmessage;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class i extends com.taobao.android.detail.ttdetail.communication.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f10506a;
    public String b;

    static {
        kge.a(-546075603);
    }

    public i(String str, Map<String, Object> map) {
        this.f10506a = map;
        this.b = str;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.a
    public JSONObject bZ_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("72b9874e", new Object[]{this}) : new JSONObject(this.f10506a);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }
}
