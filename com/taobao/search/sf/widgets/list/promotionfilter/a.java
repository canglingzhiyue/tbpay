package com.taobao.search.sf.widgets.list.promotionfilter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import org.json.JSONObject;
import tb.kge;
import tb.nsu;

/* loaded from: classes8.dex */
public class a extends nsu<SFPromotionFilterBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-704978454);
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_promotionfilter";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public SFPromotionFilterBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SFPromotionFilterBean) ipChange.ipc$dispatch("9b6295be", new Object[]{this}) : new SFPromotionFilterBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<SFPromotionFilterBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : SFPromotionFilterBean.class;
    }

    @Override // tb.nsu
    public void a(JSONObject jSONObject, SFPromotionFilterBean sFPromotionFilterBean, CommonSearchResult commonSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3809542d", new Object[]{this, jSONObject, sFPromotionFilterBean, commonSearchResult});
        } else {
            sFPromotionFilterBean.oldPromotionFilterBean = PromotionFilterBean.parsePromotionFilter(jSONObject);
        }
    }
}
