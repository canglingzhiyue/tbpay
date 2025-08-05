package com.taobao.android.searchbaseframe.datasource.impl.cell;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.d;
import com.taobao.android.searchbaseframe.parse.c;
import com.taobao.android.searchbaseframe.xsl.section.h;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c<BaseCellBean, BaseSearchResult> f14973a;

    static {
        kge.a(-627400620);
    }

    public b(imn imnVar) {
        this.f14973a = new c<>(imnVar, new d(), new com.taobao.android.searchbaseframe.nx3.bean.b());
    }

    public void a(a<? extends BaseCellBean> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b252852", new Object[]{this, aVar});
        } else {
            this.f14973a.a(aVar);
        }
    }

    public void a(String str, a<? extends BaseCellBean> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2726248", new Object[]{this, str, aVar});
        } else {
            this.f14973a.a(str, aVar);
        }
    }

    public BaseCellBean a(JSONObject jSONObject, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseCellBean) ipChange.ipc$dispatch("e74b1a38", new Object[]{this, jSONObject, baseSearchResult}) : a(jSONObject, baseSearchResult, null);
    }

    public BaseCellBean a(JSONObject jSONObject, BaseSearchResult baseSearchResult, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("d0823728", new Object[]{this, jSONObject, baseSearchResult, jSONObject2});
        }
        BaseCellBean baseCellBean = (BaseCellBean) this.f14973a.a(jSONObject, (JSONObject) baseSearchResult);
        boolean z = baseCellBean instanceof WeexCellBean;
        if (z || (baseCellBean instanceof MuiseCellBean)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(XslMUSComponent.KEY_EXTRA_STATUS);
            if (jSONObject3 != null) {
                baseCellBean.extraStatus = jSONObject3;
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("extraStorage");
            if (jSONObject4 != null && !jSONObject4.isEmpty() && (baseCellBean instanceof MuiseCellBean)) {
                ((MuiseCellBean) baseCellBean).mStorage.putAll(jSONObject4);
            }
            baseCellBean.barrier = jSONObject.getBooleanValue("xsearchBarrier");
            baseCellBean.isSection = jSONObject.getBooleanValue("xsearchSection");
            if (!baseCellBean.isSection && (jSONObject.get("info") instanceof JSONObject)) {
                baseCellBean.isSection = jSONObject.getJSONObject("info").getBooleanValue("xsearchSection");
            }
            baseCellBean.isFullspan = jSONObject.getBooleanValue("xsearchFullspan");
            if (!baseCellBean.isFullspan && (jSONObject.get("info") instanceof JSONObject)) {
                baseCellBean.isFullspan = jSONObject.getJSONObject("info").getBooleanValue("xsearchFullspan");
            }
            if (jSONObject.getBooleanValue("fullSpan")) {
                baseCellBean.isFullspan = true;
            }
            if (baseCellBean.isSection) {
                baseSearchResult.setHasSections(true);
            }
            if (baseCellBean.barrier) {
                baseSearchResult.setHasBarrier(true);
            }
        }
        if (baseCellBean != null && baseCellBean.isSection) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("xsearchSectionStyle");
            if (jSONObject5 == null && (jSONObject.get("info") instanceof JSONObject)) {
                jSONObject5 = jSONObject.getJSONObject("info").getJSONObject("xsearchSectionStyle");
            }
            if (jSONObject5 != null) {
                baseCellBean.ownedSectionStyle = new h(jSONObject5);
            }
            if (baseCellBean.ownedSectionStyle != null && baseCellBean.ownedSectionStyle.e()) {
                baseSearchResult.setHasSectionClip(true);
            }
        }
        if (z) {
            ((WeexCellBean) baseCellBean).mWeexBean.pageInfoExtraStatus = jSONObject2;
        } else if (baseCellBean instanceof MuiseCellBean) {
            ((MuiseCellBean) baseCellBean).mMuiseBean.pageInfoExtraStatus = jSONObject2;
        }
        return baseCellBean;
    }
}
