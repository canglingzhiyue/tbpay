package com.taobao.search.jarvis.rcmd.cell;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.mmd.util.d;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class a extends com.taobao.android.searchbaseframe.datasource.impl.cell.a<XslDegradeCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(154123919);
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_xsl_degrade_auction";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.a, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, XslDegradeCellBean xslDegradeCellBean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdea8772", new Object[]{this, jSONObject, xslDegradeCellBean, baseSearchResult});
            return;
        }
        super.a(jSONObject, (JSONObject) xslDegradeCellBean, baseSearchResult);
        JSONObject jSONObject2 = jSONObject.getJSONObject("info");
        if (jSONObject2 == null) {
            return;
        }
        xslDegradeCellBean.itemUrl = jSONObject2.getString("itemUrl");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("itemPic");
        if (jSONObject3 != null) {
            xslDegradeCellBean.imageUrl = jSONObject3.getString("src");
            xslDegradeCellBean.width = d.b(jSONObject3.getString("w"), 1);
            xslDegradeCellBean.height = d.b(jSONObject3.getString("h"), 1);
        }
        xslDegradeCellBean.soldCount = jSONObject2.getString("itemTotalSales") + com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16693);
        xslDegradeCellBean.title = jSONObject2.getString("itemTitle");
        xslDegradeCellBean.price = jSONObject2.getString("itemPrice");
    }

    public XslDegradeCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (XslDegradeCellBean) ipChange.ipc$dispatch("4b12c7a6", new Object[]{this}) : new XslDegradeCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<XslDegradeCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : XslDegradeCellBean.class;
    }
}
