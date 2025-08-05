package com.taobao.search.sf.widgets.list.listcell.baseauction;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.j;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.noa;
import tb.nss;

/* loaded from: classes8.dex */
public abstract class b<BEAN extends SFAuctionBaseCellBean> extends nss<BEAN> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1752387649);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 470578782) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseCellBean) objArr[1]), (BaseSearchResult) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract AuctionBaseBean a(org.json.JSONObject jSONObject, Map<String, SearchDomBean> map);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.nss, com.taobao.android.searchbaseframe.datasource.impl.cell.a, com.taobao.android.searchbaseframe.datasource.impl.c
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, BaseTypedBean baseTypedBean, BaseSearchResult baseSearchResult) throws Exception {
        a(jSONObject, (JSONObject) ((SFAuctionBaseCellBean) baseTypedBean), baseSearchResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.nss, com.taobao.android.searchbaseframe.datasource.impl.cell.a
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, BaseCellBean baseCellBean, BaseSearchResult baseSearchResult) throws Exception {
        a(jSONObject, (JSONObject) ((SFAuctionBaseCellBean) baseCellBean), baseSearchResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.nss, com.taobao.android.searchbaseframe.datasource.impl.cell.a, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, TypedBean typedBean, Object obj) throws Exception {
        a(jSONObject, (JSONObject) ((SFAuctionBaseCellBean) typedBean), (BaseSearchResult) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.nss, com.taobao.android.searchbaseframe.datasource.impl.cell.a, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj, Object obj2) throws Exception {
        a(jSONObject, (JSONObject) ((SFAuctionBaseCellBean) obj), (BaseSearchResult) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.nss
    public /* bridge */ /* synthetic */ void a(org.json.JSONObject jSONObject, BaseCellBean baseCellBean, BaseSearchResult baseSearchResult) throws Exception {
        a(jSONObject, (org.json.JSONObject) ((SFAuctionBaseCellBean) baseCellBean), baseSearchResult);
    }

    public void a(org.json.JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7120a3", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        HashMap<String, SearchDomBean> hashMap = null;
        if (baseSearchResult instanceof CommonSearchResult) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) baseSearchResult;
            hashMap = commonSearchResult.domIcons;
            jSONObject2 = commonSearchResult.negFeedbackActions;
        } else {
            jSONObject2 = null;
        }
        bean.auctionBaseBean = a(jSONObject, hashMap);
        if (bean.auctionBaseBean != null) {
            bean.auctionBaseBean.mOutterBean = bean;
            bean.auctionBaseBean.utLogMap.put("srp_seq", String.valueOf(bean.pageNo));
            bean.auctionBaseBean.utLogMap.put("srp_pos", String.valueOf(bean.pagePos));
        }
        a(bean.auctionBaseBean, baseSearchResult);
        if (jSONObject2 == null || bean.auctionBaseBean == null) {
            return;
        }
        bean.auctionBaseBean.negFeedbackActions = jSONObject2;
    }

    public void a(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e491a31", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        super.a(jSONObject, (JSONObject) bean, baseSearchResult);
        b(jSONObject, (JSONObject) bean, baseSearchResult);
        c(jSONObject, bean, baseSearchResult);
    }

    private void b(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0c1332", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(noa.VALUE_MODULE_DYNAMIC_CARD);
        if (jSONObject2 == null) {
            return;
        }
        DynamicCardBean dynamicCardBean = new DynamicCardBean();
        dynamicCardBean.mOriginData = jSONObject2;
        dynamicCardBean.mDynamicCellBean = j.f19452a.f().a(jSONObject2, (BaseSearchResult) null);
        bean.dynamicCardBean = dynamicCardBean;
    }

    private void c(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dcf0c33", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("feedback");
        if (jSONObject2 == null) {
            return;
        }
        BaseTypedBean a2 = j.f19452a.g().a(jSONObject2, baseSearchResult);
        if (!(a2 instanceof MuiseBean)) {
            return;
        }
        MuiseBean muiseBean = (MuiseBean) a2;
        muiseBean.model = jSONObject;
        bean.feedbackBean = muiseBean;
    }
}
