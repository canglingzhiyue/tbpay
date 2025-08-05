package com.taobao.android.searchbaseframe.datasource.impl;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import tb.kge;
import tb.nog;

/* loaded from: classes6.dex */
public abstract class c<BEAN extends BaseTypedBean, CTX extends BaseSearchResult> extends com.taobao.android.searchbaseframe.parse.b<BEAN, CTX> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1491836725);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 1019040963) {
            super.a((JSONObject) objArr[0], (JSONObject) ((TypedBean) objArr[1]), (TypedBean) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.parse.b
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, TypedBean typedBean, Object obj) throws Exception {
        a(jSONObject, (JSONObject) ((BaseTypedBean) typedBean), (BaseTypedBean) ((BaseSearchResult) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj, Object obj2) throws Exception {
        a(jSONObject, (JSONObject) ((BaseTypedBean) obj), (BaseTypedBean) ((BaseSearchResult) obj2));
    }

    public void a(JSONObject jSONObject, BEAN bean, CTX ctx) throws Exception {
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eaddd7", new Object[]{this, jSONObject, bean, ctx});
            return;
        }
        super.a(jSONObject, (JSONObject) bean, (BEAN) ctx);
        bean.clickTrace = jSONObject.getString(nog.CLICK_TRACE);
        if (ctx == null || (mainInfo = ctx.getMainInfo()) == null) {
            return;
        }
        bean.rn = mainInfo.rn;
        bean.abtest = mainInfo.abtest;
        bean.pageType = mainInfo.pageType;
    }
}
