package com.alibaba.android.ultron.common.page.provider.impl;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.common.page.provider.a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class c implements com.alibaba.android.ultron.common.page.provider.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-752355198);
        kge.a(1189376219);
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(Context context, String str, String str2, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa1409", new Object[]{this, context, str, str2, jSONObject, map});
        }
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a8385a", new Object[]{this, linearLayout, recyclerView, linearLayout2});
        }
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(com.alibaba.android.ultron.common.page.provider.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c229185f", new Object[]{this, bVar});
        }
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        }
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(Context context, JSONObject jSONObject, JSONObject jSONObject2, a.InterfaceC0085a interfaceC0085a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feade92b", new Object[]{this, context, jSONObject, jSONObject2, interfaceC0085a});
        } else {
            interfaceC0085a.a("-1", "unknow error", null);
        }
    }
}
