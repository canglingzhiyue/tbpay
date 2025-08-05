package com.taobao.search.sf.widgets.list.listcell.inshopauction2020;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.noj;

/* loaded from: classes8.dex */
public class a extends com.taobao.search.sf.widgets.list.listcell.baseauction.b<InshopAuction2020CellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1722442860);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -1166991197) {
            super.a((JSONObject) objArr[0], (JSONObject) ((SFAuctionBaseCellBean) objArr[1]), (BaseSearchResult) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_inshop_auction_2020";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.b
    public void a(JSONObject beanObject, InshopAuction2020CellBean bean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("229b40f8", new Object[]{this, beanObject, bean, baseSearchResult});
            return;
        }
        q.c(beanObject, "beanObject");
        q.c(bean, "bean");
        super.a(beanObject, (JSONObject) bean, baseSearchResult);
        a(beanObject, bean);
        b(beanObject, bean);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.b
    public AuctionBaseBean a(JSONObject jSONObject, Map<String, SearchDomBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionBaseBean) ipChange.ipc$dispatch("32b82810", new Object[]{this, jSONObject, map});
        }
        AuctionBaseBean a2 = noj.a(jSONObject, map);
        q.a((Object) a2, "InshopAuctionRadiusParse…uctionObject, domBeanMap)");
        return a2;
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<InshopAuction2020CellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : InshopAuction2020CellBean.class;
    }

    public InshopAuction2020CellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InshopAuction2020CellBean) ipChange.ipc$dispatch("2d423a58", new Object[]{this}) : new InshopAuction2020CellBean();
    }

    private final void a(JSONObject jSONObject, InshopAuction2020CellBean inshopAuction2020CellBean) {
        ArrayList<String> skuPics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54098b80", new Object[]{this, jSONObject, inshopAuction2020CellBean});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("skuPics");
        if (optJSONArray == null || optJSONArray.length() < 3) {
            return;
        }
        inshopAuction2020CellBean.setSkuPics(new ArrayList<>());
        int min = Math.min(optJSONArray.length(), 5);
        for (int i = 0; i < min; i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString) && (skuPics = inshopAuction2020CellBean.getSkuPics()) != null) {
                skuPics.add(optString);
            }
        }
    }

    private final void b(JSONObject jSONObject, InshopAuction2020CellBean inshopAuction2020CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2b99f", new Object[]{this, jSONObject, inshopAuction2020CellBean});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("topIcon");
        if (optJSONObject == null) {
            return;
        }
        inshopAuction2020CellBean.setTopIconUrl(optJSONObject.optString("url"));
        inshopAuction2020CellBean.setTopIconTop(optJSONObject.optInt("top", 0));
        inshopAuction2020CellBean.setTopIconLeft(optJSONObject.optInt("left", 0));
        inshopAuction2020CellBean.setTopIconWidth(optJSONObject.optInt("width"));
        inshopAuction2020CellBean.setTopIconHeight(optJSONObject.optInt("height"));
    }
}
