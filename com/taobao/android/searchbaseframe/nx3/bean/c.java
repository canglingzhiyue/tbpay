package com.taobao.android.searchbaseframe.nx3.bean;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends com.taobao.android.searchbaseframe.datasource.impl.c<WeexBean, BaseSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_D_TYPE = "dItemType";

    static {
        kge.a(1486919963);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 32169431) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseTypedBean) objArr[1]), (BaseTypedBean) ((BaseSearchResult) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "NxBean";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public WeexBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexBean) ipChange.ipc$dispatch("6cc30841", new Object[]{this}) : new WeexBean();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, WeexBean weexBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b107bd", new Object[]{this, jSONObject, weexBean, baseSearchResult});
            return;
        }
        super.a(jSONObject, (JSONObject) weexBean, (WeexBean) baseSearchResult);
        weexBean.model = jSONObject;
        weexBean.setdItemType(jSONObject.getString("dItemType"));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<WeexBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : WeexBean.class;
    }
}
