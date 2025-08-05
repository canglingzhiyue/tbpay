package com.taobao.android.fluid.framework.adapter.mtop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class b<T extends BaseOutDo> implements IMTopAdapter.b<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1941879310);
        kge.a(1539240584);
    }

    public abstract void a(MtopResponse mtopResponse, JSONObject jSONObject, T t);

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
    public final void a(MtopResponse mtopResponse, T t) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b39cfcd", new Object[]{this, mtopResponse, t});
        } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
            a(mtopResponse);
        } else {
            try {
                jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                a(mtopResponse);
            } else {
                a(mtopResponse, jSONObject, t);
            }
        }
    }
}
