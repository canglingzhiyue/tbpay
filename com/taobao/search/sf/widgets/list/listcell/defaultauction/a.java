package com.taobao.search.sf.widgets.list.listcell.defaultauction;

import android.support.v4.app.FrameMetricsAggregator;
import android.taobao.util.j;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.taolive.room.utils.aw;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import tb.kge;
import tb.nog;
import tb.nss;

/* loaded from: classes8.dex */
public final class a extends nss<DefaultAuctionCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1481952182);
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_auction_2022";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public DefaultAuctionCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DefaultAuctionCellBean) ipChange.ipc$dispatch("8bed4462", new Object[]{this}) : new DefaultAuctionCellBean(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<DefaultAuctionCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : DefaultAuctionCellBean.class;
    }

    @Override // tb.nss
    public void a(JSONObject beanObject, DefaultAuctionCellBean bean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddaef6e", new Object[]{this, beanObject, bean, baseSearchResult});
            return;
        }
        q.c(beanObject, "beanObject");
        q.c(bean, "bean");
        JSONObject optJSONObject = beanObject.optJSONObject(nog.PRICE_BLOCK);
        if (optJSONObject != null) {
            bean.setPrice(optJSONObject.optString("price", ""));
            bean.setPriceUnit(optJSONObject.optString(nog.PRICE_UNIT, "￥"));
        }
        bean.setTitle(beanObject.optString("title", ""));
        JSONObject optJSONObject2 = beanObject.optJSONObject("itemPic");
        if (optJSONObject2 != null) {
            bean.setImg(com.taobao.search.common.uikit.a.a(j.a(optJSONObject2.optString("src", ""))));
        }
        String img = bean.getImg();
        if (img == null || img.length() == 0) {
            bean.setImg(com.taobao.search.common.uikit.a.a(j.a(beanObject.optString(nog.PRD_PICURL, ""))));
        }
        bean.setUprightImg(com.taobao.search.common.uikit.a.a(j.a(beanObject.optString(nog.PRD_WF_PICURL, ""))));
        bean.setUprightImgAspectRatio(beanObject.optString("uprightImgAspectRatio", ""));
        bean.setAuctionUrl(beanObject.optString("auctionURL", ""));
        String auctionUrl = bean.getAuctionUrl();
        if (auctionUrl != null && auctionUrl.length() != 0) {
            z = false;
        }
        if (z) {
            bean.setAuctionUrl(beanObject.optString("auctionUrl", ""));
        }
        bean.setUtLogMap(beanObject.optJSONObject("utLogMap"));
        if (bean.getUtLogMap() != null) {
            JSONObject utLogMap = bean.getUtLogMap();
            if (utLogMap == null) {
                q.a();
            }
            if (utLogMap.length() > 0) {
                return;
            }
        }
        JSONObject optJSONObject3 = beanObject.optJSONObject("trace");
        if (optJSONObject3 == null || optJSONObject3.length() <= 0) {
            return;
        }
        bean.setUtLogMap(optJSONObject3.optJSONObject(aw.PARAM_UT_PARAMS));
    }
}
