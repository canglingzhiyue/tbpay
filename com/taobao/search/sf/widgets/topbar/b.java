package com.taobao.search.sf.widgets.topbar;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonSearchResult;
import org.json.JSONObject;
import tb.ioz;
import tb.kge;
import tb.non;
import tb.nsu;

/* loaded from: classes8.dex */
public class b extends nsu<SFInshopTopBarBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-974294572);
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_inshop_topbar";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public SFInshopTopBarBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SFInshopTopBarBean) ipChange.ipc$dispatch("6106a418", new Object[]{this}) : new SFInshopTopBarBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<SFInshopTopBarBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : SFInshopTopBarBean.class;
    }

    @Override // tb.nsu
    public void a(JSONObject jSONObject, SFInshopTopBarBean sFInshopTopBarBean, CommonSearchResult commonSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924cc65d", new Object[]{this, jSONObject, sFInshopTopBarBean, commonSearchResult});
            return;
        }
        sFInshopTopBarBean.traceDigest = new ioz();
        sFInshopTopBarBean.oldTopBarBean = non.a(jSONObject, sFInshopTopBarBean.traceDigest);
    }
}
