package com.taobao.search.sf.widgets.topbar;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonSearchResult;
import org.json.JSONObject;
import tb.ioz;
import tb.kge;
import tb.non;
import tb.nsu;

/* loaded from: classes8.dex */
public class d extends nsu<SFTopBarBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-770943591);
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_topbar";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public SFTopBarBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SFTopBarBean) ipChange.ipc$dispatch("2dc14533", new Object[]{this}) : new SFTopBarBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<SFTopBarBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : SFTopBarBean.class;
    }

    @Override // tb.nsu
    public void a(JSONObject jSONObject, SFTopBarBean sFTopBarBean, CommonSearchResult commonSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab84578", new Object[]{this, jSONObject, sFTopBarBean, commonSearchResult});
            return;
        }
        sFTopBarBean.traceDigest = new ioz();
        sFTopBarBean.oldTopBarBean = non.a(jSONObject, sFTopBarBean.traceDigest);
    }
}
