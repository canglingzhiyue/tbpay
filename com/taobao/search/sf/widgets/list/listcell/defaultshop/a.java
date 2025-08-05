package com.taobao.search.sf.widgets.list.listcell.defaultshop;

import android.taobao.util.j;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.security.faceauth.api.AntDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.nss;

/* loaded from: classes8.dex */
public final class a extends nss<DefaultShopCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1491557754);
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_shop_2022";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public DefaultShopCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DefaultShopCellBean) ipChange.ipc$dispatch("67abe6b2", new Object[]{this}) : new DefaultShopCellBean(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<DefaultShopCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : DefaultShopCellBean.class;
    }

    @Override // tb.nss
    public void a(JSONObject beanObject, DefaultShopCellBean bean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b24ade", new Object[]{this, beanObject, bean, baseSearchResult});
            return;
        }
        q.c(beanObject, "beanObject");
        q.c(bean, "bean");
        bean.setTitle(beanObject.optString("title"));
        bean.setLogo(com.taobao.search.common.uikit.a.a(j.a(beanObject.optString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO))));
        bean.setShopId(beanObject.optString("shopId"));
        bean.setSellerId(beanObject.optString("sellerId"));
        bean.setOriginTItemType(beanObject.optString("originTItemType"));
        JSONArray optJSONArray = beanObject.optJSONArray("auctions");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            bean.getAuctions().clear();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    jSONObject.put("RN", bean.rn);
                    jSONObject.put(AntDetector.EXT_KEY_AB_TEST, bean.abtest);
                    bean.getAuctions().add(jSONObject);
                }
            }
        }
        bean.setUtLogMap(beanObject.optJSONObject("utLogMap"));
        bean.setDetailTrace(beanObject.optJSONArray("detailTrace"));
    }
}
