package com.taobao.android.searchbaseframe.nx3.bean;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends com.taobao.android.searchbaseframe.datasource.impl.c<MuiseBean, BaseSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_D_TYPE = "dItemType";

    static {
        kge.a(-13235913);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
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

    public MuiseBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MuiseBean) ipChange.ipc$dispatch("b5da1e21", new Object[]{this}) : new MuiseBean();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, MuiseBean muiseBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5feb5897", new Object[]{this, jSONObject, muiseBean, baseSearchResult});
            return;
        }
        super.a(jSONObject, (JSONObject) muiseBean, (MuiseBean) baseSearchResult);
        muiseBean.model = jSONObject;
        muiseBean.setdItemType(jSONObject.getString("dItemType"));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<MuiseBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : MuiseBean.class;
    }
}
