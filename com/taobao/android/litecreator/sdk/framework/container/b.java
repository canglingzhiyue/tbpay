package com.taobao.android.litecreator.sdk.framework.container;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-890084856);
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.h
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.h
    public void a(g gVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497863c9", new Object[]{this, gVar, fVar});
        }
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.e
    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : R.layout.layout_plugin_empty;
    }
}
