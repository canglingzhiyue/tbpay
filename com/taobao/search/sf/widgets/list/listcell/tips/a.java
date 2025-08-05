package com.taobao.search.sf.widgets.list.listcell.tips;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import org.json.JSONObject;
import tb.kge;
import tb.nss;
import tb.osh;

/* loaded from: classes8.dex */
public class a extends nss<TipsCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1155670166);
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_tips";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public TipsCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TipsCellBean) ipChange.ipc$dispatch("9202ba42", new Object[]{this}) : new TipsCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<TipsCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : TipsCellBean.class;
    }

    @Override // tb.nss
    public void a(JSONObject jSONObject, TipsCellBean tipsCellBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6793720e", new Object[]{this, jSONObject, tipsCellBean, baseSearchResult});
            return;
        }
        tipsCellBean.listTipBean = osh.a(jSONObject);
        tipsCellBean.fullSpan = jSONObject.optBoolean("fullSpan");
        a(tipsCellBean.listTipBean, baseSearchResult);
    }
}
