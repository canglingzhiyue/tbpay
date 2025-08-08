package com.taobao.android.searchbaseframe.datasource.impl.cell;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.c;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import tb.fjp;
import tb.kge;
import tb.nog;

/* loaded from: classes6.dex */
public abstract class a<BEAN extends BaseCellBean> extends c<BEAN, BaseSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1765628076);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 32169431) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseTypedBean) objArr[1]), (BaseTypedBean) ((BaseSearchResult) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.impl.c
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, BaseTypedBean baseTypedBean, BaseSearchResult baseSearchResult) throws Exception {
        a(jSONObject, (JSONObject) ((BaseCellBean) baseTypedBean), baseSearchResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, TypedBean typedBean, Object obj) throws Exception {
        a(jSONObject, (JSONObject) ((BaseCellBean) typedBean), (BaseSearchResult) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj, Object obj2) throws Exception {
        a(jSONObject, (JSONObject) ((BaseCellBean) obj), (BaseSearchResult) obj2);
    }

    public void a(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0c765e", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "info");
        bean.cardType = jSONObject.getString(fjp.BIZ_CONTEXT_KEY_CARD_TYPE);
        if (StringUtils.isEmpty(bean.cardType) && b != null) {
            bean.cardType = b.getString(fjp.BIZ_CONTEXT_KEY_CARD_TYPE);
        }
        bean.bizItemId = jSONObject.getString("bizItemId");
        if (StringUtils.isEmpty(bean.bizItemId) && b != null) {
            bean.bizItemId = b.getString("bizItemId");
        }
        bean.isP4p = jSONObject.getBooleanValue(nog.PRD_IS_P4P);
        bean.isDynamicLandP4p = jSONObject.getBooleanValue(nog.PRD_IS_DYNAMIC_LAND_P4P);
        bean.itemId = jSONObject.getString("item_id");
        String string = jSONObject.getString("curItemIds");
        if (!StringUtils.isEmpty(string)) {
            bean.curItemIds = string.split(",");
        }
        String string2 = jSONObject.getString("curP4pIds");
        if (!StringUtils.isEmpty(string2)) {
            bean.curP4pIds = string2.split(",");
        }
        super.a(jSONObject, (JSONObject) bean, (BEAN) baseSearchResult);
        if (baseSearchResult == null) {
            return;
        }
        bean.pageNo = baseSearchResult.getPageNo();
        bean.pagePos = baseSearchResult.getCellsCount();
        bean.setOriginPageNo(bean.pageNo);
        bean.setOriginPagePos(bean.pagePos);
    }
}
