package com.taobao.android.detail.ttdetail.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncModule;
import tb.dwy;
import tb.kge;

/* loaded from: classes5.dex */
public class v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1887846658);
    }

    public static boolean a(com.taobao.android.detail.ttdetail.component.module.d dVar, boolean z) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d333105", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        if (dVar == null || (d = dVar.getComponentData().d()) == null || !d.getBooleanValue(dwy.KEY_DETAIL)) {
            return false;
        }
        d.put(dwy.KEY_DETAIL_COLLECTED, (Object) Boolean.valueOf(z));
        return true;
    }

    public static boolean a(com.taobao.android.detail.ttdetail.component.module.d dVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9944915b", new Object[]{dVar, jSONObject, new Boolean(z)})).booleanValue();
        }
        if (dVar == null || jSONObject == null) {
            return false;
        }
        com.taobao.android.detail.ttdetail.async.b.a(jSONObject.getJSONObject(z ? dwy.KEY_DETAIL_COLLECTED : "uncollected"), AsyncModule.a(jSONObject), dVar.getComponentData());
        return true;
    }
}
