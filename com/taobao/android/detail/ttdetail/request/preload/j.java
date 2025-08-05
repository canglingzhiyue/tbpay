package com.taobao.android.detail.ttdetail.request.preload;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f10801a = -1;

    static {
        kge.a(-1823929046);
    }

    public synchronized boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        int i = com.taobao.android.detail.ttdetail.utils.d.e(jSONObject) ? 0 : 1;
        if (i < this.f10801a) {
            return false;
        }
        this.f10801a = i;
        return true;
    }
}
