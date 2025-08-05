package com.taobao.search.sf.widgets.list.listcell.crosstips;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends com.taobao.android.searchbaseframe.datasource.impl.cell.a<CrossTipsBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1715553350);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 470578782) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseCellBean) objArr[1]), (BaseSearchResult) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_cross_tips";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public CrossTipsBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CrossTipsBean) ipChange.ipc$dispatch("ba83c272", new Object[]{this}) : new CrossTipsBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<CrossTipsBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : CrossTipsBean.class;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.a, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, CrossTipsBean crossTipsBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6904ff2c", new Object[]{this, jSONObject, crossTipsBean, baseSearchResult});
            return;
        }
        super.a(jSONObject, (JSONObject) crossTipsBean, baseSearchResult);
        crossTipsBean.title = jSONObject.getString("title");
        crossTipsBean.isFullspan = true;
    }
}
