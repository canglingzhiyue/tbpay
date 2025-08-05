package com.alibaba.android.icart.core.groupcharge;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f2360a;

    static {
        kge.a(-65376895);
    }

    public d(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new IllegalStateException();
        }
        this.f2360a = jSONObject;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f2360a.getString(WXExceptionConfig.KEY_GROUP_KEY);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f2360a.getString("title");
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f2360a.getIntValue("priority");
    }
}
