package com.taobao.themis.kernel.adapter;

import com.alibaba.fastjson.JSONObject;
import com.taobao.themis.kernel.d;
import tb.qpa;

/* loaded from: classes9.dex */
public interface IApiInvokerChainFactory extends com.taobao.themis.kernel.basic.a {
    qpa createApiInvokerChain(d dVar, com.taobao.themis.kernel.ability.base.a aVar, com.taobao.themis.kernel.ability.register.b bVar, JSONObject jSONObject);
}
