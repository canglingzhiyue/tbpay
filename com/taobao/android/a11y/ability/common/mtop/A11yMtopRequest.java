package com.taobao.android.a11y.ability.common.mtop;

import com.alibaba.fastjson.JSON;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes4.dex */
public class A11yMtopRequest<T> extends MtopRequest {
    static {
        kge.a(17598883);
    }

    public A11yMtopRequest(T t) {
        setData(JSON.toJSONString(t));
    }
}
