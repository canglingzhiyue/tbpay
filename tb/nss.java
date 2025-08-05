package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.a;
import com.taobao.android.searchbaseframe.parse.TypedBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.mmd.datasource.bean.SearchListBaseBean;

/* loaded from: classes8.dex */
public abstract class nss<BEAN extends BaseCellBean> extends a<BEAN> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1106293826);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(nss nssVar, String str, Object... objArr) {
        if (str.hashCode() == 470578782) {
            super.a((JSONObject) objArr[0], (JSONObject) ((BaseCellBean) objArr[1]), (BaseSearchResult) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a(org.json.JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception;

    public void b(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb5005f", new Object[]{this, jSONObject, bean, baseSearchResult});
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.a, com.taobao.android.searchbaseframe.datasource.impl.c
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, BaseTypedBean baseTypedBean, BaseSearchResult baseSearchResult) throws Exception {
        a(jSONObject, (JSONObject) ((BaseCellBean) baseTypedBean), baseSearchResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.a, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, TypedBean typedBean, Object obj) throws Exception {
        a(jSONObject, (JSONObject) ((BaseCellBean) typedBean), (BaseSearchResult) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.a, com.taobao.android.searchbaseframe.datasource.impl.c, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public /* bridge */ /* synthetic */ void a(JSONObject jSONObject, Object obj, Object obj2) throws Exception {
        a(jSONObject, (JSONObject) ((BaseCellBean) obj), (BaseSearchResult) obj2);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.cell.a
    public void a(JSONObject jSONObject, BEAN bean, BaseSearchResult baseSearchResult) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0c765e", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        super.a(jSONObject, (JSONObject) bean, baseSearchResult);
        if (e()) {
            b(jSONObject, bean, baseSearchResult);
            return;
        }
        String jSONString = jSONObject.toJSONString();
        if (TextUtils.isEmpty(jSONString)) {
            k.a("CellAdapterParser", "beanStr is empty");
            return;
        }
        try {
            a(new org.json.JSONObject(jSONString), (org.json.JSONObject) bean, baseSearchResult);
        } catch (Exception unused) {
            k.a("CellAdapterParser", "fail to create old json object");
        }
    }

    public void a(SearchListBaseBean searchListBaseBean, BaseSearchResult baseSearchResult) {
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfd375c", new Object[]{this, searchListBaseBean, baseSearchResult});
        } else if (searchListBaseBean == null || baseSearchResult == null || (mainInfo = baseSearchResult.getMainInfo()) == null) {
        } else {
            searchListBaseBean.rn = mainInfo.rn;
            searchListBaseBean.abtest = mainInfo.abtest;
            searchListBaseBean.page = mainInfo.page;
            searchListBaseBean.pagePos = baseSearchResult.getCellsCount();
        }
    }
}
